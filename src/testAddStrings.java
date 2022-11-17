import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() 
	{
		JUnitTesting ob = new JUnitTesting();
		assertEquals("Hello World!", ob.AddStrings("Hello ", "World!"));
	}
}
