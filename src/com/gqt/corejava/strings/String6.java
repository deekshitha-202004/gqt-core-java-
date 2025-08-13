package com.gqt.corejava.strings;


import java.util.Scanner;

public class String6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        int res=str.length();
        System.out.println("The length of the string is:"+res);
	}

}

