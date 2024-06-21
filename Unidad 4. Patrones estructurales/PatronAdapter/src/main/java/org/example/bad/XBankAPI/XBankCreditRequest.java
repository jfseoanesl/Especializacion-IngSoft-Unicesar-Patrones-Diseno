package org.example.bad.XBankAPI;

public class XBankCreditRequest {

    private String ncustomerName;
    private double requestAmount;

    public XBankCreditRequest() {
    }

    public XBankCreditRequest(String ncustomerName, double requestAmount) {
        this.ncustomerName = ncustomerName;
        this.requestAmount = requestAmount;
    }

    public String getNcustomerName() {
        return ncustomerName;
    }

    public void setNcustomerName(String ncustomerName) {
        this.ncustomerName = ncustomerName;
    }

    public double getRequestAmount() {
        return requestAmount;
    }

    public void setRequestAmount(double requestAmount) {
        this.requestAmount = requestAmount;
    }
}
