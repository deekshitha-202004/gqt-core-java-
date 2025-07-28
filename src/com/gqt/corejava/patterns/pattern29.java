package com.gqt.corejava.patterns;
import java.util.Scanner;

public class pattern29 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size"); 
		int n = 5;
		int mid = (n + 1) / 2;
		for (int i = 1; i <= n; i++) {
		    for (int j = 1; j <= n; j++) {
		        if ((i + j == mid + 1) || (j - i == mid - 1) || (i - j == mid - 1) || (i + j == n + mid)) {
		            System.out.print(i + " ");
		        } else {
		            System.out.print("  ");
		        }
		    }
		    System.out.println();
		}


	}

}
