package com.gqt.corejava.patterns;
import java.util.Scanner;
public class pattern34 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size"); 
int n=sc.nextInt();
for (int i = 0; i < 5; i++) {
    char ch = (char) ('A' + i);
    for (int j = 1; j <= 2 * i + 1; j++) {
        System.out.print(ch);
    }
    System.out.println();
}
	}
}



	


