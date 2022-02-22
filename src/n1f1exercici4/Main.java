package n1f1exercici4;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<String> listStr = Arrays.asList("Jordi", "Elena", "Pep", "Oriol", "Joan", "Rodolfo");
		
		filterWords(listStr).forEach(System.out::println);
		
	}
	
	public static List<String> filterWords(List<String> list) {
		
		return list.stream()
				.filter(str -> str.contains("o"))
				.filter(str -> str.length() > 5)
				.toList();
		
	}

}
