package com.pratmodi.one;

import java.util.Arrays;

public class Fifth {

	public static void main(String[] args) {
		run(9);
	}

	public static void run(int len) {
		
		char[] s = new char[len-1];
		Arrays.fill(s,'#');
		
		for (char s1 : s) {
			System.out.print(s1);
		}
		System.out.println();
		for (int i = 0; i < s.length - 1; i++) {
			for (int j = 0; j < s.length - 1; j++) {
				if (i == j) {
					s[i] = String.valueOf(s).replace('#', '*').charAt(j);
					for (char s1 : s) {
						System.out.print(s1);
					}
					System.out.println();
					continue;
				}
			}
		}
	}
}
