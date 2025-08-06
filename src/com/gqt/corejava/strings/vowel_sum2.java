
		package com.gqt.corejava.strings;

		import java.util.Scanner;

		public class vowel_sum2 {

			public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the string : ");
				String str=sc.nextLine();
			    int upper_vowel_sum=0; 
			    int lower_vowel_sum=0;
			    int cons_product=1;
			    for(int i=0;i<str.length();i++) {
					if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
						if(str.charAt(i)=='A' ||str.charAt(i)=='E' ||str.charAt(i)=='I'
								||str.charAt(i)=='O'||str.charAt(i)=='U') {
							upper_vowel_sum=upper_vowel_sum+str.charAt(i);
						}
						else {
							cons_product=cons_product+str.charAt(i);
						}
					}
					if(str.charAt(i)>='a' && str.charAt(i)<='z') {
						if(str.charAt(i)=='a' ||str.charAt(i)=='e' ||str.charAt(i)=='i'
								||str.charAt(i)=='o'||str.charAt(i)=='u') {
							lower_vowel_sum=lower_vowel_sum+str.charAt(i);
						}
						else {
							cons_product=cons_product*str.charAt(i);
						}
					}
				}
				System.out.println("Sum of the upper vowel sum string : "+upper_vowel_sum);
				System.out.println("Sum of the lower vowel sum string : "+lower_vowel_sum);
				System.out.println("product of the consonents string : "+cons_product);
			}
		} 

		

	


