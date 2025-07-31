package com.gqt.corejava.arrays;
import java.util.Scanner;
public class challange1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size : ");
		int n=sc.nextInt();
		int sum=0;
		int arr[]=new int[n];
		System.out.print("Enter elements into the array : ");
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		System.out.println("sum of elements in an array :"+sum);
	}

}