package collections;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import basics.CodeStudent;

public class MapsDemo {

	public static void main(String[] args) {
		List<CodeStudent> listOfStudents = loadStudents();
		System.out.println(listOfStudents);

	}
	
	private static List<CodeStudent> loadStudents() {
		List<CodeStudent> listOfStudents = new ArrayList<CodeStudent>(); //od predlozenih importa izabrati java.util
		
		//FileNotFoundException
		      File myObj = new File("C:\\Users\\QA\\Documents\\polaznici.txt");
		      Scanner myReader = null;
			try {
				 myReader = new Scanner(myObj);			
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        String[] dataParts = data.split(" ");
		        String name = dataParts[0];
		        String lastName = dataParts[1];
		        Integer numberOfPoints = null;
		        try {
		        numberOfPoints = Integer.parseInt(dataParts[2]);
		        } catch (NumberFormatException e) {
		        	System.out.println("Za studenta " + name + " " + lastName + " unesen nepravilan broj poena!");
		        	continue;
		        }
		        CodeStudent student = new CodeStudent(name, lastName, numberOfPoints, null);
		        listOfStudents.add(student);
		      }
			} 		
			catch (FileNotFoundException nameOfVariable) {
				System.out.println("Greska pri citanju fajla!");
			} finally {
				System.out.println("EVO ME U FAJNALI!");
			     myReader.close();
			}
		   
		return listOfStudents;
	}

}
