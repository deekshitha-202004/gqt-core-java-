
package com.gqt.corejava.arrays;
import java.util.Scanner;
public class challenge_10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<n/2;i++) {
			if(arr[i]==arr[n-1-i]) {
				count++;
			}
		}
		if(count==n/2) {
			System.out.println("The array is palindrome");
		}
		else {
			System.out.println("The array is not palindrome");
		}

	}

}
