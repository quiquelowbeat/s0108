package n1f3exercici1;
import java.lang.StringBuffer;

public class Main {

	public static void main(String[] args) {
		
		ReverseStr rev1 = str -> (new StringBuffer(str).reverse().toString());
		
		System.out.println(rev1.reverseStr("HOLA COMO ESTAS"));

	}

}
