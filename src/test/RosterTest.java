package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import RosterAndStudent.Professor;
import RosterAndStudent.Roster;
import RosterAndStudent.Student;

class RosterTest {

	@Test
	void testAddStudentOne() {
		ArrayList <Student> CSE237list = new ArrayList<Student>();
		Roster CSE237 = new Roster(CSE237list, null);
		Map<String, Double> henry_classes = new HashMap<String,Double>();
		Student henry = new Student("henry", henry_classes);
		CSE237.addStudent(henry, 98.7);
		int classSize = CSE237.getSize();
		assertEquals(1, classSize);
	}
	
	@Test
	void testAddStudentTwo() {
		ArrayList <Student> CSE237list = new ArrayList<Student>();
		Roster CSE237 = new Roster(CSE237list, null);
		Map<String, Double> ray_classes = new HashMap<String, Double>();
		Map<String, Double> sheila_classes = new HashMap<String, Double>();
		Student ray = new Student("ray", ray_classes);
		CSE237.addStudent(ray, 54.8);
		Student sheila = new Student("sheila", sheila_classes);
		CSE237.addStudent(sheila, 37.9);
		int classSize = CSE237.getSize();
		assertEquals(2, classSize);
	}
	
	@Test
	void testAddStudentDuplicate() {
		ArrayList <Student> CSE237list = new ArrayList<Student>();
		Roster CSE237 = new Roster(CSE237list, null);
		Map<String, Double> ray_classes = new HashMap<String, Double>();
		Map<String, Double> sheila_classes = new HashMap<String, Double>();
		Student ray = new Student("ray", ray_classes);
		CSE237.addStudent(ray, 29.4);
		Student sheila = new Student("sheila", sheila_classes);
		CSE237.addStudent(sheila, 89.7);
		CSE237.addStudent(sheila, 89.7);
		int classSize = CSE237.getSize();
		assertEquals(2, classSize);
	}
	
	@Test
	void testRosterincrease() {
		ArrayList <Student> studentList = new ArrayList<Student>();
		Roster roster_name = new Roster(studentList, null);
		int rosterSize = roster_name.getSize();
		Roster.assertTrue(rosterSize != studentList.size());
		
	}
	
	@Test
	void testgetRosterName() {
		ArrayList<Student> studentList= new ArrayList<Student>();
		Roster roster_name = new Roster(studentList, "Sample Roster");
		String actual = "Sample Roster";
		assertEquals(actual, roster_name.getRosterName());
	
	}
	
	@Test
	void testgetRoster() {
		ArrayList<Student> studentList = new ArrayList<Student>();
		Map<String, Double> new_student_one_map = new HashMap<String, Double>();
		Map<String, Double> new_student_two_map = new HashMap<String, Double>();
		Student new_student_one = new Student("ray", new_student_one_map);
		Student new_student_two = new Student("sheila", new_student_two_map);
		studentList.add(new_student_one);
		studentList.add(new_student_two);
		Roster roster_name = new Roster(studentList, "roster");
		ArrayList<Student> compareList = new ArrayList<Student>();
		compareList = roster_name.getRoster();
		assertEquals(studentList, compareList);
	}
	
	@Test
	void testRemoveStudent() {
		ArrayList <Student> CSE237list = new ArrayList<Student>();
		Roster CSE237 = new Roster(CSE237list, null);
		Map<String, Double> deanna_classes = new HashMap<String, Double>();
		Map<String, Double> zoe_classes = new HashMap<String, Double>();
		Map<String, Double> rue_classes = new HashMap<String, Double>();
		Student deanna = new Student("deanna", deanna_classes);
		CSE237.addStudent(deanna, 84.3);
		Student zoe = new Student("zoe", zoe_classes);
		CSE237.addStudent(zoe, 81.9);
		Student rue = new Student("rue", rue_classes);
		CSE237.addStudent(rue, 26.4);
		
		CSE237.removeStudent(rue);
		
		int classSize = CSE237.getSize();
		assertEquals(2, classSize);
	}
	
	@Test
	void testRemoveStudentInvalid() {
		ArrayList <Student> CSE237list = new ArrayList<Student>();
		Roster CSE237 = new Roster(CSE237list, null);
		Map<String, Double> deanna_classes = new HashMap<String, Double>();
		Map<String, Double> zoe_classes = new HashMap<String, Double>();
		Map<String, Double> rue_classes = new HashMap<String, Double>();
		Student deanna = new Student("deanna", deanna_classes);
		CSE237.addStudent(deanna, 84.3);
		Student zoe = new Student("zoe", zoe_classes);
		CSE237.addStudent(zoe, 81.9);
		Student rue = new Student("rue", rue_classes);
		
		CSE237.removeStudent(rue);
		
		int classSize = CSE237.getSize();
		assertEquals(2, classSize);
	}
	
	@Test
	void testGetStudentValid() {
		ArrayList <Student> CSE237list = new ArrayList<Student>();
		Roster CSE237 = new Roster(CSE237list, null);
		Map<String, Double> deanna_classes = new HashMap<String, Double>();
		Map<String, Double> zoe_classes = new HashMap<String, Double>();
		Map<String, Double> rue_classes = new HashMap<String, Double>();
		Student deanna = new Student("deanna", deanna_classes);
		CSE237.addStudent(deanna, 84.3);
		Student zoe = new Student("zoe", zoe_classes);
		CSE237.addStudent(zoe, 81.9);
		Student rue = new Student("rue", rue_classes);
		CSE237.addStudent(rue, 26.4);
		
		Student testStudent = CSE237.getStudent("rue");
		
		assertSame(rue, testStudent);
		
	}
	
	@Test
	void testGetStudentInvalid() {
		ArrayList <Student> CSE237list = new ArrayList<Student>();
		Roster CSE237 = new Roster(CSE237list, null);
		Map<String, Double> deanna_classes = new HashMap<String, Double>();
		Map<String, Double> zoe_classes = new HashMap<String, Double>();
		Map<String, Double> rue_classes = new HashMap<String, Double>();
		
		Student deanna = new Student("deanna", deanna_classes);
		CSE237.addStudent(deanna, 84.3);
		
		Student zoe = new Student("zoe", zoe_classes);

		Student rue = new Student("rue", rue_classes);
		CSE237.addStudent(rue, 26.4);
		
		Student testStudent = CSE237.getStudent("zoe");
		
		assertNull(testStudent);
		
	}
	
	@Test
	void testGetStudentRemoved() {
		ArrayList <Student> CSE237list = new ArrayList<Student>();
		Roster CSE237 = new Roster(CSE237list, null);
		
		Map<String, Double> deanna_classes = new HashMap<String, Double>();
		Map<String, Double> zoe_classes = new HashMap<String, Double>();
		Map<String, Double> rue_classes = new HashMap<String, Double>();
		
		Student deanna = new Student("deanna", deanna_classes);
		CSE237.addStudent(deanna, 84.3);
		Student zoe = new Student("zoe", zoe_classes);
		CSE237.addStudent(zoe, 81.9);
		Student rue = new Student("rue", rue_classes);
		CSE237.addStudent(rue, 26.4);
		
		CSE237.removeStudent(rue);
		
		Student test_student = CSE237.getStudent("rue");
		
		assertNull(test_student);
		
	}
	
	@Test
	void testGetAverageGrade() {
		ArrayList <Student> CSE237list = new ArrayList<Student>();
		Roster CSE237 = new Roster(CSE237list, null);
		
		Map<String, Double> deanna_classes = new HashMap<String, Double>();
		Map<String, Double> zoe_classes = new HashMap<String, Double>();
		Map<String, Double> rue_classes = new HashMap<String, Double>();
		
		Student deanna = new Student("deanna", deanna_classes);
		CSE237.addStudent(deanna, 84.3);
		Student zoe = new Student("zoe", zoe_classes);
		CSE237.addStudent(zoe, 81.9);
		Student rue = new Student("rue", rue_classes);
		CSE237.addStudent(rue, 26.4);
		
		double test_average = CSE237.getAverageGrade();
		
		assertEquals(64.2, test_average);
		
	}
	
	@Test
	void testGetAverageGradeEmpty() {
		ArrayList <Student> CSE237list = new ArrayList<Student>();
		Roster CSE237 = new Roster(CSE237list, null);
		
		double test_average = CSE237.getAverageGrade();
		
		assertEquals(0.0, test_average);
		
	}
	
	@Test
	void testFindRosterValid() {
		ArrayList<Roster> test_classes_taught = new ArrayList<Roster>();
		
		ArrayList<Student> cse_132_roster = new ArrayList<Student>();
		Roster cse_132 = new Roster(cse_132_roster, "CSE132");
		test_classes_taught.add(cse_132);

		ArrayList<Student> cse_131_roster = new ArrayList<Student>();
		Roster cse_131 = new Roster(cse_131_roster, "CSE131");
		test_classes_taught.add(cse_131);

		Professor test_professor = new Professor(test_classes_taught);
		
		assertSame(cse_132, test_professor.findRoster("CSE132"));
		
	}
	
	@Test
	void testFindRosterInvalid() {
		ArrayList<Roster> test_classes_taught = new ArrayList<Roster>();
		
		ArrayList<Student> cse_132_roster = new ArrayList<Student>();
		Roster cse_132 = new Roster(cse_132_roster, "CSE132");
		test_classes_taught.add(cse_132);

		ArrayList<Student> cse_131_roster = new ArrayList<Student>();
		Roster cse_131 = new Roster(cse_131_roster, "CSE131");
		test_classes_taught.add(cse_131);

		Professor test_professor = new Professor(test_classes_taught);
		
		assertNull(test_professor.findRoster("DNE"));
		
	}
	

}
