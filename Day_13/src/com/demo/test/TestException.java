package com.demo.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException {
	public static int divide(int x, int y) {
		return(x/y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter a number: ");
			int n1=sc.nextInt();
			System.out.println("Enter a number: ");
			int n2=sc.nextInt();
			
			int ans=divide(n1,n2);
			System.out.println("Division is: " +ans);
			
			System.out.println("At the end of outer try block");
			
		}catch(InputMismatchException e) {
			System.out.println("plz Enter number: ");
			
		}catch(ArithmeticException|ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			
		}catch(Exception e) {
			System.out.println("Error occured" );
			System.out.println(e.getMessage());
		}
		finally{
			System.out.println("In a final block ");
			
		}
		

	}

}
