package RosterAndStudent;

import java.util.ArrayList;
import java.util.Scanner; 



public class Roster {
	
	private static ArrayList<Student> studentList = new ArrayList<Student>();
	
	public Roster(ArrayList<Student> studentList) {

		this.studentList = studentList;
	}

	public ArrayList<Student> getRoster(){
		return studentList;
	}
	
	public static void addStudent(String studentName, double studentGrade) {
		Student newStudent = new Student(studentName, studentGrade);
		studentList.add(newStudent);
	}
	
	public int getSize() {
		return studentList.size();
	}
	
	public static void displayRoster() {
		for (Student student : studentList) {
			System.out.println(student.getName() + ": grade is " + student.getGrade());
	}
}

public static double getAverageGrade() {
	double sum = 0.0;
	double count = 0.0;
	for (Student student : studentList) {
		sum += student.getGrade();
		count += 1.0;
	}
	return sum/count;
}

public static void main(String[] args) {
	int optionChoice = 0;
	Student abby = new Student("abby", 99.0);
	Student julia = new Student("julia", 20.1);
	Student sonia = new Student("sonia", 41.7);
	studentList.add(abby);
	studentList.add(julia);
	studentList.add(sonia);
	while (optionChoice != 10) {
	Scanner option = new Scanner(System.in);
	System.out.println("Pick option: 1 = display roster, 2 = get class average grade, 3 = add student, 4 = get student grade, 10 = end");
	String choice = option.nextLine();
	if (choice.equals("1")){
		optionChoice = 1;
		displayRoster();
	}
	else if (choice.equals("2")) {
		optionChoice = 2;
		double classAverage = getAverageGrade();
		System.out.println("class average is " + classAverage);
	}
	else if (choice.equals("3")) {
		optionChoice = 3;
		System.out.println("What is the student's name?");
		String studentName = option.nextLine();
		System.out.println("What is the student's grade?");
		double studentGrade = option.nextDouble();
		addStudent(studentName, studentGrade);
	}
	else if (choice.equals("4")) {
		optionChoice = 4;
		System.out.println("Enter name to get grade: ");
		String name = option.nextLine();
		var grade = -1.0;
		for (Student s : studentList) {
			if (s.getName().equals(name)) {
				grade = s.getGrade();
			}
		}	
		if(grade == -1.0) {
			System.out.println("Student not in class");
		} else {
			System.out.println(name + "'s grade is "+ grade);
		}		
	}
	else if (choice.equals("10")) {
		optionChoice = 10;
	}
	}
	}
}
	


