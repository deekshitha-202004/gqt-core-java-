
		package com.gqt.corejava.strings;

		import java.util.Scanner;

		public class vowel_sum1 {

			public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the string : ");
				String str=sc.nextLine();
			    int sum=0; 
				for(int i=0;i<str.length();i++) {
					if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
						sum=sum+str.charAt(i);
					}
					if(str.charAt(i)>='a' && str.charAt(i)<='z') {
						sum=sum+str.charAt(i);
					}
				}
				System.out.println("Sum of the string : "+sum);
			}

		}
