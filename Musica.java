package aula11_10_22;

import java.util.ArrayList;

public class Musica {

	private String nome;
	private int duracao;
	private String letra;

	public Musica(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}
	
	public int getDuracao() {
		return this.duracao;
	}

	public void setDuracao(int duracao) {
		if (duracao >= 0)
			this.duracao = duracao;
	}
	public void setletra(String letra) {
			this.letra = letra;
	}
	
	public String getLetra() {
		return this.letra;
	}
	
	
}
