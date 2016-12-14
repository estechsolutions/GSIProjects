package tcc.e1.bssv.J5542001;

import java.util.ArrayList;
import java.util.Date;

import oracle.e1.bssvfoundation.base.BusinessService;
import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.DBServiceException;
import oracle.e1.bssvfoundation.services.BSSVDBField;
import oracle.e1.bssvfoundation.services.BSSVDBFieldMap;
import oracle.e1.bssvfoundation.services.BSSVDBResultSet;
import oracle.e1.bssvfoundation.services.BSSVDBSortDirection;
import oracle.e1.bssvfoundation.services.BSSVDBSortField;
import oracle.e1.bssvfoundation.services.BSSVDBWhereClauseBuilder;
import oracle.e1.bssvfoundation.services.BSSVDBWhereField;
import oracle.e1.bssvfoundation.services.IDBService;
import oracle.e1.bssvfoundation.util.E1Message;
import oracle.e1.bssvfoundation.util.E1MessageList;

import oracle.e1.bssvfoundation.util.MathNumeric;

import tcc.e1.bssv.J5542001.valueobject.InternalSalesOrderHistory_V4211AB;
import tcc.e1.bssv.J5542001.valueobject.InternalSelectResults;

/**
 * TODO: Java Doc for BusinessService
 */
public abstract class InternalSelectSalesOrderHistory extends BusinessService {
    /**
     * TODO: Create Java Doc for: selectSO_V4211AB
     * Method selectSO_V4211AB is used for...?
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param internalVO represents data that is passed to EnterpriseOne for processing TODO: complete javadoc for VO.
     * @return an E1Message containing the text of any errors or warnings that may have occurred
     */
    public static E1MessageList selectSO_V4211AB(IContext context, IConnection connection,
                                                 InternalSalesOrderHistory_V4211AB internalVO) {

        //Call start internal method, passing the context (which was passed from PublishedBusinessService).
        startInternalMethod(context, "selectSO_V4211AB", internalVO);
        //Create new message list for BusinessService processing.
        E1MessageList messages = new E1MessageList();
        long maxReturnedRows = 10;

        //TODO: call method (created by the wizard), which then executes Business Function or Database operation.
        // messages.addMessages(selectFromV4211AB(context, connection, internalVO));
        //TODO:  add messages returned from E1 processing to BusinessService message list.

        //messages.addMessages(selectFromV4211AB_Top10Records(context, connection, internalVO, maxReturnedRows));

        messages.addMessages(selectFromV4211AB_DateRange(context, connection, internalVO, maxReturnedRows));

        //Call finish internal method passing context.
        finishInternalMethod(context, "selectSO_V4211AB");

        //Call finish internal method passing context.
        return messages;
    }

    /**
     * Selects records from the V4211AB business view.
     * <p>Following SQL statement can be produced by this generated code
     * <blockquote><pre><code>
     * SELECT *
     *
     * FROM V4211AB
     *
     * WHERE F4211.AN8=? AND F4211.TRDJ=?
     *
     * ORDER BY F4211.TRDJ ASC
     * </code></pre></blockquote>
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param internalVO TODO document input parameters
     * @return an E1Message containing the text of any database exceptions that may have occurred
     */
    private static E1MessageList selectFromV4211AB(IContext context, IConnection connection, InternalSalesOrderHistory_V4211AB internalVO) {
        //create return object
        E1MessageList returnMessages = new E1MessageList();

        //specify columns to select
        BSSVDBField[] selectFields = { new BSSVDBField("F4211.KCOO"), // String - CompanyKeyOrderNo
                                       new BSSVDBField("F4211.DOCO"), // Numeric - DocumentOrderInvoiceE
                                       new BSSVDBField("F4211.DCTO"), // String - OrderType
                                       new BSSVDBField("F4211.LNID"), // Numeric - LineNumber
                                       new BSSVDBField("F4211.SFXO"), // String - OrderSuffix
                                       new BSSVDBField("F4211.MCU"), // String - CostCenter
                                       new BSSVDBField("F4211.CO"), // String - Company
                                       new BSSVDBField("F4211.AN8"), // Numeric - AddressNumber
                                       new BSSVDBField("F4211.SHAN"), // Numeric - AddressNumberShipTo
                                       new BSSVDBField("F4211.PA8"), // Numeric - AddressNumberParent
                                       new BSSVDBField("F4211.DRQJ"), // Date - DateRequestedJulian
                                       new BSSVDBField("F4211.TRDJ"), // Date - DateTransactionJulian
                                       new BSSVDBField("F4211.PDDJ"), // Date - ScheduledPickDate
                                       new BSSVDBField("F4211.OPDJ"), // Date - DateOriginalPromisde
                                       new BSSVDBField("F4211.ADDJ"), // Date - ActualShipDate
                                       new BSSVDBField("F4211.IVD"), // Date - DateInvoiceJulian
                                       new BSSVDBField("F4211.CNDJ"), // Date - CancelDate
                                       new BSSVDBField("F4211.DGL"), // Date - DtForGLAndVouch1
                                       new BSSVDBField("F4211.RSDJ"), // Date - DateReleaseJulian
                                       new BSSVDBField("F4211.PEFJ"), // Date - DatePriceEffectiveDate
                                       new BSSVDBField("F4211.PPDJ"), // Date - DatePromisedShipJu
                                       new BSSVDBField("F4211.VR01"), // String - Reference1
                                       new BSSVDBField("F4211.ITM"), // Numeric - IdentifierShortItem
                                       new BSSVDBField("F4211.LITM"), // String - Identifier2ndItem
                                       new BSSVDBField("F4211.AITM"), // String - Identifier3rdItem
                                       new BSSVDBField("F4211.LOCN"), // String - Location
                                       new BSSVDBField("F4211.LOTN"), // String - Lot
                                       new BSSVDBField("F4211.DSC1"), // String - DescriptionLine1
                                       new BSSVDBField("F4211.DSC2"), // String - DescriptionLine2
                                       new BSSVDBField("F4211.LNTY"), // String - LineType
                                       new BSSVDBField("F4211.NXTR"), // String - StatusCodeNext
                                       new BSSVDBField("F4211.LTTR"), // String - StatusCodeLast
                                       new BSSVDBField("F4211.EMCU"), // String - CostCenterHeader
                                       new BSSVDBField("F4211.SRP1"), // String - SalesReportingCode1
                                       new BSSVDBField("F4211.SRP2"), // String - SalesReportingCode2
                                       new BSSVDBField("F4211.SRP3"), // String - SalesReportingCode3
                                       new BSSVDBField("F4211.SRP4"), // String - SalesReportingCode4
                                       new BSSVDBField("F4211.SRP5"), // String - SalesReportingCode5
                                       new BSSVDBField("F4211.PRP1"), // String - PurchasingReportCode1
                                       new BSSVDBField("F4211.PRP2"), // String - PurchasingReportCode2
                                       new BSSVDBField("F4211.PRP3"), // String - PurchasingReportCode3
                                       new BSSVDBField("F4211.PRP4"), // String - PurchasingReportCode4
                                       new BSSVDBField("F4211.PRP5"), // String - PurchasingReportCode5
                                       new BSSVDBField("F4211.UOM"), // String - UnitOfMeasureAsInput
                                       new BSSVDBField("F4211.UORG"), // Numeric - UnitsTransactionQty
                                       new BSSVDBField("F4211.SOQS"), // Numeric - UnitsQuantityShipped
                                       new BSSVDBField("F4211.SOBK"), // Numeric - UnitsQuanBackorHeld
                                       new BSSVDBField("F4211.SOCN"), // Numeric - UnitsQuantityCanceled
                                       new BSSVDBField("F4211.COMM"), // Character - CommittedHS
                                       new BSSVDBField("F4211.UPRC"), // Numeric - AmtPricePerUnit2
                                       new BSSVDBField("F4211.AEXP"), // Numeric - AmountExtendedPrice
                                       new BSSVDBField("F4211.PROV"), // Character - PriceOverrideCode
                                       new BSSVDBField("F4211.UNCS"), // Numeric - AmountUnitCost
                                       new BSSVDBField("F4211.ECST"), // Numeric - AmountExtendedCost
                                       new BSSVDBField("F4211.CSTO"), // Character - CostOverrideCode
                                       new BSSVDBField("F4211.TCST"), // Numeric - ExtendedCostTransfer
                                       new BSSVDBField("F4211.KCO"), // String - CompanyKey
                                       new BSSVDBField("F4211.DOC"), // Numeric - DocVoucherInvoiceE
                                       new BSSVDBField("F4211.DCT"), // String - DocumentType
                                       new BSSVDBField("F4211.PSN"), // Numeric - PickSlipNumber
                                       new BSSVDBField("F4211.DELN"), // Numeric - DeliveryNumber
                                       new BSSVDBField("F4211.MOT"), // String - ModeOfTransport
                                       new BSSVDBField("F4211.LOB"), // String - LineofBusiness
                                       new BSSVDBField("F4211.EUSE"), // String - EndUse
                                       new BSSVDBField("F4211.SO01"), // Character - SalesOrderStatus01
                                       new BSSVDBField("F4211.FUP"), // Numeric - AmtForPricePerUnit
                                       new BSSVDBField("F4211.FEA"), // Numeric - AmountForeignExtPrice
                                       new BSSVDBField("F4211.FUC"), // Numeric - AmountForeignUnitCost
                                       new BSSVDBField("F4211.FEC") // Numeric - AmountForeignExtCost

        };

        //specify sort order
        BSSVDBSortField[] sortOrder = {
            new BSSVDBSortField(new BSSVDBField("F4211.TRDJ"), BSSVDBSortDirection.ASCENDING) };

        //specify condition records must meet - assume inputs are optional
        ArrayList whereFieldsList = new ArrayList();
        if (internalVO.getQueryWhereFields().getF4211_AN8() != null) {
            whereFieldsList.add(new BSSVDBWhereField(null, new BSSVDBField("F4211.AN8"), IDBService.EQUALS,
                                                     internalVO.getQueryWhereFields().getF4211_AN8()));
        }
        if (internalVO.getQueryWhereFields().getF4211_BEGIN_TRDJ() != null) {
            whereFieldsList.add(new BSSVDBWhereField(IDBService.AND, new BSSVDBField("F4211.TRDJ"), IDBService.GREATER_THAN_OR_EQUAL_TO,
                                                     internalVO.getQueryWhereFields().getF4211_BEGIN_TRDJ()));
        }

        //TODO: CHECK FOR EMPTY whereFieldsList ARRAY LIST
        BSSVDBWhereField[] whereFields = new BSSVDBWhereField[whereFieldsList.size()];
        whereFieldsList.toArray(whereFields);
        BSSVDBWhereClauseBuilder whereClause = new BSSVDBWhereClauseBuilder(context, whereFields);

        BSSVDBResultSet resultSet = null;
        boolean selectDistinct = false;

        try {
            //get dbService from context
            IDBService dbService = context.getDBService();
            //execute db select operation
            resultSet =
                dbService.select(context, connection, "V4211AB", IDBService.DB_BSVW, selectDistinct,
                                 IDBService.DB_FETCH_ALL, selectFields, sortOrder, whereClause);
        } catch (DBServiceException e) {
            //TODO take some action in response to the database exception
            returnMessages.addMessage(new E1Message(context, "005FIS", e.getMessage()));
        }

        //process the results of the select
        if (resultSet != null) {
            BSSVDBFieldMap[] fieldMap = resultSet.getFieldMap();
            if (fieldMap != null && fieldMap.length > 0) {
                ArrayList queryResults = new ArrayList();
                for (int i = 0; i < fieldMap.length; i++) {
                    BSSVDBFieldMap map = fieldMap[i];
                    InternalSelectResults result = new InternalSelectResults();
                    result.setF4211_KCOO((String) map.getValue("F4211.KCOO"));
                    result.setF4211_DOCO((MathNumeric) map.getValue("F4211.DOCO"));
                    result.setF4211_DCTO((String) map.getValue("F4211.DCTO"));
                    result.setF4211_LNID((MathNumeric) map.getValue("F4211.LNID"));
                    result.setF4211_SFXO((String) map.getValue("F4211.SFXO"));
                    result.setF4211_MCU((String) map.getValue("F4211.MCU"));
                    result.setF4211_CO((String) map.getValue("F4211.CO"));
                    result.setF4211_AN8((MathNumeric) map.getValue("F4211.AN8"));
                    result.setF4211_SHAN((MathNumeric) map.getValue("F4211.SHAN"));
                    result.setF4211_PA8((MathNumeric) map.getValue("F4211.PA8"));
                    result.setF4211_DRQJ((Date) map.getValue("F4211.DRQJ"));
                    result.setF4211_TRDJ((Date) map.getValue("F4211.TRDJ"));
                    result.setF4211_PDDJ((Date) map.getValue("F4211.PDDJ"));
                    result.setF4211_OPDJ((Date) map.getValue("F4211.OPDJ"));
                    result.setF4211_ADDJ((Date) map.getValue("F4211.ADDJ"));
                    result.setF4211_IVD((Date) map.getValue("F4211.IVD"));
                    result.setF4211_CNDJ((Date) map.getValue("F4211.CNDJ"));
                    result.setF4211_DGL((Date) map.getValue("F4211.DGL"));
                    result.setF4211_RSDJ((Date) map.getValue("F4211.RSDJ"));
                    result.setF4211_PEFJ((Date) map.getValue("F4211.PEFJ"));
                    result.setF4211_PPDJ((Date) map.getValue("F4211.PPDJ"));
                    result.setF4211_VR01((String) map.getValue("F4211.VR01"));
                    result.setF4211_ITM((MathNumeric) map.getValue("F4211.ITM"));
                    result.setF4211_LITM((String) map.getValue("F4211.LITM"));
                    result.setF4211_AITM((String) map.getValue("F4211.AITM"));
                    result.setF4211_LOCN((String) map.getValue("F4211.LOCN"));
                    result.setF4211_LOTN((String) map.getValue("F4211.LOTN"));
                    result.setF4211_DSC1((String) map.getValue("F4211.DSC1"));
                    result.setF4211_DSC2((String) map.getValue("F4211.DSC2"));
                    result.setF4211_LNTY((String) map.getValue("F4211.LNTY"));
                    result.setF4211_NXTR((String) map.getValue("F4211.NXTR"));
                    result.setF4211_LTTR((String) map.getValue("F4211.LTTR"));
                    result.setF4211_EMCU((String) map.getValue("F4211.EMCU"));
                    result.setF4211_SRP1((String) map.getValue("F4211.SRP1"));
                    result.setF4211_SRP2((String) map.getValue("F4211.SRP2"));
                    result.setF4211_SRP3((String) map.getValue("F4211.SRP3"));
                    result.setF4211_SRP4((String) map.getValue("F4211.SRP4"));
                    result.setF4211_SRP5((String) map.getValue("F4211.SRP5"));
                    result.setF4211_PRP1((String) map.getValue("F4211.PRP1"));
                    result.setF4211_PRP2((String) map.getValue("F4211.PRP2"));
                    result.setF4211_PRP3((String) map.getValue("F4211.PRP3"));
                    result.setF4211_PRP4((String) map.getValue("F4211.PRP4"));
                    result.setF4211_PRP5((String) map.getValue("F4211.PRP5"));
                    result.setF4211_UOM((String) map.getValue("F4211.UOM"));
                    result.setF4211_UORG((MathNumeric) map.getValue("F4211.UORG"));
                    result.setF4211_SOQS((MathNumeric) map.getValue("F4211.SOQS"));
                    result.setF4211_SOBK((MathNumeric) map.getValue("F4211.SOBK"));
                    result.setF4211_SOCN((MathNumeric) map.getValue("F4211.SOCN"));
                    result.setF4211_COMM(map.getValue("F4211.COMM").toString());
                    result.setF4211_UPRC((MathNumeric) map.getValue("F4211.UPRC"));
                    result.setF4211_AEXP((MathNumeric) map.getValue("F4211.AEXP"));
                    result.setF4211_PROV(map.getValue("F4211.PROV").toString());
                    result.setF4211_UNCS((MathNumeric) map.getValue("F4211.UNCS"));
                    result.setF4211_ECST((MathNumeric) map.getValue("F4211.ECST"));
                    result.setF4211_CSTO(map.getValue("F4211.CSTO").toString());
                    result.setF4211_TCST((MathNumeric) map.getValue("F4211.TCST"));
                    result.setF4211_KCO((String) map.getValue("F4211.KCO"));
                    result.setF4211_DOC((MathNumeric) map.getValue("F4211.DOC"));
                    result.setF4211_DCT((String) map.getValue("F4211.DCT"));
                    result.setF4211_PSN((MathNumeric) map.getValue("F4211.PSN"));
                    result.setF4211_DELN((MathNumeric) map.getValue("F4211.DELN"));
                    result.setF4211_MOT((String) map.getValue("F4211.MOT"));
                    result.setF4211_LOB((String) map.getValue("F4211.LOB"));
                    result.setF4211_EUSE((String) map.getValue("F4211.EUSE"));
                    result.setF4211_SO01(map.getValue("F4211.SO01").toString());
                    result.setF4211_FUP((MathNumeric) map.getValue("F4211.FUP"));
                    result.setF4211_FEA((MathNumeric) map.getValue("F4211.FEA"));
                    result.setF4211_FUC((MathNumeric) map.getValue("F4211.FUC"));
                    result.setF4211_FEC((MathNumeric) map.getValue("F4211.FEC"));
                    queryResults.add(result);
                }

                if (resultSet.hasMoreRows()) {
                    returnMessages.addMessage(new E1Message(context, "028FIS", ""));
                }

                //map results to internal vo
                internalVO.setQueryResults(queryResults);
            }
        }
        return returnMessages;
    }

    /**
     * Selects records from the V4211AB business view.
     * <p>Following SQL statement can be produced by this generated code
     * <blockquote><pre><code>
     * SELECT F4211.KCOO, F4211.DOCO, F4211.DCTO, F4211.LNID, F4211.SFXO, F4211.MCU, F4211.CO, F4211.AN8
     *
     * FROM V4211AB
     *
     * WHERE F4211.AN8=?
     *
     * ORDER BY F4211.TRDJ ASC
     * </code></pre></blockquote>
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param internalVO TODO document input parameters
     * @param maxReturnedRows the maximium number of rows returned from the select operation.
     * @return an E1Message containing the text of any database exceptions that may have occurred
     */
    private static E1MessageList selectFromV4211AB_Top10Records(IContext context, IConnection connection, InternalSalesOrderHistory_V4211AB internalVO,
                                                     long maxReturnedRows) {
        //create return object
        E1MessageList returnMessages = new E1MessageList();

        //specify columns to select
        BSSVDBField[] selectFields = { new BSSVDBField("F4211.KCOO"), // String - CompanyKeyOrderNo
                                       new BSSVDBField("F4211.DOCO"), // Numeric - DocumentOrderInvoiceE
                                       new BSSVDBField("F4211.DCTO"), // String - OrderType
                                       new BSSVDBField("F4211.LNID"), // Numeric - LineNumber
                                       new BSSVDBField("F4211.SFXO"), // String - OrderSuffix
                                       new BSSVDBField("F4211.MCU"), // String - CostCenter
                                       new BSSVDBField("F4211.CO"), // String - Company
                                       new BSSVDBField("F4211.AN8"), // Numeric - AddressNumber
                                       new BSSVDBField("F4211.ITM"), // Numeric - IdentifierShortItem
                                       new BSSVDBField("F4211.LITM"), // String - Identifier2ndItem                                       
                                       new BSSVDBField("F4211.TRDJ")

        };

        //specify sort order
        BSSVDBSortField[] sortOrder = {
            new BSSVDBSortField(new BSSVDBField("F4211.TRDJ"), BSSVDBSortDirection.ASCENDING) };

        //specify condition records must meet to be selected
        BSSVDBWhereField[] whereFields = {
            new BSSVDBWhereField(null, new BSSVDBField("F4211.AN8"), IDBService.EQUALS,
                                 internalVO.getQueryWhereFields().getF4211_AN8()) };

        BSSVDBWhereClauseBuilder whereClause = new BSSVDBWhereClauseBuilder(context, whereFields);

        BSSVDBResultSet resultSet = null;
        boolean selectDistinct = false;

        try {
            //get dbService from context
            IDBService dbService = context.getDBService();
            //execute db select operation
            resultSet =
                dbService.select(context, connection, "V4211AB", IDBService.DB_BSVW, selectDistinct, maxReturnedRows,
                                 selectFields, sortOrder, whereClause);
        } catch (DBServiceException e) {
            //TODO take some action in response to the database exception
            returnMessages.addMessage(new E1Message(context, "005FIS", e.getMessage()));
        }

        //process the results of the select
        if (resultSet != null) {
            BSSVDBFieldMap[] fieldMap = resultSet.getFieldMap();
            if (fieldMap != null && fieldMap.length > 0) {
                ArrayList queryResults = new ArrayList();
                for (int i = 0; i < fieldMap.length; i++) {
                    BSSVDBFieldMap map = fieldMap[i];
                    InternalSelectResults result = new InternalSelectResults();
                    result.setF4211_KCOO((String) map.getValue("F4211.KCOO"));
                    result.setF4211_DOCO((MathNumeric) map.getValue("F4211.DOCO"));
                    result.setF4211_DCTO((String) map.getValue("F4211.DCTO"));
                    result.setF4211_LNID((MathNumeric) map.getValue("F4211.LNID"));
                    result.setF4211_SFXO((String) map.getValue("F4211.SFXO"));
                    result.setF4211_MCU((String) map.getValue("F4211.MCU"));
                    result.setF4211_CO((String) map.getValue("F4211.CO"));
                    result.setF4211_AN8((MathNumeric) map.getValue("F4211.AN8"));
                    result.setF4211_ITM((MathNumeric) map.getValue("F4211.ITM"));
                    result.setF4211_LITM((String) map.getValue("F4211.LITM"));
                    result.setF4211_TRDJ((Date) map.getValue("F4211.TRDJ"));
                    
                    queryResults.add(result);
                }

                if (resultSet.hasMoreRows()) {
                    returnMessages.addMessage(new E1Message(context, "028FIS", ""));
                }

                //map results to internal vo
                internalVO.setQueryResults(queryResults);
            }
        }
        return returnMessages;
    }

    /**
     * Selects records from the V4211AB business view.
     * <p>Following SQL statement can be produced by this generated code
     * <blockquote><pre><code>
     * SELECT *
     *
     * FROM V4211AB
     *
     * WHERE F4211.AN8=? AND F4211.TRDJ<=? AND F4211.TRDJ>=?
     *
     * ORDER BY F4211.TRDJ ASC
     * </code></pre></blockquote>
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param internalVO TODO document input parameters
     * @param maxReturnedRows the maximium number of rows returned from the select operation.
     * @return an E1Message containing the text of any database exceptions that may have occurred
     */
    private static E1MessageList selectFromV4211AB_DateRange(IContext context, IConnection connection, InternalSalesOrderHistory_V4211AB internalVO,
                                                     long maxReturnedRows) {
        //create return object
        E1MessageList returnMessages = new E1MessageList();

        //specify columns to select
        BSSVDBField[] selectFields = { new BSSVDBField("F4211.KCOO"), // String - CompanyKeyOrderNo
                                       new BSSVDBField("F4211.DOCO"), // Numeric - DocumentOrderInvoiceE
                                       new BSSVDBField("F4211.DCTO"), // String - OrderType
                                       new BSSVDBField("F4211.LNID"), // Numeric - LineNumber
                                       new BSSVDBField("F4211.SFXO"), // String - OrderSuffix
                                       new BSSVDBField("F4211.MCU"), // String - CostCenter
                                       new BSSVDBField("F4211.CO"), // String - Company
                                       new BSSVDBField("F4211.AN8"), // Numeric - AddressNumber
                                       new BSSVDBField("F4211.SHAN"), // Numeric - AddressNumberShipTo
                                       new BSSVDBField("F4211.PA8"), // Numeric - AddressNumberParent
                                       new BSSVDBField("F4211.DRQJ"), // Date - DateRequestedJulian
                                       new BSSVDBField("F4211.TRDJ"), // Date - DateTransactionJulian
                                       new BSSVDBField("F4211.PDDJ"), // Date - ScheduledPickDate
                                       new BSSVDBField("F4211.OPDJ"), // Date - DateOriginalPromisde
                                       new BSSVDBField("F4211.ADDJ"), // Date - ActualShipDate
                                       new BSSVDBField("F4211.IVD"), // Date - DateInvoiceJulian
                                       new BSSVDBField("F4211.CNDJ"), // Date - CancelDate
                                       new BSSVDBField("F4211.DGL"), // Date - DtForGLAndVouch1
                                       new BSSVDBField("F4211.RSDJ"), // Date - DateReleaseJulian
                                       new BSSVDBField("F4211.PEFJ"), // Date - DatePriceEffectiveDate
                                       new BSSVDBField("F4211.PPDJ"), // Date - DatePromisedShipJu
                                       new BSSVDBField("F4211.VR01"), // String - Reference1
                                       new BSSVDBField("F4211.ITM"), // Numeric - IdentifierShortItem
                                       new BSSVDBField("F4211.LITM"), // String - Identifier2ndItem
                                       new BSSVDBField("F4211.AITM"), // String - Identifier3rdItem
                                       new BSSVDBField("F4211.LOCN"), // String - Location
                                       new BSSVDBField("F4211.LOTN"), // String - Lot
                                       new BSSVDBField("F4211.DSC1"), // String - DescriptionLine1
                                       new BSSVDBField("F4211.DSC2"), // String - DescriptionLine2
                                       new BSSVDBField("F4211.LNTY"), // String - LineType
                                       new BSSVDBField("F4211.NXTR"), // String - StatusCodeNext
                                       new BSSVDBField("F4211.LTTR"), // String - StatusCodeLast
                                       new BSSVDBField("F4211.EMCU"), // String - CostCenterHeader
                                       new BSSVDBField("F4211.SRP1"), // String - SalesReportingCode1
                                       new BSSVDBField("F4211.SRP2"), // String - SalesReportingCode2
                                       new BSSVDBField("F4211.SRP3"), // String - SalesReportingCode3
                                       new BSSVDBField("F4211.SRP4"), // String - SalesReportingCode4
                                       new BSSVDBField("F4211.SRP5"), // String - SalesReportingCode5
                                       new BSSVDBField("F4211.PRP1"), // String - PurchasingReportCode1
                                       new BSSVDBField("F4211.PRP2"), // String - PurchasingReportCode2
                                       new BSSVDBField("F4211.PRP3"), // String - PurchasingReportCode3
                                       new BSSVDBField("F4211.PRP4"), // String - PurchasingReportCode4
                                       new BSSVDBField("F4211.PRP5"), // String - PurchasingReportCode5
                                       new BSSVDBField("F4211.UOM"), // String - UnitOfMeasureAsInput
                                       new BSSVDBField("F4211.UORG"), // Numeric - UnitsTransactionQty
                                       new BSSVDBField("F4211.SOQS"), // Numeric - UnitsQuantityShipped
                                       new BSSVDBField("F4211.SOBK"), // Numeric - UnitsQuanBackorHeld
                                       new BSSVDBField("F4211.SOCN"), // Numeric - UnitsQuantityCanceled
                                       new BSSVDBField("F4211.COMM"), // Character - CommittedHS
                                       new BSSVDBField("F4211.UPRC"), // Numeric - AmtPricePerUnit2
                                       new BSSVDBField("F4211.AEXP"), // Numeric - AmountExtendedPrice
                                       new BSSVDBField("F4211.PROV"), // Character - PriceOverrideCode
                                       new BSSVDBField("F4211.UNCS"), // Numeric - AmountUnitCost
                                       new BSSVDBField("F4211.ECST"), // Numeric - AmountExtendedCost
                                       new BSSVDBField("F4211.CSTO"), // Character - CostOverrideCode
                                       new BSSVDBField("F4211.TCST"), // Numeric - ExtendedCostTransfer
                                       new BSSVDBField("F4211.KCO"), // String - CompanyKey
                                       new BSSVDBField("F4211.DOC"), // Numeric - DocVoucherInvoiceE
                                       new BSSVDBField("F4211.DCT"), // String - DocumentType
                                       new BSSVDBField("F4211.PSN"), // Numeric - PickSlipNumber
                                       new BSSVDBField("F4211.DELN"), // Numeric - DeliveryNumber
                                       new BSSVDBField("F4211.MOT"), // String - ModeOfTransport
                                       new BSSVDBField("F4211.LOB"), // String - LineofBusiness
                                       new BSSVDBField("F4211.EUSE"), // String - EndUse
                                       new BSSVDBField("F4211.SO01"), // Character - SalesOrderStatus01
                                       new BSSVDBField("F4211.FUP"), // Numeric - AmtForPricePerUnit
                                       new BSSVDBField("F4211.FEA"), // Numeric - AmountForeignExtPrice
                                       new BSSVDBField("F4211.FUC"), // Numeric - AmountForeignUnitCost
                                       new BSSVDBField("F4211.FEC") // Numeric - AmountForeignExtCost

        };

        //specify sort order
        BSSVDBSortField[] sortOrder = {
            new BSSVDBSortField(new BSSVDBField("F4211.TRDJ"), BSSVDBSortDirection.ASCENDING) };

        //specify condition records must meet to be selected
        BSSVDBWhereField[] whereFields = {
            new BSSVDBWhereField(null, new BSSVDBField("F4211.AN8"), IDBService.EQUALS,
                                 internalVO.getQueryWhereFields().getF4211_AN8()),
            new BSSVDBWhereField(IDBService.AND, new BSSVDBField("F4211.TRDJ"), IDBService.LESS_THAN_OR_EQUAL_TO,
                                 internalVO.getQueryWhereFields().getF4211_END_TRDJ()),
            new BSSVDBWhereField(IDBService.AND, new BSSVDBField("F4211.TRDJ"), IDBService.GREATER_THAN_OR_EQUAL_TO,
                                 internalVO.getQueryWhereFields().getF4211_BEGIN_TRDJ())
        };

        BSSVDBWhereClauseBuilder whereClause = new BSSVDBWhereClauseBuilder(context, whereFields);

        BSSVDBResultSet resultSet = null;
        boolean selectDistinct = false;

        try {
            //get dbService from context
            IDBService dbService = context.getDBService();
            //execute db select operation
            resultSet =
                dbService.select(context, connection, "V4211AB", IDBService.DB_BSVW, selectDistinct, maxReturnedRows,
                                 selectFields, sortOrder, whereClause);
        } catch (DBServiceException e) {
            //TODO take some action in response to the database exception
            returnMessages.addMessage(new E1Message(context, "005FIS", e.getMessage()));
        }

        //process the results of the select
        if (resultSet != null) {
            BSSVDBFieldMap[] fieldMap = resultSet.getFieldMap();
            if (fieldMap != null && fieldMap.length > 0) {
                ArrayList queryResults = new ArrayList();
                for (int i = 0; i < fieldMap.length; i++) {
                    BSSVDBFieldMap map = fieldMap[i];
                    InternalSelectResults result = new InternalSelectResults();
                    result.setF4211_KCOO((String) map.getValue("F4211.KCOO"));
                    result.setF4211_DOCO((MathNumeric) map.getValue("F4211.DOCO"));
                    result.setF4211_DCTO((String) map.getValue("F4211.DCTO"));
                    result.setF4211_LNID((MathNumeric) map.getValue("F4211.LNID"));
                    result.setF4211_SFXO((String) map.getValue("F4211.SFXO"));
                    result.setF4211_MCU((String) map.getValue("F4211.MCU"));
                    result.setF4211_CO((String) map.getValue("F4211.CO"));
                    result.setF4211_AN8((MathNumeric) map.getValue("F4211.AN8"));
                    result.setF4211_SHAN((MathNumeric) map.getValue("F4211.SHAN"));
                    result.setF4211_PA8((MathNumeric) map.getValue("F4211.PA8"));
                    result.setF4211_DRQJ((Date) map.getValue("F4211.DRQJ"));
                    result.setF4211_TRDJ((Date) map.getValue("F4211.TRDJ"));
                    result.setF4211_PDDJ((Date) map.getValue("F4211.PDDJ"));
                    result.setF4211_OPDJ((Date) map.getValue("F4211.OPDJ"));
                    result.setF4211_ADDJ((Date) map.getValue("F4211.ADDJ"));
                    result.setF4211_IVD((Date) map.getValue("F4211.IVD"));
                    result.setF4211_CNDJ((Date) map.getValue("F4211.CNDJ"));
                    result.setF4211_DGL((Date) map.getValue("F4211.DGL"));
                    result.setF4211_RSDJ((Date) map.getValue("F4211.RSDJ"));
                    result.setF4211_PEFJ((Date) map.getValue("F4211.PEFJ"));
                    result.setF4211_PPDJ((Date) map.getValue("F4211.PPDJ"));
                    result.setF4211_VR01((String) map.getValue("F4211.VR01"));
                    result.setF4211_ITM((MathNumeric) map.getValue("F4211.ITM"));
                    result.setF4211_LITM((String) map.getValue("F4211.LITM"));
                    result.setF4211_AITM((String) map.getValue("F4211.AITM"));
                    result.setF4211_LOCN((String) map.getValue("F4211.LOCN"));
                    result.setF4211_LOTN((String) map.getValue("F4211.LOTN"));
                    result.setF4211_DSC1((String) map.getValue("F4211.DSC1"));
                    result.setF4211_DSC2((String) map.getValue("F4211.DSC2"));
                    result.setF4211_LNTY((String) map.getValue("F4211.LNTY"));
                    result.setF4211_NXTR((String) map.getValue("F4211.NXTR"));
                    result.setF4211_LTTR((String) map.getValue("F4211.LTTR"));
                    result.setF4211_EMCU((String) map.getValue("F4211.EMCU"));
                    result.setF4211_SRP1((String) map.getValue("F4211.SRP1"));
                    result.setF4211_SRP2((String) map.getValue("F4211.SRP2"));
                    result.setF4211_SRP3((String) map.getValue("F4211.SRP3"));
                    result.setF4211_SRP4((String) map.getValue("F4211.SRP4"));
                    result.setF4211_SRP5((String) map.getValue("F4211.SRP5"));
                    result.setF4211_PRP1((String) map.getValue("F4211.PRP1"));
                    result.setF4211_PRP2((String) map.getValue("F4211.PRP2"));
                    result.setF4211_PRP3((String) map.getValue("F4211.PRP3"));
                    result.setF4211_PRP4((String) map.getValue("F4211.PRP4"));
                    result.setF4211_PRP5((String) map.getValue("F4211.PRP5"));
                    result.setF4211_UOM((String) map.getValue("F4211.UOM"));
                    result.setF4211_UORG((MathNumeric) map.getValue("F4211.UORG"));
                    result.setF4211_SOQS((MathNumeric) map.getValue("F4211.SOQS"));
                    result.setF4211_SOBK((MathNumeric) map.getValue("F4211.SOBK"));
                    result.setF4211_SOCN((MathNumeric) map.getValue("F4211.SOCN"));
                    result.setF4211_COMM(map.getValue("F4211.COMM").toString());
                    result.setF4211_UPRC((MathNumeric) map.getValue("F4211.UPRC"));
                    result.setF4211_AEXP((MathNumeric) map.getValue("F4211.AEXP"));
                    result.setF4211_PROV(map.getValue("F4211.PROV").toString());
                    result.setF4211_UNCS((MathNumeric) map.getValue("F4211.UNCS"));
                    result.setF4211_ECST((MathNumeric) map.getValue("F4211.ECST"));
                    result.setF4211_CSTO(map.getValue("F4211.CSTO").toString());
                    result.setF4211_TCST((MathNumeric) map.getValue("F4211.TCST"));
                    result.setF4211_KCO((String) map.getValue("F4211.KCO"));
                    result.setF4211_DOC((MathNumeric) map.getValue("F4211.DOC"));
                    result.setF4211_DCT((String) map.getValue("F4211.DCT"));
                    result.setF4211_PSN((MathNumeric) map.getValue("F4211.PSN"));
                    result.setF4211_DELN((MathNumeric) map.getValue("F4211.DELN"));
                    result.setF4211_MOT((String) map.getValue("F4211.MOT"));
                    result.setF4211_LOB((String) map.getValue("F4211.LOB"));
                    result.setF4211_EUSE((String) map.getValue("F4211.EUSE"));
                    result.setF4211_SO01(map.getValue("F4211.SO01").toString());
                    result.setF4211_FUP((MathNumeric) map.getValue("F4211.FUP"));
                    result.setF4211_FEA((MathNumeric) map.getValue("F4211.FEA"));
                    result.setF4211_FUC((MathNumeric) map.getValue("F4211.FUC"));
                    result.setF4211_FEC((MathNumeric) map.getValue("F4211.FEC"));
                    queryResults.add(result);
                }

                if (resultSet.hasMoreRows()) {
                    returnMessages.addMessage(new E1Message(context, "028FIS", ""));
                }

                //map results to internal vo
                internalVO.setQueryResults(queryResults);
            }
        }
        return returnMessages;
    }
}
