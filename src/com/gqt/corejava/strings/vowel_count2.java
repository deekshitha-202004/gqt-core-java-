package com.gqt.corejava.strings;

import java.util.Scanner;

public class vowel_count2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		int upper_vowel_count=0;
		int lower_cons_count=0;
		str=str.toUpperCase();
		for(int i=0;i<str.length()-1;i++) {
		if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
			if(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' 
					|| str.charAt(i)=='O' ||str.charAt(i)=='U') {
			}
		}
		if(str.charAt(i)>='a' && str.charAt(i)<='z') {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' 
					|| str.charAt(i)=='o' ||str.charAt(i)=='u') {
			}
		}
		}

		System.out.println("upper_vowel_count="+upper_vowel_count);
		System.out.println("lower_vowel_count="+lower_cons_count);
		}	
	}

	


