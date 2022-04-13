package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import RosterAndStudent.Student;

class StudentTest {

	@Test
	void testName() {
		Map<String, Double> abby_classes = new HashMap<String, Double>();
		Student abby = new Student("Abby", abby_classes);
		String abby_name = abby.getStudentName();
		assertEquals("Abby", abby_name);
		System.out.println(abby_name);
	}
	
	@Test
	void testGrade() {
		Map<String, Double> julia_classes = new HashMap<String, Double>();
		julia_classes.put("CSE131", 90.0);
		julia_classes.put("CSE132", 85.65);
		Student julia = new Student ("Julia", julia_classes);
		double julia_grade_131 = julia.getGrade("CSE131");
		assertEquals(90.0, julia_grade_131);
		
	}

}
