import javax.swing.JOptionPane;

public class FilaPrioridadeDinamica<T>{
	protected FilaPrioridadeDinamica<T> inicio;
	protected FilaPrioridadeDinamica<T> fim;
	protected FilaPrioridadeDinamica<T> proxima;
	protected T valor;
	
	public FilaPrioridadeDinamica() {
		this.inicio = null;
		this.fim = null;
	}

	public void setValor(T valor) {
		this.valor = valor;
	}
	public void setProxima(FilaPrioridadeDinamica<T> prox) {
		this.proxima = prox;
	}
	public T getValor() {
		return this.valor;
	}
	public FilaPrioridadeDinamica<T> getProxima() {
		return this.proxima;
	}
	
	public void adicionarNaFila(T valor) {
		if(this.inicio == null ) {
			FilaPrioridadeDinamica<T> nova = new FilaPrioridadeDinamica<T>();
			nova.setValor(valor);
			nova.setProxima(null);
			this.inicio = nova;
			this.fim = nova;
		}else{
			
			FilaPrioridadeDinamica<T> aux = this.inicio;
			do{
				if(comparar(valor, aux.getValor() ) < 0)  {
					FilaPrioridadeDinamica<T> nova = new FilaPrioridadeDinamica<T>();
					nova.setValor(valor);
					nova.setProxima(aux);
					this.inicio = nova;
					break;
				}else if(aux.getProxima() == null) {
					FilaPrioridadeDinamica<T> nova = new FilaPrioridadeDinamica<T>();
					nova.setValor(valor);
					nova.setProxima(null);
					this.fim.setProxima(nova);
					this.fim = nova;
					break;
				}else if(comparar(valor, (T) aux.getProxima().getValor() ) < 0 ) {
					FilaPrioridadeDinamica<T> nova = new FilaPrioridadeDinamica<T>();
					nova.setValor(valor);
					nova.setProxima(aux.getProxima());
					aux.setProxima(nova);
					break;
				}
				aux = aux.getProxima();
			}while(aux!=null); 
		}
		JOptionPane.showMessageDialog(null," foi adicionado na fila");
	}
	
	public void excluirDaFila() {
		if(this.inicio == null) {
			JOptionPane.showMessageDialog(null, "A fila esta vazia");
		}else{
			JOptionPane.showMessageDialog(null, "O elemento " + this.inicio.getValor() +" foi excluido "); 
			this.inicio = this.inicio.getProxima();
		}
		if(this.inicio == null) {
			this.fim = null;
		}
	}
	public String Listar() {
		String dados = null;
		if(inicio != null) {
			FilaPrioridadeDinamica<T> aux = this.inicio;
			dados = "A fila � composta pelos seguintes elementos:\n";
			
			do{
				dados += paraString(aux.getValor()) + "  ";
				aux = aux.getProxima();
			}while(aux!=null); 
		}else {
			dados = "A fila esta vazia";
		}
		return dados;
	}
	protected String paraString(T valor) {
		return valor.toString();
	}

	protected int comparar(T e1,T e2) {
		@SuppressWarnings("unchecked")
		Comparable<T> chave = (Comparable<T>) e1;
		if(chave.compareTo(e2) < 0) {
			return -1;
		}else if(chave.compareTo(e2) > 0) {
			return 1;
		}
		return 0;
	}
}
