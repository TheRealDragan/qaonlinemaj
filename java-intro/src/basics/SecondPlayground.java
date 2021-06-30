package basics;

public class SecondPlayground {

	public static void main(String[] args) {
		CodeStudent student = new CodeStudent ("Marko", "Markovic", 99, Sex.MALE);
		
		System.out.println("Ime studenta je "+student.name);
		System.out.println("Prezime studenta je "+student.lastName);
		System.out.println("Poeni studenta su "+student.pointsOnExam);
		System.out.println("Pol studenta je "+student.sex);

	}

}
