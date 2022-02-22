package n1exercici3;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<String> listStr = Arrays.asList("Jordi", "Elena", "Pep", "Oriol", "Joan");
		
		wordsWithO(listStr).forEach(System.out::println);
		
	}
	
	public static List<String> wordsWithO(List<String> list) {
		
		return list.stream()
				.filter(str -> str.contains("o"))
				.toList();
		
	}

}
