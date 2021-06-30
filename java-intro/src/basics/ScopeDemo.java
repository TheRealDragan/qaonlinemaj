package basics;

public class ScopeDemo {
	
	String someString = "Some String";
	String hello = "Helooooooooo";

	public static void main(String[] args) {
	//	System.out.println(hello);
		sayHello();

	}
	
	private static void sayHello() {
		String hello = "Hello"; //Ne vidi se u main metodi zato sto je lokalna promenljiva ove metode
		  // lokalna promenljiva metode = promenljiva koja je definisana u okviru neke metode
		hello = "Hello 1";
		System.out.println(hello); //Odstampace se Hello 1 zato sto se pri istom imenu promenljivih u klasi i metodi
		   //Uzima vrednost "blize" promenljive, tj one koja je definisana u metodi
	}
	
	
	private void sayHelloConditional() {
		if (3 > 1) {
			String hello = "Hello";
		} else {
		//	hello = "Not hello"; -> promenljiva hello ovde nije vidljiva jer je definisana u viticastima
			//zagradama linije 19-21 i kao takva je vidljiva samo izmedju njih
		}
	}

}
