package com.bridgelabz;

public class BreakKeyword {

	public static void main(String[] args) {
		
		
		for(int x=1;x<=10;x++)
		{
			System.out.println("The value of x :"+ x);
			if(x==9)
			{
				break; // ends the code and comes out of loop when break encountered;
			}
		}
	}
}
