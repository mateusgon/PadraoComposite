package padraostateandobserver;

import model.Livro;
import model.Usuario;

public class PadraoStateAndObserver {

    public static void main(String[] args) {
        Livro livro = new Livro();
        Usuario usuario = new Usuario(livro);
        usuario.setNome("Mateus");
        livro.emprestar();
        livro.disponibilizar();
    }
    
}
