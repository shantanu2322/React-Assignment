package com.yash.assignment2;

import java.util.Arrays;

public class StringA {

	public static void main(String[] args) {
		String given[] = { "Tas is situated in Agra" };
		String find = "ast";
		boolean anyMatch = Arrays.stream(given).anyMatch(s -> s.contains(find));
		// System.out.println(anyMatch);
		if (anyMatch == true) {
			System.out.println(find + " String found");
		}
		System.out.println(find + " String not found");

	}

}
