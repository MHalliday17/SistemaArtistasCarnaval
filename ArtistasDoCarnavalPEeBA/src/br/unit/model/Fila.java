package br.unit.model;

import java.util.ArrayList;


public class Fila {
	ArrayList<Artista> artistas;

	public Fila() {
		artistas = new ArrayList<Artista>();
	}
	//ADICIONA UM ARTISTA A FILA
	public void add(Artista artista) {
		this.artistas.add(artista);
	}

	//PEGA O PRIMEIRO ARTISTA E REMOVE DA FILA
	public Artista get() {
		Artista primeiro = artistas.get(0);
		artistas.remove(0);
		return primeiro;
	}

	public void exibirFila() {
		for(Artista art: artistas) {
			System.out.println(art.toString());
		}
	}

	public void limparLista() {
		artistas.clear();
	}

	@Override
	public String toString() {
		return "" + artistas;
	}
}
