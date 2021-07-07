package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import basics.CodeStudent;
import basics.Sex;

public class CodeStudentNamePronounciationTest {

	public CodeStudent codeStudent = new CodeStudent();

	@Test
	public void testWhenStudentIsFemale() {
		codeStudent.sex = Sex.FEMALE;
		codeStudent.name = "Mileva";
		codeStudent.lastName = "Milevic";
		String greeting = codeStudent.sayYourNameWithPronoun();
		assertEquals(greeting, "Miss Mileva Milevic");
	}
	

	@Test
	public void testWhenStudentIsMale() {
		codeStudent.sex = Sex.MALE;
		codeStudent.name = "Albert";
		codeStudent.lastName = "Albertic";
		String greeting = codeStudent.sayYourNameWithPronoun();
		assertEquals(greeting, "Mr Albert Albertic");
	}
	

	@Test
	public void testWhenStudentIsOther() {
		codeStudent.sex = Sex.OTHER;
		codeStudent.name = "Albert";
		codeStudent.lastName = "Albertic";
		String greeting = codeStudent.sayYourNameWithPronoun();
		assertEquals(greeting, "Albert Albertic");
	}
	
	@Test
	public void testWhenSexIsNull() {
		codeStudent.name = "Albert";
		codeStudent.lastName = "Albertic";
		String greeting = codeStudent.sayYourNameWithPronoun();
		assertEquals(greeting, "Albert Albertic");
	}
	
	@Test
	public void testWhenFirstNameIsNull() {
		codeStudent.sex = Sex.OTHER;
		codeStudent.lastName = "Albertic";
		String greeting = codeStudent.sayYourNameWithPronoun();
		assertEquals(greeting, "null Albertic");
	}
	
	
	@Test
	public void testWhenLastNameIsNull() {
		codeStudent.sex = Sex.OTHER;
		codeStudent.name = "Albert";
		String greeting = codeStudent.sayYourNameWithPronoun();
		assertEquals(greeting, "Albert null");
	}
	

	@Test
	public void testWhenBothFirstAndLastNameAreNull() {		
		String greeting = codeStudent.sayYourNameWithPronoun();
		assertEquals(greeting, "null null");
	}
}
