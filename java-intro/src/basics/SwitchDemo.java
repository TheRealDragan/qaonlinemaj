package basics;

public class SwitchDemo {

	public static void main(String[] args) {
		CodeStudent student = new CodeStudent("Pera", "Peric", 45, Sex.FEMALE);
		sayYourNameWithPronoun(student);

	}
	
	static void sayYourNameWithPronoun (CodeStudent student) {
		Sex sex = student.sex;
		String name = student.name;
		String lastName = student.lastName;
		switch(sex) {
			case FEMALE:
				System.out.println("Miss "+name+" " + lastName);
				break;
			case MALE:
				System.out.println("Mr "+name+" " + lastName);
				break;
			default:
				System.out.println(name+" " +lastName);
				
		}
		
	//	if (sex == null) {
	//		System.out.println("Pol nije izabran!"); --> jedno resenje
	//	}
	}

}
