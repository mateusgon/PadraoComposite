package model;

public class LivroEstadoEmprestado implements LivroEstado{

    public LivroEstadoEmprestado() {
    }

    @Override
    public void disponibilizar(Livro a) {
        a.setEstado(new LivroEstadoDisponivel(a));
    }

    @Override
    public void emprestar(Livro a) {
        
    }

    @Override
    public void perder(Livro a) {
        a.setEstado(new LivroEstadoPerdido());
    }
    
}
