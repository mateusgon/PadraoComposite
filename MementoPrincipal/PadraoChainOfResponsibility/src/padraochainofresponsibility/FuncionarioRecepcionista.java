package padraochainofresponsibility;

public class FuncionarioRecepcionista extends Funcionario {

    public FuncionarioRecepcionista(Funcionario superior) {
        listaAtendimentos.add(TipoAtendimentoMarcacao.getTipoAtendimentoMarcacao());
        setFuncionarioSuperior(superior);
    }

    @Override
    public String getDescricaoCargo() {
        return "Recepcionista";
    }

}
