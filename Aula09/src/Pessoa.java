
public class Pessoa {
	//atributos
	private String nome;
	private int idade;
	private String sexo;
	
	//m�todo construtor
	public Pessoa(String nome, int idade, String sexo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}
	
	//m�todos p�blicos
	public void fazerAniver() {
		this.setIdade(this.getIdade() + 1); //this.idade++ 
	}


	//m�todos acessores
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	//m�todos acessores
	
	
}
