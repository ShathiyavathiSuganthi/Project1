package org.mini;

 class Student {
	private int stdId;
	private String stdName;
	private int grade;
	
	public Student(int stdId,String stdName,int grade) {
		this.stdId=stdId;
		this.stdName=stdName;
		this.grade=grade;
	}

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void displayInfo() {
		System.out.println("Student Id:"+stdId);
		System.out.println("Student Name:"+stdName);
		System.out.println("Student Grade:"+grade);
	}
	

}
