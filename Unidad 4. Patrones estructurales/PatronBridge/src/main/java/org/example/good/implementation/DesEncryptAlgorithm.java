package org.example.good.implementation;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

public class DesEncryptAlgorithm implements IEncryptAlgorithm{

    @Override
    public String encrypt(String msg, String password) throws Exception{

        DESKeySpec dks = new DESKeySpec(msg.getBytes());
        SecretKeyFactory skf = SecretKeyFactory.getInstance("DES");
        SecretKey desKey = skf.generateSecret(dks);
        Cipher desCipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
        desCipher.init(Cipher.ENCRYPT_MODE, desKey);

        org.apache.commons.codec.binary.Base64 base64=new org.apache.commons.codec.binary.Base64();
        return base64.encodeAsString(desCipher.doFinal(msg.getBytes()));


    }
}
