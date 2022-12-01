package EXERCICIO;

import javax.swing.JOptionPane;

public class HashExercicio1e2 {
	/*
	 * 1.Implemente uma tabela de Hashing para armazenar 26 nomes em ordem
	 * alfabética. A sua função hash() deve garantir a classificação. ¨ 2.Altere sua
	 * tabela de espalhamento de modo a garantir uma lista encadeada de nomes, sendo
	 * cada lista encadeada indexada de acordo com a inicial.
	 * 
	 * Façam no mesmo grupo do Projeto Integrado
	 */

	// Proximo passo criar o QuickSort para ordenar o vetor

	public static void main(String[] args) {

		String vetor[] = new String[26];
		String nome = "";
		String letra = "";
		String Sair = "";
		int cont = 0;
		int letraVetor = 0;
		int tamanhoPalavra = 0;
		Lista_encadeada vetorLista = new Lista_encadeada();

		// Dicionario
		vetor[0] = "A";
		vetor[1] = "B";
		vetor[2] = "C";
		vetor[3] = "D";
		vetor[4] = "E";
		vetor[5] = "F";
		vetor[6] = "G";
		vetor[7] = "H";
		vetor[8] = "I";
		vetor[9] = "J";
		vetor[10] = "K";
		vetor[11] = "L";
		vetor[12] = "M";
		vetor[13] = "N";
		vetor[14] = "O";
		vetor[15] = "P";
		vetor[16] = "Q";
		vetor[17] = "R";
		vetor[18] = "S";
		vetor[19] = "T";
		vetor[20] = "U";
		vetor[21] = "V";
		vetor[22] = "W";
		vetor[23] = "X";
		vetor[24] = "Y";
		vetor[25] = "Z";

		while (Sair != "Sair") {

			// Sair = "Sair";// remover essa linha para ativar o código

			//nome = JOptionPane.showInputDialog("Digite um nome:");
		nome = "sem nome";

			
			
			nome = TratarNome(nome);
			tamanhoPalavra = nome.length();

			if (nome.equals("Sair")) {
				Sair = "Sair";
				break;
			}

			System.out.println("O nome digitado: " + nome);
			System.out.println("Tamanho do nome: " + tamanhoPalavra);

			// pega uma letra da string nome.charAt(0)
			// System.out.println(nome.charAt(0));

			for (int i = 0; i < vetor.length; i++) {
				letra = "" + nome.charAt(0);
				if (vetor[i].equals(letra)) {
					System.out.println("A letra " + letra + " esta no vetor de letra " + vetor[i] + " na posição " + i);
					// atribui a matriz a posição 'i' que representa a mesma posição do vetor de
					// letras
					letraVetor = i;

					// Tratamento de colisão
					cont = Hash(letraVetor, nome, cont, vetorLista);
				}

				if (cont == 26) {
					System.out.println("\n\nVocê inseriu os 26 nomes");
					System.out.println("Encerrando o programa");
					System.out.println("-----------------------------------------------------------");
					vetorLista.todos();
					System.out.println("-----------------------------------------------------------");
					//DEU ERRO AO ORDENAR CORRIGIR
					//Ordenar(vetorLista);
					AlgoritmoDeOrdenacao2.QuickSort(vetorLista);
					System.out.println("----------------------VETOR ORDENADO-------------------------------------");
					vetorLista.todos();
					System.out.println("-----------------------------------------------------------");
					
					
					Sair = "Sair";
					break;
				}
			}
			// Chamar o ALGORITMO DE ORDENAÇÃO
			//Ordenar(vetorLista);
			
			

		}
		nome = JOptionPane.showInputDialog("Digite o nome a ser pesquisado: ");
		// Busca(nome, vetor, matriz);
		Busca2(nome, vetorLista);

		System.out.println("-----------------------------------------------------------");

		nome = JOptionPane.showInputDialog("Digite o nome a ser removido: ");
		System.out.println(Remove2(nome, vetorLista));
		System.out.println("-----------------------------------------------------------");
		vetorLista.todos();
	}

	public static String TratarNome(String nomeTratado) {

		nomeTratado = nomeTratado.substring(0, 1).toUpperCase().concat(nomeTratado.substring(1));

		return nomeTratado;
	}

	// ok - ex2
	public static String Remove2(String removerNome, Lista_encadeada vetor) {

		int vetorResultado = 0;

		vetorResultado = Busca2(removerNome, vetor);

		String removido = "";

		System.out.println("Removendo");
		removido = "O usuário de " + vetor.getObjeto(vetorResultado) + " foi removido";
		vetor.remove(vetorResultado);

		return removido;
	}

	// ok - ex2
	public static int Busca2(String buscarNome, Lista_encadeada vetor) {
		// VALIDAR A BUSCA PARA CONFIRMAR QUE FUNCIONA
		// Esta entrando mas n esta fazendo nd

		int vetorResultado = 0;
		buscarNome = TratarNome(buscarNome);
		boolean encontrou = false;

		String letra = "";

		letra = "" + buscarNome.charAt(0);

		for (int i = 0; i < vetor.tamanho(); i++) {

			if (vetor.getObjeto(i).toString().contains(buscarNome)) {

				System.out.println("BUSCA 2 - Nome " + buscarNome + " encontrado na tabela da letra " + letra
						+ " na na posição " + i);
				encontrou = true;
				vetorResultado = i;
				return vetorResultado;
			}
		}

		if (encontrou == false) {
			buscarNome = "O nome " + buscarNome + " não foi encontrado";
			System.out.println(buscarNome);
		}
		return vetorResultado;
	}

	// ok -ex2
	public static int Hash(int letraVetor, String nome, int cont, Lista_encadeada vetor) {

		
		switch ((int) (Math.random() * 10)) {
		case 1:
			nome = "amanda"+1;
			break;
		case 2:
			nome = "bruna"+2;
			break;
		case 3:
			nome = "nicole"+3;
			break;
		case 4:
			nome = "may"+4;
			break;
		case 5:
			nome = "Barbara"+5;
			break;
		case 6:
			nome = "Gi"+6;
			break;
		case 7:
			nome = "Tami"+7;
			break;
		case 8:
			nome = "LOO"+8;
			break;
		case 9:
			nome = "kaio"+9;
			break;
			
		default:
			break;
		}
		
		
		
		
		String letra = "";
		letra = "" + nome.charAt(0);
		// Tratamento de colisão

		// inserção
		Aluno_lista_encadeada al = new Aluno_lista_encadeada(nome, letra);
		vetor.enfileirar(al);

		// System.out.println("O aluno na " + (0) + "ª posição foi selecionado: \n" +
		// vetor.getObjeto(0));

		cont++;
		System.out.println("-----------------------------------------------------------" + cont);
		return cont;
	}
	
	public static Lista_encadeada Ordenar(Lista_encadeada vetorLista) {
		
		
		//Classificar em ordem alfabetica
			
			// variável para auxiliar na troca dos nomes
			Object aux = null;
			
			for (int i = 0; i < vetorLista.tamanho(); i++) {
				
				//TENHO QUE PEGAR A POSICAO DO NOME QUE SERA TROCADO
				// PARA TROCAR PRECISA ADICIONAR O NOME NA POSICAO : vetor.adiciona(posicao do outro, al); atual
				//APOS ADICIONAR NA POSICAO DO OUTRO BASTA REMOVER O OUTRO DA POSICAO SEGUINTE vetor.remove(atual+1, al);
				
				//OU EU MUDO A POSICAO DO OBJETO
				//OU EU MUDO O CONTEUDO DO OBJETO
				
				for (int j = 0; j < vetorLista.tamanho(); j++) {
					Object nome1OBJ = vetorLista.getObjeto(i);
					String nome1 = vetorLista.getObjeto(i).toString();//string que está no índice i do array.
					String nome2 = vetorLista.getObjeto(j).toString();//string que está no índice j do array.
					Object nome2OBJ = vetorLista.getObjeto(j);
					
					//PASSAR 2 OBJETOS e trocar 
					
					//A primeira letra do nome2 é maior do que a primeira letra do nome1 ?
					if(nome2.charAt(0) < nome1.charAt(0)){
						//utiliza a variável auxiliar e trocar os nomes de posição no array.

						aux = nome1OBJ; 
						vetorLista.adiciona(i, nome2OBJ);
						vetorLista.remove(i+1);
						vetorLista.adiciona(j, aux);
						vetorLista.remove(j+1);
					
						//A primeira letra do nome2 é igual a nome1?
					}else if(nome2.charAt(0) == nome1.charAt(0)){
						//Compara a segunda letra
						if(nome2.charAt(1) < nome1.charAt(1)){
							
							aux = nome1OBJ; 
							vetorLista.adiciona(i, nome2OBJ);
							vetorLista.remove(i+1);
							vetorLista.adiciona(j, aux);
							vetorLista.remove(j+1);
							
						}else if(nome2.charAt(1) == nome1.charAt(1)){
							//Compara a segunda letra
							if(nome2.charAt(2) < nome1.charAt(2)){
								
								aux = nome1OBJ; 
								vetorLista.adiciona(i, nome2OBJ);
								vetorLista.remove(i+1);
								vetorLista.adiciona(j, aux);
								vetorLista.remove(j+1);
							}
						}
						
					}
				}
		
			}
			return vetorLista;

		}
	}