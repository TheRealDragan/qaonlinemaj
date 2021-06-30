package intro;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class FirstPractice {

	//metoda treba da odstampa kolicnik dva decimalna broja zaokruzen na dve decimale
	public static void main(String[] args) {
		double a = 4.00;
		double b = 1.5;
		double c = a / b; 
		
		//Do resenja smo dosli kucanjem u gugl 
		// java round double two decimal places
		// PRI GUGLANJU STVARI VEZANIH ZA KOD OBAVEZNO KORISTITI ENGLESKI JEZIK!!!!!
		System.out.format("%.2f", c);

	}

}
