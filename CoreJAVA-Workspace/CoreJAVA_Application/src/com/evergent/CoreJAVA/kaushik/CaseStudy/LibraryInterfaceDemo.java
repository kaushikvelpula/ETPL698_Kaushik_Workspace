package com.evergent.CoreJAVA.kaushik.CaseStudy;
import java.util.*;
import java.util.Scanner;

public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Test case #1: KidUsers
        System.out.println("Test case #1: KidUsers");
        try {
            KidUsers kidUser = new KidUsers();
            
            // Taking age input from the user
            System.out.print("Enter age for KidUser: ");
            int kidAge = scanner.nextInt();
            kidUser.registerAccount(kidAge);
            
            // Taking book type input from the user
            System.out.print("Enter book type for KidUser: ");
            String kidBookType = scanner.next();
            kidUser.requestBook(kidBookType);
            
        } catch (InvalidAgeException | InvalidBookTypeException e) {
            System.out.println(e.getMessage());
        }

        // Test case #2: AdultUser
        System.out.println("\nTest case #2: AdultUser");
        try {
            AdultUser adultUser = new AdultUser();
            
            // Taking age input from the user
            System.out.print("Enter age for AdultUser: ");
            int adultAge = scanner.nextInt();
            adultUser.registerAccount(adultAge);
            
            // Taking book type input from the user
            System.out.print("Enter book type for AdultUser: ");
            String adultBookType = scanner.next();
            adultUser.requestBook(adultBookType);
            
        } catch (InvalidAgeException | InvalidBookTypeException e) {
            System.out.println(e.getMessage());
        }

        scanner.close(); // Close the scanner after use
    }
}
