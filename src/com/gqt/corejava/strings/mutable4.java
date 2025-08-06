package com.gqt.corejava.strings;

import java.util.Scanner;
 
public class mutable4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string 1 for string buffer :");
		String str1=sc.nextLine();
		System.out.println("Enter the string 2 for string builder :");
		String str2=sc.nextLine();
		StringBuffer sb1=new StringBuffer(str1);
		StringBuffer sb2=new StringBuffer(str2);
		//compareTo()
				if(sb1.compareTo(sb2)==0) {
					System.out.println("strings are equal ");
				}
				else {
					System.out.println("string are not equal");
				}
	}
}


	


