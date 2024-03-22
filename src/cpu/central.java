package cpu;

import iphone.aparelhoTelefonico.AparelhoTelefonico;
import iphone.iphone.Iphone;
import iphone.navegadorDeInternet.NavegadorDeInternet;
import iphone.reprodutorMusical.ReprodutorMusical;

public class central {
	
	public static void main(String[] args) {
		
		Iphone i = new Iphone();
		
		AparelhoTelefonico aparelhoTelefonico = i;
		NavegadorDeInternet navegadorDeInternet = i;
		ReprodutorMusical reprodutorMusical = i;
		
		
		
		aparelhoTelefonico.ligar();
		aparelhoTelefonico.atender();
		aparelhoTelefonico.iniciarCorreioDeVoz();
		
		navegadorDeInternet.adicionarNovaAba();
		navegadorDeInternet.atualizarPagina();
		navegadorDeInternet.exibirPagina();
		
		reprodutorMusical.tocar();
		reprodutorMusical.pausar();
		reprodutorMusical.selecionarMusica();
	}

}
