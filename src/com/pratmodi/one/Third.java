package com.pratmodi.one;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Third {

	public static void main(String[] args) {

		List<Integer> numbers = new LinkedList<Integer>();
		Pattern p = Pattern.compile("\\d+");
		Matcher m = p.matcher("abcd2134"); 
		while (m.find()) {
		  numbers.add(Integer.parseInt(m.group()));
		}
		System.out.println(numbers.listIterator().next());
	}

}
