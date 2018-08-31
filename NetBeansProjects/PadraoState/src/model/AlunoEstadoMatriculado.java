package model;

public class AlunoEstadoMatriculado implements AlunoEstado{

    public AlunoEstadoMatriculado() {
    }

    @Override
    public void matricular(Aluno a) {
        
    }

    @Override
    public void formar(Aluno a) {
        a.setEstado(new AlunoEstadoFormado());
    }

    @Override
    public void trancar(Aluno a) {
        a.setEstado(new AlunoEstadoTrancado());
    }

    @Override
    public void jubilar(Aluno a) {
        a.setEstado(new AlunoEstadoJubilado());
    }

    @Override
    public void evadir(Aluno a) {
        a.setEstado(new AlunoEstadoJubilado());
    }
    
    @Override
    public String getNomeEstado() {
        return "Matriculado";
    }
    
}
