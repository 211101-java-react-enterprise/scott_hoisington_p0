package com.revature.scottbank.screens;

import com.revature.scottbank.exceptions.InvalidRequestException;
import com.revature.scottbank.exceptions.ResourcePersistenceException;
import com.revature.scottbank.models.AppUser;
import com.revature.scottbank.services.UserService;
import com.revature.scottbank.util.ScreenRouter;

import java.io.BufferedReader;

public class NewAcctScreen extends Screen {

    private final UserService userService;

    public NewAcctScreen(BufferedReader consoleReader, ScreenRouter router,
                         UserService userService) {
        super("/new-acct", consoleReader, router);
        this.userService = userService;
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
        AppUser newUser = new AppUser(firstName,lastName,email,password);
        try {
            userService.registerNewUser(newUser);
            System.out.println("\nSign Up was successful\n");
            router.navigate("/login");
        } catch (InvalidRequestException | ResourcePersistenceException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
