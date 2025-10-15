package com.demo.test;

import java.util.Scanner;

import com.demo.exceptions.WrongNumberException;

public class TestGuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=45;
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				System.out.println("Enter the Number");
				int n= sc.nextInt();
				if(num==n) {
					System.out.println(" Yeahhhhhhhhhhhhh , You got it !!!");
					break;
				}
				else {
					if(num>n) {
						throw new WrongNumberException("OOPS!! Your Number is a bit higher ");
					}
					else {
						throw new WrongNumberException("OOPS!! Your Number is a bit Small");
					}
				}
				
			}
		
		catch(WrongNumberException e) {
			System.out.println(e.getMessage());
		}
	}

	}

}
