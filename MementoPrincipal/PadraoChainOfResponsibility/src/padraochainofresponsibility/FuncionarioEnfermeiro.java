package padraochainofresponsibility;

public class FuncionarioEnfermeiro extends Funcionario{

    public FuncionarioEnfermeiro(Funcionario superior) {
        listaAtendimentos.add(TipoAtendimentoExame.getTipoAtendimentoExame());
        listaAtendimentos.add(TipoAtendimentoTriagem.getTipoAtendimentoTriagem());
        setFuncionarioSuperior(superior);
    }

    @Override
    public String getDescricaoCargo() {
        return "Enfermeiro";
    }
    
}
