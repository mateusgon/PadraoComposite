package padraoobserver2;

import java.util.Observable;
import java.util.Observer;

public class Aluno implements Observer{

    private Observable turma;
    private String nome;
    private Double nota;

    public Aluno(Observable turma) {
        this.turma = turma;
        nota = 0.0;
        turma.addObserver(this);
    }
    
    @Override
    public void update(Observable turmaSubject, Object arg) {
        if (turmaSubject instanceof Turma)
        {
            Turma turma = (Turma) turmaSubject;
            System.out.println("Atenção " + getNome() + ", a nota já foi lançada");
        }
    }

    public Observable getAluno() {
        return turma;
    }

    public void setAluno(Observable turma) {
        this.turma = turma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }
    
    
}
