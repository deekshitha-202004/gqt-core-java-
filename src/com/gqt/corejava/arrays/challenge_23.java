package com.gqt.corejava.arrays;

import java.util.Scanner;

public class challenge_23 {

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
		int temp[]=new int[n];
		int n1=0;
		for(int i=0;i<n;i++) {
			boolean isDuplicate=false;
			for(int j=0;j<n1;j++) {
				if(arr[i]==temp[j]) {
					isDuplicate=true;
					break;
				}
			}
			if(!isDuplicate) {
				temp[n1]=arr[i];
				n1++;
			}
		}
		System.out.println("Array after removing duplicates:");
		for(int i=0;i<n1;i++) {
			System.out.print(temp[i]+" ");
		}
	}

}