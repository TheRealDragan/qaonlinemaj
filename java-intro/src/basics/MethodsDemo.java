package basics;

public class MethodsDemo {
	
	public void callMethods() {
		final String a = "Bla";
		printTheWord(a);
		printTheWord(a, 5);
	}
	
	public void printTheWord(String word) {
		System.out.println(word);
	}
	
	public void printTheWord(String word, int times) {
		for (int i=0; i<times; i++) {
			System.out.println(word);
		}
	}

}
