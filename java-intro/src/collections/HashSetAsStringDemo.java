package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetAsStringDemo {

	public static void main(String[] args) {
		List<String> numbers = new ArrayList<String>();
		numbers.add("1");
		numbers.add("2");
		numbers.add("1");
		numbers.add("3");
		
		System.out.println("Stringovi kao lista: "+numbers);
		
		Set<String> numbersSet = new HashSet<String>();
		numbersSet.add("1");
		numbersSet.add("2");
		numbersSet.add("1");
		numbersSet.add("3");
		
		System.out.println("Stringovi kao skup: "+numbersSet);

	}

}
