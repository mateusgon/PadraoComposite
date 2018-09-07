package model;

import java.util.Observable;

public class LivroEstadoDisponivel extends Observable implements LivroEstado{

    public LivroEstadoDisponivel(Livro a) {
        a.notificar();
    }

    @Override
    public void disponibilizar(Livro a) {
        
    }

    @Override
    public void emprestar(Livro a) {
        a.setEstado(new LivroEstadoEmprestado());
    }

    @Override
    public void perder(Livro a) {
        a.setEstado(new LivroEstadoPerdido());
    }

}
