package com.java.unit;

import org.junit.Assert;
import org.junit.Test;

import com.java.app.Numbers;

public class NumbersTest {
	
	@Test
	public void AddWithPositiveNumbers(){
		Numbers num = new Numbers();
		Assert.assertTrue("Positive numbers getting added correctly", num.add(5, 2)==7);
	}
	
	@Test
	public void AddWithOneNegativeNumber(){
		Numbers num = new Numbers();
		Assert.assertTrue("Numbers with one negative number getting added correctly", num.add(5, -2)==3);
	}
	
	@Test
	public void AddWithZero(){
		Numbers num = new Numbers();
		Assert.assertTrue("Zeros getting added correctly", num.add(0, 0)==0);
	}
	
	@Test
	public void SubtractZero(){
		Numbers num = new Numbers();
		Assert.assertTrue("Zeros getting subtracted correctly", num.sub(0, 0)==0);
	}
	
	@Test
	public void MultiplyZero(){
		Numbers num = new Numbers();
		Assert.assertTrue("Zeros getting multiplied correctly", num.mul(0, 0)==0);
	}
	
	@Test
	public void DivideZero(){
		Numbers num = new Numbers();
		
		try{
			num.div(0, 0);
			Assert.assertFalse("Divide by zero not throwing exception", false);
		}
		catch(ArithmeticException ae){
			Assert.assertTrue("Divide by zero throwing exception", true);
		}
			
		
		
	}
	
	
	
	
	
	
	

}
