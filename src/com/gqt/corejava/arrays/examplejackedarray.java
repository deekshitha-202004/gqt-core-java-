package com.gqt.corejava.arrays;
	import java.util.Scanner;
	/**
	 * @author deekshitha
	 * @category arrays
	 * @description This is an example for three dimensional jacked array 
	 */
	class collegeoperations{
		String arr[][][];
		long engg_fee;
		long medical_fee;
		long degree_fee;
		long revenue=0;
		Scanner sc=new Scanner(System.in);
		void createArray() {
			System.out.println("Enter the college count : ");
			int clg=sc.nextInt();
			arr = new String[clg][][];
			for(int i=0;i<arr.length;i++) {
				System.out.println("Enter the count of class rooms in each college no : "+(i+1));
				arr[i]=new String[sc.nextInt()][];
				for(int j=0;j<arr[i].length;j++) {
					System.out.println("Enter the count of capacity inside the class no : "+(j+1));
					arr[i][j]=new String[sc.nextInt()];
				}
			}
			System.out.println("Array created ");
			System.out.println("----------------------------------------------");
			System.out.println("Enter the medical clg students anually fee  : ");
			medical_fee=sc.nextLong();
			System.out.println("Enter the engineering clg students anually fee  : ");
			engg_fee=sc.nextLong();
			System.out.println("Enter the degree clg students anually fee  : ");
			degree_fee=sc.nextLong();
		}
		void collectData() {
			for (int i = 0; i < arr.length; i++) {
		        System.out.println("Inside college no : " + (i + 1));
		        for (int j = 0; j < arr[i].length; j++) {
		            System.out.println("Inside class no : " + (j + 1));
		            for(int k=0;k<arr[i][j].length;k++) {
		            	System.out.println("Enter name of the students in class no : " + (k + 1));
		            	arr[i][j][k] = sc.next();
		            	if (i == 0) {
		                    revenue += medical_fee;
		                } else if (i == 1) {
		                	revenue += engg_fee;
		                } else {
		                    revenue += degree_fee;
		                }
		            }
		        }
		    }
			
			System.out.println("Data collected and calculated ");
			System.out.println("----------------------------------------------");
			
		}
		void display() {
			for(int i=0;i<arr.length;i++) {
				System.out.println("Inside college no : "+(i+1));
				for(int j=0;j<arr[i].length;j++) {
					System.out.println("inside class no : "+(j+1));
					for(int k=0;k<arr[i][j].length;k++) {
	            		System.out.println("The capacity of class no : " + (k + 1)+" is ="+arr[i][j][k]);
	            	}
				}
			}
			System.out.println("overall revenue : "+revenue);
			System.out.println("----------------------------------------------");
			
		}
	}
	public class examplejackedarray {

		/**
		 * @param args
		 * @description This contains source code for the three dimensional jacked array
		 */
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			collegeoperations a0=new collegeoperations();	
			a0.createArray();
			a0.collectData();
			a0.display();
		}
	}


	