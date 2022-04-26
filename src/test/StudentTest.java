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
	}
	
	@Test
	void testGetGradeValid() {
		Map<String, Double> julia_classes = new HashMap<String, Double>();
		julia_classes.put("CSE131", 90.0);
		julia_classes.put("CSE132", 85.65);
		Student julia = new Student ("Julia", julia_classes);
		double julia_grade_131 = julia.getGrade("CSE131");
		assertEquals(90.0, julia_grade_131);
	}
	
	@Test
	void testGetGradeInvalid() {
		Map<String, Double> julia_classes = new HashMap<String, Double>();
		julia_classes.put("CSE131", 90.0);
		julia_classes.put("CSE132", 85.65);
		Student julia = new Student ("Julia", julia_classes);
		Double julia_grade_131 = julia.getGrade("CSE237");
		System.out.println("grade: ");
		System.out.println(julia_grade_131);
		assertNull(julia_grade_131);
	}
	
	@Test
	void testAddClassValid(){
		Map<String, Double> sonia_classes = new HashMap<String, Double>();
		sonia_classes.put("CSE131", 86.0);
		Student sonia = new Student ("Sonia", sonia_classes);
		sonia.addClass("CSE237", 32.67);
		assertEquals(2, sonia_classes.size());
	}
	
	@Test
	void testAddClassDuplicate(){
		Map<String, Double> sonia_classes = new HashMap<String, Double>();
		sonia_classes.put("CSE131", 86.0);
		Student sonia = new Student ("Sonia", sonia_classes);
		sonia.addClass("CSE237", 32.67);
		sonia.addClass("CSE237", 32.67);
		assertEquals(2, sonia_classes.size());
	}
	
	@Test
	void testRemoveClassValid(){
		Map<String, Double> sonia_classes = new HashMap<String, Double>();
		sonia_classes.put("CSE131", 86.0);
		sonia_classes.put("CSE237", 54.62);
		Student sonia = new Student ("Sonia", sonia_classes);
		sonia.removeClass("CSE237");
		assertEquals(1, sonia_classes.size());
	}
	
	@Test
	void testRemoveClassInvalid(){
		Map<String, Double> sonia_classes = new HashMap<String, Double>();
		sonia_classes.put("CSE131", 86.0);
		sonia_classes.put("CSE237", 54.62);
		Student sonia = new Student ("Sonia", sonia_classes);
		sonia.removeClass("CSE132");
		assertEquals(2, sonia_classes.size());
	}

}
