package br.unit.view;

import java.util.Scanner;

import br.unit.controller.ArtistaController;
import br.unit.model.Artista;


public class Main_teste {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Telas tela = new Telas();
		ArtistaController artistasController = new ArtistaController();

		//LOCAL DE INSERÇÃO DE ARTISTAS PARA FACILITAR NOS TESTES
		try {
			String aN1 = "Wellington";
			String aB1 = "1985";
			String aC1 = "Recife";
			String aVT1 = "Não";
			artistasController.inserir(aN1, aB1, aC1, aVT1);

			String aN2 = "Alceu Paiva Valença";
			String aB2 = "1946";
			String aC2 = "São Bento do una";
			String aVT2 = "Sim";
			artistasController.inserir(aN2, aB2, aC2, aVT2);

			String aN3 = "Almir Rouche Cavalcante de Lima";
			String aB3 = "1969";
			String aC3 = "Tgarassul";
			String aVT3 = "Sim";
			artistasController.inserir(aN3, aB3, aC3, aVT3);

			String aN4 = "Andre Rio";
			String aB4 = "1969";
			String aC4 = "Recife";
			String aVT4 = "Sim";
			artistasController.inserir(aN4, aB4, aC4, aVT4);

			String aN5 = "Oswaldo Lenine Macedo Pimentel";
			String aB5 = "1959";
			String aC5 = "Recife";
			String aVT5 = "Sim";
			artistasController.inserir(aN5, aB5, aC5, aVT5);

			String aN6 = "Elba Maria Nunes Ramalho";
			String aB6 = "1951";
			String aC6 = "Conceição";
			String aVT6 = "Sim";
			artistasController.inserir(aN6, aB6, aC6, aVT6);

			String aN7 = "Reginaldo Rodrigues dos Santos";
			String aB7 = "1943";
			String aC7 = "Recife";
			String aVT7 = "Não";
			artistasController.inserir(aN7, aB7, aC7, aVT7);

			String aN8 = "Francisco de Assis França";
			String aB8 = "1966";
			String aC8 = "Recife";
			String aVT8 = "Não";
			artistasController.inserir(aN8, aB8, aC8, aVT8);

			String aN9 = "Otto Maximiliano Pereira de Cordeiro Ferreira";
			String aB9 = "1968";
			String aC9 = "Belo Jardim";
			String aVT9 = "Sim";
			artistasController.inserir(aN9, aB9, aC9, aVT9);

			String aN10 = "Sérgio Roberto veloso de Oliveira";
			String aB10 = "1969";
			String aC10 = "Recife";
			String aVT10 = "Sim";
			artistasController.inserir(aN10, aB10, aC10, aVT10);



		} catch (Exception e) {
			if (e.getMessage() != null) {
				System.out.println(e.getMessage()
						+ " Digite novamente as informações do artista: ");
			} 
			else {
				System.out.println(
						"Dados inv�lidos! Digite novamente o nome, cpf e logradouro do leitor: ");
			}
		}

		char fechar = 's';

		do {
			int swchk1;
			while (true) {
				try {
					tela.telaMenuInicial();
					swchk1 = sc.nextInt();
					break;

				} catch (Exception e) {
					tela.msgDigitoInvalido();
				}
			}
			switch (swchk1) {
			case 1:
				do {
					tela.telaCadastrar();
					while (true) {
						try {
							sc.nextLine();
							String artistaNome = sc.nextLine();
							String artistaNascimento = sc.nextLine();
							String artistaCidade = sc.nextLine();
							String artistaVaiTocar = sc.nextLine();
							artistasController.inserir(artistaNome, artistaNascimento, artistaCidade, artistaVaiTocar);
							tela.linha("-");
							break;
						} catch (Exception e) {
							if (e.getMessage() != null) {
								System.out.println(e.getMessage()
										+ " Digite novamente as informações do artista: ");
							} 
							else {
								System.out.println(
										"Dados inv�lidos! Digite novamente o nome, cpf e logradouro do leitor: ");
							}
						}

					}

					tela.msgCadOutroArtista();
					fechar = sc.next().charAt(0);

				} while (fechar == 's' || fechar == 'S');
				break;

			case 2:
				tela.telaImprimirArtCadastrados();
				for(Artista artista: artistasController.retornarTodos()) {
					System.out.println(artista);
				}
				System.out.println("");
				break;

			case 3:
				do {
					tela.telaAlterarRegistro();
					System.out.println("");
					while(true) {
						try {
							sc.nextLine();
							while(true) {
							
								String artAlterar = sc.nextLine();

								if (artistasController.consultar(artAlterar) != null) {
									System.out.println(artistasController.consultar(artAlterar));
									
									String artTorcaNome = sc.nextLine();
									String artTrocaAno = sc.nextLine();
									String artTrocaCidade = sc.nextLine();
									String artTrocaVaiTOcar = sc.nextLine();
									artistasController.alterar(artTorcaNome, artTrocaAno, artTrocaCidade, artTrocaVaiTOcar);
									
									break;
								} else {
									tela.linha("-");
									tela.msgArtNaoENcontrado();
								}
							}

							
break;
						}catch(Exception e) {

							if(e.getMessage()!= null) {
								System.out.println(e.getMessage()
										+ "Digite o nome do artista novamente");	
							} else {
								System.out.println("Dados Invalidos digite novamente o nome");
							}
						}
					}
					System.out.println("");
					tela.linha("-");
					tela.msgModificarOutroArtista();

					fechar = sc.next().charAt(0);
				}while(fechar == 's' || fechar == 'S');
				break;

			case 4:
				do {
					System.out.println("Digite o cpf/matr�cula do leitor que deseja remover");
					while (true) {
						try {
sc.nextLine();
							String artDelNome = sc.nextLine();
							artistasController.remover(artDelNome);
							sc.nextLine();
							break;
						} catch (Exception e) {
							sc.nextLine();
							if (e.getMessage() != null) {
								System.out.println(e.getMessage()
										+ " Digite novamente o cpf/matr�cula do leitor que deseja remover: ");
							} else {
								System.out.println(
										"Dados inv�lidos! Digite novamente o cpf/matr�cula do leitor que deseja remover: ");
							}
						}
					}
					System.out.println("Deseja remover mais algum leitor cadastrado? (s/n)");
					fechar = sc.next().charAt(0);
				} while (fechar == 's' || fechar == 'S');
				break;

			case 5:

				break;

			}

			tela.linha("-");
			tela.msgRetornarTelaInicial();
			fechar = sc.next().charAt(0);
		} while (fechar == 's' || fechar == 'S');
	}
}
