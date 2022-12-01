package EXERCICIO;

public class TesteDesempenhoOrdenacao {

	public static void main(String[] args) {
		
		// Cria e inicializa o vetor
		int[] vetor = new int[10];

		// preenche
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) Math.floor(Math.random() * vetor.length);
			//vetor[i] = i+1;
		}
		// Exibe desordenado
		System.out.println("Desordenado");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}

		// -------------------------------------------------

		// Calcular tempo de execucão
		// Tempo inicial
		long tempoInicial = System.currentTimeMillis();

		// Insira o algoritmo de ordenação abaixo ou desmarque a linha do algoritmo
		
		// Ordena por QuickSort passando o vetor, o inicio do vetor, e o fim do vetor
		AlgoritmoDeOrdenacao.QuickSort(vetor);
		
		// Ordena por InsertionSort passando o vetor
		 //AlgoritmoDeOrdenacao.InsertionSort(vetor);
		 
		// Ordena por BubbleSort passando o vetor
		 //AlgoritmoDeOrdenacao.BubbleSort(vetor);
		 
		// Ordena por SelectionSort passando o vetor
		 //AlgoritmoDeOrdenacao.SelectionSort(vetor);
		
		// Ordena por MergeSort passando o vetor
		//AlgoritmoDeOrdenacao.MergeSort(vetor);
		
		// Ordena por HeapSort passando o vetor
		//AlgoritmoDeOrdenacao.HeapSort(vetor);

		// Tempo final de execução
		long tempoFinal = System.currentTimeMillis();

		// Exibe DeltaTempo de execução
		System.out.println("\n\nExecutado em = " + (tempoFinal - tempoInicial) + " ms");

		// -------------------------------------------------

		// Exibe vetor ordenado
		System.out.println("Ordenado");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
	}
}