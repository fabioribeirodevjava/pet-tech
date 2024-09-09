package br.com.fiap.pet_tech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repo;

    public Collection<Produto> findAll(){
        var produtos = repo.findAll();
        return produtos;
    }

    public Optional<Produto> findById(UUID id) {
        var produto = repo.findById(id);
        return produto;
    }

    public Produto save(Produto produto){
        produto =  repo.save(produto);
        return produto;
    }

    public Produto update(UUID id, Produto produto){
        Produto buscaProduto = repo.getOne(id);
        buscaProduto.setNome(produto.getNome());
        buscaProduto.setDescricao(produto.getDescricao());
        buscaProduto.setUrlDaImage(produto.getUrlDaImage());
        buscaProduto.setPreco(produto.getPreco());
        buscaProduto = repo.save(buscaProduto);
        return buscaProduto;
    }

    public void delete(UUID id){
        repo.deleteById(id);
    }

}
