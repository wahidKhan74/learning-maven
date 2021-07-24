package com.simplilearn.app.learning_maven;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GreeterTest {
	
	Greeter greeter ;	
	@BeforeEach
	public void setUp() {
		greeter = new Greeter();
	}
	
	@AfterEach
	void cleanUp() {
		greeter = null;
	}
	
	@Test
	public void testHelloGreeting() {
		String actual = greeter.sayHello();
		String expected = "Hello";
		assertEquals(expected, actual);
	}
	
	@Test
	public void testHiGreeting() {
		String actual = greeter.sayHi();
		String expected = "Hi";
		assertEquals(expected, actual);
	}
	
	@Test
	public void testTodaysGreeting() {
		String actual = greeter.sayTodaysGreeting();
		String expected = "Today is a good day!";
		assertEquals(expected, actual);
	}
}
