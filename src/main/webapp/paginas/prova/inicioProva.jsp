<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<script>var idProva = "<%=request.getAttribute("idProva")%>"</script>

<t:principal>
	<jsp:body>
		<script src="${pageContext.request.contextPath}/resources/js/prova/inicioProva.js"></script>
		<h2 id="tituloProva" class="col">Prova</h2>
		
		<div id="containerProva" class="col col-6"></div>
		
		<div class="col col-6" style="text-align: right;">
			<button type="button" id="btnEntregarProva" class="btn btn-success">Entregar Prova</button>
	  	</div>
	  	
	  	<!-- Modal Resultados-->
		<div class="modal fade" id="modalResultadoProva" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
		  <div class="modal-dialog" role="document">
		    <div class="modal-content">
		      <div class="modal-header">
		        <h5 class="modal-title" id="exampleModalLabel">Resultado prova</h5>
		        <button type="button" class="close" data-dismiss="modal" aria-label="Fechar">
		          <span aria-hidden="true">&times;</span>
		        </button>
		      </div>
		      <div id="modalContainer" class="modal-body">
		      </div>
		      <div class="modal-footer">
		        <button type="button" id="btnFecharModal" class="btn btn-secondary" data-dismiss="modal">Fechar</button>
		      </div>
		    </div>
		  </div>
		</div>
		
    </jsp:body>
</t:principal>