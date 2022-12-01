public class Principal {

    public static void main(String[] args) {
        Pizza p1 = new Pizza("Marguerita", 55.00);
        Pizza p2 = new Pizza("Mussarela", 35);
        Pizza p3 = new Pizza("Calabresa", 30);
        Pizza p4 = new Pizza("Portuguesa", 45.50);
        Pizza p5;
        p5 = new Pizza("Atum", 42.50);

        CarrinhoDeCompra carrinho = new CarrinhoDeCompra();

        carrinho.adicionarItem(p1);
        carrinho.adicionarItem(p2);
        carrinho.adicionarItem(p3);
        carrinho.adicionarItem(p4);
        carrinho.adicionarItem(p5);

        System.out.println("Itens no carrinho : " + carrinho.totalPizzasAdicionadas());
    }
}