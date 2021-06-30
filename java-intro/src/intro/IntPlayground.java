package intro;

public class IntPlayground {

	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		
		int c = a + b;
		
		System.out.println(c);
		
		//int d  = c / a; -> ovo je 2, dakle deljenje bez ostatka (celobrojno deljenje)
		
	//	double d = c / a; -> iako je d definisan kao double, rezultat ce i dalje biti 2, jer
		// se prvo izracunava desna strana oko znaka =; a deljenje za cele brojeve (c i a) 
		// je definisano tako da vraca rezultat bez ostatka		
		
		double d = (double) c / (double) a; //kastovanje () -> pretvaranje jednog tipa u drugi
		
		System.out.println(d);
		
		int e = 12 % 8;
		
		System.out.println(e);
	}

}
