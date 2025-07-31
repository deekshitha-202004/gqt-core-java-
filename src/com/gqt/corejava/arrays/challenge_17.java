package com.gqt.corejava.arrays;

import java.util.Scanner;

public class challenge_17 {

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
		int negative_sum=0;
		for(int i=0;i<n;i++) {
			if(arr[i]<0) {
				negative_sum+=arr[i];
			}
		}
		System.out.println("The negative sum of elements is:"+negative_sum);
	}

}