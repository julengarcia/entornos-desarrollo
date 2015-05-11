package org.cuatrovientos.maven.username;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestUserName {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testUserName() {
		UserName target = new UserName("Jon", "Snow");
		String expectedName = "Jon";
		String actualName = target.getName();
		
		assertEquals("Testing default cons.", actualName, expectedName);
	}

	@Test
	public void testUserNameStringString() {
		fail("Not yet implemented");
	}

	@Test
	public void testGenerate() {
		UserName target = new UserName("Jon", "Snow");
		String expected = "jon_snow";
		String actual = target.generate();
		
		assertEquals("Testing default cons.", actual, expected);
	}

}
