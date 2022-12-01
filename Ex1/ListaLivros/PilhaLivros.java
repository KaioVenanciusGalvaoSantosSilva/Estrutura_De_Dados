@SuppressWarnings("hiding")
public class PilhaLivros<Livro> extends PilhaDinamica<Livro>{
	protected String paraString(Livro livro){
		return "TITULO: " + ((Livro) livro).getTitulo() + " ---- "
				+ "QTD: " + ((Livro) livro).getQuantidade() + "\n";
	}
}
