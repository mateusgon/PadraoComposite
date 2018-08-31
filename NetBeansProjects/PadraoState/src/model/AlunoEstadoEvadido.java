package model;

public class AlunoEstadoEvadido implements AlunoEstado{

    public AlunoEstadoEvadido() {
    }

    @Override
    public void matricular(Aluno a) {
        
    }

    @Override
    public void formar(Aluno a) {
        
    }

    @Override
    public void trancar(Aluno a) {
        
    }

    @Override
    public void jubilar(Aluno a) {
        
    }

    @Override
    public void evadir(Aluno a) {
        
    }

    @Override
    public String getNomeEstado() {
        return "Evadido";
    }
    
}
