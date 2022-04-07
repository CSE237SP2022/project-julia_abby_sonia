package RosterAndStudent;

import java.util.*;

public class Professor {
	private static ArrayList<Roster> classes_taught = new ArrayList<Roster>();
	
	public static Roster findRoster(String class_name){
		
		for (Roster roster : classes_taught) {
			if (roster.getRosterName().equals(class_name)) {
				return roster;
			}
		}
		
		return null;
		
	}
	
	public static void main(String[] args) {
		ArrayList<Student> cse_237_roster = new ArrayList<Student>();
		Roster cse_237 = new Roster(cse_237_roster, "CSE237");
		classes_taught.add(cse_237);
		
		ArrayList<Student> cse_131_roster = new ArrayList<Student>();
		Roster cse_131 = new Roster(cse_131_roster, "CSE131");
		classes_taught.add(cse_131);

		
		int optionChoice = 0;
		
		Student abby = new Student("abby", new HashMap<String, Double>());
		Student julia = new Student("julia", new HashMap<String, Double>());
		Student sonia = new Student("sonia", new HashMap<String, Double>());
		Student alice = new Student("alice", new HashMap<String, Double>());
		Student bob = new Student("bob", new HashMap<String, Double>());
		
		cse_237.addStudent(abby, 78.9);
		cse_237.addStudent(julia, 45.6);
		cse_237.addStudent(sonia, 12.3);
		
		cse_237.displayRoster();

		cse_131.addStudent(sonia, 78.9);
		cse_131.addStudent(alice, 90.3);
		cse_131.addStudent(bob, 63.2);
		
		cse_237.displayRoster();
		
//		while (optionChoice != 10) {
//			Scanner user_input = new Scanner(System.in);
//			System.out.println("Choose a class to work with: ");
//			System.out.println(classes_taught);
//			String current_class = user_input.nextLine();
//			Roster chosen_roster = findRoster(current_class);
//			
//			System.out.println("Pick option: 1 = display roster, 2 = get class average grade, 3 = add student, 4 = get student grade, 10 = end");
//			String choice = user_input.nextLine();
//			
//			if (choice.equals("1")){
//				optionChoice = 1;
//				chosen_roster.displayRoster();
//			}
//			else if (choice.equals("2")) {
//				optionChoice = 2;
//				double classAverage = chosen_roster.getAverageGrade();
//				System.out.println("class average is " + classAverage);
//			}
//			else if (choice.equals("3")) {
//				optionChoice = 3;
//				System.out.println("What is the student's name?");
//				String new_student_name = user_input.nextLine();
//				System.out.println("What is the student's grade?");
//				double new_student_grade = user_input.nextDouble();
//				Student new_student = new Student(new_student_name, new HashMap<String, Double>());
//				chosen_roster.addStudent(new_student, new_student_grade);
//			}
//			else if (choice.equals("4")) {
//				optionChoice = 4;
//				System.out.println("Enter name to get grade: ");
//				String input_name = user_input.nextLine();
//				var grade = -1.0;
//				for (Student s : chosen_roster.getRoster()) {
//					if (s.getStudentName().equals(input_name)) {
//						grade = s.getGrade(chosen_roster.getRosterName());
//					}
//				}	
//				if(grade == -1.0) {
//					System.out.println("Student not in class");
//				} else {
//					System.out.println(input_name + "'s grade is "+ grade);
//				}		
//			}
//			else if (choice.equals("10")) {
//				optionChoice = 10;
//			}
//		}
	}
}
