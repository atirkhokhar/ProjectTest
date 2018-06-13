package com.company.methodsample;

import java.util.Scanner;

public class Test {
/* Given two int values.
 * return their sum. Unless the two values are the same, then return double their sum. 
 * sumDouble(1,2)--3
 * sumDouble(3,2)--5
 * sumDouble(2,2)--8
 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter First Number");
		int a = input.nextInt();
		System.out.println("Enter Second Number");
		int b = input.nextInt();
		input.close();
		System.out.println(sumDouble(a, b));
		System.out.println(makes10(a,b));
	}
	
	public static int sumDouble(int a, int b) {
		if(a==b) {
			return 2*(a+b);
		}else {
			return a+b;
		}
		
	}
	
	public static boolean makes10(int a, int b) {
		if ((a==10 || b==10)||(a+b==10)) {
			return true;
		}else {
			return false;
		}
	}

}
