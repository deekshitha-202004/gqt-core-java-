package com.gqt.corejava.patterns;
import java.util.Scanner;
public class pattern39 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		for (int i = 1; i <= 5; i++) {
		    for (int j = 1; j <= i; j++) {
		        System.out.print(j);
		    }
		    for (int j = i - 1; j >= 1; j--) {
		        System.out.print(j);
		    }
		    System.out.println();
		}
		

	}

}
