package padraochainofresponsibility;

public class TipoAtendimentoMarcacao implements TipoAtendimento {

    private static TipoAtendimentoMarcacao tipoAtendimentoMarcacao = new TipoAtendimentoMarcacao();

    public static TipoAtendimentoMarcacao getTipoAtendimentoMarcacao() {
        return tipoAtendimentoMarcacao;
    }
}
