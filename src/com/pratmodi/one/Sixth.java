package com.pratmodi.one;

import java.util.Arrays;

public class Sixth {

	public static void main(String[] args) {
		printPattern(10);
	}

	public static void printPattern(int len) {
		char[] s = new char[len-1];
		Arrays.fill(s,'#');
		System.out.println(s);
		for (int i= 1; i < len - 1; i++) {
			for(int j=0;j < len-1;j++) {
				if(j<i) {
					System.out.print("*");
				}else {
					System.out.print("#");
				}
			}
			System.out.println();
		}
	}
}
