package com.gqt.corejava.practice;

import java.util.Scanner;
public class datatype7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter array size: ");
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        System.out.println("Enter elements:");
	        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

	        int max = arr[0], min = arr[0];
	        for (int num : arr) {
	            if (num > max) max = num;
	            if (num < min) min = num;
	        }
	        System.out.println("Max: " + max + ", Min: " + min);
	}

}

