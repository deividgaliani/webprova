<%@tag description="Overall Page template" pageEncoding="UTF-8"%>
<%@attribute name="header" fragment="true"%>
<%@attribute name="footer" fragment="true"%>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>WEB Provas</title>

    <!-- Bootstrap core CSS -->
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
	
	<script src="${pageContext.request.contextPath}/resources/js/jquery-3.4.1.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/popper.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        -ms-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
    </style>
  </head>

<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
	  <a class="navbar-brand" href="${pageContext.request.contextPath}/prova/index">Inicio</a>
	  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#conteudoNavbarSuportado" aria-controls="conteudoNavbarSuportado" aria-expanded="false" aria-label="Alterna navegação">
	    <span class="navbar-toggler-icon"></span>
	  </button>
	
	  <div class="collapse navbar-collapse" id="conteudoNavbarSuportado">
	    <ul class="navbar-nav mr-auto">
    	  <li class="nav-item">
	        <a class="nav-link" href="${pageContext.request.contextPath}/prova/cadastroProva">Cadastro Prova<span class="sr-only"></span></a>
	      </li>
	    </ul>
	  </div>
	</nav>
	<div id="body">
		<jsp:doBody />
	</div>
	<div id="pagefooter">
		<!-- FOOTER -->
<!-- 		<footer class="container"> -->
<!-- 			<p>&copy; WEB Provas. &middot;</p> -->
<!-- 		</footer> -->
	</div>
	
</body>
</html>
