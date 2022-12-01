package EXERCICIO;

public class Aluno_lista_encadeada {

	String nome;
	String letra;

	Aluno_lista_encadeada proximo;
	
	public Aluno_lista_encadeada(String nome, String letra) {	
			
		this.nome = nome;
		this.letra = letra;

	}
	
	public Aluno_lista_encadeada getProximo() {
		return proximo;
	}	

	public void setProximo(Aluno_lista_encadeada proximo) {
		this.proximo = proximo;
	}
	@Override
    public String toString() {
        return nome ;
    }	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLetra() {
		return letra;
	}

	public void setLetra(String letra) {
		this.letra = letra;
	}

	public String toStringNome() {
        return nome;
    }	
}