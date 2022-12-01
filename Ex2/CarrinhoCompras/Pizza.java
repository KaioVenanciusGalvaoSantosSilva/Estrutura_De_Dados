public class Pizza {
    String sabor;
    double preco;
    static int qtde_pizzas = 0;

    public Pizza(String sabor, double preco) {
        this.sabor = sabor;
        this.preco = preco;
        qtde_pizzas++;
    }

    public int getQtdePizzas() {
        return qtde_pizzas;
    }

    public String getSabor() {
        return sabor;
    }

    public double getPreco() {
        return preco;
    }

}
