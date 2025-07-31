
package com.gqt.corejava.arrays;

import java.util.Scanner;

public class challenge_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int n=sc.nextInt();
		int original[]=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++) {
			original[i]=sc.nextInt();
		}
		int copy[]=new int[n];
		for(int i=0;i<n;i++) {
			copy[i]=original[i];
		}
		System.out.println("Copied Array elements:");
		for(int i=0;i<n;i++) {
			System.out.print(copy[i]+" ");
		}
	}

}