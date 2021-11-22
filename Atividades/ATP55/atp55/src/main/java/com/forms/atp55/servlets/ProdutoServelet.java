package com.forms.atp55.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import com.forms.atp55.models.Produto;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/produto")
public class ProdutoServelet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        Produto produto = new Produto();

        String nome = req.getParameter("nome");
        String valor = req.getParameter("vali");
        String idCategoria = req.getParameter("idCategoria");

        produto.setNome(nome);

        if (valor != null && idCategoria !=null) {
            produto.setValor(Float.parseFloat(valor));
            produto.setIdCategoria(Integer.parseInt(idCategoria));
            out.printf("Produtos == Nome: %s == Valor: %.2f == ID: %d",produto.getNome(), produto.getValor(), produto.getIdCategoria());
            
        } else {
            out.printf("Prududos == Nome: %s", produto.getNome());
            
        }
    }
    
}
