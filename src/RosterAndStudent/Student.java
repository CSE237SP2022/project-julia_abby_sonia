package RosterAndStudent;

import java.util.*;

public class Student {
	private String stu_name;
	private Map<String, Double> enrolled_classes = new HashMap<String, Double>();
	
	public Student(String name, double d) {
		this.stu_name = name;
		this.enrolled_classes = d;
	}
	
	
	public String getStudentName() {
		return stu_name;
	}
	
	public void addClass(String class_name, double class_grade) {
		enrolled_classes.put(class_name, class_grade);
	}
	
	public double getGrade(String class_name) {
		return enrolled_classes.get(class_name);
	}
}