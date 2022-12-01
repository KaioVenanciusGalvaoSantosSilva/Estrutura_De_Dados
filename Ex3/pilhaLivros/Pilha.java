package pilhaLivros;

public class Pilha {

	private Livro topo, anterior;

	public void empilhar(Livro livro) {
		// push

		if (anterior == null) {
			anterior = livro;
		} else {
			topo = livro;
			topo.setAnterior(anterior);
			anterior = topo;
		}
	}

	public void desempilhar() {
		// pop
		topo = topo.getAnterior();
		anterior = topo;
	}

	public Livro topo() {
		// topo(), mostra o elemento que está no topo da pilha, sem desempilhar
		return topo;
	}

	public void get() {

		Livro auxTop = topo;
		System.out.println(auxTop.toString());
		desempilhar();
	}

	public void mostraLivros() {
    	//mostra o conteúdo da pilha de livros.
        Livro aux = topo;

        if(aux == null) {
            System.out.println("Pilha de livros esta vazia");        	
        }else{
	        while (aux != null) {
	            System.out.println(aux.toString());
	            aux = aux.getAnterior();	
	        }
       	 }
    }

	public void tamanho() {
		Livro atual = topo;
		int contador = 0;
		while (atual != null) {

			atual = atual.getAnterior();
			contador++;
		}
		System.out.println("O tamanho da pilha de livro é de: " + contador);
	}
}
