/**
 * - - - - - $
 * - - - - $ $ $
 * - - - $ $ $ $ $
 * - - $ $ $ $ $ $ $ 
 * - $ $ $ $ $ $ $ $ $
 */
package com.gqt.corejava.patterns;

import java.util.Scanner;

/**
 *@author deekshitha
 *@category patterns
 *description this ia an example for pyramid pattern
 */
public class newpattern3 {

	/**
	 * @param args
	 * description this contain source cod for the pattern
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System .out.print("Enter the size");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print("- ");
			}
				for(int j=1;j<=2*i-1;j++) {
					System.out.print("$ ");
				}
			System.out.println();
		}
	}
}

	


