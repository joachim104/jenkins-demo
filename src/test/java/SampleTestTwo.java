import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class SampleTestTwo {
	
	@Test
	public void simpleTestFail() {
		int a = 1;
		int b = 2;
		assertTrue(a + b == 4);
	}
}
