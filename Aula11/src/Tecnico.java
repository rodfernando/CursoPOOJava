
public class Tecnico extends Aluno {
	private String registroProfissional;

	public void praticar() {
		System.out.println("T�cnico com certifica��o em dia!");
	}
	
	public String getRegistroProfissional() {
		return registroProfissional;
	}

	public void setRegistroProfissional(String registroProfissional) {
		this.registroProfissional = registroProfissional;
	}
	
	

}
