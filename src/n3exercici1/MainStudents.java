package n3exercici1;

import java.util.Arrays;
import java.util.List;

public class MainStudents {
	
	public static void main(String[] args) {
		
		List<Student> StudentList = Arrays.asList(
				new Student("Quique", 39, "Backend Java", 8),
				new Student("Anna", 23, "FrontEnd React", 10),
				new Student("Willy", 18, "Hacking Termomix", 3),
				new Student("Joseph", 78, "Paint Avanzado", 7),
				new Student("John", 55, "Ir más allá con tu Samsung", 5),
				new Student("Antonia", 23, "Backend Fortran", 6),
				new Student("Julia", 18, "PHP", 10),
				new Student("Stephano", 45, "Buscaminas Intermedio", 9),
				new Student("Raphael", 19, "Tinder para dummies", 4),
				new Student("Tana", 34, "Cloud Computing", 7));
		
		System.out.println("Nombre + edad:\n");
		
		StudentList.stream().forEach(s -> System.out.println(s.getName() + " " + s.getAge()));
		
		System.out.println("\nNombre empieza por A:\n");
		
		List<Student> listA = StudentList.stream()
			.filter(s -> s.getName().charAt(0) == 'A')
			.toList();
			
		listA.forEach(System.out::println);
		
		System.out.println("\nNota superior a 5:\n");
		
		StudentList.stream()
			.filter(s -> s.getScore() >= 5)
			.forEach(System.out::println);
		
		System.out.println("\nNota superior a 5 y no hacen PHP:\n");
		
		StudentList.stream()
			.filter(s -> s.getScore() >= 5 && !s.getGrade().equals("PHP")) // OJO!!! Cuidado con comparar strings usando ==.
		    .forEach(System.out::println);
		
		System.out.println("\nMayores y hacen JAVA:\n");
		
		StudentList.stream()
			.filter(s -> s.getAge() >= 18 && s.getGrade().equals("Backend Java")) // OJO!!! Cuidado con comparar strings.
			.forEach(System.out::println);
		
	}
		
}
