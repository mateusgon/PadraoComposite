package persistence;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.Contato;

public class ContatoDAO {

    private static ContatoDAO instance = new ContatoDAO();
    public static ContatoDAO getInstance() {
        return instance;
    }
    
    public void save(Contato contato) throws SQLException, ClassNotFoundException{
        Connection conn = null;
        Statement st = null;
        
        try{
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            st.execute("insert into contato(nome, email, fk_idEmpresa) values ('"+ contato.getNome() +"', '"+ contato.getEmail() +"', "+contato.getCodigoEmpresa()+")");
        } catch(SQLException e){
            throw e;
        } finally{
            closeResources(conn, st);
        }
    }
    
    public void load(Contato contato) throws SQLException, ClassNotFoundException{
        Connection conn = null;
        Statement st = null;
        
        try{
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            ResultSet resultado = st.executeQuery("select email from contato where nome='"+contato.getNome()+"'");
            while (resultado.next())
            {
                String email = resultado.getString("email");
                contato.setEmail(email);
            }
        } catch(SQLException e){
            throw e;
        } finally{
            closeResources(conn, st);
        }
    
    }
    
    public void change (Contato contato) throws SQLException, ClassNotFoundException{
        Connection conn = null;
        Statement st = null;
        
        try{
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            st.execute("update contato set email='"+contato.getEmail()+"' where nome='"+contato.getNome()+"'");
        } catch(SQLException e){
            throw e;
        } finally{
            closeResources(conn, st);
        }
    }
    
    public void delete(Contato contato) throws SQLException, ClassNotFoundException{
        Connection conn = null;
        Statement st = null;
        
        try{
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            st.execute("delete from contato where nome='"+contato.getNome()+"'");
        } catch(SQLException e){
            throw e;
        } finally{
            closeResources(conn, st);
        }
    
    }
    
    public void closeResources (Connection conn, Statement st)
    {
        try{
            if(st!=null) st.close();
            if(conn!=null) conn.close();
        }
        catch (SQLException e){
        
        }
    }
}
