package listaAluno;

public class Lista_ex1_vetor {
	/*
	Crie uma lista simplesmente encadeada que armazena os
	dados de um conjunto de alunos de uma dada disciplina.
	A estrutura Aluno dever� conter as seguintes informa��es: 

	N�mero de matr�cula: String
� Nome (100 caracteres)
� Disciplina (100 caracteres)
� NotaP1: Float
� NotaP2: Float
� NotaSUB: Float
� NotaEX: Float

2. Implemente os m�todos:
� Cria��o de uma lista;
� Inser��o de dados da lista
� Remo��o de dados da lista;
� Visualiza��o de dados da lista.

	 */

	//ordena��o em pilha, remove o que esta no topo da lista


	private Object[] objetos = new Object[10];
	public int totalDeObjetos = 0;


	private void garantaEspaco() {
		//Garante espa�o para inserir novo objeto no vetor (elasticidade)
		if (totalDeObjetos == objetos.length) {
			Object[] novoVetor = new Object[objetos.length * 2];
			for (int i = 0; i < objetos.length; i++) {
				novoVetor[i] = objetos[i];
			}
			objetos = novoVetor;
		}
	}

	private boolean posicaoOcupada(int posicao){
		//valida posi��o esta ocupada
		return posicao>=0 && posicao<totalDeObjetos;
	}

	private boolean posicaoValida(int posicao){
		//valida posi��o esta vazia
		return posicao>=0 && posicao<totalDeObjetos;
	}

	public void adiciona(Object objeto) {
		//adiciona objeto ao vetor
		garantaEspaco();
		objetos[totalDeObjetos] = objeto;
		totalDeObjetos++;
	}

	public void adiciona(int posicao, Object objeto) {
		//adiciona objeto ao vetor em determinada posi��o
		garantaEspaco();
		if(!posicaoValida(posicao)){
			throw new IllegalArgumentException("Posi��o Inv�lida!");
		}

		for(int i=totalDeObjetos-1; i>=posicao; i--){
			objetos[i+1] = objetos[i];
		}
		objetos[posicao]=objeto;
		totalDeObjetos++;
	}

	public Object getObjeto(int posicao){
		//Pega posi��o do objeto
		if(!posicaoOcupada(posicao)){
			throw new IllegalArgumentException ("Posicao Inv�lida!");
		}
		return objetos[posicao];
	}

	public void todos() {
		for (int i = 0; i < objetos.length; i++) {
			if (objetos[i] != null) {
				System.out.println(objetos[i]);

			}else {
				break;
			}
		}

	}

	public void remove(int posicao){
		//remove determinado objeto baseado na posi��o
		if(!posicaoValida(posicao)){
			throw new IllegalArgumentException("Posicao Invalida! ");
		}
		for(int i=posicao; i<totalDeObjetos-1; i++){
			objetos[i] = objetos[i+1];
		}
		for (int i = 0; i < objetos.length; i++) {
			if (objetos[i] == null) {
				objetos[i-1] = null;
				break;
			}
		}

		totalDeObjetos--;
	}

	public boolean contem(Object objeto){
		//verifica se determinado objeto esta contido no vetor
		boolean valor_retorno = false;
		for(int i=0; i<totalDeObjetos; i++){
			if(objeto.equals(objetos[i])){
				valor_retorno =  true;
			}
		}
		return valor_retorno;
	}

	public int tamanho(){
		//tamanho do vetor
		return totalDeObjetos;
	}
}