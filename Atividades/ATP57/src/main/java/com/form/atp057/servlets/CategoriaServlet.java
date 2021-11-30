package com.form.atp057.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;

import com.form.atp057.models.Categoria;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/categoria")
public class CategoriaServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServerException, IOException{
        Categoria cat = new Categoria();
        cat.setNome(req.getParameter("nome"));
        
        PrintWriter out = resp.getWriter();
        out.printf("Categoria: %s", cat.getNome());

    }
    
}
