package com.gqt.corejava.arrays;

import java.util.Scanner;

public class challenge_22 {

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
		if(n<2) {
			System.out.println("Array contains two elements");
		}
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		int smallest=arr[0];
		int secondsmallest=-1;
		for(int i=0;i<n;i++) {
			if(arr[i]!=smallest) {
				secondsmallest=arr[i];
				break;
			}
		}
		int largest=arr[n-1];
		int secondlargest=-1;
		for(int i=n-2;i>=0;i--) {
			if(arr[i]!=largest) {
				secondlargest=arr[i];
				break;
			}
		}
		if(secondsmallest==-1) {
			System.out.println("There is no second smallest elemnets");
		}
		else {
			System.out.println("The second smallest element:"+secondsmallest);
		}
		if(secondlargest==-1) {
			System.out.println("There is no second largest elemnets");
		}
		else {
			System.out.println("The second largest element:"+secondlargest);
		}
	}

}