package br.unit.main;

import java.util.Scanner;

public class ArtistasGUI {
Scanner leia = new Scanner (System.in);
ArtistaController artControl = new ArtistaController ();
public void Menu() {
	System.out.println("Programação do Carnaval - PE e BA \n" + "Digite 1 para funcionário \n" + "Digite 2 para usuário");
	int opcao = 0;
	opcao = leia.nextInt();
	switch (opcao) {
	case 1:
	MenuFuncionario();
		break;
	case 2:
		MenuUsuario();
		break;
	default:
		break;
	}
}	public void MenuFuncionario () {
	System.out.println("Menu Funcionário \n Digite 1 para cadastrar artista \n Digite 2 para alterar \n Digite 3 para pesquisar \n Digite 4 para excluir");
	int opcao = 0;
	opcao = leia.nextInt();
	switch (opcao) {
	case 1:
		artControl.Cadastro("Ivete Sangalo", 1972, false, "Recife");
		artControl.Cadastro("Ivete Saalo", 1972, false, "Recife");

		artControl.ListaTodos();
	// alterar case 2:
	// pesquisar case 3:
	// excluir case 4:	
		break;

	default:
		break;
	}
}
public void MenuUsuario () {
	System.out.println("Menu Folião \n Digite 1 para pesquisar por artista \n Digite 2 para pesquisar por cidade");
	int opcao = 0;
	opcao = leia.nextInt();
	switch (opcao) {
	case 1:
		
		break;

	default:
		break;
	}
}
}