package javamaven.naz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import additiontest.Addition;

public class AdditionTest {
	Addition addd=new Addition();
	@Test
	public void addTest() {
		int i = addd.add(3, 7);
		assertEquals(10, i);
	}

}
