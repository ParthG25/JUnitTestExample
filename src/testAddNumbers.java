import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers 
{
	@Test
	public void test() 
	{
		JUnitTesting ob = new JUnitTesting();
		assertEquals(70, ob.AddNumbers(50, 20));
	}
}
