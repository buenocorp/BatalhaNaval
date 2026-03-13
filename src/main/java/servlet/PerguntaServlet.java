package servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import model.Pergunta;

import java.io.IOException;

@WebServlet("/responder")
public class PerguntaServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws IOException, ServletException {

        HttpSession session = req.getSession();

        Pergunta p = (Pergunta) session.getAttribute("pergunta");
        
        if(p == null){
            resp.sendRedirect("tabuleiro.jsp");
            return;
        }

        int resposta = Integer.parseInt(req.getParameter("resposta"));

        if (resposta == p.getResposta()) {
            req.setAttribute("msg", "✔ Resposta correta! Continue jogando.");
        } else {
            req.setAttribute("msg", "❌ Resposta errada! Perdeu a vez.");
        }

        session.removeAttribute("pergunta");

        req.getRequestDispatcher("tabuleiro.jsp").forward(req, resp);
    }
}