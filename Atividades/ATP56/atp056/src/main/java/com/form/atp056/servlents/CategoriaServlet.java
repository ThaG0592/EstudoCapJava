package com.form.atp056.servlents;


import java.io.IOException;
import java.io.PrintWriter;

import com.form.atp056.dao.CategoriaDao;
import com.form.atp056.models.Categoria;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/categoria")
public class CategoriaServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CategoriaDao dao = new CategoriaDao();
        Categoria model = new Categoria();

        model.setNome(req.getParameter("nome"));
        model.setDescricao(req.getParameter("descricao"));
        int id = dao.insert(model);

        model.setId(id);

        PrintWriter out = resp.getWriter();
        out.printf("Categoria Salva com sucesso XML - Id gerado %d", model.getId());
    }
    
}