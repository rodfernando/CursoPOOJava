
public interface Controlador {
	//m�todo abstrato: s�o interfaces id�nticas com implementa��es distintas; � um m�todo previsto, mas n�o � implementado
	
	public abstract void ligar();
	
	public abstract void desligar();
	
	public abstract void abrirMenu();
	
	public abstract void fecharMenu();
	
	public abstract void maisVolume();
	
	public abstract void menosVolume();
	
	public abstract void ligarMudo();
	
	public abstract void desligarMudo();
	
	public abstract void play();
	
	public abstract void pause();	
}
