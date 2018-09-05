package padraoobserver2;

public class PadraoObserver2 {

    public static void main(String[] args) {
        Turma turma = new Turma();
        Turma turma2 = new Turma();
        Aluno aluno = new Aluno(turma);
        aluno.setNome("Cassio");
        turma.getAlunos().add(aluno);
        turma.lancarNota(aluno, 10.0);
        Aluno aluno2 = new Aluno(turma);
        aluno2.setNome("Gabriel");
        turma.getAlunos().add(aluno2);
        turma.lancarNota(aluno2, 10.0);
        Aluno aluno3 = new Aluno(turma2);
        aluno3.setNome("Teste");
        aluno3.getAluno().addObserver(aluno3);
        turma2.lancarNota(aluno, 9.0);
        turma.fecharNota();
    }
    
}
