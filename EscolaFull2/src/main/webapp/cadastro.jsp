<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>Tela de Cadastro</title>
  <link rel="stylesheet" href="java/style.css.css" type="text/css">
</head>
<body>
  <div id="main-container">
    <h1>Tela de Cadastro</h1>
    <form id="register-form" method="post" action="EscolaFull2/">
      
      <div class="half-box spacing">
          <label for="name">Nome</label>
          <input type="text" name="name" id="name" placeholder="Digite seu nome" value="${aluno.nome}" data-required data-min-length="3" data-max-length="16">
      </div>
      <div class="full-box">
        <label for="email">E-mail</label>
        <input type="email" name="email" id="email" placeholder="Digite seu e-mail" value="${aluno.e-mail}" data-min-length="2" data-email-validate>
      </div>
      <div class="half-box spacing">
        <label for="dataCadastro">Data de Cadastro</label>
        <input type="number" name="dataCadastro" id="dataCadastro" placeholder="Digite a data de hoje  "value="${aluno.dataCadastro}" data-required data-min-length="3" data-max-length="16">

      </div>
      <div class="half-box spacing">
        <label for="telefone">telefone</label>
        <input type="number" name="telefone" id="Telefone" placeholder="Digite seu número de telefone"value="${aluno.telefone}" data-required data-min-length="3" data-max-length="16">

    </div>

      
      
     
      
      <div class="full-box">
        <input id="btn-submit" type="submit" value="Registrar">
      </div>
    </form>
  </div>
  <p class="error-validation template"></p>
  <script src="js/scripts.js"></script>
</body>
</html>