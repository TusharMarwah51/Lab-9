/* 

TUSHAR MARWAH
E19CSE399
EB14

*/
package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitFunction junitstring = new jUnitFunction();
		String result = junitstring.addStrings("TUSHAR", "MARWAH");
		assertEquals("TUSHARMARWAH",result);
	}

}