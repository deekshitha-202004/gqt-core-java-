package com.gqt.corejava.practice;
import java.util.Scanner;
public class datatype4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a character: ");
	        char ch = sc.next().charAt(0);
	        if (Character.isLowerCase(ch))
	            System.out.println("Uppercase: " + Character.toUpperCase(ch));
	        else
	            System.out.println("Lowercase: " + Character.toLowerCase(ch));
	}

}

