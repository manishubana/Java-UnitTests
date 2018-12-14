package com.java.app;

public class Numbers {
	
	
	public static void main(String args[]){
		System.out.println(add(4,5));
		System.out.println(sub(10,5));
		System.out.println(mul(4,5));
		System.out.println(div(0,0));
	}
	
	public static int add(int a, int b){
		return a+b;
	}
	
	
	public static int sub(int a, int b){
		return a-b;
	}
	
	public static int mul(int a, int b){
		return a*b;
	}
	
	public static int div(int a, int b){
		return a/b;
	}
	
}
