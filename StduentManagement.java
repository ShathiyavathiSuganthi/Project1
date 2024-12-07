package org.mini;

import java.util.ArrayList;

 class StduentManagement {
	private ArrayList<Student>students;
	public StduentManagement() {
		students=new ArrayList<>();
	}
		public  void addStudents(int stdId,String stdName,int grade) {
		Student student=new Student(stdId,stdName,grade);
		students.add(student);
		System.out.println("Students added successfully");
		
}
		public void displayStudents() {
			if(students.isEmpty()) {
				System.out.println("No Student found");
			}
			for(Student student:students) {
				student.displayInfo();
			}
			
		}
		public Student findStudent(int stdId) {
			for(Student student:students) {
				if(student.getStdId()==stdId) {
					return student;
				}
			}
			return null;
		}
		
	    public boolean updateStudent(int stdId,String stdName,int grade) {
	    	Student student=findStudent(stdId);
	    	if(student!=null) {
	    		student.setStdName(stdName);
	    		student.setGrade(grade);
	    		System.out.println("Students updated...");
	    		return true;
	    	}
	    	else {
	    		System.out.println("Students not found");
	    		return false;
	    	}
	    }
	    public boolean deleteStudents(int stdId) {
	    	Student student=findStudent(stdId);
	    	if(student!=null) {
	    		students.remove(student);
	    		System.out.println("Students deleted");
	    		return true;
	    	}
	    	else {
	    		System.out.println("Students not found");
	    		return false;
	    	}
	    }


}