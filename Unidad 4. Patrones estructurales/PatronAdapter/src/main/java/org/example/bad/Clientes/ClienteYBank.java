package org.example.bad.Clientes;

import org.example.bad.YBankAPI.YBankAPI;
import org.example.bad.YBankAPI.YBankCreditRequest;
import org.example.bad.YBankAPI.YBankCreditResponse;

public class ClienteYBank {

    public boolean getCreditYBank(String name, float amount){

        YBankCreditRequest request = new YBankCreditRequest("jairo", 500);
        YBankCreditResponse response = YBankAPI.YBankCreditValidate(request);
        return (response.getAproved().equals("Y"));

    }

}
