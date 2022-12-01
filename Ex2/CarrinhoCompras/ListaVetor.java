public class ListaVetor {

    private Object[] objetos = new Object[10];
    public int totalDeObjetos = 0;


    private void garantaEspaco() {
        if (totalDeObjetos == objetos.length) {
            Object[] novoVetor = new Object[objetos.length * 2];
            for (int i = 0; i < objetos.length; i++) {
                novoVetor[i] = objetos[i];
            }
            objetos = novoVetor;
        }
    }

    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < totalDeObjetos;
    }

    private boolean posicaoValida(int posicao) {
        return posicao >= 0 && posicao < totalDeObjetos;
    }

    public void adiciona(Object objeto) {
        garantaEspaco();
        objetos[totalDeObjetos] = objeto;
        totalDeObjetos++;
    }

    public void adiciona(int posicao, Object objeto) {
        garantaEspaco();
        if (!posicaoValida(posicao)) {
            throw new IllegalArgumentException("Posição Inválida!");
        }

        for (int i = totalDeObjetos - 1; i >= posicao; i--) {
            objetos[i + 1] = objetos[i];
        }
        objetos[posicao] = objeto;
        totalDeObjetos++;
    }

    public Object getObjeto(int posicao) {
        if (!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posicao Inválida!");
        }
        return objetos[posicao];
    }

    public void remove(int posicao) {
        if (!posicaoValida(posicao)) {
            throw new IllegalArgumentException("Posicao Invalida! ");
        }
        for (int i = posicao; i < totalDeObjetos - 1; i++) {
            objetos[i] = objetos[i + 1];
        }
        totalDeObjetos--;
    }

    public boolean contem(Object objeto) {
        boolean valor_retorno = false;
        for (int i = 0; i < totalDeObjetos; i++) {
            if (objeto.equals(objetos[i])) {
                valor_retorno = true;
            }
        }
        return valor_retorno;
    }

    public int tamanho() {
        return totalDeObjetos;
    }
}
