public class Central {
    private static Central instance = new Central();

    private Central() {}

    public static Central getInstance(){
        return instance;
    }

    public String receberProduto(){
        return "A central encaminhou sua solicitação.\n"+
                "Mensagem da agência responsável: .\n" +
                AgenciaSaoPaulo.getInstance().receberProduto();

    }

    public String enviarProduto(){
        return "A central encaminhou sua solicitação.\n"+
                "Mensagem da agência responsável: .\n" +
                AgenciaSaoPaulo.getInstance().enviarProduto();

    }
}
