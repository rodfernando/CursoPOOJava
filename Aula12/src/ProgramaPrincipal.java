
public class ProgramaPrincipal {

	public static void main(String[] args) {
		//Animal an = new Animal();
		Ave a = new Ave();
		Mamifero m = new Mamifero();
		Peixe p = new Peixe();
		Reptil r = new Reptil();
		
				
		a.setIdade(2);
		a.setMembros(2);
		a.setPeso(3.5f);
		a.setCorPena("Preto");
		a.alimentar();
		a.locomover();
		a.emitirSom();
		System.out.println(a.toString());
		
		Canguru c = new Canguru();
		c.locomover();
		Cachorro k = new Cachorro();
		k.locomover();
		k.emitirSom();
		Arara ara = new Arara();
		ara.setIdade(4);
		ara.setCorPena("Colorida");
		ara.emitirSom();
		ara.alimentar();
		ara.locomover();
		ara.emitirSom();
		
		
		
	}

}
