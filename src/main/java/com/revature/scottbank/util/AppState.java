package com.revature.scottbank.util;

public class AppState {

    private static boolean appRunning;

    public AppState() {
        appRunning = true;
    }

    public void startup() {
        try {
            while (appRunning) {

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void shutdown() { appRunning = false; }

}
