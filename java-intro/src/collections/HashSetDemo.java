package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(1);
		numbers.add(3);
		
		System.out.println("Brojevi kao lista: "+numbers);
		
		Set<Integer> numbersSet = new HashSet<Integer>();
		numbersSet.add(1);
		numbersSet.add(2);
		numbersSet.add(1);
		numbersSet.add(3);
		
		System.out.println("Brojevi kao skup: "+numbersSet);


	}

}
