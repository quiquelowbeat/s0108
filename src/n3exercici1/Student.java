package n3exercici1;

public class Student {
	
	private String name;
	private int age;
	private String grade;
	private int score;
	
	

	public Student(String name, int age, String grade, int score) {
		
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public String toString() {
		
		return this.name + " " + this.age + " " + this.grade + " " + this.score;
		
	}
	
	
}
