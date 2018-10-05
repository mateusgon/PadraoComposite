package padraochainofresponsibility;

import java.util.ArrayList;

public abstract class Funcionario {

    protected ArrayList listaAtendimentos = new ArrayList();
    private Funcionario funcionarioSuperior;

    public Funcionario getFuncionarioSuperior() {
        return funcionarioSuperior;
    }

    public void setFuncionarioSuperior(Funcionario funcionarioSuperior) {
        this.funcionarioSuperior = funcionarioSuperior;
    }

    public ArrayList getListaAtendimentos() {
        return listaAtendimentos;
    }

    public void setListaDocumentos(ArrayList listaAtendimentos) {
        this.listaAtendimentos = listaAtendimentos;
    }

    public abstract String getDescricaoCargo();

    public String realizarAtendimento(Atendimento atendimento) {
        if (listaAtendimentos.contains(atendimento.getTipoAtendimento())) {
            return getDescricaoCargo();
        } else {
            if (funcionarioSuperior != null) {
                return funcionarioSuperior.realizarAtendimento(atendimento);
            } else {
                return "Não é possível";
            }
        }
    }

}
