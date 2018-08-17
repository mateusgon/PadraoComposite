package action;

import controller.Action;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Contato;
import persistence.ContatoDAO;

public class GravarContatoAction implements Action{

    public GravarContatoAction() {
    }

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String nome = request.getParameter("textNome");
        String email = request.getParameter("textEmail");       
        if(nome.equals("") || email.equals("")) 
        {
            response.sendRedirect("index.jsp");
        } 
        else 
        {
            Contato contato = new Contato(nome, email);
            try
            {
                ContatoDAO.getInstance().save(contato);
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
