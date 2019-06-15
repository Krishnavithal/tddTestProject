package tddTestProject;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringTest {

	@Test
	public void test1() {
		SampleJunit sj = new SampleJunit();
		String output = sj.sample("ABCD");
		assertEquals("BCD",output);	
	}
	@Test
	public void test2() {
		SampleJunit sj = new SampleJunit();
		String output = sj.sample("AACD");
		assertEquals("CD",output);	
	}
	@Test
	public void test3() {
		SampleJunit sj = new SampleJunit();
		String output = sj.sample("BACD");
		assertEquals("BCD",output);	
	}
	@Test
	public void test4() {
		SampleJunit sj = new SampleJunit();
		String output = sj.sample("BBAA");
		assertEquals("BBAA",output);	
	}
	@Test
	public void test5() {
		SampleJunit sj = new SampleJunit();
		String output = sj.sample("AABAA");
		assertEquals("BAA",output);	
	}
	@Test
	public void test6() {
		SampleJunit sj = new SampleJunit();
		String output = sj.sample("");
		assertEquals("",output);	
	}
	@Test
	public void test7() {
		SampleJunit sj = new SampleJunit();
		String output = sj.sample("B");
		assertEquals("B",output);	
	}
	@Test
	public void test8() {
		SampleJunit sj = new SampleJunit();
		String output = sj.sample("AA");
		assertEquals("",output);	
	}

}
