package listaAluno;

public class Principal_ex1_vetor {
	
	public static void main(String[] args) {
		//LISTA
		
		Aluno_ex1_vetor al1 = new Aluno_ex1_vetor("KAIO", "Matematica", 10, 10, 10, 10);
		Aluno_ex1_vetor al2 = new Aluno_ex1_vetor("JUCA", "Matematica", 10, 9, 8, 7);
		Aluno_ex1_vetor al3 = new Aluno_ex1_vetor("Perseu", "Matematica", 10, 10, 10, 10);
		Aluno_ex1_vetor al4 = new Aluno_ex1_vetor("Larissa", "Matematica", 10, 10, 10, 10);
		Aluno_ex1_vetor al5 = new Aluno_ex1_vetor("Andy", "Portugues", 10, 10, 10, 10);
		Aluno_ex1_vetor al6 = new Aluno_ex1_vetor("Teste", "Portugues", 10, 10, 10, 10);
		
		Lista_ex1_vetor vetor = new Lista_ex1_vetor();
		
		//Adiciona na proxima posição vazia
		vetor.adiciona(al1);
		vetor.adiciona(al2);
		vetor.adiciona(al3);
		vetor.adiciona(al4);
		vetor.adiciona(al5);
		//Adiciona em uma posição especifica
		vetor.adiciona(3, al6);
		
		 
        //Ver conteudo de um objeto especifico
    	System.out.println("---------------------------------------------");
    	int posicao = 2;
        System.out.println("O aluno na " +  posicao + "ª posição foi selecionado: \n" + vetor.getObjeto(posicao));
        
      //Mostra todos os elementos da lista
        System.out.println("---------------------------------------------");
        System.out.println("\nToda a lista");
		vetor.todos();
		
		//Mostra a quantidade de elementos na lista
		System.out.println("---------------------------------------------");
        System.out.println("\nQuantidade de Aluno = " + vetor.tamanho());
       
        
        System.out.println("---------------------------------------------");
        int remove = 2;
		 System.out.println("\nRemovendo o aluno da "+ remove + "ª posição: "
 		+ "\n" + vetor.getObjeto(posicao));
		 vetor.remove(remove);
        
		//Mostra todos os elementos da lista - ATUALIZADA
        System.out.println("---------------------------------------------");
        System.out.println("\nLista Atualizada");
		vetor.todos();
        
		System.out.println("---------------------------------------------");
        System.out.println("\nQuantidade de Aluno Atual= " + vetor.tamanho());
        
        //Ver conteudo de um objeto especifico
    	System.out.println("---------------------------------------------");
    	int posicao5 = 4;
        System.out.println("O aluno na " +  posicao5 + "ª posição foi selecionado: \n" + vetor.getObjeto(posicao5));
        
        
        System.out.println("---------------------------------------------");

      
	}
}