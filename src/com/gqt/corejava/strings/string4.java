package com.gqt.corejava.strings;
import java.util.Scanner;

public class string4 {

			public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the string 1 for string buffer :");
				String str1=sc.nextLine();
				System.out.println("Enter the string 2 for string builder :");
				String str2=sc.nextLine();
				StringBuffer sb1=new StringBuffer(str1);
				StringBuffer sb2=new StringBuffer(str2);
				//1.length()
				int len=sb2.length();
				System.out.println("length of the string is : "+len);
				
				//2.charAt()
				char ch=sb1.charAt(0);
				System.out.println("character of the string is : "+ch);
				
				//3.append()
				StringBuffer res=sb1.append(sb2);
				System.out.println("APPENDED STRING : "+res);
				
				//4.compareTo()
				if(sb1.compareTo(sb2)==0) {
					System.out.println("strings are equal ");
				}
				else {
					System.out.println("string are not equal");
				}
				
				//5.equals()
				if(sb1.equals(sb2)==0) {
					System.out.println("strings are equal ");
				}
				else {
					System.out.println("string are not equal");
				}
				
				//indexOf()
				int res1=sb1.indexOf(str2);
				System.out.println("INDEXOF METHOD :"+res1);
				
				//reverse
				StringBuffer res2=sb1.reverse();
				System.out.println("REVERSE METHOD :"+res2);
				
				//replace
				StringBuffer res3=sb1.replace(0, 3, "+");
				System.out.println("REPLACE METHOD :"+res3);
						
				//insert()
				StringBuffer res4=sb1.insert(4, ",");
				System.out.println("INSERT METHOD : "+res4);
				
				//getClass()
				Class class1=sb1.getClass();
				System.out.println("GET CLASS METHOD : "+class1);
				
				//getHashcode()
				int hashcode=sb1.hashCode();
				System.out.println("HASHCODE METHOD : "+hashcode);
				
				//isEmpty()
				boolean res5=sb1.isEmpty();
				System.out.println("ISEMPTY METHOD : "+res5);
				
				System.out.println("Enter the string 1 for string buffer :");
				String str3=sc.nextLine();
				System.out.println("Enter the string 2 for string builder :");
				String str4=sc.nextLine();
				StringBuilder sb3=new StringBuilder(str3);
				StringBuilder sb4=new StringBuilder(str4);
				sb3.append(sb4);
				System.out.println("APPENDED STRING : "+sb3);
			}

		}

	}

}
