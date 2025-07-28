package com.gqt.corejava.patterns;
import java.util.Scanner;
public class pattern17 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the count:");
		int n=sc.nextInt();
		int value=1;
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print(value+"");
			}
			System.out.println( );
		}
	}
}


	


