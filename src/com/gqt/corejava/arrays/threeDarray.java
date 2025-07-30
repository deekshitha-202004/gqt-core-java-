package com.gqt.corejava.arrays;
import java.util.Scanner;
class arrayoperation2{
	String arr[][][];
	Scanner sc=new Scanner(System.in);
	void createArray() {
		System.out.println("Enter the school count : ");
		int sch=sc.nextInt();
		System.out.println("Enter the class count in each school : ");
		int cls=sc.nextInt();
		System.out.println("Enter the student count in each class : ");
		int stu=sc.nextInt();
		arr = new String[sch][cls][stu];
		System.out.println("Array created ");
		System.out.println("----------------------------------------------");
	}
	void collectData() {
		for (int i = 0; i < arr.length; i++) {
	        System.out.println("Inside school no : " + (i + 1));
	        for (int j = 0; j < arr[i].length; j++) {
	            System.out.println("Inside class no : " + (j + 1));
	            for(int k=0;k<arr[i][j].length;k++) {
	            		System.out.println("Enter the name of student no : " + (k + 1));
	            		arr[i][j][k] = sc.next();
	            }
	        }
	    }
		System.out.println("Data stored into the array ");
		System.out.println("----------------------------------------------");
	}
	void display() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside school no : "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("inside class no : "+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
            			System.out.println("The name of student no : " + (k + 1)+" is ="+arr[i][j][k]);
            		}
			}
		}
		System.out.println("----------------------------------------------");
	}
}
/**
 * 
 */
public class  threeDarray {

	/**
	 * @param args
	 * @description This contains source code for the two dimensional jacked array
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		arrayoperation2 a0=new arrayoperation2();	
		a0.createArray();
		a0.collectData();
		a0.display();
	}
}






