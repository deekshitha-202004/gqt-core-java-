package com.gqt.corejava.practice;

import java.util.Scanner;
public class datatype23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter matrix size: ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        int sum = 0;
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
                if (i == j) sum += mat[i][j];
            }
        System.out.println("Diagonal sum: " + sum);
	}

}
