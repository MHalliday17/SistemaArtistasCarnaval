package br.unit.main;

public class Artista {
 String nomeArtista;
 int anoNascimento;
 boolean vaiTocar;
 String cidade;

 public Artista (String nomeArtista,int anoNascimento, boolean vaiTocar, String cidade) {
	 this.anoNascimento=anoNascimento;
	 this.nomeArtista=nomeArtista;
	 this.cidade=cidade;
	 this.vaiTocar=vaiTocar;
 }
public int getAnoNascimento() {
	return anoNascimento;
}
public void setAnoNascimento(int anoNascimento) {
	this.anoNascimento = anoNascimento;
}
public String getNomeArtista() {
	return nomeArtista;
}
public void setNomeArtista(String nomeArtista) {
	this.nomeArtista = nomeArtista;
}
public String getCidade() {
	return cidade;
}
public void setCidade(String cidade) {
	this.cidade = cidade;
}
public boolean isVaiTocar() {
	return vaiTocar;
}
public void setVaiTocar(boolean vaiTocar) {
	this.vaiTocar = vaiTocar;
}
@Override
public String toString() {
	return "Artista [nomeArtista=" + nomeArtista + ", anoNascimento=" + anoNascimento + ", vaiTocar=" + vaiTocar
			+ ", cidade=" + cidade + "]";
}
}
