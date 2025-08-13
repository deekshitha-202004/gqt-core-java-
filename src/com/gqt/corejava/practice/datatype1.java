package com.gqt.corejava.practice;
import java.util.Scanner;
public class datatype1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter byte value: ");
	        byte b = sc.nextByte();
	        System.out.print("Enter short value: ");
	        short s = sc.nextShort();
	        System.out.print("Enter int value: ");
	        int i = sc.nextInt();
	        System.out.print("Enter long value: ");
	        long l = sc.nextLong();
	        System.out.print("Enter float value: ");
	        float f = sc.nextFloat();
	        System.out.print("Enter double value: ");
	        double d = sc.nextDouble();
	        System.out.print("Enter a character: ");
	        char c = sc.next().charAt(0);
	        System.out.print("Enter boolean value: ");
	        boolean bool = sc.nextBoolean();

	        System.out.println("You entered: " + b + " " + s + " " + i + " " + l);
	        System.out.println(f + " " + d);
	        System.out.println(c + " " + bool);
	}
}

