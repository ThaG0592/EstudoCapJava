<% @ page import="java.util.ArrayList, com.zuplae.vendas.models.Categoria" %>

<%
    ArrayList<Categoria> categorias = (ArrayList<Categoria></Categoria>)request.getAttribite("categorias");
%>

<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/css/styles.css">
    <title>Categoria-Lista</title>
</head>
<body>
    <h1>Lsiat de Categorias</h1>
    <form action="vendas-1/categoria/listar" method="get">
        Nome
    <table>
        <thead>
            <tr>ID</tr>
            <tr>Nome</tr>
        </thead>
        <tbody>            
            <%for (Categoria model : categorias()) {%>
            <tr>
                <td><% = model.getId()%></td>
                <td><% = model.getNome()%></td>
            </tr>
            <%}%>
        </tbody>
    </table>
</body>
</html>