package com.gqt.corejava.patterns;
import java.util.Scanner;
public class pattern35 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size"); 
int n=sc.nextInt();
for (int i = 1; i <= 5; i++) {
    for (int j = 1; j <= 2 * i - 1; j++) {
        System.out.print(j);
    }
    System.out.println();
}
	}
}


