package org.example.good.adaptee;

import org.example.good.YBankAPI.YBankAPI;
import org.example.good.YBankAPI.YBankCreditRequest;
import org.example.good.YBankAPI.YBankCreditResponse;
import org.example.good.adapter.BankCreditRequest;
import org.example.good.adapter.BankCreditResponse;
import org.example.good.adapter.IBankAdapter;

public class YBankAdaptee implements IBankAdapter {
    @Override
    public BankCreditResponse sendBankCreditRequest(BankCreditRequest request) {
        YBankCreditRequest ybankRequest = new YBankCreditRequest(request.getCustomer(),(float)request.getAmount());
        YBankCreditResponse ybankResponse = YBankAPI.YBankCreditValidate(ybankRequest);
        BankCreditResponse response = new BankCreditResponse();
        response.setApproved(ybankResponse.getAproved().equals("Y"));
        return response;
    }
}
