package intro;

public class BooleanPlayGround2 {

	public static void main(String[] args) {

		int a = -2;
		int b = 3;
				
		boolean c = b > a && a > 0;		
		
		if (c == true) System.out.println("a i b su pozitivni brojevi i b je veci je od a");
			else System.out.println("b ili a nisu pozitivni brojevi ili b nije vece od a");


		int d = 4;
		int e = -4;
		
		boolean f = d > 0 || e > 0;
		
		if (f == true) System.out.println("d ili e je pozitivan broj");
		else System.out.println("d i e nisu pozitivni brojevi");
		
	}

}
