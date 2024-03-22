package iphone.reprodutorMusical;

public class Player implements ReprodutorMusical {
	
	public void tocar() {
		System.out.println("Tocando");
	}
	
	public void pausar() {
		System.out.println("Pausado");
	}
	
	public void selecionarMusica() {
		System.out.println("Selecionando musica");
	}

}
