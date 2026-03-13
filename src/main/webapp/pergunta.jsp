<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="model.Pergunta"%>

<%
Pergunta p = (Pergunta) session.getAttribute("pergunta");
String[] opcoes = p.getOpcoes();
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Pergunta</title>

<style>

body{
    font-family: Arial;
    background: linear-gradient(135deg,#141e30,#243b55);
    color:white;
    display:flex;
    justify-content:center;
    align-items:center;
    height:100vh;
}

.card{
    background:rgba(0,0,0,0.4);
    padding:40px;
    border-radius:12px;
    width:420px;
    text-align:center;
}

.opcao{
    margin:10px 0;
    text-align:left;
}

button{
    margin-top:20px;
    padding:10px 25px;
    border:none;
    background:#00b4d8;
    color:white;
    border-radius:6px;
    cursor:pointer;
}

button:hover{
    background:#0077b6;
}

</style>

</head>

<body>

<div class="card">

<h2>💦 Você errou o tiro!</h2>

<h3><%= p.getPergunta() %></h3>

<form action="responder" method="post">

<%
for(int i=0;i<opcoes.length;i++){
%>

<div class="opcao">
<label>
<input type="radio" name="resposta" value="<%=i%>" required>
<%= opcoes[i] %>
</label>
</div>

<%
}
%>

<button type="submit">Responder</button>

</form>

</div>

</body>
</html>