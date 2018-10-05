package padraochainofresponsibility;

public class TipoAtendimentoMedico implements TipoAtendimento {

    private static TipoAtendimentoMedico tipoAtendimentoMedico = new TipoAtendimentoMedico();

    public static TipoAtendimentoMedico getTipoAtendimentoMedico() {
        return tipoAtendimentoMedico;
    }
}
