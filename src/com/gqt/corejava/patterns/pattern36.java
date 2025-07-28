package com.gqt.corejava.patterns;
import java.util.Scanner;
public class pattern36 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		char start = 'A';
		for (int i = 0; i < 5; i++) {
		    char ch = (char) (start + i * (i + 1) / 2);
		    for (int j = 0; j <= i * 2; j++) {
		        System.out.print((char) (ch - j));
		    }
		    System.out.println();
		}
	}
}
