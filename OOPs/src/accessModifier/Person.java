package accessModifier;

public class Person {
	public String name;
	private String secret;
	public Person(String name) {
		this.name = name;
	}
	public Person() {
		
	}
	public void showSecret() {
		System.out.println("Secret : "+ this.secret); // SECRET VAN DUNG DUOC
	}
	class Diary {
		public void Logging() {
			System.out.println("Secret : " + secret); // TRONG INNER CLASS NO VAN DUNG DUOC
		}
	}
	
}
