
public class Programa_Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Visitante v1 = new Visitante();
		v1.setNome("Cleber");
		v1.setIdade(22);
		v1.setSexo("M");
		System.out.println(v1.toString());
		
		Aluno a1 = new Aluno();
		a1.setNome("Jubileu");
		a1.setIdade(40);
		a1.setCurso("Informática");
		a1.setMatricula(82766);
		a1.setSexo("M");
		System.out.println(a1.toString());
		
		Bolsista b1 = new Bolsista();
		b1.setNome("Aroldo");
		b1.setIdade(50);
		b1.setCurso("Medicina");
		b1.setBolsa(2200.2f);
		b1.pagarMensalidade();
		
		Professor p1 = new Professor();
		p1.setNome("Dudu");
		p1.setIdade(19);
		p1.setEspecialidade("Estatístico");
		p1.setSalario(5000.00f);
		p1.receberAumento();
		System.out.println(p1.toString());
		
		Tecnico t1 = new Tecnico();
		t1.setRegistroProfissional("Crea");
		t1.praticar();
	}

}
