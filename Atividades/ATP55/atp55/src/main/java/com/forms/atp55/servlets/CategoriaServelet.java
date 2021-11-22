package com.forms.atp55.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import com.forms.atp55.models.Categoria;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/categoria")
public class CategoriaServelet extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Categoria categoria = new Categoria();

        categoria.setNome(req.getParameter("nome"));
        categoria.setDescricao(req.getParameter("descricao"));

        PrintWriter out = resp.getWriter();
        out.printf("Categoria == Nome: %s == Descrição: %s", categoria.getNome(), categoria.getDescricao());
    }

    


    
}
