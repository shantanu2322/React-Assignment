package com.yash.ArrayAssignment;

//2)WAP to find duplicate numbers and there counting from list of numbers.
public class Question_Two {

	public static void main(String[] args) {
		int[] Numbers = { 3, 6, 7, 6, 3, 8, 8, 19, 1, 19 };
		int count = 0;
		for (int i = 0; i < Numbers.length; i++) {
			for (int j = i + 1; j < Numbers.length; j++) {
				if (Numbers[i] == Numbers[j]) {
					System.out.println("Duplicate element found = " + Numbers[j]);
					count++;
				}
			}
		}
		System.out.println("Count of Duplicate Numbers are:" + count);
	}

}
