package org.example.bad.Clientes;

import org.example.bad.XBankAPI.XBankAPI;
import org.example.bad.XBankAPI.XBankCreditRequest;
import org.example.bad.XBankAPI.XBankCreditResponse;

public class ClienteXBank {

    public boolean XBankCreditRequest(String nombre, double valor){
        XBankCreditRequest request = new XBankCreditRequest(nombre, valor);
        XBankCreditResponse response = XBankAPI.sendCreditRequest(request);
        return response.isAproval();
    }
}
