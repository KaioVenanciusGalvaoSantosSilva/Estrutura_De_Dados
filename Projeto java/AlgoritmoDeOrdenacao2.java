package EXERCICIO;

import listaEncadedadaAluno.Lista_encadeada;

public class AlgoritmoDeOrdenacao2 {
	/*
	 * public static void main(String[] args) {
	 * 
	 * 
	 * //Cria e inicializa o vetor int[] vetor = new int[5];
	 * 
	 * //preenche for (int i = 0; i < vetor.length; i++) { vetor[i] = (int)
	 * Math.floor(Math.random() * vetor.length);
	 * 
	 * } //Exibe desordenado System.out.println("Desordenado"); for (int i = 0; i <
	 * vetor.length; i++) { System.out.print(vetor[i] + " "); } //Ordena por
	 * QUICK_SORT passando o vetor, o inicio do vetor, e o fim do vetor
	 * quicksort(vetor, 0, vetor.length - 1);
	 * 
	 * //Exibe vetor ordenado System.out.println("\n\n Ordenado"); for (int i = 0; i
	 * < vetor.length; i++) { System.out.print(vetor[i] + " "); }
	 * 
	 * }
	 */

	// Ordenado por melhor eficiencia 1° QUICK, 2° InsertionSort

	// QuickSort Inicio
	public static void QuickSort(Lista_encadeada vetor) {
		// O mais rápido para todos os tamanhos aleatórios
		// É o algoritmo mais eficiente que existe para uma grande variedade de
		// situações
		// Complexidade Pior Caso: O(n²) - quadratica
		// Complexidade Caso Médio: (nlogn) - logarítmica
		// Complexidade Melhor Caso: (nlogn) - logarítmica
		
		quicksortOrdena(vetor,1,vetor.tamanho()-1);
	}

	private static void quicksortOrdena(Lista_encadeada vetor, int esquerda, int direita) {
		if (esquerda < direita) {
			// Define um pivo no vetor e ordena
			int pivo = particao(vetor, esquerda, direita);

			// Quebra em problemas menores
			// recursiva para ordenar do lado esquerdo do vetor
			quicksortOrdena(vetor, esquerda, pivo);
			// recursiva para ordenar do lado direito do vetor
			quicksortOrdena(vetor, pivo + 1, direita);
		}

	}

	private static int particao(Lista_encadeada vetor, int esquerda, int direita) {
		
		
		//pra conseguir fazer a ordenacao de todas as letras
		//sera necessario pegar o tamanho da palavra (string)
		//fazer um 'for' de charArt(i) < tamanho da palavra.
		//tudo isso dentro de um while tamanho do vetor
		
		int meio = (int) (esquerda + direita) / 2;
		
		String nome3 = vetor.getObjeto(meio).toString();//conteudo do objeto em string ou seja o nome em string
		char meioChar = nome3.charAt(0);//pega a primeira letra do nome
		int meioInt = meioChar; //converte a primeira letra em numero de acordo com a ascII
		// pivo no meio do vetor
		int pivo = meioInt;
		
		// pivo na posicao esquerda
		int pivoEsquerda = esquerda - 1;
		
		// pivo na posicao direita
		int pivoDireita = direita + 1;
		
		while (true) {


			int esquerdaInt;
			do {
				pivoEsquerda++;
				String esquerda1 = vetor.getObjeto(pivoEsquerda).toString();//conteudo do objeto em string ou seja o nome em string
				char esquerdaChar = esquerda1.charAt(0);//pega a primeira letra do nome
				esquerdaInt = esquerdaChar; //converte a primeira letra em numero de acordo com a ascII
				
				// pivo da esquerda percorrerá o vetor ate que fique ao lado do pivo do meio
			} while (esquerdaInt < pivo);
			int direitaInt;
			do {
				String direita1 = vetor.getObjeto(pivoDireita).toString();//conteudo do objeto em string ou seja o nome em string
				char direitaChar = direita1.charAt(0);//pega a primeira letra do nome
				direitaInt = direitaChar; //converte a primeira letra em numero de acordo com a ascII

				pivoDireita--;
				// pivo da direita percorrerá o vetor ate que fique ao lado do pivo do meio
			} while (direitaInt > pivo);
			if (pivoEsquerda >= pivoDireita) {

				return pivoDireita;
			}
			//int aux = esquerdaInt;
			//esquerdaInt = direitaInt;
			//direitaInt = aux;
			
			
			Object nome1OBJ = vetor.getObjeto(pivoEsquerda);
			Object nome2OBJ = vetor.getObjeto(pivoDireita);
			
			Object aux = nome1OBJ; 
			vetor.adiciona(pivoEsquerda, nome2OBJ);
			vetor.remove(pivoEsquerda+1);
			vetor.adiciona(pivoDireita, aux);
			vetor.remove(pivoDireita+1);
			
		}

	}
	// QuickSort Fim

	// InsertionSort Inicio
	public static void InsertionSort(int[] vetor) {
		// É o mais interessante para arquivos com menos do que 20 elementos
		// Inserção é o método mais rápido para qualquer tamanho se os elementos estão
		// ordenados
		// Complexidade Pior Caso: O(n²) - quadratica
		// Complexidade Caso Médio: O(n²) - quadratica
		// Complexidade Melhor Caso: O(n) - linear
		int j;
		int chave;
		int i;

		for (j = 1; j < vetor.length; j++) {
			chave = vetor[j];
			for (i = j - 1; (i >= 0) && (vetor[i] > chave); i--) {
				vetor[i + 1] = vetor[i];
			}
			vetor[i + 1] = chave;
		}
	}
	// InsertionSort FIM

	// BubbleSort Inicio
	public static void BubbleSort(int vetor[]) {
		// Complexidade Pior Caso: O(n²) - quadratica
		// Complexidade Caso Médio: O(n²) - quadratica
		// Complexidade Melhor Caso: O(n) - linear
		boolean troca = true;
		int aux;
		while (troca) {
			troca = false;
			for (int i = 0; i < vetor.length - 1; i++) {
				if (vetor[i] > vetor[i + 1]) {
					aux = vetor[i];
					vetor[i] = vetor[i + 1];
					vetor[i + 1] = aux;
					troca = true;
				}
			}
		}

	}
	// BubbleSort FIM

	// SelectionSort Inicio
	public static void SelectionSort(int vetor[]) {
		// Deve ser usado para arquivos com elementos muito grandes,
		// desde que o número de elementos a ordenar seja pequeno
		// Complexidade Pior Caso: O(n²) - quadratica
		// Complexidade Caso Médio: O(n²) - quadratica
		// Complexidade Melhor Caso: O(n²) - quadratica
		for (int fixo = 0; fixo < vetor.length - 1; fixo++) {
			int menor = fixo;

			for (int i = menor + 1; i < vetor.length; i++) {
				if (vetor[i] < vetor[menor]) {
					menor = i;
				}
			}
			if (menor != fixo) {
				int t = vetor[fixo];
				vetor[fixo] = vetor[menor];
				vetor[menor] = t;
			}
		}
	}
	// SelectionSort FIM
	
	// MergeSort Inicio
	public static void MergeSort(int vetor[]) {

		// Chama o método que vai executar o algoritmo do Merge Sort.
		mergeSortOrdenar(vetor.length, vetor);

	}

	private static void mergeSortOrdenar(int tamanho, int[] vetor) {
		/*
		 * Variavel utilizada para percorrer o vetor. Inicializa com 1 para indicar que
		 * o vetor tenha pelo menos 1 elemento.
		 */
		int elementos = 1;
		/* Variaveis utilizadas para marcar o inicio, meio e fim do vetor. */
		int inicio, meio, fim;

		/* Percorre os elementos do vetor até chegar no fim do vetor. */
		while (elementos < tamanho) {
			/* Aponta o inicio do vetor. */
			inicio = 0;

			/*
			 * Percorre o vetor do inicio + quantidade de elementos ja percorrido, até o
			 * tamanho do vetor.
			 */
			while (inicio + elementos < tamanho) {
				/* Guarda a posição do meio do vetor que será ordenado. */
				meio = inicio + elementos;
				/* Guarda a posição final do vetor que será ordenado. */
				fim = inicio + 2 * elementos;

				/*
				 * Caso o fim fique com um tamanho maior, que o tamanho do vetor, então faz o
				 * fim ter o mesmo tamanho que o tamanho do vetor.
				 */
				if (fim > tamanho)
					fim = tamanho;

				/*
				 * Chama o método que faz a intercalação dos valores ordenados do vetor.
				 */
				intercala(vetor, inicio, meio, fim);

				/* Faz o inicio do vetor ser igual ao fim. */
				inicio = fim;
			}

			/* Percorre o vetor dobrando a quantidade de itens ja ordenados. */
			elementos = elementos * 2;
		}
	}

	private static void intercala(int[] vetor, int inicio, int meio, int fim) {
		/* Vetor utilizado para guardar os valors ordenados. */
		int novoVetor[] = new int[fim - inicio];
		/* Variavel utilizada para guardar a posicao do inicio do vetor. */
		int i = inicio;
		/* Variavel utilizada para guardar a posição do meio do vetor. */
		int m = meio;
		/*
		 * Variavel utilizada para guarda a posição onde os valores serão inseridos no
		 * novo vetor.
		 */
		int pos = 0;

		/*
		 * Enquanto o inicio não chegar até o meio do vetor, ou o meio do vetor não
		 * chegar até seu fim, compara os valores entre o inicio e o meio, verificando
		 * em qual ordem vai guarda-los ordenado.
		 */
		while (i < meio && m < fim) {
			/*
			 * Se o vetor[i] for menor que o vetor[m], então guarda o valor do vetor[i] pois
			 * este é menor.
			 */
			if (vetor[i] <= vetor[m]) {
				novoVetor[pos] = vetor[i];
				pos = pos + 1;
				i = i + 1;
				// Senão guarda o valor do vetor[m] pois este é o menor.
			} else {
				novoVetor[pos] = vetor[m];
				pos = pos + 1;
				m = m + 1;
			}
		}

		// Adicionar no vetor os elementos que estão entre o inicio e meio,
		// que ainda não foram adicionados no vetor.
		while (i < meio) {
			novoVetor[pos] = vetor[i];
			pos = pos + 1;
			i = i + 1;
		}

		// Adicionar no vetor os elementos que estão entre o meio e o fim,
		// que ainda não foram adicionados no vetor.
		while (m < fim) {
			novoVetor[pos] = vetor[m];
			pos = pos + 1;
			m = m + 1;
		}

		// Coloca no vetor os valores já ordenados.
		for (pos = 0, i = inicio; i < fim; i++, pos++) {
			vetor[i] = novoVetor[pos];
		}
	}
	// MergeSort FIM

	// HeapSort Inicio

	public static void HeapSort(int vetor[]) {

		// Heap Sort
		// Propriedade básica do heap é que possui 2 filhos
		// 2*i+1
		// 2*i+2

		int tamanhoVetor = vetor.length;
		// Ordenado em arvore binária
		for (int posicaoAtual = (tamanhoVetor / 2) - 1; posicaoAtual >= 0; posicaoAtual--) {
			aplicarHeap(vetor, tamanhoVetor, posicaoAtual);
		}

		// Ordenando vetor por heap
		for (int atual = (tamanhoVetor - 1); atual > 0; atual--) {
			int aux = vetor[0];
			vetor[0] = vetor[atual];
			vetor[atual] = aux;

			aplicarHeap(vetor, atual, 0);
		}
	}

	private static void aplicarHeap(int[] vetor, int tamanhoVetor, int posicaoAtual) {

		int raiz = posicaoAtual;
		// 2*i+1;
		int esquerda = (2 * posicaoAtual) + 1;
		// 2*i+2;
		int direita = (2 * posicaoAtual) + 2;

		if (esquerda < tamanhoVetor && vetor[esquerda] > vetor[raiz]) {
			raiz = esquerda;
		}
		if (direita < tamanhoVetor && vetor[direita] > vetor[raiz]) {
			raiz = direita;
		}
		if (raiz != posicaoAtual) {
			int aux = vetor[posicaoAtual];
			vetor[posicaoAtual] = vetor[raiz];
			vetor[raiz] = aux;
			aplicarHeap(vetor, tamanhoVetor, raiz);
		}
	}
	// HeapSort FIM

	
	// Fazer os demais algoritmos

}