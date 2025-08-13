package com.gqt.corejava.practice;

import java.util.Scanner;
public class datatype12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer as string: ");
        String strNum = sc.next();
        int num = Integer.parseInt(strNum);
        System.out.println("String to Integer: " + num);
        System.out.println("Integer to String: " + String.valueOf(num));
	}

}

