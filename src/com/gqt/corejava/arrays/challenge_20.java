package com.gqt.corejava.arrays;
import java.util.Scanner;


public class challenge_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] freq = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            freq[i] = -1; 
        }
        for (int i = 0; i < n; i++) {
            if (freq[i] != -1) {
                continue; 
            }
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    freq[j] = 0; 
                }
            }
            freq[i] = count;
        }
        System.out.println("Frequency of each element:");
        for (int i = 0; i < n; i++) {
            if (freq[i] != 0) {
                System.out.println(arr[i] + " occurs " + freq[i] + " time(s)");
            }
        }
		
	}

}