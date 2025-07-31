 
  package com.gqt.corejava.arrays; 
import java.util.Scanner;

/**
 * @author deekshitha
 * @category arrays
 * @description This is an example for three dimensional jacked array 
 */
class movieOperation{
	long arr[][][];
	long investment;
	long prev_profit;
	long sum_revenue;
	Scanner sc=new Scanner(System.in);
	void createArray() {
		System.out.println("Enter the language count : ");
		int lan=sc.nextInt();
		System.out.println("Enter the count of category in each language no : ");
		int cat=sc.nextInt();
		System.out.println("Enter the movie count in each categories : ");
		int mov=sc.nextInt();
		arr = new long[lan][cat][mov];
		System.out.println("Array created ");
		System.out.println("----------------------------------------------");
		System.out.println("Enter the investment made : ");
		investment=sc.nextLong();
		System.out.println("Enter the profit made in the financial year 2023-2024 : ");
		prev_profit=sc.nextLong();
		System.out.println("----------------------------------------------");
	}
	void collectData() {
		for (int i = 0; i < arr.length; i++) {
	        System.out.println("Inside language no : " + (i + 1));
	        for (int j = 0; j < arr[i].length; j++) {
	            System.out.println("Inside category no : " + (j + 1));
	            for(int k=0;k<arr[i][j].length;k++) {
	            		System.out.println("Enter the revenue of movie no : " + (k + 1));
	            		arr[i][j][k] = sc.nextLong();
	            		sum_revenue+=arr[i][j][k];
	            }
	        }
	    }
		System.out.println("Data collected and calculated ");
		System.out.println("----------------------------------------------");
	}
	void display() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside language no : "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("inside categories no : "+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
            			System.out.println("The revenue of movie no : " + (k + 1)+" is ="+arr[i][j][k]);
            		}
			}
		}
		System.out.println("----------------------------------------------");
		System.out.println("overall revenue : "+sum_revenue);
		System.out.println("----------------------------------------------");
		if(sum_revenue>investment) {
			long profit=sum_revenue-investment;
			System.out.println("The profit made by hemanth is = "+profit);
			if(profit>prev_profit) {
				System.out.println("Hemanth Has made more profit than previous year ");
			}
			else {
				System.out.println("Hemanth has not made more profit than previous year");
			}
		}
		else {
			long loss=investment-sum_revenue;
			System.out.println("The Loss incured by hemanth is = "+loss);
		}
	}
}
public class examplearray {

	/**
	 * @param args
	 * @description This contains source code for the three dimensional jacked array
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		movieOperation a0=new movieOperation();	
		a0.createArray();
		a0.collectData();
		a0.display();
	}

}
