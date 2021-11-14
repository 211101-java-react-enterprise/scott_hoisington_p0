package com.revature.scottbank.screens;

import com.revature.scottbank.util.ScreenRouter;

import java.io.BufferedReader;

public class NewAcctScreen extends Screen {

    public NewAcctScreen(BufferedReader consoleReader, ScreenRouter router) {
        super("/new-acct", consoleReader, router);
    }

    @Override
    public void render() throws Exception {
        String stmt = "\nPlease provide the following required information.\n";
        System.out.println(stmt);
        System.out.print("First Name: ");
        String firstName = consoleReader.readLine();
        System.out.print("Last Name: ");
        String lastName = consoleReader.readLine();
        System.out.print("Email: ");
        String email = consoleReader.readLine();
        System.out.print("Password: ");
        String password = consoleReader.readLine();
    }

}
