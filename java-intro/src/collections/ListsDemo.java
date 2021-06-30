package collections;
import java.util.ArrayList;
import java.util.List;

import basics.CodeStudent;
public class ListsDemo {

	public static void main(String[] args) {
		List<CodeStudent> listOfStudents = new ArrayList<CodeStudent>(); //od predlozenih importa izabrati java.util

		CodeStudent student1 = new CodeStudent();
		CodeStudent student2 = new CodeStudent();
		CodeStudent student3 = new CodeStudent();
		CodeStudent student4 = new CodeStudent();
		CodeStudent student5 = new CodeStudent();

		
		student1.pointsOnExam = 90;
		student2.pointsOnExam = 85;
		student3.pointsOnExam = 95;
		student4.pointsOnExam = 100;
		student5.pointsOnExam = 100;

		
		listOfStudents.add(student1);
		listOfStudents.add(student2);
		listOfStudents.add(student3);
		listOfStudents.add(student4);
		listOfStudents.add(student5);

		
	//	System.out.println(listOfStudents.get(4)); -> POZIV KA ELEMENTU LISTE CIJI JE INDEX VECI OD NAJVISEG INDEX-A LISTE
		// DOVODI DO GRESKE!!!!!!
		System.out.println(listOfStudents.get(1));
		
		System.out.println("DUZINA LISTE JE "+listOfStudents.size());
		
		int sum = 0;
		
		for (int i=0; i<listOfStudents.size(); i++) {
			sum = sum + listOfStudents.get(i).pointsOnExam;
		}
		
		double averagePoints = (double) sum / listOfStudents.size();
		
		System.out.println(averagePoints);

	}

}
