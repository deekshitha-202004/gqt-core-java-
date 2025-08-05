package com.gqt.corejava.strings;

import java.util.Scanner;

public class vowelreplace2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
				if(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' 
						|| str.charAt(i)=='O' ||str.charAt(i)=='U') {
					str=str.replace('A','$');
					str=str.replace('E','#');
					str=str.replace('I','*');
					str=str.replace('O','@');
					str=str.replace('U','&');
					
				}
			}
	if(str.charAt(i)>='a' && str.charAt(i)<='z') {
		if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' 
				|| str.charAt(i)=='o' ||str.charAt(i)=='u') {
			str=str.replace('a','$');
			str=str.replace('e','#');
			str=str.replace('i','*');
			str=str.replace('o','@');
			str=str.replace('u','&');
		}
	}
		}
	System.out.println("Resultant replaced string:"+str);
		}
	}

	
	
