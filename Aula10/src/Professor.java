
public class Professor extends Pessoa {
	//atributos
	private String especialidade;
	private float salario;
	
	//M�todos
	public void receberAum(float aum) {
		this.salario += aum;
	}

	//M�todos especiais
	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	
}
