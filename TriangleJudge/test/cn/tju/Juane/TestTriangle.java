package cn.tju.Juane;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestTriangle {
	private Triangle triangle;
	@Before
	public void setup() {
		triangle = new Triangle();
	}
	@Test
	public void testJudgeKindOfTriangle() {
		int answer = triangle.judgeKindOfTriangle(3,3,3);
		assertEquals(0,answer);
		answer = triangle.judgeKindOfTriangle(3,3,2);
		assertEquals(1,answer);
		answer = triangle.judgeKindOfTriangle(3,4,2);
		assertEquals(2,answer);
				
	}
	
	
}
