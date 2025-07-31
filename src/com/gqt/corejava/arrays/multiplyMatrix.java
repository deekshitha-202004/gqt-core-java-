package com.gqt.corejava.arrays;
import java.util.Scanner;
class multiplyMatrix{
	Scanner sc=new Scanner(System.in);
	int row,col;
	int arr1[][],arr2[][],mul[][];
	void createMatrix() {
		System.out.println("Enter the row size : ");
		row=sc.nextInt();
		System.out.println("Enter the column    size : ");
		col=sc.nextInt();
		arr1=new int[row][col];
		arr2=new int [row][col];
		mul=new int[row][col];
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
	void calculate() {
//		System.out.println("matrix multiplication : "+" ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				for(int k=0;k<row;k++) {
					mul[i][j]+=arr1[i][k]*arr2[k][j];
				}
				
			}
		}
	}
	void display() {
		System.out.println("matrix multiplication : "+" ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(mul[i][j]+"	");
			}
			System.out.println();
		}
	}
public class mul_2Dmatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		multiplyMatrix m1=new multiplyMatrix();
		m1.createMatrix();
		m1.collectData();
		m1.calculate();
		m1.display();
	}

	}
}