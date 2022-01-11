
public class Ave extends Animal{
	private String corPena;
	
	public String getCorPena() {
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}

	@Override
	public void locomover() {
		System.out.println("Voando");
	}

	@Override
	public void alimentar() {
		System.out.println("Ave se alimenta de frutas ou animais.");
	}

	@Override
	public void emitirSom() {
		System.out.println("Ave pia!");
	}
	
	public void fazerNinho() {
		System.out.println("Constrói ninhos");
	}

	@Override
	public String toString() {
		return "Ave [corPena=" + corPena + ", peso=" + peso + ", idade=" + idade + ", membros=" + membros + "]";
	}

}
