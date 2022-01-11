package treino;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Conta c1 = new Conta("123-x");
	
	c1.creditar(600);
	c1.printExtrato();

	c1.debitar(-600);
	c1.printExtrato();
		
	}

}
