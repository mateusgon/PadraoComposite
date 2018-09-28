package strategytemplatemethodbuilder;

public abstract class Vestuario {
    
    protected Loja loja;
    protected String nome;
    
    public abstract String getOrigem();

    public String getDadosVestuario()
    {
        return "Peça " + getNome() + " com origem " + getOrigem();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Loja getLoja() {
        return loja;
    }

    public void setLoja(Loja loja) {
        this.loja = loja;
    }
    
}
