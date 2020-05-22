import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class SampleTest {
	
	@Test
	public void simpleTestPass() {
		int a = 1;
		int b = 2;
		assertTrue(a + b == 3);
	}
	
	@Test
	public void simpleTestPass2() {
		int a = 5;
		int b = 6;
		assertTrue(a + b == 12);
	}
}
