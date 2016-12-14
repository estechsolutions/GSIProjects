package tcc.e1.bssv.JP550300;

import oracle.e1.bssvfoundation.exception.BusinessServiceException;

import tcc.e1.bssv.JP550300.valueobject.CreditCheckReply;
import tcc.e1.bssv.JP550300.valueobject.CreditCheckRequest;

public class TestAccountsReceivableManagerTCC
{
    public static void main(String[] args)
    {
        CreditCheckRequest ccRequest = new CreditCheckRequest();
        ccRequest.setCustomerIdTCC("TCC-2740001");
        
        try
        {
            AccountsReceivableManagerTCC armt = new AccountsReceivableManagerTCC();
            CreditCheckReply ccReply = armt.doCreditCheck(ccRequest);
            
            if(ccReply != null)
            {
                System.out.println("Success!" + ccReply.getAccountCreditBalance());
            }
        }
        catch(BusinessServiceException exp)
        {
            System.out.println("Some Exception Occured!");
        }
    }
}
