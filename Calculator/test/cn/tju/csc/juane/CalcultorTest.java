package cn.tju.csc.juane;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalcultorTest {
	private Calculator cal;
	@Before
	public void setUp()throws Exception{
		cal = new Calculator();
	}
	@Test
	public void testAdd(){
		assertEquals(2.0,cal.add(1.0, 1.0),0.0000f);
	}
	@Test
	public void testSubmit(){
		assertEquals(2.0,cal.submit(3.0, 1.0),0.0000f);
	}
	
	@Test
	public void testMultiply(){
		assertEquals(4.0,cal.multiply(2.0, 2.0),0.0000f);
	}
	
	@Test
	public void testDevide(){
		assertEquals(4.0,cal.devide(8.0, 2.0),0.0000f);

	}
	
	@After
	public void tearDown()throws Exception{
		cal = null;
	}

}