package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		jUnitFuction junit = new jUnitFuction();
		int result = junit.addNumbers(100,200);
		assertEquals (300,result);
	}

}
