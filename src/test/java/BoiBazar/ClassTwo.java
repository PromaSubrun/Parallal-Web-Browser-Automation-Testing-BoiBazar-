package BoiBazar;

import org.testng.annotations.Test;

public class ClassTwo {
	@Test
	public void firstTest() {
		System.out.println("First test method in ClassTwo" + " " + "Thread Id: " + Thread.currentThread().getId());
	}

	@Test
	public void secondTest() {
		System.out.println("Second test method in ClassTwo" + " " + "Thread Id: " + Thread.currentThread().getId());
	}
}
