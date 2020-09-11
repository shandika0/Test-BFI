package com.example.bfiTest;

import java.util.ArrayList;
import java.util.Collections;

public class TestD {
	public static void main(String[] args) {
		Test();

	}
	public static void Test() {
		System.out.println(solD(new Integer[] { 3, 2, -5, 0 }));
		System.out.println(solD(new Integer[] { 10, -1, -2, -3 }));
		System.out.println(solD(new Integer[] { 100, 200, 300, -100, -200, -3, -1, -2, -4, 1000, -5 }));
		System.out.println(solD(new Integer[] { 0, 2, 4, -1, -3, -4 }));
		System.out.println(solD(new Integer[] { 3, 2, -5, -1, -2, 0 }));
	}

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
