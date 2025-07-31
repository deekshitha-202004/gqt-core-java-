package com.gqt.corejava.arrays;

import java.util.Scanner;

public class challenge_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int count=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==num) {
				System.out.println("The number found at index:"+i);
				count++;
				break;
			}
		}
		if(count==0) {
			System.out.println("The number not found");
		}
	}

}