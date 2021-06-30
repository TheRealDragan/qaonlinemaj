package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetWithHumansDemo {

	public static void main(String[] args) {
		Human human1 = new Human ("Pera", "Peric");
		Human human2 = new Human ("Pera", "Peric");
		Human human3 = new Human ("Mita", "Mitic");		
		
		
		List<Human> humansAsList = new ArrayList<Human>();
		Set<Human> humansAsSet = new HashSet<Human>();		

		humansAsList.add(human1);
		humansAsList.add(human2);
		humansAsList.add(human3);
		
		humansAsSet.add(human1);
		humansAsSet.add(human2);
		humansAsSet.add(human3);
		
		
		System.out.println("Ljudi kao lista: "+humansAsList);
		System.out.println("Ljudi kao skup: "+humansAsSet);

	}

}
