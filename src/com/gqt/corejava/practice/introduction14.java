package com.gqt.corejava.practice;

import java.util.Scanner;
public class introduction14 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter decimal number: ");
	        int num = sc.nextInt();

	        String bin = "";

	        for (int n = num; n > 0; n /= 2) {
	            bin = (n % 2) + bin;
	        }

	        System.out.println("Binary = " + bin);
	    }
	}

