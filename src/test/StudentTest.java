package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import StudentandRoster.Student;

class StudentTest {

	@Test
	void testName() {
		Student abby = new Student("Abby", 99.0);
		String name = abby.getName();
		assertEquals("Abby", name);
	}
	
	@Test
	void testGrade() {
		Student julia = new Student ("Julia", 20.1);
		double grade = julia.getGrade();
		assertEquals(20.1, grade);
		
	}

}
