package com.gqt.corejava.practice;
import java.util.Scanner;
public class datatype3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer: ");
        int num = sc.nextInt();
        String binary = Integer.toBinaryString(num);
        System.out.println("Binary: " + binary);

        System.out.print("Enter binary: ");
        String binInput = sc.next();
        int intValue = Integer.parseInt(binInput, 2);
        System.out.println("Integer: " + intValue);
	}

}

