package model;

public interface LivroEstado {
    public void disponibilizar(Livro a);
    public void emprestar(Livro a);
    public void perder(Livro a);
}
