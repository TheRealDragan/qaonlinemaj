package collections;

public class ForLoopDemo {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) { //i je tzv brojac i sluzi za kontrolisanje toga koliko ce se puta blok koda koji pripada 
			                         //petlji izvrsiti
		System.out.println("Cao");
		}
		
		System.out.println(sumOfNumbersToN(5));
		System.out.println(sumOfNumbersToN(8));

		
	}
	
	static int sumOfNumbersToN (int n) {
		int sum = 0;
		for (int i = 1; i <=n; i++) {
			sum = sum + i;
		}
		return sum;		
	}

}
