
/**
 *   
 *   
 *   
 *   
 *   
 */
package com.gqt.corejava.patterns;
import java.util.Scanner;
/**
 * @author
 * @category patterns
 * @description this is an example for conditional patterns
 */
public class pattern66  {

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
			  if( i==0 || i+j==n-1){
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
