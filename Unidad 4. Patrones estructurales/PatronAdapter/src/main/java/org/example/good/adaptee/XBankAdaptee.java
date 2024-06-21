package org.example.good.adaptee;

import org.example.good.XBankAPI.XBankAPI;
import org.example.good.XBankAPI.XBankCreditRequest;
import org.example.good.XBankAPI.XBankCreditResponse;
import org.example.good.adapter.BankCreditRequest;
import org.example.good.adapter.BankCreditResponse;
import org.example.good.adapter.IBankAdapter;

public class XBankAdaptee implements IBankAdapter {

    @Override
    public BankCreditResponse sendBankCreditRequest(BankCreditRequest request) {

        XBankCreditRequest xbankRequest = new XBankCreditRequest(request.getCustomer(), request.getAmount());
        XBankCreditResponse xbankResponse = XBankAPI.sendCreditRequest(xbankRequest);
        BankCreditResponse response = new BankCreditResponse(xbankResponse.isAproval());
        return response;

    }
}
