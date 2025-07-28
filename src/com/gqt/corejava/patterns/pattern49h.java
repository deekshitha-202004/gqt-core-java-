/**
 * *                   * 
*                   * 
*                   * 
*                   * 
*                   * 
* * * * * * * * * * * 
*                   * 
*                   * 
*                   * 
*                   * 
*                   * 

 */
package com.gqt.corejava.patterns;
import java.util.Scanner;
/**
 * @author deekshitha
 * @category patterns
 * description this is an example for alphabet patterns
 */
public class pattern49h {

	/**
	 * @param args
	 * description this contains source code for the patterns
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter count:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
			  if( i==n/2 || j==0 || j==n-1) {
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
		
	


	
