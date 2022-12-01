package listaAluno;

public class Lista_ex1_vetor {
	/*
	Crie uma lista simplesmente encadeada que armazena os
	dados de um conjunto de alunos de uma dada disciplina.
	A estrutura Aluno deverá conter as seguintes informações: 

	Número de matrícula: String
• Nome (100 caracteres)
• Disciplina (100 caracteres)
• NotaP1: Float
• NotaP2: Float
• NotaSUB: Float
• NotaEX: Float

2. Implemente os métodos:
¨ Criação de uma lista;
¨ Inserção de dados da lista
¨ Remoção de dados da lista;
¨ Visualização de dados da lista.

	 */

	//ordenação em pilha, remove o que esta no topo da lista


	private Object[] objetos = new Object[10];
	public int totalDeObjetos = 0;


	private void garantaEspaco() {
		//Garante espaço para inserir novo objeto no vetor (elasticidade)
		if (totalDeObjetos == objetos.length) {
			Object[] novoVetor = new Object[objetos.length * 2];
			for (int i = 0; i < objetos.length; i++) {
				novoVetor[i] = objetos[i];
			}
			objetos = novoVetor;
		}
	}

	private boolean posicaoOcupada(int posicao){
		//valida posição esta ocupada
		return posicao>=0 && posicao<totalDeObjetos;
	}

	private boolean posicaoValida(int posicao){
		//valida posição esta vazia
		return posicao>=0 && posicao<totalDeObjetos;
	}

	public void adiciona(Object objeto) {
		//adiciona objeto ao vetor
		garantaEspaco();
		objetos[totalDeObjetos] = objeto;
		totalDeObjetos++;
	}

	public void adiciona(int posicao, Object objeto) {
		//adiciona objeto ao vetor em determinada posição
		garantaEspaco();
		if(!posicaoValida(posicao)){
			throw new IllegalArgumentException("Posição Inválida!");
		}

		for(int i=totalDeObjetos-1; i>=posicao; i--){
			objetos[i+1] = objetos[i];
		}
		objetos[posicao]=objeto;
		totalDeObjetos++;
	}

	public Object getObjeto(int posicao){
		//Pega posição do objeto
		if(!posicaoOcupada(posicao)){
			throw new IllegalArgumentException ("Posicao Inválida!");
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
		//remove determinado objeto baseado na posição
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