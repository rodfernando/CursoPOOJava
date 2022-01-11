
public class ContaBanco {
	// Atributos
	public int numConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;

	public ContaBanco(double saldo, boolean status) {
		this.saldo = saldo;
		this.status = status;
	}

	// Métodos
	public void abrirConta(String t) { //parâmetro usado no método tipo
		setTipo(t); // configurar o tipo de conta.
		setStatus(true); // = status == true
		if (t == "CC" || t == "cc") {
			saldo = 50;
		} else if (t == "CP" || t == "cp") {
			setSaldo(150);
		}
	}

	public void fecharConta() {
		if (saldo > 0) {
			System.err.println("Conta com dinheiro.");
		} else if (saldo < 0) {
			System.err.println("Conta em débito.");
		} else {
			setStatus(false);
		}

	}

	public void depositar(double valor) {
		if (getStatus() == true) { // ou somente status == true
			setSaldo(getSaldo() + valor); // pegue o saldo, some o valor que foi depositado e atualize o saldo.
			// saldo += valor;
		} else {
			System.err.println("Impossível depositar dinheiro com conta fechada");
		}
	}

	public void sacar(double valor) {
		if (getStatus() == true) {
			if (getSaldo() > valor) {
				setSaldo(getSaldo() - valor); // ou saldo -= valor;
			} else {
				System.err.println("Saldo insuficiente para saque");
			}
		} else {
			System.err.println("Impossível sacar dinheiro com conta fechada");
		}
	}

	public void pagarMensal() {
		// inicialização de uma variável local:
		double valor = 0;
		if (getTipo() == "CC" || getTipo() == "cc") {
			valor = 12;
		} else if (getTipo() == "CP" || getTipo() == "cp") {
			valor = 20;
		}
		if (getStatus() == true) { // só posso cobrar de uma conta aberta.
			if (saldo > valor) {
				// se o saldo for maior do que o valor que eu tenho que sacar, então:
				setSaldo(getSaldo() - valor);
			} else {
				System.err.println("Impossível de pagar");
			}

		}
	}

	// Métodos de acesso
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int n) {
		this.numConta = n;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String t) {
		this.tipo = t;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String d) {
		this.dono = d;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean s) {
		this.status = s;
	}

}
