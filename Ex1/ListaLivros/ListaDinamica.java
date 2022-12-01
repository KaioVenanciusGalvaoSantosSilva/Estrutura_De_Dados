import javax.swing.JOptionPane;

public class ListaDinamica<T>{
	protected ListaDinamica<T> inicio;
	protected ListaDinamica<T> fim;
	protected ListaDinamica<T> proxima;
	protected T valor;
	
	public ListaDinamica() {
		this.inicio = null;
		this.fim = null;
	}
	public void setValor(T car) {
		this.valor = car;
	}
	public void setProxima(ListaDinamica<T> prox) {
		this.proxima = prox;
	}
	public T getValor() {
		return this.valor;
	}
	public ListaDinamica<T> getProxima() {
		return this.proxima;
	}
	
	public boolean estaVazia() {
		if(this.inicio == null && this.fim == null) return true;
		return false;
	}
	
	public void adicionarNoInicio(T valor) {
		if(this.inicio == null ) {
			ListaDinamica<T> nova = new ListaDinamica<T>();
			nova.setValor(valor);
			nova.setProxima(null);
			this.inicio = nova;
			this.fim = nova;
		}else {
			ListaDinamica<T> nova = new ListaDinamica<T>();
			nova.setValor(valor);
			nova.setProxima(this.inicio);
			this.inicio = nova;
		}
		JOptionPane.showMessageDialog(null,"inserido no inicio com sucesso ");
	}
	
	public void adicionarNoFim(T valor) {
		if(estaVazia()) {
			adicionarNoInicio(valor);
		}else {
			ListaDinamica<T> nova = new ListaDinamica<T>();
			nova.setValor(valor);
			nova.setProxima(null);
			this.fim.setProxima(nova);
			this.fim = nova;
			JOptionPane.showMessageDialog(null,"inserido no fim com sucesso ");
		}
	}
	
	public void adicionarNaPosicao(int posicao, T valor) {
		if(estaVazia()) {
			JOptionPane.showMessageDialog(null,"A lista esta vazia");
		}else {
			int tamanho = 0;
			ListaDinamica<T> aux = this.inicio;
			do{
				tamanho++;
				aux = aux.getProxima();
			}while(aux!=null);
			
			if(posicao > tamanho || posicao == 0) 
				JOptionPane.showMessageDialog(null,"A posicao indicada � invalida");
			else if(posicao == tamanho) 
				adicionarNoFim(valor);
			else if(posicao == 1)
				adicionarNoInicio(valor);
			else {
				tamanho = 0;
				ListaDinamica<T> item = this.inicio;
				do{
					// (-2) na posicao indicada pois contase o primeiro item como sendo 1
					// caso queira contar o primeiro item como sendo 0 basta subtrair 1 da posicao indicada na funcao
					if(tamanho == posicao-2) { 
						ListaDinamica<T> nova = new ListaDinamica<T>();
						nova.setValor(valor);
						nova.setProxima(item.getProxima());
						item.setProxima(nova);
						break;
					}
					tamanho++;
					item = item.getProxima();
				}while(item!=null);
				JOptionPane.showMessageDialog(null,"inserido na posicao indicada com sucesso ");
			}
		}
	}
	
	public T removerNoInicio() {
		T retorno = null;
		if(estaVazia()) {
			JOptionPane.showMessageDialog(null,"A lista esta vazia, impossivel remover.");
			retorno = null;
		}else{
			retorno = this.inicio.getValor();
			this.inicio = this.inicio.getProxima();
		}
		return retorno;
	}
	
	public T removerNoFim() {
		T retorno = null;
		if(estaVazia()) {
			JOptionPane.showMessageDialog(null,"A lista esta vazia, impossivel remover.");
			retorno = null;
		}else {
			ListaDinamica<T> aux = this.inicio;
			do{				
				if(aux.getProxima() == this.fim) {
					retorno = this.fim.getValor();
					this.fim = aux;
					this.fim.setProxima(null);
					break;
				}
				aux = aux.getProxima();
			}while(aux!=null);
		}
		return retorno;
	}
	
	public T removerNaPosicao(int posicao) {
		T retorno = null;
		if(estaVazia()) {
			JOptionPane.showMessageDialog(null,"A lista esta vazia, impossivel remover.");
			retorno = null;
		}else{
			int tamanho = 0;
			ListaDinamica<T> aux = this.inicio;
			do{
				tamanho++;
				aux = aux.getProxima();
			}while(aux!=null);
			
			if(posicao > tamanho || posicao == 0) {
				JOptionPane.showMessageDialog(null,"A posicao indicada � invalida");
				retorno = null;
			}
			else if(posicao == tamanho){
				retorno = removerNoFim();
			}else if( posicao == 1) {
				retorno = removerNoInicio();
			}else if(posicao < tamanho) {
				ListaDinamica<T> item = this.inicio;
				tamanho = 0;
				do{
					if(tamanho == posicao -2) {
						retorno = item.getValor();
						item.setProxima(item.getProxima().getProxima());
					}
					tamanho++;
					item = item.getProxima();
				}while(item!=null);
			}	
		}
		return retorno;
	}
	
	public String mostrar() {
		String dados = null;
		if(inicio != null) {
			ListaDinamica<T> aux = this.inicio;
			dados = "A lista � composta pelos seguintes elementos:\n";
			
			do{
				dados += " " + paraString(aux.getValor()) ;
				aux = aux.getProxima();
			}while(aux!=null); 
		}else {
			dados = "A lista esta vazia";
		}
		return dados;
	}
	
	protected String paraString(T valor) {
		return (String) valor;
	}
	
}
