package iphone.iphone;

import iphone.aparelhoTelefonico.AparelhoTelefonico;
import iphone.navegadorDeInternet.NavegadorDeInternet;
import iphone.reprodutorMusical.ReprodutorMusical;

public class Iphone  implements AparelhoTelefonico, NavegadorDeInternet, ReprodutorMusical {

	@Override
	public void ligar() {
		System.out.println("Ligando via Iphone");
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo via Iphone");
		
	}

	@Override
	public void iniciarCorreioDeVoz() {
		System.out.println("Correio de Voz via Iphone");
		
	}

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo página via Iphone");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba via Iphone");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando página via Iphone");
		
	}

	@Override
	public void tocar() {
		System.out.println("Tocando via Iphone");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausado via Iphone");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando música via Iphone");
		
	}

}
