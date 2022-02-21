package n1exercici2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Main  {
	
	public static void main(String[] args) {
		
		List<Integer> intList = Arrays.asList(5, 78, 34, 56, 2, 98, 11, 56, 79);
		
		System.out.println(getIntString(intList));
	
	}
	
	public static String getIntString(List<Integer> list) {
		
		return list.stream()
					.map(num -> (num % 2 == 0) ? "e" + num : "o" + num)
					.collect(Collectors.joining(", "));
	
	}
}

