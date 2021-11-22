import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns ="/categoria")
public class Categoria extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        
        String descricao = req.getParameter("descricao");
        String parameterId = req.getParameter("ID");

        if(parameterId != null){
            int id = Integer.parseInt(parameterId);
            out.printf("%d // %s ",id, descricao);
        }else{
            out.printf("%s ",descricao);
        }
    }
    
}
