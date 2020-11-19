package com.dkit.hd2.johnloane;

import java.util.Scanner;

/**
 * Menus with Enums
 *
 */
public class App 
{
    private static Scanner keyboard = new Scanner(System.in);
    public static void main( String[] args )
    {
        System.out.println( "Weclome to our Banking application" );

        MenuOptions selectedOption = MenuOptions.CONTINUE;

        while(selectedOption != MenuOptions.QUIT)
        {
            try
            {
                //print the menu
                //get the user's selection
                //act on that selection
                //exit the loop on quit
                menu();

            }
        }
    }

    private static void menu()
    {
        System.out.println("\nEnter: ");
        System.out.println("\t 1. Create bank");
        System.out.println("\t 2. Add a branch to a bank");
        System.out.println("\t 3. Add a customer to a branch");
        System.out.println("\t 4. Customer transaction");
        System.out.println("\t 5. Display banks, branches, customers, transactions");
        System.out.println("\t 6. Quit");
        System.out.println("\n Selection -> ");
    }
}
