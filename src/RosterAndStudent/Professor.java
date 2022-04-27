/**package RosterAndStudent;

import java.util.*; 


public class Professor {
	private static ArrayList<Roster> classes_taught = new ArrayList<Roster>();
	
	public Professor (ArrayList<Roster> classes_taught) {
		this.classes_taught = classes_taught;
	}
	
	public static Roster findRoster(String class_name){
		for (Roster roster : classes_taught) {
			if (roster.getRosterName().equals(class_name)) {
				return roster;
			}
		}
		return null;
	}
	
	static void listOptions() {
		System.out.println("Enter number to pick option:");
		System.out.println("1 = display roster");
		System.out.println("2 = get roster class average");
		System.out.println("3 = add a student to the roster");
		System.out.println("4 = retrieve a student's grade");
		System.out.println("5 = choose another class");
		System.out.println("6 = exit app");
	}
	
	public static void main(String[] args) {
		ArrayList<Student> cse_237_roster = new ArrayList<Student>();
		Roster cse_237 = new Roster(cse_237_roster, "CSE237");
		classes_taught.add(cse_237);
		
		ArrayList<Student> cse_131_roster = new ArrayList<Student>();
		Roster cse_131 = new Roster(cse_131_roster, "CSE131");
		classes_taught.add(cse_131);

		
		Student abby = new Student("abby", new HashMap<String, Double>());
		Student julia = new Student("julia", new HashMap<String, Double>());
		Student sonia = new Student("sonia", new HashMap<String, Double>());
		Student alice = new Student("alice", new HashMap<String, Double>());
		Student bob = new Student("bob", new HashMap<String, Double>());
		
		cse_237.addStudent(abby, 78.90);
		cse_237.addStudent(julia, 45.63);
		cse_237.addStudent(sonia, 12.32);
				
		cse_131.addStudent(alice,  50.0);
		cse_131.addStudent(bob, 70.2);
		
		
		int optionChoice = 0;
		
		Scanner user_input = new Scanner(System.in);
		
		
		System.out.println("Choose a class to work with: ");
		System.out.println(classes_taught);
		String current_class = user_input.nextLine();
		Roster chosen_roster = findRoster(current_class);
		if(chosen_roster != null) {
			System.out.println("Current class is: "+ current_class);
			listOptions();
			optionChoice = user_input.nextInt();
			while (optionChoice != 6) {
				System.out.println("option selected is " + optionChoice);
				if (optionChoice == 1){
					System.out.println("Here is the course roster!");
					chosen_roster.displayRoster();
					
				}
			
				else if (optionChoice == 2) {
					double classAverage = chosen_roster.getAverageGrade();
					System.out.println("class average is " + classAverage);

				}
			
				else if (optionChoice == 3) {
					System.out.println("Enter student name");
					user_input.nextLine();
					String new_student_name = user_input.nextLine();
					System.out.println("What is the student's grade?");
					double new_student_grade = user_input.nextDouble();
					Student new_student = new Student(new_student_name, new HashMap<String, Double>());
					chosen_roster.addStudent(new_student, new_student_grade);
					System.out.println("student added to roster!");

				}
				
				else if (optionChoice == 4) {
					System.out.println("Enter name to get grade: ");
					user_input.nextLine();
					String input_name = user_input.nextLine();
					int exists = 0;
					var grade = -1.0;
					for (Student s : chosen_roster.getRoster()) {
						if (s.getStudentName().equals(input_name)) {
							exists += 1;
							grade = s.getGrade(chosen_roster.getRosterName());
						}
					}
					if (exists == 1) {
						System.out.println(input_name + "'s grade is " + grade);

					}
					else {
						System.out.println("student not in course!");
					}
				}
				else if (optionChoice == 5) {
					boolean invalid_class = true;
					while(invalid_class) {
						System.out.println("Choose a class to work with: ");
						System.out.println(classes_taught);
						user_input.nextLine();
						current_class = user_input.nextLine();
						chosen_roster = findRoster(current_class);
						if (chosen_roster != null) {
							invalid_class = false;
						}
					}
				}
				System.out.println("Current class is: "+ current_class);
				listOptions();
				optionChoice = user_input.nextInt();
			}
		}
	}
}
**/

/*package RosterAndStudent;

import java.util.*; 


public class Professor {
	private static ArrayList<Roster> classes_taught = new ArrayList<Roster>();

	public Professor (ArrayList<Roster> classes_taught) {
		
		this.classes_taught = classes_taught;
		
	}

	public static Roster findRoster(String class_name){
		
		for (Roster roster : classes_taught) {
			if (roster.getRosterName().equals(class_name)) {
				return roster;
			}
		}
		
		return null;
		
	}

	static void listOptions() {
		
		System.out.println("Enter number to pick option:");
		System.out.println("1 = display roster");
		System.out.println("2 = get roster class average");
		System.out.println("3 = add a student to the roster");
		System.out.println("4 = remove a student from the roster");
		System.out.println("5 = retrieve a student's grade");
		System.out.println("6 = choose another class");
		System.out.println("7 = exit app");
		
	}

	public static void main(String[] args) {
		
		ArrayList<Student> cse_237_roster = new ArrayList<Student>();
		Roster cse_237 = new Roster(cse_237_roster, "CSE237");
		classes_taught.add(cse_237);

		ArrayList<Student> cse_131_roster = new ArrayList<Student>();
		Roster cse_131 = new Roster(cse_131_roster, "CSE131");
		classes_taught.add(cse_131);


		Student abby = new Student("abby", new HashMap<String, Double>());
		Student julia = new Student("julia", new HashMap<String, Double>());
		Student sonia = new Student("sonia", new HashMap<String, Double>());
		Student alice = new Student("alice", new HashMap<String, Double>());
		Student bob = new Student("bob", new HashMap<String, Double>());

		
		cse_237.addStudent(abby, 78.90);
		cse_237.addStudent(julia, 45.63);
		cse_237.addStudent(sonia, 12.32);

		cse_131.addStudent(alice,  50.0);
		cse_131.addStudent(bob, 70.2);

		

		int optionChoice = 0;

		Scanner user_input = new Scanner(System.in);


		System.out.println("Choose a class to work with: ");
		System.out.println(classes_taught);
		
		String current_class = user_input.nextLine();
		Roster chosen_roster = findRoster(current_class);
		
		
		if(chosen_roster != null) {
			
			System.out.println("Current class is: "+ current_class);
			listOptions();
			
			optionChoice = user_input.nextInt();
			
			while (optionChoice != 7) {
				
				System.out.println("option selected is " + optionChoice);
				
				if (optionChoice == 1){
					
					System.out.println("Here is the course roster!");
					chosen_roster.displayRoster();

				}

				else if (optionChoice == 2) {
					
					double classAverage = chosen_roster.getAverageGrade();
					System.out.println("class average is " + classAverage);

				}

				else if (optionChoice == 3) {
					
					System.out.println("Enter student name");
					user_input.nextLine();
					String new_student_name = user_input.nextLine();
					
					System.out.println("What is the student's grade?");
					double new_student_grade = user_input.nextDouble();
					
					Student new_student = new Student(new_student_name, new HashMap<String, Double>());
					
					chosen_roster.addStudent(new_student, new_student_grade);
					
					System.out.println("student '" + new_student_name + "' added to roster!");

				}
				
				else if (optionChoice == 4) {
					
					System.out.println("Enter student name to be removed");
					user_input.nextLine();
					
					String student_name_to_remove = user_input.nextLine();
					Student student_to_remove = chosen_roster.getStudent(student_name_to_remove);
					
					chosen_roster.removeStudent(student_to_remove);
					
					System.out.println("student '" + student_name_to_remove + "' removed from roster!");
					
				}

				else if (optionChoice == 5) {
					
					System.out.println("Enter name to get grade: ");
					user_input.nextLine();
					String input_name = user_input.nextLine();
					
					Student input_student = chosen_roster.getStudent(input_name);
					
					if (input_student != null) {
						
						var grade = input_student.getGrade(chosen_roster.getRosterName());
						System.out.println(input_name + "'s grade is " + grade);
						
					}
					else {
						
						System.out.println("student not in course!");
						
					}
					
				}
				
				else if (optionChoice == 6) {
					
					boolean invalid_class = true;
					
					while(invalid_class) {
						
						System.out.println("Choose a class to work with: ");
						System.out.println(classes_taught);
						
						user_input.nextLine();
						current_class = user_input.nextLine();
						
						chosen_roster = findRoster(current_class);
						
						if (chosen_roster != null) {
							invalid_class = false;
						}
					}
				}
				
				System.out.println("Current class is: "+ current_class);
				listOptions();
				
				optionChoice = user_input.nextInt();
			}
		}
	}
}
*/
package RosterAndStudent;

import java.util.*; 


public class Professor {
	private static ArrayList<Roster> classes_taught = new ArrayList<Roster>();
	private static Scanner user_input = new Scanner(System.in);

	public Professor (ArrayList<Roster> classes_taught, Scanner user_input) {
		this.classes_taught = classes_taught;
		this.user_input = user_input;
	}

	public static void main(String[] args) {
		initialize();
		runProgram();
	}
	
	public static Roster findRoster(String class_name){
		for (Roster roster : classes_taught) {
			if (roster.getRosterName().equals(class_name)) {
				return roster;
			}
		}
		return null;
	}

	static void listOptions() {
		System.out.println();
		System.out.println("Enter number to pick option:");
		System.out.println("1 = display roster");
		System.out.println("2 = get roster class average");
		System.out.println("3 = add a student to the roster");
		System.out.println("4 = remove a student from the roster");
		System.out.println("5 = retrieve a student's grade");
		System.out.println("6 = choose another class");
		System.out.println("7 = exit app");
	}

	private static void runProgram() {
		Roster chosen_roster = startProgram();
		int optionChoice = user_input.nextInt();
			while (optionChoice != 7) {
				System.out.println("option selected is " + optionChoice);
				selectMethod(chosen_roster, optionChoice);
				listOptions();
				optionChoice = user_input.nextInt();
			}
		}

	private static Roster startProgram() {
		System.out.println("Choose a class to work with: ");
		System.out.println(classes_taught);
		String current_class = user_input.nextLine();
		Roster chosen_roster = determineInvalid(current_class);
		System.out.println("Current class is: "+ current_class);
		listOptions();
		return chosen_roster;
	}

	private static void selectMethod(Roster chosen_roster, int optionChoice) {
		if (optionChoice == 1){					
			optionOne(chosen_roster);
		}

		else if (optionChoice == 2) {
			optionTwo(chosen_roster);
		}

		else if (optionChoice == 3) {
			optionThree(chosen_roster);
		}
		
		else if (optionChoice == 4) {
			optionFour(chosen_roster);
		}

		else if (optionChoice == 5) {
			optionFive(chosen_roster);
		}
		
		else if (optionChoice == 6) {
			optionSix(chosen_roster);
		}
	}

	private static void optionSix(Roster chosen_roster) {
		System.out.println("Choose a class to work with: ");
		System.out.println(classes_taught);
		user_input.nextLine();
		String current_class = user_input.nextLine();
		chosen_roster = findRoster(current_class);
		System.out.print(current_class);
		current_class = determineValidRoster(current_class);
		System.out.println("Current class is: "+ current_class);
	}

	private static String determineValidRoster(String current_class) {
		while (findRoster(current_class) == null) {
			System.out.println("Option not valid, choose among" + classes_taught);
			current_class = user_input.nextLine();
		}
		return current_class;
	}
	private static void optionFive(Roster chosen_roster) {
		System.out.println("Enter name to get grade: ");
		user_input.nextLine();
		String input_name = user_input.nextLine();
		
		Student input_student = chosen_roster.getStudent(input_name);
		
		if (input_student != null) {
			
			var grade = input_student.getGrade(chosen_roster.getRosterName());
			System.out.println(input_name + "'s grade is " + grade);
			
		}
		else {
			
			System.out.println("student not in course!");
			
		}
	}

	private static void optionFour(Roster chosen_roster) {
		System.out.println("Enter student name to be removed");
		user_input.nextLine();
		
		String student_name_to_remove = user_input.nextLine();
		Student student_to_remove = chosen_roster.getStudent(student_name_to_remove);
		
		chosen_roster.removeStudent(student_to_remove);
		
		System.out.println("student '" + student_name_to_remove + "' removed from roster!");
	}

	private static void optionThree(Roster chosen_roster) {
		System.out.println("Enter student name");
		user_input.nextLine();
		String new_student_name = user_input.nextLine();
		
		System.out.println("What is the student's grade?");
		double new_student_grade = user_input.nextDouble();
		
		Student new_student = new Student(new_student_name, new HashMap<String, Double>());
		
		chosen_roster.addStudent(new_student, new_student_grade);
		
		System.out.println("student '" + new_student_name + "' added to roster!");
	}

	private static void optionTwo(Roster chosen_roster) {
		double classAverage = chosen_roster.getAverageGrade();
		System.out.println("class average is " + classAverage);
	}

	private static void optionOne(Roster chosen_roster) {
		System.out.println("Here is the course roster!");
		chosen_roster.displayRoster();
	}

	private static Roster determineInvalid(String current_class) {
		Roster chosen_roster = findRoster(current_class);
		if (chosen_roster == null) {
			System.out.println("class not valid, choose " + classes_taught);
			current_class = user_input.nextLine();
			chosen_roster = findRoster(current_class);
		}
		return chosen_roster;
	}

	private static void initialize() {
		create131();
		create237();
	}
	

	private static void create131() {
		ArrayList<Student> cse_131_roster = new ArrayList<Student>();
		Roster cse_131 = new Roster(cse_131_roster, "CSE131");
		classes_taught.add(cse_131);
		addStudentsTo131(cse_131);
	}

	private static void addStudentsTo131(Roster cse_131) {
		Student alice = new Student("alice", new HashMap<String, Double>());
		Student bob = new Student("bob", new HashMap<String, Double>());
		cse_131.addStudent(alice,  50.0);
		cse_131.addStudent(bob, 70.2);
	}
	
	private static void create237() {
		ArrayList<Student> cse_237_roster = new ArrayList<Student>();
		Roster cse_237 = new Roster(cse_237_roster, "CSE237");
		classes_taught.add(cse_237);
		addStudentsTo237(cse_237);
	}

	private static void addStudentsTo237(Roster cse_237) {
		Student abby = new Student("abby", new HashMap<String, Double>());
		Student julia = new Student("julia", new HashMap<String, Double>());
		Student sonia = new Student("sonia", new HashMap<String, Double>());
		cse_237.addStudent(abby, 78.90);
		cse_237.addStudent(julia, 45.63);
		cse_237.addStudent(sonia, 12.32);
	}
	
}