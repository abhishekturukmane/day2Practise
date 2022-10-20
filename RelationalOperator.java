package com.bridgelabz;

import java.util.Scanner;

public class RelationalOperator {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter value1");
		int val1= obj.nextInt();
		
		System.out.println("Enter value2");
		int val2=obj.nextInt();
		
		System.out.println("val1 == val2: "+ (val1==val2));
		System.out.println("val1 != val2: "+ (val1!=val2));
		System.out.println("val1 < val2: "+ (val1 < val2));
		System.out.println("val1 > val2: "+ (val1 > val2));
		System.out.println("val1 <= val2: "+ (val1 <=val2));
		System.out.println("val1 >= val2: "+ (val1 >=val2));
		 obj.close();
	}
	
}
