package com.gqt.corejava.arrays;
import java.util.Arrays;
import java.util.Scanner;

public class challenge_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size : ");
		int n=sc.nextInt();
		int arr1[]=new int[n];
		int arr2[]=new int[n];
		System.out.print("Enter elements into the array : ");
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("Element in array 1:"+Arrays.toString(arr1));
		arr2=arr1;
		System.out.println("Element in array 2:"+Arrays.toString(arr2));
		
	}

}
