package com.gqt.corejava.patterns;
import java.util.Scanner;
public class pattern37 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		for (int i = 0; i <= 4; i++) {
		    for (int j = i; j >= 1; j--) {
		        System.out.print(j);
		    }
		    System.out.print(0);
		    for (int j = 1; j <= i; j++) {
		        System.out.print(j);
		    }
		    System.out.println();
		}

	}

}
