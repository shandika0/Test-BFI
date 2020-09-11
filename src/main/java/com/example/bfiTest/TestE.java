package com.example.bfiTest;

public class TestE {


	public static String solE(String original) {
		String word[] = original.split(" ");
		String filter[] = new String[0];
		String result = "";

		for (int i = 0; i < word.length; i++) {
			if (word[i].length() > 2) {
				filter = word[i].split("");
				for (int j = 0; j < filter.length; j++) {
					if (filter[j] == filter[0] || filter[j] == filter[filter.length - 1]) {
						result += filter[j];
					} else {
						result += "*";
					}
				}
			} else {
				result += word[i];
			}
			result += " ";
		}
		return result;
	}

}