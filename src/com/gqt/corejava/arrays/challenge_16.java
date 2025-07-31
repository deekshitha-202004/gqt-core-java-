package com.gqt.corejava.arrays;
import java.util.Scanner;
public class challenge_16{

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
		int positive_sum=0;
		for(int i=0;i<n;i++) {
			if(arr[i]>0) {
				positive_sum+=arr[i];
			}
		}
		System.out.println("The positive sum of elements is:"+positive_sum);
	}

}