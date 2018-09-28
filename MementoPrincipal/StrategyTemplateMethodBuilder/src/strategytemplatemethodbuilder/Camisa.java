package strategytemplatemethodbuilder;

public class Camisa extends Vestuario{

    @Override
    public String getOrigem() {
        return this.loja.obterEndereco();
    }

    public Camisa() {
        this.nome = "Calca";
        this.loja = new LojaMesmoEstado();
    }
    
    
}
