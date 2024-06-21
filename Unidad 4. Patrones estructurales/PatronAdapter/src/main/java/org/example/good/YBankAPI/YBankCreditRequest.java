package org.example.good.YBankAPI;

public class YBankCreditRequest {

    private String name;
    public float credit;

    public YBankCreditRequest() {
    }

    public YBankCreditRequest(String name, float credit) {
        this.name = name;
        this.credit = credit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCredit() {
        return credit;
    }

    public void setCredit(float credit) {
        this.credit = credit;
    }
}
