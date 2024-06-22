package org.example.good.abstraction;

import org.example.good.implementation.AesEncryptAlgorithm;
import org.example.good.implementation.DesEncryptAlgorithm;
import org.example.good.implementation.IEncryptAlgorithm;

public class DefaultMessageEncrypt implements IMessageEncrypt{

    private IEncryptAlgorithm encryptAlgorithm;

    public DefaultMessageEncrypt() {
        this.encryptAlgorithm = new AesEncryptAlgorithm();
    }

    @Override
    public String encryptMessage(String msg) throws Exception{
        String password = "jairoseoanesleon";
        return this.encryptAlgorithm.encrypt(msg, password);
    }
}
