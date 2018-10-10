package padraocomposite;

public abstract class Conteudo {

    protected String descricao;

    public Conteudo(String descricao) {
        this.descricao = descricao;
    }

    public abstract String getDescricao();
        

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
       
}
