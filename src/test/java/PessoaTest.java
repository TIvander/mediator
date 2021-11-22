import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {
    @Test
    void returnProdutopostado() {
        Pessoa pessoa = new Pessoa();
        assertEquals("Produto enviado pela Agência responsável", pessoa.postarProduto());
    }

    @Test
    void returnProdutorecebido() {
        Pessoa pessoa = new Pessoa();
        assertEquals("Produto recebido pela Agência responsável", pessoa.receberProduto());
    }
}