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
	void testRosterSizeOne() {
		ArrayList <Student> CSE237list = new ArrayList<Student>();
		Roster CSE237 = new Roster(CSE237list, null);
		Map<String, Double> henry_classes = new HashMap<String,Double>();
		Student henry = new Student("henry", henry_classes);
		CSE237list.add(henry);
		int classSize = CSE237.getSize();
		assertEquals(1, classSize);
	}
	
	@Test
	void testRosterSizeTwo() {
		ArrayList <Student> CSE237list = new ArrayList<Student>();
		Roster CSE237 = new Roster(CSE237list, null);
		Map<String, Double> ray_classes = new HashMap<String, Double>();
		Map<String, Double> sheila_classes = new HashMap<String, Double>();
		Student ray = new Student("ray", ray_classes);
		CSE237list.add(ray);
		Student sheila = new Student("sheila", sheila_classes);
		CSE237list.add(sheila);
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
		Roster roster_name = new Roster(studentList, (null));
		String actual = roster_name.getRosterName();
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

}
