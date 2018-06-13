package com.company.methodsample;

public class MethodTest {

	public static void main(String[] args) {
		getSum(4,5,"Test");
	     getSumAmount(45, getSum(45,56,null));

	}
	
	public static int getSum(int a, int b, String str) {
		
		int sum  =(int)( a+b);
		System.out.println(sum);
		return sum;
	}
	

    
	public static void getSumAmount(int num3, int sum) {
		int sumNum = num3 + sum;
		System.out.println(sumNum);
	}
}
