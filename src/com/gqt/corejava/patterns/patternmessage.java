
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
 * @categort patterns
 * @description this is an example for conditional patterns
 */
public class patternmessage {

	/**
	 * @param args
	 * @description this contain source code for the patterns
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter count:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {//for B
				if(i==0 ||  j==0 || j==(n-1) || i==(n-1) || i==(n/2) ) {
				System.out.print("* ");
			}
			  else {
				  System.out.print("  ");			
				  }
			}
			System.out.print(" ");
		
				for(int j=0;j<n;j++) {//for E
					 if(i==0 ||  j==0 || i==(n-1) || i==(n/2) ) {
					System.out.print("* ");
				}
				  else {
					  System.out.print("  ");			
					  }
				}
				System.out.print(" ");
				for(int j=0;j<n;j++) {// for S

					if( i==0 || i==n/2 || (j==0 && i<=n/2) || (j==n-1 && i>=n/2)|| i==n-1){
					
					System.out.print("* ");
				}
				  else {
					  System.out.print("  ");			
					  }
				}
				System.out.print(" ");
				
				for(int j=0;j<n;j++) { // code for T
					if( i==0 || j==n/2 ){
					System.out.print("* ");
				}
				  else {
					  System.out.print("  ");			
					  }
				}
				System.out.print("	 ");
				
				for(int j=0;j<n;j++) { //code for C
					 if( j==0 || i==0 || i==n-1 ){
						 System.out.print("* ");
				}
				  else {
					  System.out.print("  ");			
					  }
				}
				System.out.print("  ");
				
				for(int j=0;j<n;j++) { // code for O
					if( j==0 || j==n-1 || i==0  || i==n-1){

					System.out.print("* ");
				}
				  else {
					  System.out.print("  ");			
					  }
				}
                System.out.print("");
				
				for(int j=0;j<n;j++) {  // code A
					if(i==0 ||  j==0 || j==(n-1) || i==(n/2) ) {

					System.out.print("* ");
				}
				  else {
					  System.out.print("  ");			
					  }
				}
                 System.out.print(" ");
				
				for(int j=0;j<n;j++) { // code for C
					 if( j==0 || i==0 || i==n-1 ){

					System.out.print("* ");
				}
				  else {
					  System.out.print("  ");			
					  }
				}
				  System.out.print(" ");
					
				for(int j=0;j<n;j++) {  // code for H
					if( i==n/2 || j==0 || j==n-1) {
					System.out.print("* ");
				}
				else {
				  System.out.print("  ");			
		    	  }
			  }
				 System.out.print(" ");
						
			for(int j=0;j<n;j++) {  // code for I
				if( j==n/2 || i==0 || i==n-1) {
			System.out.print("* ");
			}
			  else {
			  System.out.print("  ");			
			  }
			}
		    System.out.print(" ");
							
			for(int j=0;j<n;j++) { // code for N
				if( j==0 || j==n-1 || i==j){
			System.out.print("* ");
			}
		   else {
		  System.out.print("  ");			
		  }
	   }
	   System.out.print(" ");
								
		for(int j=0;j<n;j++) {  // code for G
			if( i==0 || j==0 || (i==n-1 && j<=n/2) || (j==n/2 && i>=n/2)
					|| (i==n/2 && j>=n/2) || ( j==(n-1) && i>=(n/2))) {
		System.out.print("* ");
		}
	    else {
		 System.out.print("  ");			
		 }
	  }
		 System.out.print("	 ");
									
	   for(int j=0;j<n;j++) { // code for I
		   if( j==n/2 || i==0 || i==n-1) {
             System.out.print("* ");
		}
		else {
		  System.out.print("  ");			
		  }
		}
	   System.out.print(" ");
		
		for(int j=0;j<n;j++) { // code for N
			if( j==0 || j==n-1 || i==j){
			System.out.print("* ");
		}
		  else {
			  System.out.print("  ");			
			  }
		}
		  System.out.print(" ");
			
			for(int j=0;j<n;j++) { // code for S
				if( i==0 || i==n/2 || (j==0 && i<=n/2) || (j==n-1 && i>=n/2)|| i==n-1){
					System.out.print("* ");
			}
			  else {
				  System.out.print("  ");			
				  }
			}
			  System.out.print(" ");
				
				for(int j=0;j<n;j++) {  // code for T
					if( i==0 || j==n/2 ){
					System.out.print("* ");
				}
				  else {
					  System.out.print("  ");			
					  }
				}
				  System.out.print(" ");
					
					for(int j=0;j<n;j++) { // code for I
						if( j==n/2 || i==0 || i==n-1) {

						System.out.print("* ");
					}
					  else {
						  System.out.print("  ");			
						  }
					}
                   System.out.print(" ");
					
					for(int j=0;j<n;j++) { // code for T
						if( i==0 || j==n/2 ){
						System.out.print("* ");
					}
					  else {
						  System.out.print("  ");			
						  }
					}
                  System.out.print(" ");
					
					for(int j=0;j<n;j++) { // code for U
						 if( j==0 || j==n-1 || i==n-1 ){

						System.out.print("* ");
					}
					  else {
						  System.out.print("  ");			
						  }
					}
                  System.out.print(" ");
					
					for(int j=0;j<n;j++) { // code for T
						if( i==0 || j==n/2 ){
               		System.out.print("* ");
					}
					  else {
						  System.out.print("  ");			
						  }
					}
                  System.out.print(" ");
					
					for(int j=0;j<n;j++) { // code for E
						if(i==0 ||  j==0 || i==(n-1) || i==(n/2) ) {		
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
