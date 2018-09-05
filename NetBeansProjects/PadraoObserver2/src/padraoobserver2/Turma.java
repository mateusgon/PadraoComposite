package padraoobserver2;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Turma extends Observable{

    private List<Aluno> alunos;

    public Turma() {
        alunos = new ArrayList<>();
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
    
    public void lancarNota (Aluno a, Double nota)
    {
        a.setNota(nota);
    }
    
    public void fecharNota()
    {
        setChanged();
        notifyObservers();
    }
    
    
    
}
