package com.revature.scottbank.services;

import com.revature.scottbank.exceptions.AuthenticationException;
import com.revature.scottbank.exceptions.InvalidRequestException;
import com.revature.scottbank.models.AppUser;

public class UserService {

    private AppUser sessionUser;

    public UserService() {
        this.sessionUser = null;
    }

    public AppUser getSessionUser() { return sessionUser; }

    public boolean registerNewUser(AppUser newUser) {
        if (!isUserValid(newUser)) {
            throw new InvalidRequestException("Please complete all information");
        }
        return true;
    }

    public void authUser(String email, String password) {
        if (email == null || email.trim().equals("") || password == null ||
                password.trim().equals("")) {
            throw new InvalidRequestException("Email and password are required for logging " +
                    "in");
        }
        AppUser authUser;
        if (authUser == null) {
            throw new AuthenticationException();
        }
        sessionUser = authUser;
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
