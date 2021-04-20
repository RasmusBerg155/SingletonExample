package com.company;

public class Main {

    public static void main(String[] args) {
        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();
        Singleton z = Singleton.getInstance();

        x.s = (x.s).toUpperCase();

        System.out.println("String from x is: " + x.s);
        System.out.println("String from y is: " + y.s);
        System.out.println("String from z is: " + z.s);
        System.out.println("\n");

        z.s = (z.s).toLowerCase();

        System.out.println("String from x is: " + x.s);
        System.out.println("String from y is: " + y.s);
        System.out.println("String from z is: " + z.s);

        LoggedIn LoggedUser1 = LoggedIn.getInstance();
        LoggedIn LoggedUser2 = LoggedIn.getInstance();
        LoggedIn LoggedUser3 = LoggedIn.getInstance();

        System.out.println("Current logged in user is: " + LoggedUser1.username);
        System.out.println("Current logged in user is: " + LoggedUser2.username);
        System.out.println("Current logged in user is: " + LoggedUser3.username);

        LoggedUser1.username = "new user";

        System.out.println("Current logged in user is: " + LoggedUser1.username);
        System.out.println("Current logged in user is: " + LoggedUser2.username);
        System.out.println("Current logged in user is: " + LoggedUser3.username);

    }


}