package com.gqt.corejava.practice;

import java.util.Scanner;
public class datatype18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        sb.append(" World");
        System.out.println("After append: " + sb);
        sb.reverse();
        System.out.println("After reverse: " + sb);
	}

}
