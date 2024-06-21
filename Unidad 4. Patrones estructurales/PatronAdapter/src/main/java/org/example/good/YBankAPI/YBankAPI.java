package org.example.good.YBankAPI;

public class YBankAPI {

    public static YBankCreditResponse YBankCreditValidate(YBankCreditRequest request){

         YBankCreditResponse response = new YBankCreditResponse();
         response.setAproved((request.getCredit()<=10000)?"Y":"N");
         return response;
    }
}
