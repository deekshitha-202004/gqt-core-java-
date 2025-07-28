package com.gqt.corejava.patterns;
import java.util.Scanner;
public class pattern26 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		int value=1;
		for(int i=1; i<=9;i++)
		{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j+" ");
		}
		System.out.println();
		}
	}
}


	


