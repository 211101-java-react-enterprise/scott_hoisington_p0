package com.revature.scottbank.util;

import com.revature.scottbank.daos.AppUserDAO;
import com.revature.scottbank.models.AppUser;
import com.revature.scottbank.screens.*;
import com.revature.scottbank.services.UserService;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AppState {

    private static boolean appRunning;
    private final ScreenRouter router;

    public AppState() {
        appRunning = true;
        router = new ScreenRouter();
        BufferedReader consoleReader =
                new BufferedReader(new InputStreamReader(System.in));

        AppUserDAO userDAO = new AppUserDAO();
        UserService userService = new UserService(userDAO);

        router.addScreen(new WelcomeScreen(consoleReader, router));
        router.addScreen(new NewAcctScreen(consoleReader, router, userService));
        router.addScreen(new LoginScreen(consoleReader, router, userService));
        router.addScreen(new DashboardScreen(consoleReader, router, userService));

    }

    public void startup() {
        try {
            while (appRunning) {
                router.navigate("/welcome");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void shutdown() { appRunning = false; }

}
