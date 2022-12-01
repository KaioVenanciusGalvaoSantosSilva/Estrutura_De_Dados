package listaAluno;

public class Aluno_ex1_vetor {
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
	
	String nome;
	String disciplina;
	float notaP1;
	float notaP2;
	float notaSub;
	float notaEx;
	Aluno_ex1_vetor proximo;
	
	public Aluno_ex1_vetor(String nome, String disciplina,float notaP1,float notaP2,float notaSub,float notaEx) {	
			
		this.nome = nome;
		this.disciplina = disciplina;
		this.notaP1 = notaP1;
		this.notaP2 = notaP2;
		this.notaSub = notaSub;
		this.notaEx = notaEx;
	}
	
	public Aluno_ex1_vetor getProximo() {
		return proximo;
	}	

	public void setProximo(Aluno_ex1_vetor proximo) {
		this.proximo = proximo;
	}
	@Override
    public String toString() {
        return "Nome: " + nome + " Disciplina: " + disciplina + " NotaP1: " + notaP1+ " NotaP2: " + notaP2+ " NotaSub: " + notaSub+ " NotaEx: " + notaEx;
    }	
}