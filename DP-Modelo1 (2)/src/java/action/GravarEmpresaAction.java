package action;

import controller.Action;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Contato;
import model.Empresa;
import persistence.ContatoDAO;
import persistence.EmpresaDAO;

public class GravarEmpresaAction implements Action{

    public GravarEmpresaAction() {
    }

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Integer codigo = Integer.parseInt(request.getParameter("textCodigo"));
        String nome = request.getParameter("textNome");       
        if(nome.equals("") || codigo.equals("")) 
        {
            response.sendRedirect("GravarEmpresa.jsp");
        } 
        else 
        {
            Empresa empresa = new Empresa(codigo, nome);
            try
            {
                EmpresaDAO.getInstance().save(empresa);
                response.sendRedirect("Sucesso.jsp");
            }
            catch (SQLException ex)
            {
                response.sendRedirect("Erro.jsp");
                ex.printStackTrace();
            }
        }
    }
    
}
