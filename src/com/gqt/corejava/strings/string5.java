package com.gqt.corejava.strings;

import java.util.Scanner;

public class string5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        String res=str.replaceAll(" ", "");
        System.out.println("The resultant string is:"+res);
	}

}

