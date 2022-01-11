
public class ProjetoLivro {

	public static void main(String[] args) {
		Pessoa[] p = new Pessoa[2];
		Livro[] l = new Livro[3];
		
		p[0] = new Pessoa("Rodrigo", 32, "M");
		p[1] = new Pessoa("ingrid", 36, "F");
		
		l[0] = new Livro("O Senhor dos Anéis", "Tolkien", 1500, p[0]);
		l[1] = new Livro("Crepúsculo", "Gibimba", 1000, p[1]);
		l[2] = new Livro("Bíblia", "Jesus", 3000, p[0]);
	
		l[0].abrir();
		l[0].folhear(1500);
		l[0].avancarPag();
		
		//quero mostrar os detalhes(toString) do livro 
		System.out.println(l[0].detalhes());
	
	}

}
