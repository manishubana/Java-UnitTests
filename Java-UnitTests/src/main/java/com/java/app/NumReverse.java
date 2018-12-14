package com.java.app;

import javax.sound.sampled.ReverbType;

public class NumReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse(-101,0));
	}
	
	public static int reverse(int num, int rev){	
		while(num!=0){
			rev=rev*10+num%10;
			num=num/10;
		}
		return rev;
	}
}
