package com.gqt.corejava.arrays;
import java.util.Scanner;
class arrayoperation {
   String arr[][];
   Scanner sc=new Scanner(System.in);
   void createarray() {
   	System.out.println("enter the room count:");
   	int cls=sc.nextInt();
   	System.out.println("enter the Student count:");
   	int stu=sc.nextInt();
   	arr=new String[cls][stu];
	System.out.println("Array Created");
	System.out.println("------------------");
   }
   void collectData() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("inside class no:"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("enter name of student no:"+(j+1));
			arr[i][j]=sc.next();
		}
		}			 
      System.out.println("Data Stores in Array");
      System.out.println("------------------");
	}
   void display() {
		for(int i=0;i<arr.length;i++) {
	    	   System.out.println("inside class no:"+(i+1));
	    	   for(int j=0;j<arr[i].length;j++) {
		    	   System.out.println("name of student no:"+(j+1)+"is ="+arr[i][j]);
	    	   }
		}  
		System.out.println("------------------");
   }
}
public class dimensitional1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 arrayoperation ao= new arrayoperation();
  	   ao.createarray();
  	   ao.collectData();
  	   ao.display();


	}

}