package com.example.bfiTest;

import java.util.ArrayList;
import java.util.Collections;

public class TestD {

	public static int solD(Integer[] a) {
		ArrayList<Integer> NegNumb = new ArrayList<Integer>();
		int result = 0;
		int min = a[0];
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				NegNumb.add(a[i]);
			}
			if (min > a[i]) {
				min = a[i];
			}
		}
		Collections.sort(NegNumb, Collections.reverseOrder());
		for (int i = -1; i >= min; i--) {
			if (i != NegNumb.get(temp)) {
				result = i;
				break;
			}
			temp++;
		}

		if (result == 0) {
			result = min + (-1);
		}
		return result;
	}
}
