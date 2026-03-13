<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Vitória</title>

<style>

body{
    font-family:'Segoe UI', Arial, sans-serif;
    background:linear-gradient(135deg,#0f2027,#203a43,#2c5364);
    color:white;
    text-align:center;
    margin:0;
    display:flex;
    justify-content:center;
    align-items:center;
    height:100vh;
}

.container{
    background:rgba(0,0,0,0.35);
    padding:40px;
    border-radius:15px;
    box-shadow:0 10px 25px rgba(0,0,0,0.5);
    width:400px;
}

h1{
    font-size:42px;
    margin-bottom:10px;
}

p{
    font-size:20px;
    margin-bottom:30px;
}

button{
    padding:12px 30px;
    font-size:18px;
    border:none;
    border-radius:8px;
    background:#1e81b0;
    color:white;
    cursor:pointer;
    transition:0.2s;
}

button:hover{
    background:#42b7e9;
    transform:scale(1.05);
}

</style>

</head>

<body>

<div class="container">

<h1>🏆 Vitória!</h1>

<p>Você destruiu todos os navios inimigos!</p>

<form action="index.jsp" method="get">
<button type="submit">🔄 Jogar novamente</button>
</form>

</div>

</body>
</html>
