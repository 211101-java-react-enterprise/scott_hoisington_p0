package com.revature.scottbank.services;

import com.revature.scottbank.models.AppUser;

public class UserService {

    private AppUser sessionUser;

    public UserService() {

    }

    public AppUser getSessionUser() { return sessionUser; }

    public boolean registerNewUser(AppUser newUser) {
        return true;
    }

    public void authUser() {

    }

    public void logout() { sessionUser = null; }

    public boolean isSessionActive() { return sessionUser != null; }

    public boolean isUserValid(AppUser user) {
        if (user == null) return false;
        if (user.getFirstName() == null || user.getFirstName().trim().equals(
                "")) return false;
        if (user.getLastName() == null || user.getLastName().trim().equals(
                "")) return false;
        if (user.getEmail() == null || user.getEmail().trim().equals(
                "")) return false;
        return user.getPassword() != null && !user.getPassword().trim().equals("");
    }

}
