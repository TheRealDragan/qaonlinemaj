package basics;

public class Calculator {
	
	Double numberOnScreen;
	
	double addNumber(double a) {
		return numberOnScreen + a;
	}
	
	static int addNumbers(int a, int b) {
//		addNumber(3); -> nije moguce pozvati nestaticku metodu iz staticke metode
		// razlog: staticka metoda postoji bez da postoji ijedan objekat te klase (videti klasu staticdemo i poziv ove metode
		// bez pravljenje ijednog Calculator objekta
		//staticka metoda bi pozivom nestaticke metode prestala da bude staticka jer bi i sama pocela da zavisi od stanje
		return a + b;
	}
	
	static void printSmallNumber(int number) {
		if (number >= 1000) {
			throw new RuntimeException("Ova metoda radi samo za brojeve manje od 1000");
		}
			System.out.println(number);
		
	}
	
}
