package n2exercici1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

public class MainMatrix {

	public static void main(String[] args) {
		
		String[] matrix1 = {"cera", "aloh4", "323", "calabaza", "189373", "tetera"};
		
		// Modifiquem el Comparator per poder utilitzar-ho en el Stream i endreçar per length de valor String.
		
		Comparator<String> byLength = (str1, str2) -> (str1.length() - str2.length());
		
		System.out.println("Sorted by String length:\n");
		
		Arrays.stream(matrix1).sorted(byLength).forEach(System.out::println);
		
		// Igual però reversed().
	
		System.out.println("\nSorted by String length reversed:\n");
		
		Arrays.stream(matrix1).sorted(byLength.reversed()).forEach(System.out::println);
		
		System.out.println("\nSorted by first char:\n");
		
		Comparator<String> byFirstChar = (str1, str2) -> (str1.charAt(0) - str2.charAt(0));
		
		Arrays.stream(matrix1).sorted(byFirstChar).forEach(System.out::println);
		
		System.out.println("\nLetter 'e' first:\n");
		
		Comparator<String> byELetter = (str1, str2) -> (- str1.indexOf("e") + str2.indexOf("e")); // Cambiando los signos de la comparación cambiamos el orden 
		
		Arrays.stream(matrix1).sorted(byELetter).forEach(System.out::println);
		
		System.out.println("\nChange 'a' to 4:\n");
		
		Arrays.stream(matrix1)
			.map(charStr -> charStr.replace('a', '4'))
			.forEach(System.out::println);
		
		System.out.println("\nNumbers:\n");
		
		Arrays.stream(matrix1)
			.filter(str -> str.matches("[0-9]+")) 
			.forEach(System.out::println);
	
		Operacio suma = (num1, num2) -> (num1 + num2);
		Operacio resta = (num1,num2) -> (num1 - num2);
		Operacio multiplicar = (num1,num2) -> (num1 * num2);
		Operacio divisio = (num1,num2) -> (num1 / num2);
		
		System.out.println("\nOperaciones con interface funcional:\n");
		
		System.out.println(suma.operacio(45, 5));
		System.out.println(resta.operacio(678, 34));
		System.out.println(multiplicar.operacio(4, 4.567f));
		System.out.println(divisio.operacio(7, 3));
		
	}

}
