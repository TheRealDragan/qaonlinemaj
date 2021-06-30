package basics;

public class AddamsFamilyMember {
	
	String firstName;
	static String lastName = "Addams";
	
	public AddamsFamilyMember(String firstName) {
		this.firstName = firstName;
		//Linija koda iznad znaci:
		// objektu klase AddamsFamilyMember koji se kreira preko ovog konstruktora
		//postavi vrednost za firstName (to je leva strana)
		// prosledjen firstName
		// AddamsFAmilyMember gomez = new AddamsFamilyMember("Gomez");
		// ce napraviti objekat koji ce se zvati gomez i kome ce
		//firstName biti setovano da bude Gomez
		//U ovom slucaju, parametar konstruktora ("Gomez") je promenljiva firstName
		//koja se prosledjuje ovoj metodi (linija 9, desna strana znaka jednakosti)
	}

	@Override
	public String toString() {
		return firstName + " " + lastName;
	}
	
	

}
