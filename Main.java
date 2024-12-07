package org.mini;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StduentManagement s=new StduentManagement();
		while(true) {
		System.out.println("Student Management System");
		System.out.println("1.Add");
		System.out.println("2.View");
		System.out.println("3.Find");
		System.out.println("4.Update");
		System.out.println("5.Delete");
		System.out.println("6.Exit");
		int c=sc.nextInt();
		switch(c) {
		case 1:
			System.out.println("Enter Student Id:");
			int stdId=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Student Name:");
			String stdName=sc.nextLine();
			System.out.println("Enter Student Grade:");
			int grade=sc.nextInt();
			s.addStudents(stdId,stdName,grade);
			break;
		case 2:
			s.displayStudents();
			break;
		case 3:
			System.out.println("Enter the Student Id:");
			int findId=sc.nextInt();
			Student student=s.findStudent(findId);
			if(student!=null) {
				s.displayStudents();
			}
			else {
				System.out.println("Not found");
			}
			break;
		case 4:
			System.out.println("Enter the Student Id to be updated");
			int updateId=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the Student name to be Update");
			String newName=sc.nextLine();
			System.out.println("Enter the Student Grade");
			int newGrade=sc.nextInt();
			s.updateStudent(updateId, newName, newGrade);
			break;
		case 5:
			System.out.println("Enter the Student Id to be deleted");
			int deleteId=sc.nextInt();
			s.deleteStudents(deleteId);
			break;
		case 6:
			System.out.println("Exiting..");
			sc.close();
			System.exit(0);
		default:
			System.out.println("Invalid Student Id");
			
			
			
			
		}
		
	}

}
}
