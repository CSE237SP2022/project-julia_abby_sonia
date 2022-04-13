package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import RosterAndStudent.Roster;
import RosterAndStudent.Student;

class RosterTest {

	@Test
	void testRosterSizeOne() {
		ArrayList <Student> CSE237list = new ArrayList<Student>();
		Roster CSE237 = new Roster(CSE237list);
		Student henry = new Student("henry", 33.0);
		CSE237list.add(henry);
		int classSize = CSE237.getSize();
		assertEquals(1, classSize);
	}
	
	@Test
	void testRosterSizeTwo() {
		ArrayList <Student> CSE237list = new ArrayList<Student>();
		Roster CSE237 = new Roster(CSE237list);
		Student ray = new Student("ray", 44.50);
		CSE237list.add(ray);
		Student sheila = new Student("sheila", 36.72);
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
		ArrayList<Student> studentList;
		Roster roster_name = new Roster(studentList, null);
		String actual = roster_name.getRosterName();
		assertEquals(actual, Roster.getRosterName());
	
	}
	
	@Test
	void testgetRoster() {
		ArrayList<Student> studentList = new ArrayList<Student>();
		Roster roster_name = new Roster(studentList, null);
		assertEquals(roster_name, studentList);
	}

}
