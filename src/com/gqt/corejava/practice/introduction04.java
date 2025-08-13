package com.gqt.corejava.practice;

import java.util.Scanner;
public class introduction04 {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        if (num <= 1) {
	            System.out.println(num + " is NOT a Prime Number.");
	        } else {
	            int count = 0;
	            for (int i = 2; i * i <= num; i++) {
	                if (num % i == 0) {
	                    count++;
	                    break;
	                }
	            }
	            if (count == 0) {
	                System.out.println(num + " is a Prime Number.");
	            } else {
	                System.out.println(num + " is NOT a Prime Number.");
	            }
	        }

	       
	    }
	}
