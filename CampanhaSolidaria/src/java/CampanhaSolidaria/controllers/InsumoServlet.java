
package CampanhaSolidaria.controllers;

import CampanhaSolidaria.model.modelo.Insumo;
import CampanhaSolidaria.model.repositorios.RepositorioInsumos;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

/**
 * @author Suellyn Gomes
 */
public class InsumoServlet extends HttpServlet {

// Método que centraliza o processamento das requisições
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Lógica comum que pode ser compartilhada entre os métodos do GET, POST, PUT, DELETE

        String action = request.getParameter("action");

        // Verifica qual ação foi solicitada
        if (action == null) {
            action = "consultar"; // Padrão, se não for especificado
        }

        switch (action) {
            case "cadastrar":
                cadastrar(request, response);
                break;
            case "consultar":
                consultar(request, response);
                break;
            case "atualizar":
                atualizar(request, response);
                break;
            case "deletar":
                deletar(request, response);
                break;
            default:
                response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Ação não reconhecida.");
                break;
        }
    }

    private void cadastrar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // pegando parametros:
        int codigo = Integer.parseInt(request.getParameter("codigo"));
        String nome = request.getParameter("nome");
        String marca = request.getParameter("marca");
        String categoria = request.getParameter("categoria");

        //criando novo objeto
        Insumo item = new Insumo(codigo, nome, marca, categoria);

        RepositorioInsumos.inserir(item);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/sucess.jsp");
        dispatcher.forward(request, response);  // Encaminha a requisição para o JSP
    }

    private void consultar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //retorna a lista de insumos inteiras
         List<Insumo> listadeinsumos = RepositorioInsumos.lerTudo();
         
         // Adiciona a lista no request
        request.setAttribute("insumos", listadeinsumos);
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("/INSUMOS/consulta.jsp");
        dispatcher.forward(request, response);  // Encaminha a requisição para o JSP 
    }

    private void atualizar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // pegando parametros:
        int codigo = Integer.parseInt(request.getParameter("codigo"));
        String nome = request.getParameter("nome");
        String marca = request.getParameter("marca");
        String categoria = request.getParameter("categoria");

        //criando novo objeto
        Insumo item = new Insumo(codigo, nome, marca, categoria);
         RepositorioInsumos.alterar(item);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/sucess.jsp");
        dispatcher.forward(request, response);  // Encaminha a requisição para o JSP
    }

    private void deletar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         // pegando parametros:
        int codigo = Integer.parseInt(request.getParameter("codigo"));
        RepositorioInsumos.deletar(codigo);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/sucess.jsp");
        dispatcher.forward(request, response);  // Encaminha a requisição para o JSP
    }

// <editor-fold defaultstate="collapsed" desc="metodos originais. Click on the + sign on the left to edit the code.">
//doGet: Usado para consultas.
@Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    processRequest(request, response);
}

//doPost: Usado para criar novos registros.
@Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    processRequest(request, response);
}

//    doPut: Usado para atualizar registros existentes.
@Override
        protected void doPut(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    processRequest(request, response);
}

//    doDelete: Usado para deletar registros.
@Override
        protected void doDelete(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    processRequest(request, response);
        }
}
// </editor-fold>
