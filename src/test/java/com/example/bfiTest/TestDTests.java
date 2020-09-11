package com.example.bfiTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestDTests {
	@Test
	void testSolution() {
		TestD td = new TestD();
		var tests = new HashMap<Integer[], Integer>();

		tests.put(new Integer[] { 3, 2, -5, 0 }, -1);
		tests.put(new Integer[] { 10, -1, -2, -3 }, -4);
		tests.put(new Integer[] { 100, 200, 300, -100, -200, -3, -1, -2, -4, 1000, -5 }, -6);
		tests.put(new Integer[] { 0, 2, 4, -1, -3, -4 }, -2);
		tests.put(new Integer[] { 3, 2, -5, -1, -2, 0 }, -3);
		tests.forEach((problem, solution) -> assertTrue(td.solD(problem) == solution));

	}

}
