package com.company;

public class LoggedIn {
    private static LoggedIn single_instance = null;

    public String username;

    private LoggedIn(String username){
        this.username = username;
    }

    public static LoggedIn getInstance()
    {
        if (single_instance == null)
            single_instance = new LoggedIn("no user");

        return single_instance;
    }
}
