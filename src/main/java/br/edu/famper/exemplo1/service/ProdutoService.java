package br.edu.famper.exemplo1.service;

import br.edu.famper.exemplo1.model.Produto;
import br.edu.famper.exemplo1.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto salvar(Produto produto) {
        return produtoRepository.save(produto);
    }

    public List<Produto> findAll() {
        return produtoRepository.findAll();// ele vai pegar tudo oque tem no banco de dados e vai trazer uma lista tudo oque tem salvo
    }

    public Optional<Produto> findById(Long id) {
        return produtoRepository.findById(id); // vai trazer um item que salvei
    }

    public Produto update(Produto produto) {
        return produtoRepository.save(produto);//modificar algo
    }

    public void deleteById(Long id) {
        produtoRepository.deleteById(id); // deletar
    }
}
