package listaEncadedadaAluno;

public class Principal_lista_encadeada {
	
	public static void main(String[] args) {
		//LISTA
		
		/*
		 * 4) Crie uma Fila de Estudantes, Sequencial e outra Encadeada respeitando a política FIFO. 
		 * Sua fila deverá ter os seguintes métodos:
			a) enfileirar(), adiciona um novo elemento no fim da fila.
			b) desenfileirar(), remove o elemento que está na cabeça da fila 
			c) cabeca(), mostra quem é o 1o elemento da fila.
			d) cauda(), mostra os elementos da cauda da fila.
		 * 
		 */		
		Aluno_lista_encadeada al1 = new Aluno_lista_encadeada("KAIO", "Matematica", 10, 10, 10, 10);
		Aluno_lista_encadeada al2 = new Aluno_lista_encadeada("JUCA", "Matematica", 10, 9, 8, 7);
		Aluno_lista_encadeada al3 = new Aluno_lista_encadeada("Perseu", "Matematica", 10, 10, 10, 10);
		Aluno_lista_encadeada al4 = new Aluno_lista_encadeada("Larissa", "Matematica", 10, 10, 10, 10);
		Aluno_lista_encadeada al5 = new Aluno_lista_encadeada("Andy", "Portugues", 10, 10, 10, 10);
		Aluno_lista_encadeada al6 = new Aluno_lista_encadeada("Teste", "Portugues", 10, 10, 10, 10);
		
		Lista_encadeada vetor = new Lista_encadeada();
				
	    //Mostra todos os elementos da lista
        System.out.println("---------------------------------------------");
        System.out.println("Toda a lista");
		vetor.todos();
		System.out.println("---------------------------------------------");
		
		System.out.println("a) enfileirar(), adiciona um novo elemento no fim da fila.");
		//a) enfileirar(), adiciona um novo elemento no fim da fila.
		vetor.enfileirar(al1);
		vetor.enfileirar(al2);
		vetor.enfileirar(al3);
		vetor.enfileirar(al4);
		vetor.enfileirar(al5);
		//Adiciona em uma posição especifica
		vetor.adiciona(3, al6);

      //Mostra todos os elementos da lista
        System.out.println("---------------------------------------------");
        System.out.println("Toda a lista");
		vetor.todos();
		System.out.println("---------------------------------------------");
				
		
		System.out.println("b) desenfileirar(), remove o elemento que está na cabeça da fila");
        //b) desenfileirar(), remove o elemento que está na cabeça da fila 
		vetor.desenfileirar();		
		
	     //Mostra todos os elementos da lista
        System.out.println("---------------------------------------------");
        System.out.println("Toda a lista");
		vetor.todos();
		System.out.println("---------------------------------------------");
				
		System.out.println("c) cabeca(), mostra quem é o 1o elemento da fila.");
		//c) cabeca(), mostra quem é o 1o elemento da fila.
		vetor.cabeca();
		System.out.println("---------------------------------------------");
				
		
		//d) cauda(), mostra os elementos da cauda da fila.
		System.out.println("d) cauda(), mostra os elementos da cauda da fila.");
		vetor.cauda();
		System.out.println("---------------------------------------------");
			
		
		//Extra
		//Mostra a quantidade de elementos na lista
        System.out.println("\nQuantidade de Aluno = " + vetor.tamanho());
          
        System.out.println("---------------------------------------------");
        int remove = 2;
		 System.out.println("\nRemovendo o aluno da "+ (remove+1) + "ª posição: "
 		+ "\n" + vetor.getObjeto(remove));
		 vetor.remove(remove);
        
	      //Mostra todos os elementos da lista
	        System.out.println("---------------------------------------------");
	        System.out.println("Toda a lista");
			vetor.todos();
			System.out.println("---------------------------------------------");
        

        System.out.println("\nQuantidade de Aluno Atual= " + vetor.tamanho());
        
        //Ver conteudo de um objeto especifico
    	System.out.println("---------------------------------------------");
    	int posicao5 = 1;
        System.out.println("O aluno na " +  (posicao5+1) + "ª posição foi selecionado: \n" + vetor.getObjeto(posicao5));
        
        System.out.println("---------------------------------------------");

	}
}