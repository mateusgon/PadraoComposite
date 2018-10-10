package padraocomposite;

public class PadraoComposite {

    public static void main(String[] args) {
        Disciplina disciplina = new Disciplina();
        Secao secao111 = new Secao("Seção 1.1.1");
        Secao secao112 = new Secao("Secao 1.1.2");
        Unidade unidade11 = new Unidade("Unidade 1.1");
        Unidade unidade1 = new Unidade("Unidade 1");
        unidade1.addConteudo(unidade11);
        unidade11.addConteudo(secao111);
        unidade11.addConteudo(secao112);
        disciplina.addConteudo(unidade1);
        Secao secao21 = new Secao("Secao 2.1");
        Unidade unidade2 = new Unidade("Unidade 2");
        unidade2.addConteudo(secao21);
        disciplina.addConteudo(unidade2);
        disciplina.listarEmenta();
    }
    
}
