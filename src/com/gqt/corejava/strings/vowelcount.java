package com.gqt.corejava.strings;

import java.util.Scanner;

public class vowelcount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		int vowel_count=0;
		int cons_count=0;
		str=str.toUpperCase();
		for(int i=0;i<str.length()-1;i++) {
		if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
			if(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='i' 
					|| str.charAt(i)=='o' ||str.charAt(i)=='u') {
				vowel_count++;
			}
			else {
				cons_count++;
			}
		}
	}
	System.out.println("Vowel_count="+vowel_count);
	System.out.println("constant_count="+cons_count);
	}
}

			
			
		


