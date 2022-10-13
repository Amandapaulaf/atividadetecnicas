package aula11_10_22;

import java.util.ArrayList;

public class PlayAmanda implements IPlay {

	private ArrayList<Musica> listamusica;
	
	public PlayAmanda() {
		this.listamusica= new ArrayList<Musica>();
	}
	
	public void addMusica(Musica m) {
		listamusica.add(m);
	}
	
	public void start() {
		for (Musica m : listamusica) {
			System.out.println(m.getNome());
				System.out.println(m.getLetra());
		}
	}

	
	public void stop() {
		// TODO Auto-generated method stub
		
	}


	public void next(int quantidade) {
		// TODO Auto-generated method stub
		
	}

	
	public void back(int quantidade) {
		// TODO Auto-generated method stub
		
	}

	
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	
	public String fabricante() {
		// TODO Auto-generated method stub
		return null;
	}

}
