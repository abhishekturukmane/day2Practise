package com.bridgelabz;

import java.util.Scanner;

public class SwitchCase {
	
	public static void main(String[] args) {
		//String day="Monday";
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a day: ");
		String day =s.nextLine();
		switch(day)
		{
		case "Monday": System.out.println("Today is Monday");
						break;
						
		case "Tuesday": System.out.println("Today is Tuesday");
						break;
		case "Wednesday": System.out.println("Today is Wednesday");
						break;
		case "Thrusday": System.out.println("Today is Thrusday");
						break;
		case "Friday": System.out.println("Today is Friday");
						break;
		case "Saturday": System.out.println("Today is Saturday");
						break;
		default : System.out.println("Not a Weekday");
						break;
		}
	}
}
