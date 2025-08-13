package com.gqt.corejava.practice;
import java.util.Scanner;
public class introduction0 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter radius of the circle: ");
	        double radius = sc.nextDouble();

	        double area = 3.1416 * radius * radius; 
	        double perimeter = 2 * 3.1416 * radius; 

	        System.out.println("Area of the circle = " + area);
	        System.out.println("Perimeter of the circle = " + perimeter);

	    }
}
