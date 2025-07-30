package com.gqt.corejava.arrays;
import java.util.Scanner; 
class arrayoperations1{
	String arr[][];
	Scanner sc=new Scanner(System.in);
		void createArray() {
			System.out.println("Enter the class count : ");
			int cls=sc.nextInt();
			arr=new String[cls][];
			   
			for(int i=0;i<arr.length;i++) {
				System.out.println("Enter the count of student inside the class no : "+(i+1));	
				arr[i]=new String[sc.nextInt()];
			}
			System.out.println(" Array is created");
			System.out.println("------------------------");
		}
void collectdata() {
	for(int i=0;i<arr.length;i++) {
		System.out.println("inside class no:"+(i+1));
		for (int j=0;j<arr[i].length;j++) {
			System.out.println("Enter the name of student no:"+(j+1));
		}
	}
	System.out.println("----------------");
}
void display() {
	for(int i=0;i<arr.length;i++) {
		System.out.println(" inside class no:"+(i+1));
		for (int j=0;j<arr[i].length;j++) {
			System.out.println(" name of student no:"+(j+1)+"is="+arr[i][j]);
		}
	}
	System.out.println("-------------");
}
public class twodimensitionalarray {
 
	public static void main(String[] args) {
		arrayoperations1 a0=new arrayoperations1 ();
		a0.createArray();
		a0.collectdata();
		a0.display();
	}
}
}

	


	

	




