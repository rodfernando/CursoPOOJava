
public class Person {
	private String firstName; // null
	private String lastName; // null
	private String name; // null
	private String cpf;// null
	private int age; // 0
	
	public Person(String firstName, String lastName, String cpf, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.cpf = cpf;
		this.setAge(age);
	}
		
	public void setFirstName(String firstName) {
		this.firstName  = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName  = lastName;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public void setAge(int age) {
		if(age >= 0 && age <= 200) {
			this.age = age;
		}
		else {
			System.out.println("Idade nao pode ser negativa! ou maior que 200!");
		}
	}
	
	public int getAge() {
		return this.age;
	}
}
