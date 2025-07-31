package com.gqt.corejava.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class challenge_4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size : ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter elements into the array : ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array after removing duplicates:");
		for(int i=0;i<arr.length;i++) {
			boolean isduplicate=false;
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					isduplicate=true;
					break;
				}
			}
			if(!isduplicate) {
				 System.out.print(arr[i] + " ");
			}
		}
	}

}