
 
/**
 * 
*                   * 
* *               * * 
*   *           *   * 
*     *       *     * 
*       *   *       * 
*         *         * 
*                   * 
*                   * 
*                   * 
*                   * 
*                   *   
 */
package com.gqt.corejava.patterns;
import java.util.Scanner;
/**
 * @author
 * @categort patterns
 * @description this is an example for conditional patterns
 */
public class pattern54m  {

	/**
	 * @param args
	 * @description this contain source code for the patterns
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter count:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
			  if( j==0 || j==n-1 ||( i+j==(n-1) && i<=n/2) || (i==j && i+j<=(n-1))){
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