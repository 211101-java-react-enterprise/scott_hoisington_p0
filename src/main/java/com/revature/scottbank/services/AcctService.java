package com.revature.scottbank.services;

public class AcctService {

    public AcctService() {

    }

    public void makeDeposit(double deposit) {

    }

    public void makeWithdrawal(double withdrawal) {

    }

    public boolean isDepositValid(double deposit) {
        if (deposit <= 0) return false;
        return true;
    }

    public boolean isWithdrawalValid(double withdrawal) {
        if (withdrawal <= 0) return false;
        return true;
    }

}
