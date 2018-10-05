package padraochainofresponsibility;

public class FuncionarioMedico extends Funcionario {

    public FuncionarioMedico(Funcionario superior) {
        listaAtendimentos.add(TipoAtendimentoMedico.getTipoAtendimentoMedico());
        setFuncionarioSuperior(superior);
    }

    @Override
    public String getDescricaoCargo() {
        return "Medico";
    }

}
