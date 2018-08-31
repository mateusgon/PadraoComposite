package model;

public class main {
    public static void main(String[] args) {
        Aluno a = new Aluno();
        a.formar();
        System.out.println(a.getNomeEstado());
        AlunoEstado estado = a.getEstado();
        a.jubilar();
        if (estado == a.getEstado())
        {
            System.out.println("Não mudou o estado");
        }
        System.out.println(a.getNomeEstado());
    }
}
