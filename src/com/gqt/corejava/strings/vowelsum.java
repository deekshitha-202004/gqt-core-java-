package com.gqt.corejava.strings;

import java.util.Scanner;

public class vowelsum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		int sum=0;
		for(int i=0;i<str.length();i++) {
			sum=sum+str.charAt(i);
		}
		System.out.println("sum of the string is="+sum);
	}
}
		

	


