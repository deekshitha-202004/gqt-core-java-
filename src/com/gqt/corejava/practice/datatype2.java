package com.gqt.corejava.practice;

import java.util.Scanner;
public class datatype2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter two float numbers: ");
	        float a = sc.nextFloat(), b = sc.nextFloat();
	        System.out.print("Enter two double numbers: ");
	        double x = sc.nextDouble(), y = sc.nextDouble();

	        System.out.println("Float Sum: " + (a + b));
	        System.out.println("Double Product: " + (x * y));
	}

}

