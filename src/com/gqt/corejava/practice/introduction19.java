package com.gqt.corejava.practice;

import java.util.Scanner;
public class introduction19 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        int temp = num, digits = 0;
	        int t = temp;
	        while (t > 0) {
	            digits++;
	            t /= 10;
	        }

	        int sum = 0;
	        t = temp;

	        
	        while (t > 0) {
	            int digit = t % 10;
	            int pow = 1;
	            for (int i = 0; i < digits; i++) { 
	                pow *= digit;
	            }
	            sum += pow;
	            t /= 10;
	        }

	        if (sum == num)
	            System.out.println(num + " is an Armstrong number.");
	        else
	            System.out.println(num + " is NOT an Armstrong number.");

	    }
	}

