package com.java.unit;

import org.junit.Assert;
import org.junit.Test;

import com.java.app.NumReverse;

public class NumReverseTest {
	
	
	@Test
	public void ReverseZero(){
		NumReverse numReverse = new NumReverse();
		Assert.assertTrue("Reversing 0 returns 0", numReverse.reverse(0, 0)==0);
	}
	
	@Test
	public void ReverseTwoDigitNumber(){
		NumReverse numReverse = new NumReverse();
		Assert.assertTrue("Reversing two digit number returns correct number", numReverse.reverse(10, 0)==01);
	}
	
	@Test
	public void ReverseThreeDigitNumber(){
		NumReverse numReverse = new NumReverse();
		Assert.assertTrue("Reversing three digit number returns correct number", numReverse.reverse(100, 0)==001);
	}
	
	@Test
	public void ReverseNegativeNumber(){
		NumReverse numReverse = new NumReverse();
		Assert.assertTrue("Reversing negative number returns correct number", numReverse.reverse(-101, 0)==-101);
	}
	
}
