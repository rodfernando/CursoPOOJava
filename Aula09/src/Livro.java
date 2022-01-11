
public class Livro implements Publicacao{
	//atributos
	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor; //agregação da classe Pessoa
	
	//métodos construtores
	public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.aberto = false;
		this.pagAtual = 0;
		this.totPaginas = totPaginas;
		this.leitor = leitor;
	}


	public String detalhes() { //foi implementado o toString (trocado pelo nome detalhes)
		return "Livro \nTítulo = " + titulo + "\nAutor = " + autor + "\nTotal de Páginas = " + totPaginas + ", Página Atual = " + pagAtual
				+ ", Aberto = " + aberto + "\nLeitor = " + leitor.getNome() + ", Idade = " + leitor.getIdade() + 
				", Sexo = " + leitor.getSexo(); // se deixar somente leitor, ele fica uma referência ao objeto Leitor = Pessoa@762efe5d
	//já que ele é uma instancia de uma classe, tem que colocar leitor.getNome()
	}




	//implementação da interface Publicacao 
	@Override
	public void abrir() {
		this.aberto = true;
	}


	@Override
	public void fechar() {
		this.aberto = false;
	}


	@Override
	public void folhear(int p) {
		this.pagAtual = p;
		// if (p > this.totPaginas){
		//		this.pagAtual = 0;
		//	} else { this.pagAtual = p; }
		if (this.getPagAtual() > this.getTotPaginas()) {
			System.out.println("Você passou o total de páginas!");
		}
	}


	@Override
	public void avancarPag() {
		this.setPagAtual(this.getPagAtual() + 1);
		if (this.getPagAtual() > this.getTotPaginas()) {
			this.setPagAtual(0);
			System.out.println("Você passou o total de páginas");
		} 
	}


	@Override
	public void voltarPag() {
		this.setPagAtual(this.getPagAtual() - 1);
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public int getTotPaginas() {
		return totPaginas;
	}


	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}


	public int getPagAtual() {
		return pagAtual;
	}


	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}


	public boolean isAberto() {
		return aberto;
	}


	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}


	public Pessoa getLeitor() {
		return leitor;
	}


	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}
	
	//métodos acessores
	
}
