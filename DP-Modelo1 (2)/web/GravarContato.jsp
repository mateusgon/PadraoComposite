<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Cadastro de Contatos</h1>
        <form action="FrontController?action=GravarContato" method="post">
            Entre com seu nome
            <input type="text" name="textNome"/><br/>
            Entre com seu email
            <input type="text" name="textEmail"/><br/>
            Empresa
            <select>
                <option value="1" name="valor">Volvo</option>
                <option value="2" name="valor">Saab</option>
                <option value="3" name="valor">Mercedes</option>
                <option value="4" name="valor">Audi</option>
            </select> <br/>
            <input type="submit"/>
        </form>    
    </body>
</html>
