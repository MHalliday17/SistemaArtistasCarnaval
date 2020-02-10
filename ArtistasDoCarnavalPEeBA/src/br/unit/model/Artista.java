package br.unit.model;

public class Artista {
	
	private String nome;
	private String anoNascimento;
	private String cidade;
	private String vaiTocar;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(String anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getVaiTocar() {
		return vaiTocar;
	}
	public void setVaiTocar(String vaiTocar) {
		this.vaiTocar = vaiTocar;
	}
	@Override
	public String toString() {
		return "Nome: " + nome 
				+ ", Nascimento: " + anoNascimento 
				+ ", Cidade: " + cidade 
				+ ", Vai Tocar: " + vaiTocar;
	}
	
}
