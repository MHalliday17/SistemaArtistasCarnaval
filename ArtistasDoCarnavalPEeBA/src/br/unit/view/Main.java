package br.unit.view;

import java.util.Scanner;

import br.unit.controller.ArtistaController;
import br.unit.controller.Ordenacao;
import br.unit.model.Artista;


public class Main {
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

			String aN2 = "Alceu Valença";
			String aB2 = "1946";
			String aC2 = "São Bento do una";
			String aVT2 = "Sim";
			artistasController.inserir(aN2, aB2, aC2, aVT2);

			String aN3 = "Almir Rouche";
			String aB3 = "1969";
			String aC3 = "Tgarassul";
			String aVT3 = "Sim";
			artistasController.inserir(aN3, aB3, aC3, aVT3);

			String aN4 = "Andre Rio";
			String aB4 = "1969";
			String aC4 = "Recife";
			String aVT4 = "Sim";
			artistasController.inserir(aN4, aB4, aC4, aVT4);

			String aN5 = "Lenine";
			String aB5 = "1959";
			String aC5 = "Recife";
			String aVT5 = "Sim";
			artistasController.inserir(aN5, aB5, aC5, aVT5);

			String aN6 = "Elba Ramalho";
			String aB6 = "1951";
			String aC6 = "Conceição";
			String aVT6 = "Sim";
			artistasController.inserir(aN6, aB6, aC6, aVT6);

			String aN7 = "Reginaldo Rossi";
			String aB7 = "1943";
			String aC7 = "Recife";
			String aVT7 = "Não";
			artistasController.inserir(aN7, aB7, aC7, aVT7);

			String aN8 = "Chico Science";
			String aB8 = "1966";
			String aC8 = "Recife";
			String aVT8 = "Não";
			artistasController.inserir(aN8, aB8, aC8, aVT8);

			String aN9 = "Otto";
			String aB9 = "1968";
			String aC9 = "Belo Jardim";
			String aVT9 = "Sim";
			artistasController.inserir(aN9, aB9, aC9, aVT9);

			String aN10 = "Siba";
			String aB10 = "1969";
			String aC10 = "Recife";
			String aVT10 = "Sim";
			artistasController.inserir(aN10, aB10, aC10, aVT10);
		} catch (Exception e) {
			if (e.getMessage() != null) {
				System.out.println(e.getMessage()
						+ " DIGITE NOVAMENTE AS INFORMAÇÕES DO ARTISTA");
			} 
			else {
				System.out.println("");
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
					sc.next();
				}
			}
			sc.nextLine();
			switch (swchk1) {
			case 1:

				do {
					tela.telaCadastrar();
					while (true) {
						try {
							//sc.nextLine();
							tela.telaCadastrarNome();
							String artistaNome = sc.nextLine();
							tela.pularLinha();

							tela.telaCadastrarNascimento();
							String artistaNascimento = sc.nextLine();
							tela.pularLinha();

							tela.telaCadastrarCidade();
							String artistaCidade = sc.nextLine();
							tela.pularLinha();

							tela.telaCadastrarVaiTocar();
							String artistaVaiTocar = sc.nextLine();
							tela.pularLinha();

							artistasController.inserir(artistaNome, artistaNascimento, artistaCidade, artistaVaiTocar);

							tela.linha("-");
							break;
						} catch (Exception e) {
							if (e.getMessage() != null) {
								tela.pularLinha();
								tela.linha("-");
								tela.titulo(e.getMessage() + "DIGITE NOVAMENTE AS INFORMAÇÕES DO ARTISTA" , "-");
								tela.linha("-");
								tela.pularLinha();
							} 
							else {
								tela.msgDadosInvalidos();
							}
						}
					}

					tela.msgCadOutroArtista();
					fechar = sc.next().charAt(0);
				} 

				while (fechar == 's' || fechar == 'S');
				break;

			case 2:
				tela.pularLinha();

				tela.telaImprimirArtCadastrados();
				for(Artista artista: artistasController.retornarTodos()) {
					tela.linha("-");
					System.out.println(artista);
				}
				tela.linha("-");
				tela.pularLinha();
				break;

			case 3:
				do {tela.pularLinha();
				tela.telaAlterarRegistro();
				tela.pularLinha();
				while(true) {
					try {
						//sc.nextLine();
						while(true) {

							String artAlterar = sc.nextLine();

							if (artistasController.consultar(artAlterar) != null) {
								tela.pularLinha();
								tela.linha("-");
								System.out.println(artistasController.consultar(artAlterar));
								tela.linha("-");
								tela.pularLinha();


								String artTorcaNome = artAlterar;
								tela.pularLinha();

								tela.telaCadastrarNascimento();
								String artTrocaAno = sc.nextLine();
								tela.pularLinha();

								tela.telaCadastrarCidade();
								String artTrocaCidade = sc.nextLine();
								tela.pularLinha();

								tela.telaCadastrarVaiTocar();
								String artTrocaVaiTOcar = sc.nextLine();
								tela.pularLinha();

								artistasController.alterar(artTorcaNome, artTrocaAno, artTrocaCidade, artTrocaVaiTOcar);
								break;

							} else {
								tela.linha("-");
								tela.msgArtNaoENcontrado();
								break;
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
					break;
				}
				int f = 0;
				while(f == 0) {
					if(swchk1 == 6) {
						fechar = 'n';
						break;
					}else {
						tela.pularLinha();
						tela.linha("-");
						tela.msgModificarOutroArtista();
						fechar = sc.next().charAt(0);
						sc.nextLine();
						if(fechar == 's' ||fechar=='S') {
							f=1;
							break;
						}
						if(fechar == 'n' || fechar == 'N') {
							f=1;
							break;
						}
						if(fechar != 's' ||fechar != 'S') {
							f=0;
						}
						if(fechar != 'n' ||fechar != 'N') {
							f=0;
						}
					}
				}
				}while(fechar == 's' || fechar == 'S');
				break;

			case 4:
				do {
					tela.pularLinha();
					while (true) {
						try {
							tela.telaRemoverArtista();
							String artDelNome = sc.nextLine();
							artistasController.remover(artDelNome);
							break;
						} catch (Exception e) {
							if (e.getMessage() != null) {
								tela.linha("-");
								tela.titulo(e.getMessage() +" "+ "Digite novamente o nome do artista que deseja remover:"  , "-");
								tela.linha("-");
								tela.pularLinha();

							} else {
								System.out.println(
										"Dados inválidos! Digite novamente nome do artista que deseja remover: ");
							}
						}
					}
					int z = 0;
					while(z == 0) {
						if(swchk1 == 6) {
							fechar = 'n';
							break;
						}else {
							tela.pularLinha();
							tela.linha("-");
							tela.msgRemoverOutroArtista();
							fechar = sc.next().charAt(0);
							sc.nextLine();
							if(fechar == 's' ||fechar=='S') {
								z=1;
								break;
							}
							if(fechar == 'n' || fechar == 'N') {
								z=1;
								break;
							}
							if(fechar != 's' ||fechar != 'S') {
								z=0;
							}
							if(fechar != 'n' ||fechar != 'N') {
								z=0;
							}
						}
					}
				} while (fechar == 's' || fechar == 'S');
				break;
			case 5:
				tela.pularLinha();
				do {
					while (true) {
						try {
							tela.telaOrdenarfiltros();
							swchk1 = sc.nextInt();
							tela.pularLinha();
							break;

						} catch (Exception e) {
							tela.msgDigitoInvalido();
							break;
						}
					}
					switch (swchk1) {
					case 1:
						tela.telaOrdenadoPorNome();
						artistasController.imprimirFila(1);
						break;
					case 2:
						tela.telaOrdenadoPorNascimento();
						artistasController.imprimirFila(2);
						break;
					case 3:
						tela.telaOrdenadoPorCidade();
						artistasController.imprimirFila(3);
						break;
					case 4:
						tela.telaOrdenadoPorVaiTocar();
						artistasController.imprimirFila(4);
						break;
					default:
						break;
					}
					
					int y = 0;
					while(y == 0) {
						if(swchk1 == 6) {
							fechar = 'n';
							break;
						}else {
							sc.nextLine();
							tela.pularLinha();
							tela.linha("-");
							tela.msgReordernar();
							tela.pularLinha();
							fechar = sc.next().charAt(0);
							tela.pularLinha();
							if(fechar == 's' ||fechar=='S') {
								y=1;

								break;
							}
							if(fechar == 'n' || fechar == 'N') {
								y=1;
								break;
							}
							if(fechar != 's' ||fechar != 'S') {
								y=0;
							}
							if(fechar != 'n' ||fechar != 'N') {
								y=0;
							}
						}
					}
				}while(fechar == 's'|| fechar == 'S');
				break;
			case 6:
				break;

			}
			int x = 0;
			while(x == 0) {
				if(swchk1 == 6) {
					fechar = 'n';
					break;

				}else {

					tela.linha("-");
					tela.msgRetornarTelaInicial();

					fechar = sc.next().charAt(0);
					if(fechar == 's' ||fechar=='S') {
						x=1;
						break;
					}
					if(fechar == 'n' || fechar == 'N') {
						x=1;
						break;
					}
					if(fechar != 's' ||fechar != 'S') {
						x=0;
					}
					if(fechar != 'n' ||fechar != 'N') {
						x=0;
					}
				}
			}

		} while (fechar == 's' || fechar == 'S');
		tela.pularLinha();
		sc.close();
		System.out.println("finalizado");
	}
}
