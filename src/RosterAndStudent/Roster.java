package RosterAndStudent;

import java.util.ArrayList;



public class Roster {
	
	private ArrayList<Student> studentList = new ArrayList<Student>();
	private String roster_name;
	
	public Roster(ArrayList<Student> studentList, String roster_name) {
		this.roster_name = roster_name;
		this.studentList = studentList;
	}

	public ArrayList<Student> getRoster(){
		return studentList;
	}
	
	public void addStudent(Student new_student, double grade) {
		if (!(studentList.contains(new_student))){
			studentList.add(new_student);
			new_student.addClass(roster_name, grade);
		}
		
	}
	
	public int getSize() {
		return studentList.size();
	}
	public String getRosterName() {
		return roster_name;
	}
	
	public void displayRoster() {
		System.out.println(roster_name + ": ");
		for (Student student : studentList) {
			System.out.println(student.getStudentName() + ": grade is " + student.getGrade(roster_name));
		}
	
	}

	public double getAverageGrade() {
		double sum = 0.0;
		double count = 0.0;
		for (Student student : studentList) {
			sum += student.getGrade(roster_name);
			count += 1.0;
		}
		return sum/count;
	}
	
	public String toString() { 
	    return roster_name;
	} 
}