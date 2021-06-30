package basics;

public class StaticDemo {

	public static void main(String[] args) {
		AddamsFamilyMember gomez = new AddamsFamilyMember("Gomez");
		AddamsFamilyMember morticia = new AddamsFamilyMember("Morticia");
		AddamsFamilyMember wednesday = new AddamsFamilyMember("Wednesday");

		
		System.out.println(gomez);
		System.out.println(morticia);
		System.out.println(wednesday);

		
	//	gomez.lastName = "James"; --> Ovaj kod ce raditi, ali je konvencija 
	// (zbog citljviosti) da se statickim varijablama pristupa preko imena klase
		AddamsFamilyMember.lastName = "James";
		System.out.println(gomez);
		System.out.println(morticia);
		System.out.println(wednesday);

		AddamsFamilyMember.lastName = "Bale";	
		System.out.println(gomez);
		System.out.println(morticia);
		System.out.println(wednesday);
		
		Calculator.addNumbers(5, 4);		
		
		Calculator.printSmallNumber(999);

	}
	
	private void printTwo(int a) {
		if (a != 2) {
			return;
		}
		System.out.println(a);
	}
	
	private int returnTwo(int a, int b) {
	 if (a > b) {
		 return 2;
	 }	 
	 return 3;
	}
	

}
