package br.unit.dao;

import java.util.ArrayList;

import br.unit.model.Artista;

public class ArtistaDao {
	public ArrayList<Artista> artistas;

	public ArtistaDao() {
		artistas = new ArrayList<Artista>();
	}


	//CREATE
	public void inserir(Artista artista) {
		this.artistas.add(artista);
	}

	//RETRIVE
	public Artista consultar(String nome) {
		for (Artista art: artistas) {
			if(art.getNome().equalsIgnoreCase(nome)) {
				return art;
			}
		}
		return null;
	}

	//EXISTE
	public boolean existe(String nome) throws Exception{
		try {
			if(artistas.contains(consultar(nome))) {
				return true;
			}
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		return false;
	}

	//UPDATE
	public void alterar (String nome, Artista art) throws Exception{
		try {
			this.artistas.set(artistas.indexOf(consultar(nome)), art);
		} catch (Exception e){
			throw new Exception(e.getMessage());
		}

	}

	//DELETE
	public void remover(String nome) throws Exception{
		try {
			artistas.remove(consultar(nome));
		} catch (Exception e){
			throw new Exception(e.getMessage());
		}

	}

	//RETORNAR TODOS
	public ArrayList<Artista> retornarTodos(){
		return artistas;
	}

	//INSERIR TODOS DE UMA VEZ SÓ
	public void inserirTodos(ArrayList<Artista> artistaList) {
		this.artistas = artistaList;
	}

	//ORDENAR POR CIDADE
	public void quicksort(int idxInicio, int idxFim, ArrayList<Artista> vetor, int ord) {
		int i = idxInicio;
		int j = idxFim;
		int pivo = (idxInicio + (idxFim - idxInicio)/2);
		int ordenar = ord;
		
		if(ordenar ==1) {
			//ORDENAR POR NOME
			while(i <= j) {
				while(vetor.get(i).getNome().compareTo(vetor.get(pivo).getNome()) < 0) {
					i++;
				}
				while(vetor.get(j).getNome().compareTo(vetor.get(pivo).getNome()) > 0) {
					j--;
				}
				if(i <= j) {
					trocarArtista(i, j, vetor);
					i++;
					j--;
				}
			}
			if(idxInicio < j) {
				quicksort(idxInicio, j, vetor, ordenar);
			}
			if(i < idxFim) {
				quicksort(i, idxFim, vetor, ordenar);
			}
		} else if(ordenar == 2) {
			//ORDENAR POR DATA DE NASCIMENTO
			while(i <= j) {
				while(vetor.get(i).getAnoNascimento().compareTo(vetor.get(pivo).getAnoNascimento()) < 0) {
					i++;
				}
				while(vetor.get(j).getAnoNascimento().compareTo(vetor.get(pivo).getAnoNascimento()) > 0) {
					j--;
				}
				if(i <= j) {
					trocarArtista(i, j, vetor);
					i++;
					j--;
				}
			}
			if(idxInicio < j) {
				quicksort(idxInicio, j, vetor, ordenar);
			}
			if(i < idxFim) {
				quicksort(i, idxFim, vetor, ordenar);
			}
		} else if(ordenar == 3) {
			//ORDENAR POR CIDADE
			while(i <= j) {
				while(vetor.get(i).getCidade().compareTo(vetor.get(pivo).getCidade()) < 0) {
					i++;
				}
				while(vetor.get(j).getCidade().compareTo(vetor.get(pivo).getCidade()) > 0) {
					j--;
				}
				if(i <= j) {
					trocarArtista(i, j, vetor);
					i++;
					j--;
				}
			}
			if(idxInicio < j) {
				quicksort(idxInicio, j, vetor, ordenar);
			}
			if(i < idxFim) {
				quicksort(i, idxFim, vetor, ordenar);
			}
		} else if(ordenar == 4) {
			//ORDENAR POR VAI TOCAR
			while(i <= j) {
				while(vetor.get(i).getVaiTocar().compareTo(vetor.get(pivo).getVaiTocar()) < 0) {
					i++;
				}
				while(vetor.get(j).getVaiTocar().compareTo(vetor.get(pivo).getVaiTocar()) > 0) {
					j--;
				}
				if(i <= j) {
					trocarArtista(i, j, vetor);
					i++;
					j--;
				}
			}
			if(idxInicio < j) {
				quicksort(idxInicio, j, vetor, ordenar);
			}
			if(i < idxFim) {
				quicksort(i, idxFim, vetor, ordenar);
			}
		}

		
	}
	
	public void trocarArtista(int i, int j, ArrayList<Artista> vetor) {
		ArrayList<Artista> aux = new ArrayList<Artista>();
		aux.add(vetor.get(i));
		vetor.set(i, vetor.get(j));
		vetor.set(j, aux.get(0));
	}
}
