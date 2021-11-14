package com.revature.scottbank.screens;

import com.revature.scottbank.util.ScreenRouter;

import java.io.BufferedReader;

public class LoginScreen extends Screen {

    public LoginScreen(BufferedReader consoleReader, ScreenRouter router) {
        super("/login", consoleReader, router);
    }

    @Override
    public void render() throws Exception {
        System.out.println("\nLog in to see your ScottBank account details\n");
        System.out.print("Email: ");
        String email = consoleReader.readLine();
        System.out.print("Password: ");
        String password = consoleReader.readLine();
    }

}
