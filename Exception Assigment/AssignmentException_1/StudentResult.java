package com.yash.AssignmentException_1;

public class StudentResult {
	public int mathMarks;
	public int scienceMarks;
	public int englishMarks;
	public int chemistryMarks;

	public StudentResult(int mathMarks, int scienceMarks, int englishMarks, int chemistryMarks) {
		super();
		this.mathMarks = mathMarks;
		this.scienceMarks = scienceMarks;
		this.englishMarks = englishMarks;
		this.chemistryMarks = chemistryMarks;
	}

	@Override
	public String toString() {
		return "Student [mathMarks=" + mathMarks + ", scienceMarks=" + scienceMarks + ", englishMarks=" + englishMarks
				+ ", chemistryMarks=" + chemistryMarks + "]";
	}
	

	
}
