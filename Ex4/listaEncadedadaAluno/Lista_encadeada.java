package listaEncadedadaAluno;

public class Lista_encadeada {

	
	private Object[] objetos = new Object[10];
	public int totalDeObjetos = 0;

	private void garantaEspaco() {
		// Garante espa�o para inserir novo objeto no vetor (elasticidade)
		if (totalDeObjetos == objetos.length) {
			Object[] novoVetor = new Object[objetos.length * 2];
			for (int i = 0; i < objetos.length; i++) {
				novoVetor[i] = objetos[i];
			}
			objetos = novoVetor;
		}
	}

	private boolean posicaoOcupada(int posicao) {
		// valida posi��o esta ocupada
		return posicao >= 0 && posicao < totalDeObjetos;
	}

	private boolean posicaoValida(int posicao) {
		// valida posi��o esta vazia
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
		System.out.println("O elemento que esta na cabe�a:");
		System.out.println(getObjeto(0));
		//Tamb�m poderia ser feito usando for para varrer todos os campos...
		//mas como a estrutura esta ordenada para que a posi��o 0 seja o cabe�a n�o tem necessidade de aumentar a complexidade do c�digo.
	}
	
	
	public void cauda() {
		System.out.println("O elemento que esta na cauda:");
		System.out.println(getObjeto(totalDeObjetos-1));
		
		
		//Tamb�m poderia ser feito usando for para varrer todos os campos...
		//mas como a estrutura esta ordenada para que a posi��o 0 seja o cabe�a n�o tem necessidade de aumentar a complexidade do c�digo.
	}


	public void adiciona(int posicao, Object objeto) {
		// adiciona objeto ao vetor em determinada posi��o
		garantaEspaco();
		if (!posicaoValida(posicao)) {
			// throw new IllegalArgumentException("Posi��o Inv�lida!");
			System.out.println("Posi��o Inv�lida!");
		}

		for (int i = totalDeObjetos - 1; i >= posicao; i--) {
			objetos[i + 1] = objetos[i];
		}
		objetos[posicao] = objeto;
		totalDeObjetos++;
	}

	public Object getObjeto(int posicao) {
		// Pega posi��o do objeto
		if (!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posicao Inv�lida!");
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
		// remove determinado objeto baseado na posi��o
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
		// b) desenfileirar(), remove o elemento que est� na cabe�a da fila
		int posicao = 0;
		
		System.out.println("Removeu o elemento que esta na cabe�a da fila");
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