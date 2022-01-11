
public class Conta {
	private String numero;
	private double saldo; // default value 0;

	// invariante seria que o saldo nao pode ser negativo!!!

	public Conta(String numero) {
		this(numero, 0.0); // causa uma chamada ao construtor de baixo
	}

	public Conta(String numero, double saldo) {
		this.numero = numero;
		//		this.saldo = saldo;
		this.setSaldo(saldo);
	}

	public void creditar(double valor) {
		if(valor>=0) {
			this.saldo += valor; // this.saldo = this.saldo + valor;
		}
		else {
			System.out.println("valor a ser creditado não pode ser negativo!");
		}
	}

	/* Validação: Saldo não pode ser negativo ao debitar.
	 *  Valor tem que ser positivo
	 */
	public void debitar(double valor) {
		if(valor >= 0) {
			if(valor >= 0 && valor <= this.saldo) {
				this.saldo -= valor; // this.saldo = this.saldo - valor;		
			}
			else {
				System.err.println("Saldo insuficiente!");
			}
		}else {
			System.err.println("Valor a ser debitado não pode ser negativo");
		}

	}

	public void printExtrato() {
		System.out.println("********************************");
		System.out.println("conta numero = "+this.numero);
		System.out.println("saldo = "+this.saldo);
		System.out.println("********************************");
		System.out.println();
	}

	public String getNumero() { 
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		if(saldo >= 0) {			
			this.saldo = saldo;
		}
		else {
			System.err.println("Erro ao inicializar o saldo! Saldo deve ser positivo!");
		}
	}
}
