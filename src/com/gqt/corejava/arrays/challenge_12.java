package com.gqt.corejava.arrays;

import java.util.Scanner;

public class challenge_12 {

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
		int largest=arr[0];int smallest=arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
			if(arr[i]<smallest) {
				smallest=arr[i];
			}
		}
		System.out.println("The largest element in an array is:"+largest);
		System.out.println("The smallest element in an array is:"+smallest);
	}

}