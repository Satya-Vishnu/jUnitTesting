package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitFuction junitString = new jUnitFuction();
		String result = junitString.addStrings("capstone","project");
		assertEquals ("capstoneproject",result);
	}

}
