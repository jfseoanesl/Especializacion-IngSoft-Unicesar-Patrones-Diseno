package org.example.good.adapter;

public class BankCreditResponse {
    public boolean approved;

    public BankCreditResponse(boolean approved) {
        this.approved = approved;
    }

    public BankCreditResponse() {
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }
}
