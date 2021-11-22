public class Pessoa {

    public String postarProduto() {
        return AgenciaSaoPaulo.getInstance().enviarProduto();
    }

    public String receberProduto() {
        return AgenciaSaoPaulo.getInstance().receberProduto();
    }
}
