package collections;

import basics.CodeStudent;

public class WhyUseCollections {

	public static void main(String[] args) {
		CodeStudent student1 = new CodeStudent();
		CodeStudent student2 = new CodeStudent();
		CodeStudent student3 = new CodeStudent();
		CodeStudent student4 = new CodeStudent();
		
		student1.pointsOnExam = 90;
		student2.pointsOnExam = 85;
		student3.pointsOnExam = 95;
		student4.pointsOnExam = 100;
		
		double averagePoints = (double) (student1.pointsOnExam + student2.pointsOnExam + 
				 student3.pointsOnExam + student4.pointsOnExam) / 4;


		//Razlog zasto ovaj kod ne moze da radi u najopstijem slucaju (gde se studenti citaju
		// iz fajla ili baze) je taj sto ovaj kod zavisi od tacnog broja studenata
		// dakle, on bi mogao da radi ako bi svaka grupa imala tacno onoliko studenata
		// koliko je predvidjeno u kodu.
		System.out.println(averagePoints);

	}

}
