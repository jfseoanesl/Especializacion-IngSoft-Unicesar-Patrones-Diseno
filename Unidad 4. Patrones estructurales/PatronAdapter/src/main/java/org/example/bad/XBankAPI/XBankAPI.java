package org.example.bad.XBankAPI;

public class XBankAPI {

    public static XBankCreditResponse sendCreditRequest(XBankCreditRequest request){

        XBankCreditResponse response = new XBankCreditResponse();
        if(request.getRequestAmount()<=5000){
            response.setAproval(true);
        }
        else{
            response.setAproval(false);
        }
         return response;
    }
}
