package br.unit.controller;

import java.util.ArrayList;

import br.unit.model.Artista;

public class Ordenacao {

	public void quicksort(int idxInicio, int idxFim, ArrayList<Artista> vetor) {
		int i = idxInicio;
		int j = idxFim;
		int pivo = (idxInicio + (idxFim - idxInicio)/2);

		while(i <= j) {
			while(vetor.get(i).getNome().compareTo(vetor.get(pivo).getNome()) < 0  ) {
				i++;
			}
			while(vetor.get(j).getNome().compareTo(vetor.get(pivo).getNome()) > 0) {
				j--;
			}
			if(i <= j) {
				trocarNumero(i, j, vetor);
				i++;
				j--;
			}
		}
		if(idxInicio < j) {
			quicksort(idxInicio, j, vetor);
		}
		if(i < idxFim) {
			quicksort(i, idxFim, vetor);
		}
	}
	public void trocarNumero(int i, int j, ArrayList<Artista> vetor) {
		ArrayList<Artista> aux = new ArrayList<Artista>();
		
		//aux = vetor.get(i);
		aux.add(vetor.get(i));
		vetor.set(i, vetor.get(j));
		vetor.set(j, aux.get(0));
		//vetor.set(j, aux);
	}

}
