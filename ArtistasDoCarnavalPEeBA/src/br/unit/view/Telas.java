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
		System.out.println("");
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
				+"\n 5 - Listar artista por filtro.\n");
	}
	
	//TELA INICIAL
	public void telaCadastrar() {
		linha("=");
		titulo("CADASTRAR", "=");
		linha("=");

		System.out.println("\nDigite as informações do artista na respectiva ordem\n"
				+"Nome, Ano de nascimento, Cidade, e se ele vai Tocar\n");
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
	
	
	
//--------------------------------------------------------------------------------------
//-------------------------------- ESCOPO DE MENSAGENS ---------------------------------
//--------------------------------------------------------------------------------------
	
	//MSG DE RETORNO AO MENU INICIAL
	public void msgRetornarTelaInicial() {
		
		titulo("DESEJA RETORNAR AO MENU PRINCIPAL? (S/N)", "=");
		linha("-");
	}
	//MSG DE DIGITO INVALIDO
	public void msgDigitoInvalido() {
		System.out.println("Dígito inválido!");
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
			titulo("DESEJA MODIFICAR OUTRO REGISTO (S/N)", "-");
			linha("-");
		}
}
