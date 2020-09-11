package com.example.bfiTest;

public class TestE {

	public static void main(String[] args) {
		Test();
	}

	public static void Test() {
		System.out.println(solE("Tony Stark"));
		System.out.println(solE("Peter Parker"));
		System.out.println(solE("Bumblebee"));
		System.out.println(solE("El Taurino"));
		System.out.println(solE("John Doe"));
		System.out.println(solE("Crazy Rich Asian"));
		System.out.println(solE("Stephen Strange"));
		System.out.println(solE("A Kid With Supernatural Abilities"));
	}

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