package strategytemplatemethodbuilder;

public class Tenis extends Vestuario{

    @Override
    public String getOrigem() {
        return this.loja.obterEndereco();
    }

    public Tenis() {
        this.nome = "Tenis";
        this.loja = new LojaMesmoEstado();
    }
    
    
    
}
