
public class Aluno extends Pessoa{
	//atributos
	private int matr;
	private String curso;
	
	//métodos
	public void cancelarMatr() {
		System.out.println("Matrícula será cancelada");
	}

	//Métodos especiais
	public int getMatr() {
		return matr;
	}

	public void setMatr(int matr) {
		this.matr = matr;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
}
