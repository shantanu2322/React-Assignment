package com.yash.AssignmentException_1;

import java.util.Scanner;

public class FinalResult {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks in MATHS");
		int mathMarks = sc.nextInt();
		if (mathMarks < 0) {
			throw new NegativeInputException("You entered Negative digit of maths marks");
		}
		System.out.println("Enter Marks in SCIENCE");

		int scienceMarks = sc.nextInt();
		if (scienceMarks < 0) {
			throw new NegativeInputException("You entered Negative digit of science marks");
		}
		System.out.println("Enter Marks in ENGLISH");

		int englishMarks = sc.nextInt();
		if (englishMarks < 0) {
			throw new NegativeInputException("You entered Negative digit of english marks");
		}
		System.out.println("Enter Marks in CHEMISTRY");

		int chemistryMarks = sc.nextInt();
		if (chemistryMarks < 0) {
			throw new NegativeInputException("You entered Negative digit of chemistry marks");
		}
		StudentResult sr = new StudentResult(mathMarks, scienceMarks, englishMarks, chemistryMarks);
		Student s = new Student(23, "Shantanu", "Pune", sr);
		System.out.println(s);

		if ((mathMarks & scienceMarks) < 40 || (scienceMarks & englishMarks) < 40
				|| (chemistryMarks & englishMarks) < 40 || (chemistryMarks & mathMarks) < 40
				|| (mathMarks & englishMarks) < 40 || (scienceMarks & chemistryMarks) < 40) {
			System.out.println("STUDENT FAILED IN THE EXAM");
		}
		int ave = (mathMarks + scienceMarks + englishMarks + chemistryMarks) / 4;
		try {
			if (ave < 40) {
				throw new StudentFailException("Average is less than 40%");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
