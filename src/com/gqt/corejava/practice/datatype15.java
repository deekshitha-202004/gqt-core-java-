package com.gqt.corejava.practice;

import java.util.Scanner;
public class datatype15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter string: ");
	        String str = sc.nextLine();
	        String rev = "";
	        for (int i = str.length() - 1; i >= 0; i--) rev += str.charAt(i);
	        System.out.println(str.equals(rev) ? "Palindrome" : "Not Palindrome");
	}

}

