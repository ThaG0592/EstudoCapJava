package com.zuplae.vendas.servlents;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import com.zuplae.vendas.dao.CategoriaDao;
import com.zuplae.vendas.models.Categoria;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/categoria/listar")
public class CategoriaReadServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //PrintWriter out = resp.getWriter();
        CategoriaDao dao =  new CategoriaDao();
        //for (Categoria model : dao.read()) {
        //    out.printf("%d - %s \n", model.getId(), model.getNome());
        //}
        ArrayList<Categoria> categorias =  dao.read();
        req.setAttribute("categoria", categorias);
        RequestDispatcher rd = req.getRequestDispatcher("/categoria-lista.jsp");
        rd.forward(req, resp);
    }
}