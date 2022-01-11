
public class Program {

	public static void main(String[] args) {
//		Person p = new Person("Henrique", "Rebelo", "0456", -37);
//		
//		System.out.println("firstName = "+p.getFirstName());
//		System.out.println("lastName = "+p.getLastName());
//		System.out.println("age = "+p.getAge());
		
		Conta c1 = new Conta("123-x",-400);
		
		c1.creditar(-200);
		c1.printExtrato();
	
		c1.debitar(1000);
		c1.printExtrato();
		
		
		
	 
		
	}
}
