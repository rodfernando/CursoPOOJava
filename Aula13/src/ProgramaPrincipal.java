
public class ProgramaPrincipal {

	public static void main(String[] args) {
		Cachorro c = new Cachorro();
		c.emitirSom();
//		Lobo l = new Lobo();
//		l.emitirSom();
		
		c.reagir("Ol�");
		c.reagir("cachorro feio");
		c.reagir(false);
		c.reagir(19, 59);
		c.reagir(3, 3.f);
	}

}
