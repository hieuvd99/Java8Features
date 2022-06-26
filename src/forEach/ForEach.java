package forEach;

import java.util.ArrayList;
import java.util.List;

/*
 * Java cung cấp một phương thức mới forEach() để lặp lại các phần tử. Nó được
 * định nghĩa trong giao diện Iterable và Stream.
 */

public class ForEach {
	public static void main(String[] args) {
		List<String> gamesList = new ArrayList<String>();
		gamesList.add("Football");
		gamesList.add("Cricket");
		gamesList.add("Chess");
		gamesList.add("Hocky");
		
		System.out.println("------------Iterating by passing lambda expression--------------");
		gamesList.forEach(games -> System.out.println(games));
		gamesList.stream().forEachOrdered(games -> System.out.println(games));
		
		System.out.println("\n------------Iterating by passing method reference---------------");
		gamesList.forEach(System.out::println);
		gamesList.stream().forEachOrdered(System.out::println);
	}
}