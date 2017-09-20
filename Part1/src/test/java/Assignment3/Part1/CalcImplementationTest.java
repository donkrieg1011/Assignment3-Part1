package Assignment3.Part1;

import static org.mockito.Mockito.*;

import junit.framework.TestCase;

public class CalcImplementationTest extends TestCase {

	CalcImplementation obj;
	
	protected void setUp() throws Exception {
		obj = new CalcImplementation();
		
		CalcInterface mockObj = mock(CalcInterface.class);
		when(mockObj.add(5, 8)).thenReturn(13);
		when(mockObj.subtract(5, 8)).thenReturn(-3);
		when(mockObj.multiply(5, 8)).thenReturn(40);
		when(mockObj.divide(8, 4)).thenReturn((double) 2);
		
		obj.setIntObj(mockObj);
	}

	protected void tearDown() throws Exception {
		obj = null;
	}

	public void testAdd() {
		assertEquals(13, obj.add(5, 8));
	}
	
	public void testSubtract() {
		assertEquals(-3, obj.subtract(5, 8));
	}
	
	public void testMultiply() {
		assertEquals(40, obj.multiply(5, 8));
	}
	
	public void testDivide() {
		assertEquals(2.0, obj.divide(8, 4));
	}

}
