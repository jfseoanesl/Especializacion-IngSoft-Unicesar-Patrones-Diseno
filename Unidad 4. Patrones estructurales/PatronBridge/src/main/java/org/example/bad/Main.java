package org.example.bad;

import org.example.bad.AesEncryptAlgorithm;
import org.example.bad.DesEncryptAlgorithm;

public class Main {
    public static void main(String[] args) throws Exception {

        String msgEncrypted = encryptMessage("Hola Mundo");
        System.out.println(msgEncrypted);

    }

    public static String encryptMessage(String msg) throws Exception {

        String password = "jairoseoanesleon";
        DesEncryptAlgorithm des = new DesEncryptAlgorithm();
        return des.encrypt(msg, password);

    }
}