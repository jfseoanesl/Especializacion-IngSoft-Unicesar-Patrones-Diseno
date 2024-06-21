package org.example.good.implementation;
public class NoEncryptAlgorithm implements IEncryptAlgorithm {

    @Override
    public String encrypt(String msg, String password) throws Exception {
        return msg;
    }
}
