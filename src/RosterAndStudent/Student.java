package RosterAndStudent;

import java.util.*;

public class Student {
	private String stu_name;
	private Map<String, Double> enrolled_classes = new HashMap<String, Double>();
	
	public Student(String name, Map <String, Double> enrolled_classes) {
		this.stu_name = name;
		this.enrolled_classes = enrolled_classes;
	}
	
	
	public String getStudentName() {
		return stu_name;
	}
	
	public void addClass(String class_name, double class_grade) {
		enrolled_classes.put(class_name, class_grade);
	}
	
	public void removeClass(String class_name) {
		enrolled_classes.remove(class_name);
	}
	
	public double getGrade(String class_name) {
		return enrolled_classes.get(class_name);
	}
}