package padraoobserver;

import java.util.Observable;

public class Revista extends Observable{
    
    private int edicao;

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
        setChanged();
        notifyObservers();
    }
}
