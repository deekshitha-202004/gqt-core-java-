package com.gqt.corejava.practice;

import java.util.Scanner;
public class introduction06 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a: ");
	        double a = sc.nextDouble();
	        System.out.print("Enter b: ");
	        double b = sc.nextDouble();
	        System.out.print("Enter c: ");
	        double c = sc.nextDouble();

	        double d = b * b - 4 * a * c; 
	        double r1 = (-b + Math.sqrt(Math.abs(d))) / (2 * a);
	        double r2 = (-b - Math.sqrt(Math.abs(d))) / (2 * a);

	        if (d >= 0) {
	            System.out.println("Root 1 = " + r1);
	            System.out.println("Root 2 = " + r2);
	        } else {
	            System.out.println("Complex Roots:");
	            System.out.println("Root 1 = " + (-b / (2 * a)) + " + " + (Math.sqrt(-d) / (2 * a)) + "i");
	            System.out.println("Root 2 = " + (-b / (2 * a)) + " - " + (Math.sqrt(-d) / (2 * a)) + "i");
	        }

	    }
	}
