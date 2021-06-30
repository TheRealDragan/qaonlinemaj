package exceptions;

import basics.CodeStudent;

public class ExceptionsDemo {

	public static void main(String[] args) {
		CodeStudent student = null;
		//System.out.println(student.name); //nullpointexception se desava kada 
		                                 //pokusamo da pristupimo polju ili pozovemo metodu
		                                //objekta cija je vrednost null
	//	student.calculateGrade();
		
	//	if (student!=null) {           Ako imamo objekat koji potencijalno moze biti null,
	//		student.calculateGrade();  pre pozivanja njegovih polja i/ili metoda obavezno
	//	}                      proveriti da li je objekat null kao sto je uradjeno u liniji 12

		
	 String five = "5";
	 Integer asInt = Integer.parseInt(five);
	 System.out.println(asInt);
	 
	 five = "abc";
	 asInt = Integer.parseInt(five);
	 System.out.println(asInt);
	}

}
