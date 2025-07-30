
package com.gqt.corejava.arrays;

import java.util.Scanner;
class arrayoperation3{
	String arr[][][];
	Scanner sc=new Scanner(System.in);
	void createArray() {
		System.out.println("Enter the school count : ");
		int sch=sc.nextInt();
		arr = new String[sch][][];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the count of class inside the school no : "+(i+1));
			arr[i]=new String[sc.nextInt()][];
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the count of student inside the class no : "+(j+1));
				arr[i][j]=new String[sc.nextInt()];
			}
		}

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
            			System.out.println("the name of student no : " + (k + 1)+" is ="+arr[i][j][k]);
            		}
			}
		}
		System.out.println("----------------------------------------------");
	}
}
/**
 * 
 */
public class threeDjackedarray {

	/**
	 * @param args
	 * @description This contains source code for the two dimensional jacked array
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		arrayoperation3 a0=new arrayoperation3();	
		a0.createArray();
		a0.collectData();
		a0.display();
	}

}

