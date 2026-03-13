<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="model.Game"%>

<%
Game game = (Game) session.getAttribute("game");

if (game == null) {
	game = new Game();
	session.setAttribute("game", game);
}

boolean[][] shots = game.getShots();
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Batalha Naval</title>

<style>
body {
	font-family: 'Segoe UI', Arial, sans-serif;
	background: linear-gradient(135deg, #0f2027, #203a43, #2c5364);
	color: white;
	text-align: center;
	margin: 0;
}

h1 {
	margin-top: 30px;
	font-size: 40px;
	letter-spacing: 2px;
}

.panel {
	background: rgba(0, 0, 0, 0.35);
	padding: 15px;
	border-radius: 12px;
	width: 350px;
	margin: 20px auto;
	font-size: 18px;
	box-shadow: 0 6px 15px rgba(0, 0, 0, 0.4);
}

.board {
	margin: auto;
	margin-top: 20px;
	border-collapse: collapse;
}

.board td {
	width: 65px;
	height: 65px;
	border: 2px solid #144d73;
	background: linear-gradient(#1e81b0, #0b5e8a);
	transition: all 0.2s;
	position: relative;
}

.board td:hover {
	background: #42b7e9;
	transform: scale(1.05);
}

button {
	width: 100%;
	height: 100%;
	border: none;
	background: transparent;
	font-size: 26px;
	cursor: pointer;
}

button:hover {
	background: rgba(255, 255, 255, 0.15);
}

.hit {
	background: #d90429 !important;
	font-size: 30px;
	display: flex;
	justify-content: center;
	align-items: center;
}

.miss {
	background: #90e0ef !important;
	font-size: 24px;
	display: flex;
	justify-content: center;
	align-items: center;
}

.footer {
	margin-top: 30px;
	opacity: 0.7;
	font-size: 14px;
}
</style>
</head>

<body>

	<h1>⚓ Batalha Naval</h1>

	<div class="panel">
		<%=request.getAttribute("msg") != null ? request.getAttribute("msg") : "Clique em um alvo para atacar!"%>
	</div>

	<table class="board">

		<%
		int size = shots.length;
		for (int i = 0; i < size; i++) {
		%>

		<tr>

			<%
			for (int j = 0; j < size; j++) {
			%>

			<td>
				<%
				if (shots[i][j]) {

					if (game.hasShip(i, j)) {
				%>

				<div class="hit">💥</div> <%
 } else {
 %>

				<div class="miss">🌊</div> <%
 }

 } else {
 %>

				<form action="shoot" method="post">

					<input type="hidden" name="x" value="<%=i%>"> <input
						type="hidden" name="y" value="<%=j%>">

					<button type="submit">🎯</button>

				</form> <%
}
%>

			</td>

			<%
}
%>

		</tr>

		<%
}
%>

	</table>

</body>
</html>