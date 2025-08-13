package com.gqt.corejava.practice;

import java.util.Scanner;
public class introduction13 {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter first number: ");
	        int a = sc.nextInt();

	        System.out.print("Enter second number: ");
	        int b = sc.nextInt();

	        while (b != 0) {  // Euclidean Algorithm
	            int temp = b;
	            b = a % b;
	            a = temp;
	        }

	        System.out.println("GCD = " + a);

	    }
	}

