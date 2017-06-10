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
    public  void deve_salvar_um_produto(){
        Produto camisetaRealMadrid = new Produto("Camiseta Real Madrid", 280d);
        produtoRepository.salvar(camisetaRealMadrid);
        System.out.println(camisetaRealMadrid.getId());
        assertNotNull(camisetaRealMadrid.getId());
    }

}
