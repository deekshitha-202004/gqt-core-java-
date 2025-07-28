package com.gqt.corejava.patterns;
import java.util.Scanner;
public class pattern15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++) { 
				if(j<=i) {
			System.out.print(j);
			}
				System.out.print("");
			}
			System.out.println();
		}
	}
}

		

	


