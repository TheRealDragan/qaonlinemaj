package basics;

public class CodeStudent {
	
	 String name;
	public String lastName;
	//int grade;
	public Integer pointsOnExam;
	//	int pointsOnExam;
//	boolean hasTakenExam; --> booleansko polje bi sluzilo kao dodatna provera kako bismo znali
    // da li je neko ko ima 0 pointsOnExam (u slucaju kada je ovo polje int) izasao na ispit
    // i na njemu ostvario 0 poena ili jos uvek nije izasao na ispit
//    AttendedExam attendedExam; --> moze se postaviti enum sa mogucnostima izasao je/nije izasao
    // ali za to nema potrebe zato sto boolean svakako pokriva da/ne i jeste/nije scenarije
	
//	pointsOnExam == 0 && hasTakenExam == false ==> bice true za studenta koji jos nije izasao na ispit
		
	public Sex sex;
	
	public CodeStudent() {
		
	} // Difoltni konstruktor prestaje da postoji kada se definise bilo kakav parametarski konstuktor.
	//Ako zelimo da imamo oba, moramo da eksplicitno definisemo difoltni konstuktor (na nacin na koji je to
	// ovde uradjeno) svaki put kada postoje parametarski konstruktori.
	
	public CodeStudent(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
	}
	
	public CodeStudent(String name, String lastName, Integer pointsOnExam, Sex sex) {
		this.name = name;
		this.lastName = lastName;
		this.pointsOnExam = pointsOnExam;
		this.sex = sex;
	}

	void sayYourNameWithPronoun () {
		if (sex == Sex.FEMALE) {
			System.out.println("Miss "+name+" " + lastName);
		}
		if (sex == Sex.MALE) {
			System.out.println("Mr "+name+" " + lastName);
		}
		if (sex == null || sex == Sex.OTHER) {
			System.out.println(name+" " +lastName);
		}
	//	if (sex == null) {
	//		System.out.println("Pol nije izabran!"); --> jedno resenje
	//	}
	}
	
	void printNumber(int number) {
		System.out.println(number);
	}
	
	void sayHiInSerbian() {
		System.out.println("Cao");
	}
	
	void sayThis(String wordToSay) {
		System.out.println(wordToSay);
	}
	
	void sayYourName() {
		System.out.println("Hi, my name is " + name + "!");
	}
	
	public int calculateGrade() {
				
		if (pointsOnExam < 50) {
			return 5;
		}
		
		if (pointsOnExam == 100) {
			return 10;
		}
		
		return pointsOnExam / 10 + 1;
		
//		if (pointsOnExam > 50 && pointsOnExam < 60) {
//			return 6;
//		}
//		if (pointsOnExam > 60 && pointsOnExam < 70) {
//			return 7;
//		}
//		if (pointsOnExam > 70 && pointsOnExam < 80) {
//			return 8;
//		}
//		if (pointsOnExam > 80 && pointsOnExam < 90) {
//			return 9;
//		}
//		if (pointsOnExam > 90 && pointsOfExam < 100 ) {
//			return 10;
//		}
//		
//		return 5;
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((pointsOnExam == null) ? 0 : pointsOnExam.hashCode());
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CodeStudent other = (CodeStudent) obj;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pointsOnExam == null) {
			if (other.pointsOnExam != null)
				return false;
		} else if (!pointsOnExam.equals(other.pointsOnExam))
			return false;
		if (sex != other.sex)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Ime : "+name+" Prezime: " + lastName 
			+ " Poeni na ispitu: " + pointsOnExam
			+" Pol: " + sex;
	
	}
	
	
	
	// potpis metode:
	// modifikator pristupa -> ucicemo sta je
	// povratna vrednost
	// ime
	// ulazni parametri
	
	//public int addTwoNumbers(int a, int b)
	
	

}
