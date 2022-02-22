package n1f1exercici1;

import java.util.Arrays;
import java.util.List;


public class MainCadena {

	public static void main(String[] args) {
		
		List<String> arrayCadena = Arrays.asList("Ara", "Ana", "Josep", "Pedro", "alf", "Quique", "Ari");
		
 		filteredList(arrayCadena).forEach(System.out::println);
		
	}
	
	public static List<String> filteredList(List<String> list) {
		
		return list.stream()
				.filter(str -> ((String) str).startsWith("A"))
     			.filter(str -> ((String) str).length() == 3)
				.toList();
		
	}
}
