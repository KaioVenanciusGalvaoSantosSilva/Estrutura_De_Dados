package listaEncadedadaAluno;

public class Aluno_lista_encadeada {

	String nome;
	String disciplina;
	float notaP1;
	float notaP2;
	float notaSub;
	float notaEx;
	Aluno_lista_encadeada proximo;
	
	public Aluno_lista_encadeada(String nome, String disciplina,float notaP1,float notaP2,float notaSub,float notaEx) {	
			
		this.nome = nome;
		this.disciplina = disciplina;
		this.notaP1 = notaP1;
		this.notaP2 = notaP2;
		this.notaSub = notaSub;
		this.notaEx = notaEx;
	}
	
	public Aluno_lista_encadeada getProximo() {
		return proximo;
	}	

	public void setProximo(Aluno_lista_encadeada proximo) {
		this.proximo = proximo;
	}
	@Override
    public String toString() {
        return "Nome: " + nome + " Disciplina: " + disciplina + " NotaP1: " + notaP1+ " NotaP2: " + notaP2+ " NotaSub: " + notaSub+ " NotaEx: " + notaEx;
    }	
	public String toStringNome() {
        return "Nome: " + nome;
    }	
}