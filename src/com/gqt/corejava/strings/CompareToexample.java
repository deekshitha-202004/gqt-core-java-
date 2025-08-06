package com.gqt.corejava.strings;

import java.util.Scanner;

public class CompareToexample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter the string-1: ");
        String str1 = sc.next();
        System.out.println("Enter the string-2: ");
        String str2 = sc.next();

        if (str1.compareTo(str2) == 0) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        System.out.println();

        System.out.println("Enter the string-1: ");
        String str3 = sc.next();
        System.out.println("Enter the string-2: ");
        String str4 = sc.next();

        if (str3.compareToIgnoreCase(str4) == 0) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

    }
}
