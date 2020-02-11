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
	
	
}
