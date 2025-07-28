/**
 * #
 * # #
 * # - #
 * # - - #
 * # # # # #
 */
package com.gqt.corejava.patterns;

import java.util.Scanner;

/**
 * @author deekshitha
 * @category patterns
 * @description this is an example for conditional pattern
 */
public class newpattern2 {

	/**
	 * @param args
	 * @description this contains source code for the pattern 
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System .out.print("Enter the size");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(i==n || j==1 || i==j) {
					System.out.print("# ");
				}
				else {
					System.out.print("- ");
				}
			}
			System.out.println();
		}
	}
}

	


