package com.gqt.corejava.arrays;
import java.util.Arrays;
import java.util.Scanner;

public class challenge5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size : ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter elements into the array : ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array before reversing :"+Arrays.toString(arr));
		System.out.print("Array after reversing : ");
		for(int i=n-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}

}