package ooprinciples;

public class Cat extends Animal implements Pet {
	
	private String breed;

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public void vocalize() {
		System.out.println("Mjau!");
		
	}
	
	@Override
	public void sayHi() {
		System.out.println("Poy, ja sam macka");
	}

	@Override
	public void greetOwner() {
		System.out.println("");
		
	}
	
	

}
