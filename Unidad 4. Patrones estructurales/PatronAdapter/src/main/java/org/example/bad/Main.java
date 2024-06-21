package org.example.bad;

import org.example.bad.Clientes.ClienteXBank;
import org.example.bad.Clientes.ClienteYBank;

public class Main {
    public static void main(String[] args) {

        ClienteXBank xbank = new ClienteXBank();
        System.out.println("XBank result: " + xbank.XBankCreditRequest("Jairo", 10000));

        ClienteYBank ybank = new ClienteYBank();
        System.out.println("YBank result: " + ybank.getCreditYBank("Luis", 10000));

    }
}