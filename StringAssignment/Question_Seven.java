package com.yash.StringAssignment;
//7) WAP to demonstrate how garbage collector work when any memory is not referenced by string  object.
public class Question_Seven {
	
	String st;

	public Question_Seven(String st) {
		super();
		this.st = st;
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("Garbage collected");
	}

	public static void main(String[] args) {
		Question_Seven gc = new Question_Seven("Sag");
		gc = null;
		System.gc();
	}

}
