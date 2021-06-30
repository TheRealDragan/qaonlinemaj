package collections;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import basics.CodeStudent;

public class ForEachLoopDemo {

	public static void main(String[] args) throws IOException {
		List<CodeStudent> listOfStudents = loadStudents();
		Map<Integer, Integer> countByGrade = new HashMap<Integer, Integer>();
		countByGrade.put(5, 0);
		countByGrade.put(6, 0);
		countByGrade.put(7, 0);
		countByGrade.put(8, 0);
		countByGrade.put(9, 0);
		countByGrade.put(10, 0);
		
		for (CodeStudent student : listOfStudents) {
			int grade = student.calculateGrade();
			int currentCount = countByGrade.get(grade);
			countByGrade.put(grade, currentCount+1);
		}
		
		System.out.println(countByGrade);
		
		for (Integer key : countByGrade.keySet()) {
			System.out.println("Za ocenu " + key + " imamo " + countByGrade.get(key) + " studenata");
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
