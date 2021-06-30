package collections;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import basics.CodeStudent;

public class WhileLoopDemo {

	public static void main(String[] args) {
		List<CodeStudent> students = loadStudents();
		
		boolean found = false;
		int i = 0;
		while(found == false && i < students.size()) {
			CodeStudent student = students.get(i);
			if (student.pointsOnExam > 50) {
				found = true;
				System.out.println(student);
			} else {
				i++;
			}
		}
		
		if (i == students.size()) {
			System.out.println("Niko nije polozio :(");
		}

	}


	private static List<CodeStudent> loadStudents() {
		List<CodeStudent> listOfStudents = new ArrayList<CodeStudent>(); //od predlozenih importa izabrati java.util
		
		try {
		      File myObj = new File("C:\\Users\\QA\\Documents\\polaznici.txt");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        String[] dataParts = data.split(" ");
		        String name = dataParts[0];
		        String lastName = dataParts[1];
		        Integer numberOfPoints = Integer.parseInt(dataParts[2]);
		        CodeStudent student = new CodeStudent(name, lastName, numberOfPoints, null);
		        listOfStudents.add(student);
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		return listOfStudents;
	}
}
