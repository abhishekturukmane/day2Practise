package com.bridgelabz;

public class InstanceOf {

	public static void main(String[] args) {
		InstanceOf obj = new InstanceOf();
		boolean res = obj instanceof InstanceOf; // returns true if obj created is of same class
		System.out.println("result: "+ res);
	}
}
