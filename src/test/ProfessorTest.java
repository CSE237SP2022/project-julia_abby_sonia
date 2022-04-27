package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import RosterAndStudent.Professor;
import RosterAndStudent.Roster;
import RosterAndStudent.Student;

public class ProfessorTest {
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

		Professor test_professor = new Professor(test_classes_taught, null);
		
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

		Professor test_professor = new Professor(test_classes_taught, null);
		
		assertNull(test_professor.findRoster("DNE"));
		
	}
	
	@Test
	void testDetermineInvalid() {
		ArrayList<Roster> test_class_name = new ArrayList<Roster>();
		
		ArrayList<Student> test_class_list = new ArrayList<Student>();
		Roster class_name = new Roster(test_class_list, "test_class_name");
		
		Professor test_professor = new Professor(test_class_name, null);
		
		assertNull(test_professor.findRoster("DNE"));
		
	}
	@Test
	void testDetermineValid() {
		ArrayList<Roster> test_class_valid = new ArrayList<Roster>();
		
		ArrayList<Student> test_class_list = new ArrayList<Student>();
		Roster valid_class_name = new Roster(test_class_list, "test_class_name");
		
		assertEquals("test_class_name", valid_class_name.getRosterName() );
	}
}
