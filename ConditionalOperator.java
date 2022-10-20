package com.bridgelabz;

public class ConditionalOperator {
	
	public static void main(String[] args) {
		int a =20;
		int b = (a==1)? 20 : 30; // return 30 as a is not equal 20
	//var x = expression ? value if true : value if false
		System.out.println("value of b:"+ b);
		
		
		b = (a==20)? 20:30; //returns 20 as a equals to 20
		System.out.println("Value of b :" + b);
		
	}

}
