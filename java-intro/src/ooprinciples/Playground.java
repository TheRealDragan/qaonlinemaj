package ooprinciples;

import basics.CodeStudent;

public class Playground {

	public static void main(String[] args) {
		EncapsulatedStudent student = new EncapsulatedStudent("Petar", "Petrovic");
		System.out.println(student.getName());
		
		student.setName("Milan");
		
		System.out.println(student.getName());
		
		CodeStudent codeStudent = new CodeStudent();

	}

}
