  package com.gqt.corejava.arrays;
import java.util.Scanner;
class matrixadd{
	Scanner sc=new Scanner(System.in);
	int row,col;
	int arr1[][],arr2[][],sum[][];
	void createMatrix() {
		System.out.println("Enter the row size : ");
		row=sc.nextInt();
		System.out.println("Enter the column size : ");
		col=sc.nextInt();
		arr1=new int[row][col];
		arr2=new int [row][col];
		sum=new int[row][col];
	}
	void collectData() {
		System.out.println("Enter the elements of matrix A : ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				 arr1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the elements of matrix B : ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				 arr2[i][j]=sc.nextInt();
			}
		}
		System.out.println("Data is collected	");
		System.out.println("-----------------------------------------------	");
	}
	void display() {
		System.out.println("sum of the elements in matrix : "+" ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				sum[i][j]=arr1[i][j]+arr2[i][j];
				System.out.print(sum[i][j]+"	");
			}
			System.out.println();
		}
	}

public class add_2Dmatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		matrixadd m1=new matrixadd();
		m1.createMatrix();
		m1.collectData();
		m1.display();
	}
}
}
