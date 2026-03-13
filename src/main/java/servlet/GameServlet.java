package servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import model.Game;
import model.Pergunta;
import data.BancoPerguntas;

import java.io.IOException;

@WebServlet("/shoot")
public class GameServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws IOException, ServletException {

        HttpSession session = req.getSession();

        Game game = (Game) session.getAttribute("game");

        if (game == null) {
            game = new Game();
            session.setAttribute("game", game);
        }

        int x = Integer.parseInt(req.getParameter("x"));
        int y = Integer.parseInt(req.getParameter("y"));

        boolean acerto = game.atirar(x,y);

        if(acerto){

            if(game.venceu()){
                req.setAttribute("msg","🏆 Você destruiu todos os navios!");
                req.getRequestDispatcher("vitoria.jsp").forward(req,resp);
                return;
            }

            req.setAttribute("msg","💥 Acertou um navio!");
            req.getRequestDispatcher("tabuleiro.jsp").forward(req,resp);
        } else {

            // gera pergunta
            Pergunta p = BancoPerguntas.getAleatoria();

            // guarda pergunta na sessão
            session.setAttribute("pergunta", p);

            // salva posição do tiro
            session.setAttribute("x", x);
            session.setAttribute("y", y);

            // vai para tela de pergunta
            resp.sendRedirect("pergunta.jsp");
        }
    }
}