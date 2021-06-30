package ooprinciples;

public class Dog extends Animal implements Pet, Carnivore {
	
	private String breed;
	
	@Override
	public void vocalize() {
	//	super.vocalize(); -> super poziva metodu nadklase
		System.out.println("Av av!");
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public void greetOwner() {
		System.out.println("Cao, covece, ti si najdraza stvar u ovom svemiru za mene");
		
	}

	@Override
	public void eatMeat() {
		System.out.println("Njam, mesoooooooo");
		
	}
	
	

}
