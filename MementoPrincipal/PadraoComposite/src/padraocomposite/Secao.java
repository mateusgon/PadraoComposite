package padraocomposite;

public class Secao extends Conteudo{

    public Secao(String descricao) {
        super(descricao);
    }
    
    @Override
    public String getDescricao() {
        return descricao + "\n";
    }
    
}
