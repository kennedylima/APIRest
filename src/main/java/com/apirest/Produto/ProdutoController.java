package com.apirest.Produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping(value = "/produto")
@CrossOrigin(origins = "*")
public class ProdutoController {

    @Autowired
    ProdutoRepository produtoRepository;

    @RequestMapping(method = RequestMethod.POST)
    public void salvar(@RequestBody Produto produto){
        produtoRepository.salvar(produto);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity editar(@RequestBody Produto produto){
        return ResponseEntity.status(200).body(produtoRepository.editar(produto));
    }

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Produto> buscarTodos(){
        return produtoRepository.buscarTodos();
    }


    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public ResponseEntity remover(@PathVariable("id") int id){
        produtoRepository.remover(id);
        return ResponseEntity.status(200).body("Excluido com sucesso");
    }


    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ResponseEntity<Produto> buscarPor(@PathVariable("id") int id){
        return ResponseEntity.status(200).body(produtoRepository.buscarPor(id));
    }

}
