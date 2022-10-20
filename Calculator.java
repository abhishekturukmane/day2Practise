package com.bridgelabz;

public class Calculator {

	int var1=20;
	int var2=30;
	
	public int addition(int a , int b) {
		int result=a+b;
		return result;//nothing works after return
	}
	
	public void sub(int a ,int b) {
		int res=a-b;
		System.out.println("substraction:"+ res);
		
	}
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		int store=cal.addition(10, 20);
		System.out.println("The addition is :" + store);
		
		cal.sub(30, 20);
		
		//for class variables
		
		int avariable= cal.var1;
		int bvariable=cal.var2;
		int storeval=cal.addition(avariable, bvariable);
		System.out.println("The addition for variable in class is :"+ storeval);
		
		System.out.println("Shortcut for addition of class variables:" + cal.addition(avariable,bvariable));
		
	}
}
