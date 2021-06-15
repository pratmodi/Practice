package com.pratmodi.one;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Second {

	public static void main(String[] args) {

		String[] inputs = { "123", "-123", "123.12", "abcd123" };

		Pattern pattern = Pattern.compile("^abcd123");
		for (String s : inputs) {
			Matcher matcher = pattern.matcher(s);
			boolean matchFound = matcher.find();
			if (matchFound) {
				System.out.println("Match found");
			} else {
				System.out.println("Match not found");
			}
		}
	}

}
