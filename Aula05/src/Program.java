
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaBanco contaBanco1 = new ContaBanco(500, true);

		contaBanco1.abrirConta("cc");
		System.out.println(contaBanco1.getSaldo()); 
		contaBanco1.depositar(500);
		System.out.println(contaBanco1.getSaldo());
		contaBanco1.sacar(551); 
		System.out.println(contaBanco1.getSaldo()); 
	}

}
