package com.gqt.corejava.practice;

import java.util.Scanner;
public class datatype11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        Integer obj = Integer.valueOf(num);
        System.out.println("Wrapper class value: " + obj);
	}

}

