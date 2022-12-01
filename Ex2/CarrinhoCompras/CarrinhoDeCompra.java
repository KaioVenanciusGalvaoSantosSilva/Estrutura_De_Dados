import java.util.ArrayList;

public class CarrinhoDeCompra {
    ListaVetor carrinho_de_compras = new ListaVetor();
    
    public void adicionarItem(Pizza objeto){
        carrinho_de_compras.adiciona(objeto);
    }
    
    public int totalPizzasAdicionadas(){
        return carrinho_de_compras.tamanho();
    }
}
