package com.yash.StringAssignment;

public class Question_Six{
public static void main(String[] args) {
		String s1 = "xyz";
		String s2 = "xyz";

		String s3 = new String("abc");
		String s4 = new String("abc");
		// Note that this == compares whether
		// s1 and s2 refer to same object or not

		// scp
		if (s1 == s2)
			System.out.println("Yes");
		else
			System.out.println("No");

		// Heap
		if (s3 == s4)
			System.out.println("Yes");
		else
			System.out.println("No");

	}
}