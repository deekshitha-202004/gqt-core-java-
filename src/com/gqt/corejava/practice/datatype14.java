package com.gqt.corejava.practice;

import java.util.Scanner;
public class datatype14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        System.out.print("Enter character to count: ");
        char ch = sc.next().charAt(0);
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == ch) count++;
        }
        System.out.println("Occurrences: " + count);
	}

}

