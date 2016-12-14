package tcc.e1.bssv.JP550300;

import oracle.e1.bssv.J0100023.CustomerCreditQueryProcessor;
import oracle.e1.bssv.J0100023.valueobject.InternalGetCustomerCreditInformation;
import oracle.e1.bssv.JP010020.valueobject.GetCustomerCreditInformation;
import oracle.e1.bssv.JP010020.valueobject.ShowCustomerCreditInformation;
import oracle.e1.bssv.util.J0100010.valueobject.Entity;
import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.PublishedBusinessService;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.BusinessServiceException;
import oracle.e1.bssvfoundation.util.E1Message;
import oracle.e1.bssvfoundation.util.E1MessageList;

import oracle.e1.bssvfoundation.util.MathNumeric;

import tcc.e1.bssv.J550100.CustomerMgrTCC;
import tcc.e1.bssv.J550100.valueobject.InternalCustomerXRef;
import tcc.e1.bssv.JP550300.valueobject.CreditCheckReply;
import tcc.e1.bssv.JP550300.valueobject.CreditCheckRequest;

/**
 * TODO: Java Doc for PublishedBusinessService
 */
public class AccountsReceivableManagerTCC extends PublishedBusinessService
{
    /**
     * TODO: PublishedBusinessService Public Constructor
     */
    public AccountsReceivableManagerTCC()
    {
    }

    /**
     * Published method for doCreditCheck TODO: Document method
     * Acts as wrapper method, passing null context and null connection,
     * will call protected doCreditCheck
     * @param vo the value object representing input data for TODO:complete javadoc
     * @return confirmVO the response data from the business process TODO:complete javadoc
     * @throws BusinessServiceException
     */
    public CreditCheckReply doCreditCheck(CreditCheckRequest ccRequest) throws BusinessServiceException
    {
        return doCreditCheck(null, null, ccRequest);
    }

    /**
     * Protected method for AccountsReceivableManagerTCC PublishedBusinessService. doCreditCheck will call make calls to BusinessService classes
     * for completing business process.
     * TODO: Comment parameters
     * @param vo the value object representing input data for TODO:complete javadoc
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @return response value object is the data returned from the business process TODO:complete javadoc
     * @throws BusinessServiceException
     */
    protected CreditCheckReply doCreditCheck(IContext context, IConnection connection,
                                             CreditCheckRequest ccRequest) throws BusinessServiceException
    {
        //perform all work within try block, finally will clean up any connections.
        try
        {
            //Call start published method, passing context of null
            //will return context object so BSFN or DB operation can be called later.
            //Context will be used to indicate default transaction boundary, as well as access
            //to formatting and logging operations.
            context = startPublishedMethod(context, "doCreditCheck", ccRequest);

            //Create new PublishedBusinessService messages object for holding errors and warnings that occur during processing.
            E1MessageList messages = new E1MessageList();

            //Get the customer reference
            InternalCustomerXRef custXRef = new InternalCustomerXRef();
            custXRef.setSzCustomerIdTCC(ccRequest.getCustomerIdTCC());
            messages.addMessages(CustomerMgrTCC.getCustomerXrefRecord(context, connection, custXRef));

            //Ensure customer exists before proceeding further.
            CreditCheckReply ccReply = null;
            MathNumeric custNum = custXRef.getMnAddressNumber();
            if (custNum != null && custNum.intValue() > 0)
            {
                GetCustomerCreditInformation gcci = createGetCustomerCreditInfo(custXRef);
                ShowCustomerCreditInformation scci = doTCCCustomerCreditCheck(context, connection, gcci);
                ccReply = new CreditCheckReply(scci);
                ccReply.setE1MessageList(messages);
            }

            if (messages.hasErrors())
            {
                //Get the string representation of all the messages.
                String error = messages.getMessagesAsString();
                //Throw new BusinessServiceException
                throw new BusinessServiceException(error, context);
            }

            finishPublishedMethod(context, "doCreditCheck");
            //return outVO, filled with return values and messages
            return ccReply;
        }
        finally
        {
            //Call close to clean up all remaining connections and resources.
            close(context, "doCreditCheck");
        }
    }

    protected GetCustomerCreditInformation createGetCustomerCreditInfo(InternalCustomerXRef custXRef) throws BusinessServiceException
    {
        GetCustomerCreditInformation gcci = new GetCustomerCreditInformation();
        if (gcci != null)
        {
            Entity custEntity = new Entity();
            if (custEntity != null)
            {
                custEntity.setEntityId(custXRef.getMnAddressNumber());
                custEntity.setEntityLongId(custXRef.getSzCustomerIdTCC());
            }
            gcci.setEntity(custEntity);
        }
        return gcci;
    }

    protected ShowCustomerCreditInformation doTCCCustomerCreditCheck(IContext context, IConnection connection,
                                                                     GetCustomerCreditInformation vo) throws BusinessServiceException
    {
        //Create new Published Business Service messages object for holding errors and warnings that occur during processing.
        E1MessageList messages = new E1MessageList();

        // Create a new internal value object.
        InternalGetCustomerCreditInformation internalVO = new InternalGetCustomerCreditInformation();

        E1MessageList mapMessages = vo.mapFromPublished(context, connection, internalVO);
        mapMessages.changeMessageType(E1Message.ERROR_MSG_TYPE, E1Message.WARNING_MSG_TYPE);
        messages.addMessages(mapMessages);

        //Call BSSV passing context, connection and internal VO
        E1MessageList sbfMessages =
            CustomerCreditQueryProcessor.getCustomerCreditInformation(context, connection, internalVO);

        //Add messages returned from BSSV to message list for Published Business Service.
        messages.addMessages(sbfMessages);

        //Published Business Service will send either warnings in the Confirm Value Object or
        //throw a BusinessServiceException.  If messages contains errors, throw the
        //exception
        if (messages.hasErrors())
        {
            //Get the string representation of all the messages.
            String error = messages.getMessagesAsString();

            //Throw new BusinessServiceException
            throw new BusinessServiceException(error, context);
        }

        //Exception was not thrown, so create the confirm VO from internal VO
        ShowCustomerCreditInformation confirmVO = new ShowCustomerCreditInformation(internalVO);
        confirmVO.setE1MessageList(messages);

        //return outVO, filled with return values and messages
        return confirmVO;
    }

}
