package com.gqt.corejava.practice;

import java.util.Scanner;
public class introduction05 {
	
	    static int fact(int n) {
	        if (n <= 1)  // base case
	            return 1;
	        return n * fact(n - 1); // recursive call
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();
	        
	        System.out.println("Factorial of " + num + " is: " + fact(num));
	        
	    }
	}
