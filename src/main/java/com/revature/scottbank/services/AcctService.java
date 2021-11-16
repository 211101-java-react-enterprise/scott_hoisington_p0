package com.revature.scottbank.services;

import com.revature.scottbank.daos.AcctDAO;
import com.revature.scottbank.exceptions.ResourcePersistenceException;
import com.revature.scottbank.models.Account;
import com.revature.scottbank.models.AppUser;

public class AcctService {

    private final AcctDAO acctDAO;

    public AcctService(AcctDAO acctDAO) {
        this.acctDAO = acctDAO;
    }

    public boolean openNewAcct(AppUser user) {
        Account newAcct = new Account();
        Account savedAcct = acctDAO.save(newAcct, user);
        if (savedAcct == null) {
            throw new ResourcePersistenceException("The account could not be " +
                    "persisted to the datasource");
        }
        return true;
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
