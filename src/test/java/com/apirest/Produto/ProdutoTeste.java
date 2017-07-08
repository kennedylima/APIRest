package com.apirest.Produto;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProdutoTeste {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Test
    public void deve_salvar_tres_produtos(){
        Produto realMadrid = new Produto("Real Madrid", 410d,"https://www.decathlon.co.uk/media/836/8364265/classic_e04465bd305d46b4aa2f4440ba590c4c.jpg");
        Produto juventus = new Produto("Juventus", 300d,"https://www.guiadoboleiro.com.br/imagens/o/2017/06/camisa_juventus_2017_18_titular_1.jpg");
        Produto barcelona = new Produto("Barcelona F.C", 280d,"http://www.lojadanike.com.br/ArquivoExibir/763829.jpg");
        Produto santos = new Produto("Santos", 230d,"https://images1.tcdn.com.br/img/img_prod/311840/camisa_kappa_santos_i_2017_libertadores_36087_1_20170524085750.jpg");

        produtoRepository.salvar(realMadrid);
        produtoRepository.salvar(juventus);
        produtoRepository.salvar(barcelona);
        produtoRepository.salvar(santos);

        assertNotNull(realMadrid.getId());
    }
}
