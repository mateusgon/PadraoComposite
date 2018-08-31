package model;

public interface AlunoEstado {
    public void matricular(Aluno a);
    public void formar(Aluno a);
    public void trancar(Aluno a);
    public void jubilar(Aluno a);
    public void evadir(Aluno a);
    public String getNomeEstado();
}
