
public class Funcionario extends Pessoa{
	//atributos
	private String setor;
	private boolean trabalhando;
	
	//Métodos
	public void mudarTrabalho(){
		this.trabalhando = !this.trabalhando;
//		if (this.trabalhando == true) {
//			this.trabalhando = false;
//		} else {
//			this.trabalhando = true;
//		}
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public boolean getTrabalhando() {
		return trabalhando;
	}

	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}
	
}
