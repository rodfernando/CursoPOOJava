public class Poupanca extends Conta {

	public Poupanca(String numero, double saldoInicial) {
		super(numero, saldoInicial);
	}
	
	public Poupanca(String numero) {
		super(numero);
	}

	public void renderJuros(double taxa) {
		double juros = this.getSaldo() * taxa;
		this.creditar(juros);
	}
	
	@Override
	public String toString() {
		return "Poupanca[numero = "+this.getNumero()+", saldo = "+this.getSaldo()+"]";
	}
}
