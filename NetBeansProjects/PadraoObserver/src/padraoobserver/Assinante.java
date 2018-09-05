package padraoobserver;

import java.util.Observable;
import java.util.Observer;

public class Assinante implements Observer{
   
    private Observable revista;
    private int edicacaoNovaRevista;
    private String nome;

    public Assinante(Observable revista) {
        this.revista = revista;
        revista.addObserver(this);
    }
    
    public Observable getRevista() {
        return revista;
    }

    public void setRevista(Observable revista) {
        this.revista = revista;
    }

    public int getEdicacaoNovaRevista() {
        return edicacaoNovaRevista;
    }

    public void setEdicacaoNovaRevista(int edicacaoNovaRevista) {
        this.edicacaoNovaRevista = edicacaoNovaRevista;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(Observable revistaSubject, Object arg) {
        if (revistaSubject instanceof Revista)
        {
            Revista revista = (Revista) revistaSubject;
            edicacaoNovaRevista = revista.getEdicao();
            System.out.println("Atenção " + getNome() + ", já chegou mais uma edição da Revista. Este é a sua edição números: " + edicacaoNovaRevista);
        }
    }
    
    
}
