package padraochainofresponsibility;

public class PadraoChainOfResponsibility {

    public static void main(String[] args) {
        FuncionarioMedico medico = new FuncionarioMedico(null);
        FuncionarioEnfermeiro enfermeiro = new FuncionarioEnfermeiro(medico);
        FuncionarioRecepcionista recepcionista = new FuncionarioRecepcionista(enfermeiro);

        System.out.println(recepcionista.realizarAtendimento(new Atendimento(TipoAtendimentoMarcacao.getTipoAtendimentoMarcacao())));
        System.out.println(recepcionista.realizarAtendimento(new Atendimento(TipoAtendimentoTriagem.getTipoAtendimentoTriagem())));
        System.out.println(recepcionista.realizarAtendimento(new Atendimento(TipoAtendimentoExame.getTipoAtendimentoExame())));
        System.out.println(recepcionista.realizarAtendimento(new Atendimento(TipoAtendimentoMedico.getTipoAtendimentoMedico())));
    }

}
