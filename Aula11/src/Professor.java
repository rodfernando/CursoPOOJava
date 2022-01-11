
public final class Professor extends Pessoa{
	private String especialidade;
	private float salario;
	
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Professor [especialidade=" + especialidade + ", salario=" + salario + ", nome=" + nome + ", idade="
				+ idade + ", sexo=" + sexo + "]";
	}
	
	public void receberAumento() {
		this.salario = this.salario + 500;
		System.out.println("O professor teve aumento no salário, que ficou em " + this.getSalario() + " reais");
	}
}
