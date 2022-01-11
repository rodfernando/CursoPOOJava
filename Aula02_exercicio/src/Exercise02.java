
public class Exercise02 {

	public static void main(String[] args) {
		
		Computador c1 = new Computador();
		c1.ram = 16;
		c1.hd = 1000001;
		c1.monitor = "Asus";
		c1.Processador = "Ryzen";
		c1.ligado = true;
		c1.armazenar();
		c1.ligar();
		c1.status();
		
		Computador c2 = new Computador();
		c2.ram = 4;
		c2.hd = 1000;
		c2.monitor = "Philips";
		c2.Processador = "Intel";
		c2.ligado = false;
		c2.armazenar();
		c2.ligar();
		c2.status();
	}

}
