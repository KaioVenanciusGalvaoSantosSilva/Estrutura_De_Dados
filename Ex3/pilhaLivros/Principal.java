package pilhaLivros;

public class Principal {
	/*Exericio.
	3) Transformar a lista encadeada de Livros em uma Pilha de Livros,
	 respeitando a política LIFO. 
	 Os seguintes métodos devem constar na sua pilha:
	*/
	
	public static void main(String[] args) {
		Livro l1 = new Livro("Livro 1", 2019, 29.99);
		Livro l2 = new Livro("Livro 2", 2017, 15.99);
		Livro l3 = new Livro("Livro 3", 2015, 27.99);
		Livro l4 = new Livro("Livro 4", 2014, 17.99);
		Livro l5 = new Livro("Livro 5", 2012, 12.22);
		Pilha livro = new Pilha();

		System.out.println("-------------------");
		System.out.println("Todos os Livros:");
		livro.mostraLivros();
		System.out.println("-------------------");
		
		// a) empilhar()
		System.out.println("Empilhar:");
		livro.empilhar(l1);
		livro.empilhar(l2);
		livro.empilhar(l3);
		livro.empilhar(l4);
		livro.empilhar(l5);
		
		System.out.println("Todos os Livros:");
		livro.mostraLivros();
		System.out.println("-------------------");
		
		
		// b) desempilhar()
		System.out.println("Desempilhar:");
		livro.desempilhar();
		System.out.println("-------------------");
		livro.mostraLivros();
		System.out.println("-------------------");

		// c) topo(), mostra o elemento que está no topo da pilha, sem desempilhar
		System.out.println("Topo: \n" + livro.topo());

		System.out.println("-------------------");
		livro.mostraLivros();
		System.out.println("-------------------");

		// d) get(), retorna o elemento que está no topo da pilha, desempilhando.
		System.out.println("Get:");
		livro.get();

		System.out.println("-------------------");
		livro.mostraLivros();
		System.out.println("-------------------");

		// e) tamanho(), retorna o tamanho da pilha (quantos elementos há).
		livro.tamanho();
		
		System.out.println("-------------------");
		livro.mostraLivros();
		System.out.println("-------------------");
	}
}