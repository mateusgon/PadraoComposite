package padraochainofresponsibility;

public class TipoAtendimentoExame implements TipoAtendimento {

    private static TipoAtendimentoExame tipoAtendimentoExame = new TipoAtendimentoExame();

    public static TipoAtendimentoExame getTipoAtendimentoExame() {
        return tipoAtendimentoExame;
    }
}
