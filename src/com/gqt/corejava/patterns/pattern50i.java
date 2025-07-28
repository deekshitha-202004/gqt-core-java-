/**
 * 
* * * * * * * * * * * 
          *           
          *           
          *           
          *           
          *           
          *           
          *           
          *           
          *           
* * * * * * * * * * * 

 */
package com.gqt.corejava.patterns;
import java.util.Scanner;
/**
 * @author deekshitha
 * @category patterns 
 * description this is an example for the alphabet patterns
 */
public class pattern50i {

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
			  if( j==n/2 || i==0 || i==n-1) {
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

	


