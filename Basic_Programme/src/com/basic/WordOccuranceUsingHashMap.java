package com.basic;

import java.util.LinkedHashMap;
import java.util.Map;

public class WordOccuranceUsingHashMap {
	public static void main(String[] args) {
		String s = "India is my country and India has 28 state and my India having a farming sector";
		Map<String, Integer> m = new LinkedHashMap<String, Integer>();
		String[] word = s.split(" ");
		for (String str : word) {
			Integer integer = m.get(str);
			if (integer == null)
				m.put(str, 1);
			else
				m.put(str, integer + 1);

		}
		System.out.println(m);
	}
}
