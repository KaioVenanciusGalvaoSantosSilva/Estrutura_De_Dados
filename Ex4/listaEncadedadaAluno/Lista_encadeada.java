package listaEncadedadaAluno;

public class Lista_encadeada {

	
	private Object[] objetos = new Object[10];
	public int totalDeObjetos = 0;

	private void garantaEspaco() {
		// Garante espaço para inserir novo objeto no vetor (elasticidade)
		if (totalDeObjetos == objetos.length) {
			Object[] novoVetor = new Object[objetos.length * 2];
			for (int i = 0; i < objetos.length; i++) {
				novoVetor[i] = objetos[i];
			}
			objetos = novoVetor;
		}
	}

	private boolean posicaoOcupada(int posicao) {
		// valida posição esta ocupada
		return posicao >= 0 && posicao < totalDeObjetos;
	}

	private boolean posicaoValida(int posicao) {
		// valida posição esta vazia
		return posicao >= 0 && posicao < totalDeObjetos;
	}

	public void enfileirar(Object objeto) {
		// adiciona objeto ao vetor
		garantaEspaco();
		objetos[totalDeObjetos] = objeto;
		System.out.println("Adicionando elemento na lista");
		totalDeObjetos++;
	}
	public void cabeca() {
		System.out.println("O elemento que esta na cabeça:");
		System.out.println(getObjeto(0));
		//Também poderia ser feito usando for para varrer todos os campos...
		//mas como a estrutura esta ordenada para que a posição 0 seja o cabeça não tem necessidade de aumentar a complexidade do código.
	}
	
	
	public void cauda() {
		System.out.println("O elemento que esta na cauda:");
		System.out.println(getObjeto(totalDeObjetos-1));
		
		
		//Também poderia ser feito usando for para varrer todos os campos...
		//mas como a estrutura esta ordenada para que a posição 0 seja o cabeça não tem necessidade de aumentar a complexidade do código.
	}


	public void adiciona(int posicao, Object objeto) {
		// adiciona objeto ao vetor em determinada posição
		garantaEspaco();
		if (!posicaoValida(posicao)) {
			// throw new IllegalArgumentException("Posição Inválida!");
			System.out.println("Posição Inválida!");
		}

		for (int i = totalDeObjetos - 1; i >= posicao; i--) {
			objetos[i + 1] = objetos[i];
		}
		objetos[posicao] = objeto;
		totalDeObjetos++;
	}

	public Object getObjeto(int posicao) {
		// Pega posição do objeto
		if (!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posicao Inválida!");
		}
		return objetos[posicao];
	}

	public void todos() {

		if (objetos[0] == null) {
			System.out.println("Lista Vazia");
		} else {
			for (int i = 0; i < objetos.length; i++) {
				if (objetos[i] != null) {
					System.out.println(objetos[i]);

				} else {
					break;
				}
			}
		}

	}

	public void remove(int posicao) {
		// remove determinado objeto baseado na posição
		if (!posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posicao Invalida! ");
		}
		for (int i = posicao; i < totalDeObjetos - 1; i++) {
			objetos[i] = objetos[i + 1];
		}
		for (int i = 0; i < objetos.length; i++) {
			if (objetos[i] == null) {
				objetos[i - 1] = null;
				break;
			}
		}

		totalDeObjetos--;
	}

	public void desenfileirar() {
		// b) desenfileirar(), remove o elemento que está na cabeça da fila
		int posicao = 0;
		
		System.out.println("Removeu o elemento que esta na cabeça da fila");
		System.out.println(getObjeto(0));
		if (!posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posicao Invalida! ");
		}
		for (int i = posicao; i < totalDeObjetos - 1; i++) {
			objetos[i] = objetos[i + 1];
		}
		for (int i = 0; i < objetos.length; i++) {
			if (objetos[i] == null) {
				objetos[i - 1] = null;
				break;
			}
		}
		totalDeObjetos--;
	}

	public boolean contem(Object objeto) {
		// verifica se determinado objeto esta contido no vetor
		boolean valor_retorno = false;
		for (int i = 0; i < totalDeObjetos; i++) {
			if (objeto.equals(objetos[i])) {
				valor_retorno = true;
			}
		}
		return valor_retorno;
	}
	public int tamanho() {
		// tamanho do vetor
		return totalDeObjetos;
	}
}