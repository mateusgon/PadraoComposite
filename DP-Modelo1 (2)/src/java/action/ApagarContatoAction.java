package action;

import controller.Action;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Contato;
import persistence.ContatoDAO;

public class ApagarContatoAction implements Action{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String nome = request.getParameter("textNome");
        if(nome.equals("")) 
        {
            response.sendRedirect("ApagarContato.jsp");
        } 
        else 
        {
            Contato contato = new Contato(nome, null);
            try
            {
                ContatoDAO.getInstance().delete(contato);
                response.sendRedirect("contatoSucesso.jsp");
            }
            catch (SQLException ex)
            {
                response.sendRedirect("contatoErro.jsp");
                ex.printStackTrace();
            }
        }
    }
    
}
