package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import basics.CodeStudent;

public class CodeStudentGradeCalculationTest {
	
	public CodeStudent codeStudent = new CodeStudent();
	
	@Test
	public void testWhenStudentHasFailedExam() {
		codeStudent.pointsOnExam = 30;
		int grade = codeStudent.calculateGrade();
		assertEquals(grade, 5);
	}
	
	@Test
	public void testWhenStudentHasBarelyPassedExam() {
		codeStudent.pointsOnExam = 50;
		int grade = codeStudent.calculateGrade();
		assertEquals(grade, 6);
	}
	
	@Test
	public void testWhenStudentHasPassedExam() {
		codeStudent.pointsOnExam = 75;
		int grade = codeStudent.calculateGrade();
		assertEquals(grade, 8);
	}
	
	@Test
	public void testWhenStudentHasMaxPoints() {
		codeStudent.pointsOnExam = 100;
		int grade = codeStudent.calculateGrade();
		assertEquals(grade, 10);
	}
	
	@Test(expected = RuntimeException.class)
	public void testWhenStudentHasOverMaxPoints() {
		codeStudent.pointsOnExam = 101;
		int grade = codeStudent.calculateGrade();		
	}
	
	@Test(expected = RuntimeException.class)
	public void testWhenStudentHasNegativePoints() {
		codeStudent.pointsOnExam = -1;
		int grade = codeStudent.calculateGrade();
		System.out.println(grade);
	}
	
	

}
