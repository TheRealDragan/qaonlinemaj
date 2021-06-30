package intro;

public class BooleanPlayGround3 {

	public static void main(String[] args) {
		int a = 2;
		int b = 3;

		boolean c = b > a && a > 0; //true && true -> true
		
		//== je poredjenje; 5 == 5 je true; 4 == 5 je false
		
		if (c) { //true == true -> true 
			// ZA BOOLEANSKE VREDNOSTI NE PISATI if (booleanskaPromenljiva == true) nego samo if (booleanskaPromenljiva)
			System.out.println("a i b su pozitivni brojevi i b je veci je od a");
			System.out.println("C je true!");
		} else {
			System.out.println("b ili a nisu pozitivni brojevi ili b nije vece od a");
			System.out.println("C je false");
		}

		int d = 4;
		int e = -4;

	//	boolean f = d > 0 || e > 0; 

		if (d > 0 || e > 0) { //Pisemo direktno izraz koji se evaluira jer nema potrebe definisati promenljivu za kod \
			               //(izraz) koji se koristi samo jednom
			System.out.println("d ili e je pozitivan broj");
		} else {
			System.out.println("d i e nisu pozitivni brojevi");
		}

	}

}
