package com.gqt.corejava.strings;

import java.util.Scanner;

public class mutable8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string 1 for string buffer :");
		String str1=sc.nextLine();
		System.out.println("Enter the string 2 for string buil der :");
		String str2=sc.nextLine();
		StringBuffer sb1=new StringBuffer(str1);
		StringBuffer sb2=new StringBuffer(str2);
		//insert()
				StringBuffer res4=sb1.insert(4, ",");
				System.out.println("INSERT METHOD : "+res4);


	}

}
