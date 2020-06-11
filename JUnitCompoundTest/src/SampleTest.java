import static org.junit.Assert.*;

import org.junit.Test;

public class SampleTest {

	@Test
	public void testPass() {
		assertTrue(true);
	}
	
	@Test
	public void testFail() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testError() {
		int[] arr = new int[10];
		assertEquals(2, arr[10]);
	}

}
