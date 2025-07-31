package com.gqt.corejava.arrays;
import java.util.Scanner;
public class challenge_18 {

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
		int product=1;
		for(int i=0;i<n;i++) {
			product*=arr[i];
		}
		System.out.println("the product of elements is:"+product);
	}

}