package com.gqt.corejava.patterns;
import java.util.Scanner;
public class pattern38 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		for (int i = 0; i < 5; i++) {
		    char ch = (char) ('A' + i);
		    for (char j = ch; j >= 'A'; j--) {
		        System.out.print(j);
		    }
		    for (char j = 'B'; j <= ch; j++) {
		        System.out.print(j);
		    }
		    System.out.println();
		}

	}

}
