package padraoobserver;

public class PadraoObserver {

    public static void main(String[] args) {
        Revista revista = new Revista();
        Assinante assinante = new Assinante(revista);
        assinante.setNome("Cassio");
        Assinante assinante2 = new Assinante(revista);
        assinante2.setNome("Gabriel");
        revista.setEdicao(2);
    }    
}
