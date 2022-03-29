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
	
	public void addStudent(Student s) {
		studentList.add(s);
	}
	

	public static void main(String[] args) {
		
		Student abby = new Student("abby", 99.0);
		Student julia = new Student("julia", 20.1);
		Student sonia = new Student("sonia", 41.7);
		studentList.add(abby);
		studentList.add(julia);
		studentList.add(sonia);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name to get grade: ");
	    String name = sc.nextLine();
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
}
	


