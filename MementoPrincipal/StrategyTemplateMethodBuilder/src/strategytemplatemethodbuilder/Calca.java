package strategytemplatemethodbuilder;

public class Calca extends Vestuario{

    @Override
    public String getOrigem() {
        return this.loja.obterEndereco();
    }

    public Calca() {
        this.nome = "Calca";
        this.loja = new LojaDiferenteEstado();
    }

    
    
}
