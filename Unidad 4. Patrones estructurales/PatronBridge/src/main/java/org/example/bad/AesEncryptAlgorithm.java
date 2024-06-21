package org.example.bad;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;

public class AesEncryptAlgorithm {

    public String aesEncrypt(String msg, String password) throws Exception {

        Key key = new SecretKeySpec(password.getBytes(),"AES");
        Cipher c = Cipher.getInstance("AES");
        c.init(Cipher.ENCRYPT_MODE, key);
        byte[] encVal = c.doFinal(msg.getBytes());
        org.apache.commons.codec.binary.Base64 base64=new org.apache.commons.codec.binary.Base64();
        String encryptedValue= base64.encodeAsString(encVal);
        return encryptedValue;

    }
}
