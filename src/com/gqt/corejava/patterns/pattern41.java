/**
 * * * * * * * * * * * * * * * * * * * * * * 
* *               * * *               * * 
*   *           *   *   *           *   * 
*     *       *     *     *       *     * 
*       *   *       *       *   *       * 
*         *         *         *         * 
*       *   *       *       *   *       * 
*     *       *     *     *       *     * 
*   *           *   *   *           *   * 
* *               * * *               * * 
* * * * * * * * * * * * * * * * * * * * * 
* *               * * *               * * 
*   *           *   *   *           *   * 
*     *       *     *     *       *     * 
*       *   *       *       *   *       * 
*         *         *         *         * 
*       *   *       *       *   *       * 
*     *       *     *     *       *     * 
*   *           *   *   *           *   * 
* *               * * *               * * 
* * * * * * * * * * * * * * * * * * * * * 

 * 
 */
package com.gqt.corejava.patterns;

import java.util.Scanner;

/**
 * @author deekshitha
 * @category patterns
 * description this is an example for the universal pattern
 */
public class pattern41 {

	/**
	 * @param args
	 * description this contains source code for the patterns
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System .out.print("Enter the size");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || i==(n-1) || j==0 || j==(n-1) ||
						   i==(n/2) || j==(n/2) ||
						   i==j || i+j==(n-1) ||
						   i+j==(n/2) || j-i==(n/2) || i-j==(n/2) || i+j==((n-1)+(n/2))) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("    ");
			for(int j=0;j<n;j++) {
				if(i==0 || i==(n-1) || j==0 || j==(n-1) ||
						   i==(n/2) || j==(n/2) ||
						   i==j || i+j==(n-1) ||
						   i+j==(n/2) || j-i==(n/2) || i-j==(n/2) || i+j==((n-1)+(n/2))) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
			


	


