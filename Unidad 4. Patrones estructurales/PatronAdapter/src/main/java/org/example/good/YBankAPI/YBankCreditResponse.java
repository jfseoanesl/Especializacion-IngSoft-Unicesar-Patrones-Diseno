package org.example.good.YBankAPI;

public class YBankCreditResponse {
   private String aproved;

    public YBankCreditResponse() {
    }

    public YBankCreditResponse(String aproved) {
        this.aproved = aproved;
    }

    public String getAproved() {
        return aproved;
    }

    public void setAproved(String aproved) {
        this.aproved = aproved;
    }
}
