package com.yash.StringAssignment;
//4)WAP to print the number of alphabets repeated in the given string.
public class Question_Four {

	public static void main(String[] args) {
		String str = "ManGessh";
		int count = 0;
		int length = str.length();
		char[] arr = str.toCharArray();
		for (int i = 0; i < length; i++) {
			for (int j = 1 + i; j < length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("Duplicate characters are =" + arr[j]);
					count++;

				}
			}
		}
		System.out.println("Number of Duplicate characters are = " + count);
	}

}
