@SuppressWarnings("hiding")
public class ListaLivros<Livro> extends ListaDinamica<Livro>{
	
	public ListaLivros( Livro valor) {
		super();
	}
	
	protected String paraString(Livro livro){
		return "TITULO: " + ((Livro) livro).getTitulo() + " ---- "
				+ "QTD: " + ((Livro) livro).getQuantidade() + "\n";
	}
	
}
