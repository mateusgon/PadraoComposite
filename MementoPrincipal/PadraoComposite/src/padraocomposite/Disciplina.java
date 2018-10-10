package padraocomposite;

import java.util.ArrayList;
import java.util.Iterator;

public class Disciplina {
    
    private ArrayList ementa = new ArrayList();
    
    public void addConteudo (Conteudo conteudo)
    {
        ementa.add(conteudo);
    }
    
    public void listarEmenta()
    {
        String descricaoEmenta = "";
        for (Iterator i = ementa.iterator();i.hasNext();)
        {
            Conteudo conteudo = (Conteudo)i.next();
            descricaoEmenta = descricaoEmenta + conteudo.getDescricao();
        }
        System.out.println(descricaoEmenta);
    }
}
