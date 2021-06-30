package ooprinciples;

public class InheritancePlayground {

	public static void main(String[] args) {
		Dog lessie = new Dog();
		
		lessie.vocalize();
		
		lessie.setNumberOfLegs(4);
		
		lessie.setBreed("Tulearski pas");
		
		System.out.println(lessie.getNumberOfLegs());
		System.out.println(lessie.getBreed());
		
		//Animal animal = new Animal(); -> apstraktna klasa ne moze da se instancira
		// animal.vocalize();
		
		Cat felix = new Cat();
		felix.vocalize();
		felix.setBreed("Sijamska macka");
		
	//	Cat tom = new Cat();
	//	System.out.println(felix.equals(tom)); -> sve klase nasledjuju Object i samim tim imaju njegove metode kao sto su
		// equals, hashCode, toString itd; s tim sto su te metode prakticno beskorisne ako im ne redefinisete ponasanje
		
		felix.vocalize();
		felix.sayHi();
		
		Animal animal = new Cat();
		
		System.out.println(felix.getBreed());
	

	}

}
