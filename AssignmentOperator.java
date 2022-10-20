package com.bridgelabz;

public class AssignmentOperator {

	public static void main(String[] args) {
		int a = 20;
		int b = 30;
		
		System.out.println("b+=a:"+ (b+=a));
		System.out.println("b+=a:"+ (b+=a));
		System.out.println("b-=a:"+ (b-=a));
		System.out.println("b*=a:"+ (b*=a));
		System.out.println("b/=a:"+ (b/=a));
		//shift operator
		
		System.out.println("b>>=a:"+ (b>>=a));
		System.out.println("b<<=a:"+ (b<<=a));
		System.out.println("b&=a:"+ (b&=a));//bitwise and
		System.out.println("b|=a:"+ (b|=a));//bitwise inclusive or
		System.out.println("b^=a:"+ (b^=a));//bitwise exclusive or
		
	}
}
