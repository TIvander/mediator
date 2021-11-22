public class AgenciaSaoPaulo implements Destinatario{
    private static AgenciaSaoPaulo instance = new AgenciaSaoPaulo();

    private AgenciaSaoPaulo(){}

    public static AgenciaSaoPaulo getInstance(){ return instance;}

    public String receberProduto(){
        return "Produto recebido pela Agência responsável";
    }

    public String enviarProduto(){
        return "Produto enviado pela Agência responsável";
    }
}
