import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {		
		ListaLivros<Livro> lista = new ListaLivros<Livro>(new Livro());
		FilaPrioridadeLivro<Livro> filaRemovidosDoInicio = new FilaPrioridadeLivro<Livro>();
		PilhaLivros<Livro> pilhaRemovidosDoFim = new PilhaLivros<Livro>();
		ListaLivros<Livro> listaRemovidos = new ListaLivros<Livro>(new Livro());
		
		boolean faca = true;
		
		while(faca) {
			int codigo = Integer.parseInt(JOptionPane.showInputDialog(null, ""
					+ "1 - Adicionar um livro no inicio da lista"
					+ "\n2 - Adicionar um livro no final da lista"
					+ "\n3 - Adicionar um livro em uma posicao da lista"
					+ "\n4 - Remover um livro do inicio da lista"  
					+ "\n5 - Remover um livro do final da lista" 
					+ "\n6 - Remover um livro de uma posicao da lista"
					+ "\n7 - Mostrar fila de livros"
					+ "\n8 - Mostrar Fila dos livros removidos no inicio"
					+ "\n9 - Mostrar Pilha dos livros removidos no fim"
					+ "\n10 - Mostrar Lista dos livros removidos em alguma posicao"
					+ "\n99 - Finalizar"));
			
			switch (codigo) {
        	case 1:
        		Livro valor = new Livro();
        		valor.setQuantidade(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de exemplares do livro para adicionar")));
        		valor.setTitulo(JOptionPane.showInputDialog("Digite o titulo do livro para adicionar"));
        		lista.adicionarNoInicio(valor);
        		break;
	        case 2:
	        	valor = new Livro();
        		valor.setQuantidade(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de exemplares do livro para adicionar")));
        		valor.setTitulo(JOptionPane.showInputDialog("Digite o titulo do livro para adicionar"));
        		lista.adicionarNoFim(valor);
	            break;
	        case 3:
	        	int p = Integer.parseInt(JOptionPane.showInputDialog("Digite a posicao da lista em que deseja adicionar"));
	        	valor = new Livro();
        		valor.setQuantidade(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de exemplares do livro para adicionar")));
        		valor.setTitulo(JOptionPane.showInputDialog("Digite o titulo do livro para adicionar"));
        		lista.adicionarNaPosicao(p,valor);
	        	break;
	        case 4:
	        	Livro removido = lista.removerNoInicio();
	        	filaRemovidosDoInicio.adicionarNaFila(removido);
	        	if(removido != null ) JOptionPane.showMessageDialog(null, removido.getTitulo()  + " foi removido da lista");
	        	break;
	        case 5:
	        	removido = lista.removerNoFim();
	        	pilhaRemovidosDoFim.empilhar(removido);
	        	if(removido != null ) JOptionPane.showMessageDialog(null, removido.getTitulo() + " foi removido da lista");
	        	break;
	        case 6:
	        	int po = Integer.parseInt(JOptionPane.showInputDialog("Digite a posicao"));
	        	removido = lista.removerNaPosicao(po);
	        	listaRemovidos.adicionarNoFim(removido);
	        	if(removido != null ) JOptionPane.showMessageDialog(null, removido.getTitulo()  + " foi removido da lista");
	        	break;
	        case 7:
	        	JOptionPane.showMessageDialog(null,lista.mostrar());
	        	break;
	        case 8:
	        	JOptionPane.showMessageDialog(null,filaRemovidosDoInicio.Listar());
	        	break;
	        case 9:
	        	JOptionPane.showMessageDialog(null,pilhaRemovidosDoFim.Listar());
	        	break;
	        case 10:
	        	JOptionPane.showMessageDialog(null,listaRemovidos.mostrar());
	        	break;
	        case 99:
	             faca = false;
	             break;
	        default:
	             JOptionPane.showMessageDialog(null, "O c�digo informado � inv�lido.");
	             break;
			} 
		}
	}

}
