package model;

import java.util.Observable;
import java.util.Observer;

public class Usuario implements Observer{

    private Observable livro;
    private String nome;

    public Usuario(Observable livro) {
        this.livro = livro;
        livro.addObserver(this);
    }
    
    public Observable getLivro() {
        return livro;
    }

    public void setLivro(Observable livro) {
        this.livro = livro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(Observable livroSubject, Object arg) {        
        System.out.println("Atenção " + getNome() + ", o livro desejado já está disponível");       
    }
    
}
