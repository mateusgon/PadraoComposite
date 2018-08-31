package model;

public class Aluno {
    private AlunoEstado estado;

    public Aluno() {
        this.estado = new AlunoEstadoMatriculado();
    }

    public void matricular()
    {
        estado.matricular(this);
    }
    
    public void formar()
    {
        estado.formar(this);
    }
    
    public void trancar()
    {
        estado.trancar(this);
    }
    
    public void evadir()
    {
        estado.evadir(this);
    }
    
    public void jubilar()
    {
        estado.jubilar(this);
    }

    public AlunoEstado getEstado() {
        return estado;
    }

    public void setEstado(AlunoEstado estado) {
        this.estado = estado;
    }

    public String getNomeEstado() {
        return estado.getNomeEstado();
    }
        
}
