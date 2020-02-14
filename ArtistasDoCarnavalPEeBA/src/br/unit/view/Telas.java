package br.unit.view;

public class Telas {
	private int largura = 110;
	//PULAR LINHA
	public void pularLinha() {
		System.out.println("");
	}
	//DESENHA UMA LINHA
	public void linha(String simbolo) {

		for (int i = 0; i <=largura; i++ ) {
			System.out.print(simbolo);
		}
		pularLinha();
	}

	//ADICIONA TEXTO ENTRE AS LINHAS
	public void titulo(String nome, String simbolo) {
		int x = nome.length();
		int calculo = (largura - x) /2;

		if(x%2 == 0) {

			for(int i = 0; i <= (calculo - 2); i++) {
				System.out.print(simbolo);
			}

			System.out.print(" " + nome + " ");

			for(int i = 0; i <= (calculo - 1); i++) {
				System.out.print(simbolo );
			}

		} else if(x%2 == 1) {

			for(int i = 0; i <= (calculo - 1); i++) {
				System.out.print(simbolo);
			}

			System.out.print(" " + nome + " ");

			for(int i = 0; i <= (calculo-1); i++) {
				System.out.print(simbolo );
			}
		}
		System.out.println("");
	}

	//TELA INICIAL
	public void telaMenuInicial() {
		linha("=");
		titulo("SISTEMA CARNAVAL", "=");
		linha("=");

		System.out.println("\nDigite um dos númernos abaixo, para executar a respectiva opção:\n"
				+"\n 1 - Cadastrar novos artistas."
				+"\n 2 - Imprimir todos os artistas cadastrados."
				+"\n 3 - Modificar dados de um artista cadastrado."
				+"\n 4 - Remover artista cadastrado."
				+"\n 5 - Listar artista por filtro."
				+"\n 6 - Fechar programa.\n");
	}

	//TELA INICIAL
	public void telaCadastrar() {
		linha("=");
		titulo("CADASTRAR", "=");
		linha("=");

		System.out.println("\nDigite as informações do artista\n");
	}
	//TELA INICIAL NOME
	public void telaCadastrarNome() {
		System.out.println(" - Digite o NOME do artista:\n");
	}
	//TELA INICIAL ANO NASCIMENTO
	public void telaCadastrarNascimento() {
		System.out.println(" - Digite o ANO DE NASCIMENTO do artista:\n");
	}
	//TELA INICIAL CIDADE
	public void telaCadastrarCidade() {
		System.out.println(" - Digite a CIDADE onde o artista vai tocar:\n");
	}
	//TELA INICIAL VAI TOCAR
	public void telaCadastrarVaiTocar() {
		System.out.println(" - Digite se o artista VAI TOCAR ou não:\n");
	}

	//ARTISTAS CADASTRADOR
	public void telaImprimirArtCadastrados() {
		linha("=");
		titulo("ARTISTAS CADASTRADOS", "=");
		linha("=");
		System.out.println("");
	}

	//TELA DE ALTERAÇÃO DE REGISTRO
	public void telaAlterarRegistro() {
		linha("=");
		titulo("ALTERAR ARTISTA CADASTRADO", "=");
		linha("=");
		System.out.println("\nDigite o nome do artista cadastrado que vc deseja alterar");
	}
	//TELA DE ALTERAÇÃO DE REGISTRO
	public void telaAlterarRegistro2() {
		System.out.println("Digite Respectivamente o nome, ano de nascimento, cidade e se vai tocar");
	}
	//TELA DE REMOÇÃO DE ARTISTA
	public void telaRemoverArtista() {
		linha("=");
		titulo("ALTERAR ARTISTA CADASTRADO", "=");
		linha("=");
		System.out.println("\nDigite o nome do artista que deseja remover.\n");
	}
	
	//TELA DE FILTRO POR NOME
	public void telaOrdenarfiltros() {
		linha("=");
		titulo("ORDENAR POR", "=");
		linha("=");

		System.out.println("\nDigite um dos númernos abaixo, para executar a respectiva opção:\n"
				+"\n 1 - Nome."
				+"\n 2 - Ano de nascimento."
				+"\n 3 - Cidade."
				+"\n 4 - Se vai tocar.\n");
	}
	
	public void telaOrdenadoPorNome() {
		linha("=");
		titulo("ORDENADO POR NOME", "=");
		linha("=");
		pularLinha();
	}
	public void telaOrdenadoPorNascimento() {
		linha("=");
		titulo("ORDENADO POR ANO NASCIMENTO", "=");
		linha("=");
		pularLinha();
	}


	//--------------------------------------------------------------------------------------
	//-------------------------------- ESCOPO DE MENSAGENS ---------------------------------
	//--------------------------------------------------------------------------------------

	//MSG DE RETORNO AO MENU INICIAL
	public void msgRetornarTelaInicial() {
		titulo("DESEJA RETORNAR AO MENU PRINCIPAL? (S/N)", "=");
		linha("-");
	}

	//MSG DE RETORNO AO MENU INICIAL
	public void msgExceptionAdcionarArt() {
		titulo("DIGITE O NOME NOVAMENTE ", "-");
		linha("-");
	}

	//MSG DE DIGITO INVALIDO
	public void msgDigitoInvalido() {
		pularLinha();
		linha("-");
		titulo("DÍGITO INVÁLIDO! TENDE DIGITAR UM NUMERO VALIDO. ", "-");
		linha("-");
		pularLinha();
	}

	//MSG DE CADASTRAR OUTRO ARTISTA
	public void msgCadOutroArtista() {
		titulo("DESEJA CADASTRAR OUTRO ARTISTA? (S/N)", "=");
		linha("-");
	}

	//MSG ARTISTA NÃO ENCONTRADO
	public void msgArtNaoENcontrado() {
		titulo("ARTISTA NÃO ENCONTRADO!", "-");
		linha("-");
	}
	//MSG MODIFICAR OUTRO ARTISTA
	public void msgModificarOutroArtista() {
		titulo("DESEJA MODIFICAR OUTRO REGISTRO (S/N)", "=");
		linha("-");
	}

	//MSG REMOVER OUTRO ARTISTA
	public void msgRemoverOutroArtista() {
		titulo("DESEJA REMOVER OUTRO ARTISTA (S/N)", "=");
		linha("-");
	}

	//MSG REMOVER OUTRO ARTISTA
	public void msgOpcaoInvalida() {
		titulo("VOCE DIGITOU UMA OPCAO INVALIDA", "-");
		linha("-");
	}
	
	public void msgDadosInvalidos() {
		pularLinha();
		linha("-");
		titulo("DADOS INVALIDOS", "-");
		linha("-");
		pularLinha();
	}
	
}
