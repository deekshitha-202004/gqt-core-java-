package com.gqt.corejava.arrays;
import java.util.Scanner;
class arrayoperations{
	int arr[];
	Scanner sc=new Scanner(System.in);
		void createArray() {
			System.out.println("Enter the student count : ");
			int n=sc.nextInt();
			arr=new int[n];
			System.out.println("Array created ");
			System.out.println("----------------------------------------------");
		}
void collectdata() {
	for(int i=0;i<arr.length;i++) {
		System.out.println("Enter the marks of student no:"+(i+1));
		arr[i]=sc.nextInt();
		arr[i]=sc.nextInt();
	}
	System.out.println("data stored into the array");
}
void displaydata() {
	for(int i=0;i<arr.length;i++) {
		System.out.println(" the marks of student no:"+(i+1)+"is="+arr[i]);
	}
}	
public class structuredarray {

	public static void main(String[] args) {
		arrayoperations a0=new arrayoperations();
		a0.createArray();
		a0.collectdata();
		a0.displaydata();
	}
}
}


					
			


	


