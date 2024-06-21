package org.example.good.XBankAPI;

public class XBankCreditResponse {
    public boolean aproval;

    public XBankCreditResponse() {
    }

    public XBankCreditResponse(boolean aproval) {
        this.aproval = aproval;
    }

    public boolean isAproval() {
        return aproval;
    }

    public void setAproval(boolean aproval) {
        this.aproval = aproval;
    }
}
