public class Bolsista extends Aluno {
	private float bolsa;

	public void renovarBolsa() {
		System.out.println("Renovando bolsa de " + this.nome);
	}
	
	public void pagarMensalidade() {
		System.out.println(this.nome + " é bolsista! Pagamento realizado");
	}
	
	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}
	
	
}
