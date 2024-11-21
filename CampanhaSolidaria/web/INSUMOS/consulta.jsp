<%-- 
    Document   : consulta
    Created on : Nov 20, 2024, 6:17:56 PM
    Author     : Suellyn Gomes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CONSULTA DE INSUMOS</title>
        <link rel="stylesheet" type="text/css" href="<%= request.getContextPath()%>/STYLES/consulta-style.css">
        <style>
            @import url('https://fonts.googleapis.com/css2?family=Bungee&display=swap');
        </style>
    </head>
    <body>
        <h1>LISTA DE INSUMOS</h1>
        <button onclick="window.location.href = 'index.html'">Voltar</button>

        <div>
            <table border="1">
                <thead>
                    <tr>
                        <th>Código</th>
                        <th>Nome</th>
                        <th>Marca</th>
                        <th>Categoria</th>
                    </tr>
                </thead>
                <tbody>
                    <!-- Itera sobre a lista de ONGs -->
                    <c:forEach var="insu" items="${insumos}">
                        <tr>
                            <td>${insu.getCodigo()}</td>
                            <td>${insu.getNome()}</td>
                            <td>${insu.getMarca()}</td>
                            <td>${insu.getCategoria()}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </body>
</html>
