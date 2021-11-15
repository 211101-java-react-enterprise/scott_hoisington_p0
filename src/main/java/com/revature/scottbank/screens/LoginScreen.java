package com.revature.scottbank.screens;

import com.revature.scottbank.services.UserService;
import com.revature.scottbank.util.ScreenRouter;

import java.io.BufferedReader;

public class LoginScreen extends Screen {

    private final UserService userService;

    public LoginScreen(BufferedReader consoleReader, ScreenRouter router,
                       UserService userService) {
        super("/login", consoleReader, router);
        this.userService = userService;
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
