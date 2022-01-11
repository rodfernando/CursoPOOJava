
public class Peixe extends Animal {
	private String corEscama;
	
	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

	@Override
	public void locomover() {
		System.out.println("Nadando");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo ra��o");
	}

	@Override
	public void emitirSom() {
		System.out.println("Nenhum som");
	}

	public void soltarBolha() {
		System.out.println("Soltou uma bolha");
	}
}
