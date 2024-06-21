package org.example.good;

import org.example.good.abstraction.DefaultMessageEncrypt;
import org.example.good.implementation.DesEncryptAlgorithm;

public class Main {
    public static void main(String[] args) throws Exception {

        DefaultMessageEncrypt encryptor = new DefaultMessageEncrypt();
        System.out.println(encryptor.encryptMessage("hola mundo"));

    }


}