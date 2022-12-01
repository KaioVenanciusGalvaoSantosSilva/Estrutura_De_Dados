import javax.swing.JOptionPane;

public class PilhaDinamica<T> {
	protected T valor;
	protected PilhaDinamica<T> proxima;
	protected PilhaDinamica<T> topo = null;
	
	public void setvalor(T valor) {
		this.valor = valor;
	}
	public void setProximo(PilhaDinamica<T> proxima) {
		this.proxima = proxima;
	}
	public PilhaDinamica<T> getProximo() {
		return this.proxima;
	}
	public T getvalor() {
		return this.valor;
	}
	
	public void empilhar(T valor) { //metodo push sempre adiciona ao final da pilha
		if(this.topo == null) {			
			this.valor = valor;
			this.proxima = null;
			this.topo = this;
		}else {
			PilhaDinamica<T> nova = new PilhaDinamica<T>(); 
			nova.setvalor(valor);
			nova.setProximo(this.topo);
			this.topo = nova;
		}
		JOptionPane.showMessageDialog(null,"O valor foi inserido com sucesso.");
	}
	
	public void desempilhar() { // metodo pop sempre remove o ultimo a ser adicionado
		if(topo == null) {
			JOptionPane.showMessageDialog(null,"A pilha esta vazia");
		}else {
			JOptionPane.showMessageDialog(null,"O valor "+ this.topo.getvalor()+ " foi removido"); 
			this.topo = this.topo.getProximo();
		}
	}
	
	public String Listar() {
		String dados = null;
		if(this.topo != null) {			
			PilhaDinamica<T> aux = this.topo;
			dados = "A pilha � composta pelos seguintes elementos:";
			while(aux!=null) {
				dados += paraString(aux.getvalor()) + "  ";
				aux = aux.getProximo();
			}		
		}else {
			dados = "A pilha esta vazia";
		}
		return dados;
	}
	
	protected String paraString(T valor) {
		return valor.toString();
	}
}
