package basics;

public class PlaygroundObjectMethods {

	public static void main(String[] args) {
		CodeStudent student1 = new CodeStudent("Sinisa", "Gizarovski");
		CodeStudent student2 = new CodeStudent("Sinisa", "Gizarovski");
		
	//	System.out.println(student1 == student2); -> NIKAD NE RADITI OVAKO
		//== U JAVI SLUZI SAMO ZA POREDJENJE PROSTIH TIPOVA I ENUM-a
		
    System.out.println(student1.equals(student2));		//ako se equals metoda ne definise u samoj klasi,
                                                        //ponasa se isto kao ==

	//	Integer a = 5;
	//	Integer b = 5;
	//	System.out.println(a == b);
    
    CodeStudent student3 =  new CodeStudent("Sinisa", "Gizarovski", 100, Sex.MALE);
    System.out.println(student3); //Ako hocemo da dobijemo string reprezentaciju 
                                 //nekog objekta, moramo da definisemo toString metodu

	}

}
