package com.form.atp057.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import com.form.atp057.models.ContaCorrente;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/contacorrente")
public class ContaCorrenteServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        PrintWriter out = resp.getWriter();
        ContaCorrente cont = new ContaCorrente();
       
        String descricao = req.getParameter("descricao");
         
        if(descricao != null && descricao != null){
            cont.setDescricao("descricao");        
            out.printf("Conta Corrente Funcionou: %s", cont.getDescricao());
        }else{
            out.printf("Conta Corrente: %s", cont.getDescricao());
        }

    }
}
