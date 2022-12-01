package com.yash.AssignmentException_2;

import java.util.Scanner;

public class EmployeeAttendance {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		Salary s=new Salary();
		int basic=30000;
		System.out.println("ENTER ATTENDANCE AS P FOR PRESENT"+"L FOR LEAVE WHICH IS PAID , A FOR ABSENT"+
		"N FOR NO INFO");
		int emp_salary=35000;
		String att[]=new String[31];
		int p=0;
		int a=0;
		int l=0;
		int n=0;
		for(int i=1;i<31;i++) {
			System.out.println("Attendance for"+i);
			att[i] = sc.next();
			if (att[i].equals("P")) {
				p++;

			} else if (att[i].equals("L")) {
				l++;

			} else if (att[i].equals("A")) {
				a++;

			} else if (att[i].equals("N")) {
				n++;

			}
		}

		System.out.println("Your total working days are " + p);
		try {
			if (l > 2 || n < 4) {
				// System.out.println("Your leaves exceed 2");
				s.calculateTotal(basic);
				// throw new
				// LeaveExceedLimitException("LeaveExceedLimitException");

			}
		} catch (Exception e) {
			System.out.println(e);
		}

		try {
			if (l > 2) {
				System.out.println("Your leaves exceed 2");
				// s.calculateTotal(basic);
				throw new LeaveExceedException("LeaveExceedException");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			if (n >= 4) {
				System.out.println("its been " + n + " days, with no information");
				System.out.println("Your salary will not be calculated");
				throw new LeaveExceedException("EmployeeAbscondingException");
			}

		} catch (LeaveExceedException e) {
			System.out.println(e.getMessage());
		}

		}
	}

