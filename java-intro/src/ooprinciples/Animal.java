package ooprinciples;

public abstract class Animal {
	
	private int numberOfLegs;	
	
	public abstract void vocalize();
	
	public void sayHi() {
		System.out.println("HI!");
	}

	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}
	
	

}
