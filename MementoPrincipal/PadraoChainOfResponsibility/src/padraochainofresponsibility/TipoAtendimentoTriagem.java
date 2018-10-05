package padraochainofresponsibility;

public class TipoAtendimentoTriagem implements TipoAtendimento{
    
    private static TipoAtendimentoTriagem tipoAtendimentoTriagem = new TipoAtendimentoTriagem();
    public static TipoAtendimentoTriagem getTipoAtendimentoTriagem()
    {
        return tipoAtendimentoTriagem;
    }
}
