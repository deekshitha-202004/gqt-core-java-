package com.gqt.corejava.patterns;
import java.util.Scanner;
public class pattern20 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		for(int i=1; i<=n;i++);
		{
		for(int j=1;j<=n;j++);
		{
			System.out.println("- ");
		}
		for(int k=1;k<=n;k++)
		{
			System.out.println("# ");
		}
		System.out.println();
		}
	}
}
				
				

	


