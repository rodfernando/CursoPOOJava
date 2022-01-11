import java.util.ArrayList;

public class Polymorphism {

	ArrayList<Conta> list = new ArrayList<>();

	public static void main(String[] args) {
		Conta c1 = new Conta("123-x", 12000);
		Conta c2 = new Conta("124-x", 1000);

		Poupanca p1 = new Poupanca("125-x", 1000);
		Poupanca p2 = new Poupanca("126-x", 1000);

		Conta c3 = new Poupanca("127-x", 1000);

		PoupancaEsp pe1 = new PoupancaEsp("126-x", 1000);

		// Array of contas
		Conta[] contas = { c1, c2, p1, p2, c3, pe1 };
		Polymorphism.printDetailsAllContas(contas);
		System.out.println();
		System.out.println();
		Polymorphism.renderJuros(contas);
		System.out.println(">>>>>>>>>>Rendeu Juros!<<<<<<<<<<");
		System.out.println();
		System.out.println();
		Polymorphism.printDetailsAllContas(contas);
		System.out.println("### Saldo Total Conta Corrente = " + Polymorphism.saldoTotalContaCorrente(contas));
		System.out.println("### Saldo Total Conta Poupança = " + Polymorphism.saldoTotalContaPoupanca(contas));
		System.out.println("### Saldo Total Conta Poupança = " + Polymorphism.saldoTotalContaPoupanca(contas));

		System.out.println("Esta conta tem saldo acima de R$ 10.000: " );
		Polymorphism.imprimirDetalheContasSaldoAcima10000(contas);		
	}

	// polymorphic method
	public static void printDetailsAllContas(Conta[] contas) {
		for (int i = 0; i < contas.length; i++) {
			contas[i].printDetailsConta();
		}
	}

	// polymorphic method
	public static void renderJuros(Conta[] contas) {
		for (int i = 0; i < contas.length; i++) {
			if (contas[i] instanceof Poupanca) {
				((Poupanca) contas[i]).renderJuros(0.01);
			}
		}
	}

	// polymorphic method
	public static double getSaldoBanco(Conta[] contas) { // reuso por polimorfismo!
		double sum = 0;
		for (int i = 0; i < contas.length; i++) {
			sum += contas[i].getSaldo();
		}
		return sum;
	}

	public static double saldoTotalContaPoupanca(Conta[] contas) {
		double contTotalCorrente = 0;
		for (int i = 0; i < contas.length; i++) {
			if (contas[i] instanceof Poupanca) {
				contTotalCorrente += contas[i].getSaldo();
			}
		}
		return contTotalCorrente;
	}

	public static double saldoTotalContaCorrente(Conta[] contas) {
		double contTotalPoupanca = 0;
		for (int i = 0; i < contas.length; i++) {
			if (contas[i] instanceof Poupanca == false) {
				contTotalPoupanca += contas[i].getSaldo();
			}
		}
		return contTotalPoupanca;
	}

	public static void imprimirDetalheContasSaldoAcima10000(Conta [] contas) {
		for (int i = 0; i < contas.length; i++) {
			if (contas[i].getSaldo() > 10000) {
				contas[i].printDetailsConta();
			}
		}
	}
}
