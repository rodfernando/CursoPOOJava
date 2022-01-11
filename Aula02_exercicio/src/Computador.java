
public class Computador {
	int ram;
	int hd;
	String monitor;
	String Processador;
	boolean ligado;
	
	void ligar() {
		if (this.ligado == true) {
			System.out.println("O computador está ligado!");
		} else {
			System.out.println("O computador está desligado!");
		}
		System.out.println();
	}
	
	void armazenar() {
		if(this.hd > 1000000) {
			System.out.println("Hd suporta o tamanho acima de 1TB.");
		} else {
			System.out.println("Este HD não suporta o tamanho do arquivo.");
		}
	}
	
	void status() {
		System.out.println("***************************");
		System.out.println("Especificações do sistema:");
		System.out.println("RAM: " +this.ram + "GB");
		System.out.println("Monitor: " +this.monitor);
		System.out.println("Processador: " +this.Processador);
		System.out.println("***************************");
		System.out.println();
	}
		
}
