package com.example.bfiTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.HashMap;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestFTests {

	@Test
	void TestCity() {
		TestF tF = new TestF();
		  var tests = new HashMap<String, Integer>();

	        tests.put("sisayang",10);
	        tests.put("pulxu pqnjzng",1);
	        tests.put("zogjakarta",4);

	        tests.forEach((problem, solution) -> {
	            try {
	                assertEquals(tF.solF(problem).size(), solution);
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        });	}
}
