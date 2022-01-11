package treino;

public class Conta {
	private String numero;
	private double saldo;

	//integridade para o saldo ser positivo

	public Conta(String numero) {
		this(numero, 0.0);
	}

	public Conta(String numero, double saldo) {
		this.numero = numero;
//		this.saldo = saldo;
		this.setSaldo(saldo); //inclusão de regra 
	}


	//métodos
	public void creditar(double valor) {
		
		if(valor >= 0) {
			this.saldo += valor;
		}
		else {
			System.err.println("Valor creditado não pode ser negativo!");
		}
	}

	public void debitar(double valor) {
		if(valor>=0) {
			if(valor <= this.saldo) {
				this.saldo -= valor;
			}
			else{
				System.err.println("Saldo insuficiente");
			}
		}
		else {
			System.err.println("O valor debitado precisa ser negativo!");
		}
		

	}

	public String getNumero() {
		return numero;
	}

//	public void setNumero(String numero) {
//		this.numero = numero;
//	}

	public double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		if(saldo >= 0) {
			this.saldo = saldo;
		}
		else {
			System.err.println("Erro ao inicializar o saldo");
		}
		
	}

	public void printExtrato() {
		System.out.println("***************************");
		System.out.println("Conta número = "+this.numero);
		System.out.println("Saldo = "+this.saldo);
		System.out.println("***************************");
		System.out.println();
	}

}
