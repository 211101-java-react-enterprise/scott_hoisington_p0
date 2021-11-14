package com.revature.scottbank.screens;

import com.revature.scottbank.util.ScreenRouter;

import java.io.BufferedReader;

import static com.revature.scottbank.util.AppState.shutdown;

public class DashboardScreen extends Screen {

    public DashboardScreen(BufferedReader consoleReader, ScreenRouter router) {
        super("/dashboard", consoleReader, router);
    }

    @Override
    public void render() throws Exception {
        System.out.printf("\n%s %s's Account\n", "User", "Userton");
        System.out.printf("Balance: $%s\n", "100.00");
        String menu = "1) Deposit to Your Account\n" +
                "2) Withdraw from Your Account\n" +
                "3) Log Out\n" +
                "> ";
        System.out.print(menu);
        String userSelection = consoleReader.readLine();

        switch (userSelection) {
            case "1":
                router.navigate("/deposit");
                break;
            case "2":
                router.navigate("/withdraw");
                break;
            case "3":
                System.out.println("\nGoodbye. Come back soon.\n\n");
                shutdown();
                break;
            default:
                System.out.println("\nInvalid Selection. Please try again.\n");
        }
    }

}
