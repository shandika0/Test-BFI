package com.example.bfiTest;

import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApp {

	public static void main(String[] args) throws Exception {
		// EXERCISE D
		Integer[] x = { 10, -1, -2, -3 };
		TestD tD = new TestD();
		System.out.println(tD.solD(x));

		// EXERCISE E
		TestE tE = new TestE();
		System.out.println(tE.solE("Tony Stark"));

		// EXERCISE F
		TestF tF = new TestF();
		List<String> cities = tF.solF("zogjakarta");
		for (String city : cities) {
			System.out.println(city);
		}
	}

}
