package org.example.good;

import org.example.good.adaptee.XBankAdaptee;
import org.example.good.adaptee.YBankAdaptee;
import org.example.good.adapter.BankCreditRequest;
import org.example.good.adapter.BankCreditResponse;
import org.example.good.adapter.IBankAdapter;

public class Main {
    public static void main(String[] args) {

        IBankAdapter bank = new XBankAdaptee();
        BankCreditRequest request = new BankCreditRequest("Jairo", 10000);
        BankCreditResponse response = bank.sendBankCreditRequest(request);
        System.out.println("XBank result: " + response.isApproved());

        bank = new YBankAdaptee();
        request = new BankCreditRequest("Luis", 10000);
        response = bank.sendBankCreditRequest(request);
        System.out.println("YBank result: " + response.isApproved());


    }
}