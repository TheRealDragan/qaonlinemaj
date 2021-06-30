package basics;

public class Playground {

	public static void main(String[] args) { //public static void main(String[] args) je specijalna metoda koja se zove mejn
	                                         //metoda i kroz ove metode je moguce pokrenuti java klase i/ili aplikacije
   // public void doSomething() { -> ako se zakomentarise gornja linija i otkomentarise ova, klasa vise nece moci da se
		                           //pokrene zato sto vise ne postoji main metoda u klasi
		CodeStudent student = new CodeStudent();
		student.name = "Sasa";
		student.lastName = "Djurdjevic";
		student.pointsOnExam = 105;
		
		
		student.sayYourName();
		System.out.println("Prezime studenta je "+student.lastName);
		System.out.println("Broj poena studenta je " + student.pointsOnExam);
		
		System.out.println("Ocena studenta je " + student.calculateGrade());
		
		CodeStudent secondStudent = new CodeStudent();
		secondStudent.name = "Lena";
		secondStudent.lastName = "Tosic";
		secondStudent.pointsOnExam = 32;
	//	secondStudent.pointsOnExam = 0;
		
		System.out.println("Ime studenta je "+secondStudent.name);
		//Difoltna vrednost polja slozenog tipa (vrednost koju polja imaju pre nego sto budu dodeljena
		// je null. null je nacin da se predstavi da se u memorijskoj lokaciji ne nalazi nista
		// null vrednosti sa sobom nose odredjene potencijalne komplikacije, cime cemo se baviti
		// kasnije tokom kursa
		System.out.println("Prezime studenta je "+secondStudent.lastName);
		// Prosti tipovi ne mogu biti null. Umesto null, oni imaju svoju difoltnu
		// vrednost pre nego sto ista bude dodeljena
		System.out.println("Ocena studenta je " + secondStudent.calculateGrade());
		
		
		if (secondStudent.pointsOnExam != null) {
			System.out.println("Broj poena studenta je " + secondStudent.pointsOnExam);
		} else {
			System.out.println("Student nije izasao na ispit!");
		}

    //demo provere enum-a
	//	if (secondStudent.attendedExam == AttendedExam.HAS_ATTENDED) {
	//		System.out.println("Student je izasao na ispit!");
	//	}
	}

}
