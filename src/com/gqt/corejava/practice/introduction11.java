package com.gqt.corejava.practice;

import java.util.Scanner;
public class introduction11 {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();

	        String rev = "";
	        for (int i = str.length() - 1; i >= 0; i--) {
	            rev += str.charAt(i);
	        }

	        if (str.equalsIgnoreCase(rev)) {
	            System.out.println(str + " is a Palindrome.");
	        } else {
	            System.out.println(str + " is NOT a Palindrome.");
	        }

	    }
	}
