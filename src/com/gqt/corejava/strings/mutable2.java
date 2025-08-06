package com.gqt.corejava.strings;

import java.util.Scanner;

public class mutable2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string 1 for string buffer :");
		String str1=sc.nextLine();
		System.out.println("Enter the string 2 for string builder :");
		String str2=sc.nextLine();
		StringBuffer sb1=new StringBuffer(str1);
		StringBuffer sb2=new StringBuffer(str2);
		//charAt()
				char ch=sb1.charAt(0);
				System.out.println("character of the string is : "+ch);

	}

}
