import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/categoria")
public class Categoria extends HttpServlet{
    
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //protocolo http/https
            //request - é a solicitação do usuario - ex. o usuario acessando end. via chrome
            //response - resposta do servidor ao usuario - ex. carregar a pagina web no chrome
        PrintWriter out = resp.getWriter();
        out.println("Servelet Categoria");
    }
}
