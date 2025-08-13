package com.gqt.corejava.practice;

import java.util.Scanner;
public class datatype13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter string: ");
	        String str = sc.nextLine();
	        System.out.println("Substring(0,3): " + str.substring(0, 3));
	        System.out.println("Index of 'a': " + str.indexOf('a'));
	        System.out.println("Equals 'java': " + str.equals("java"));
	}

}

