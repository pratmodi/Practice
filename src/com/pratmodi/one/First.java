package com.pratmodi.one;

import java.util.Arrays;

public class First {

	public static int getSecondLargest(int[] a, int len) {
		Arrays.sort(a);
		return a[len- 2];
	}

	public static void main(String args[]) {
		int a[] = { 1, 2, 5, 6, 3, 2 };
		int b[] = { 44, 66, 99, 77, 33, 22, 55 };
		System.out.println("Second Largest: " + getSecondLargest(a, a.length));
		System.out.println("Second Largest: " + getSecondLargest(b, b.length));
	}

}
