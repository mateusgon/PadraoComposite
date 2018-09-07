package model;

import java.util.Observable;

public class Livro extends Observable{

    private LivroEstado estado;

    public Livro() {
        this.estado = new LivroEstadoDisponivel(this);
    }

    public void disponibilizar() {
        estado.disponibilizar(this);
    }

    public void emprestar() {
        estado.emprestar(this);
    }

    public void perder() {
        estado.perder(this);
    }

    public LivroEstado getEstado() {
        return estado;
    }

    public void setEstado(LivroEstado estado) {
        this.estado = estado;
        /*if (estado instanceof LivroEstadoDisponivel)
        {
            setChanged();
            notifyObservers();
        }*/
    
    }    
        
        
    public void notificar() {
        this.setChanged();
        notifyObservers();
    }

}
