package com.gqt.corejava.arrays;
import java.util.Arrays;
import java.util.Scanner;

public class challange2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size : ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int temp;
		System.out.print("Enter elements into the array : ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++){
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		System.out.println(Arrays.toString(arr));			
		System.out.println("First element in array :"+arr[0]);
		System.out.println("last element in array :"+arr[n-1]);

	}

}