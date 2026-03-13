<%@ page import="model.Game"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
Game game = new Game();
session.setAttribute("game", game);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Batalha Naval</title>

<style>
body {
	font-family: Arial, Helvetica, sans-serif;
	background: linear-gradient(135deg, #0f2027, #203a43, #2c5364);
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
	margin: 0;
	color: white;
}

.card {
	background: rgba(0, 0, 0, 0.4);
	padding: 50px;
	border-radius: 15px;
	text-align: center;
	width: 400px;
	box-shadow: 0 10px 25px rgba(0, 0, 0, 0.5);
}

h1 {
	margin-bottom: 10px;
}

p {
	margin-bottom: 30px;
	font-size: 18px;
}

button {
	background: #00b4d8;
	border: none;
	padding: 15px 35px;
	font-size: 18px;
	border-radius: 8px;
	color: white;
	cursor: pointer;
	transition: 0.3s;
}

button:hover {
	background: #0077b6;
	transform: scale(1.08);
}
</style>

</head>

<body>

	<div class="card">

		<h1>⚓ Batalha Naval</h1>

		<p>Bem-vindo ao jogo!</p>

		<form action="tabuleiro.jsp">
			<button type="submit">🎮 Iniciar Jogo</button>
		</form>

	</div>

</body>
</html>