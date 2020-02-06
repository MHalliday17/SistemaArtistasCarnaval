package br.unit.main;

public class ArtistaController {
	ArtistasDAO artDAO = new ArtistasDAO ();	
	
public void Cadastro (String nomeArtista,int anoNascimento, boolean vaiTocar, String cidade){
	Artista art1 = new Artista (nomeArtista,anoNascimento, vaiTocar, cidade);
	artDAO.bancoArtistas.add(art1);
	
}

public void ListaTodos(){
	System.out.println(artDAO.bancoArtistas);
}
}
