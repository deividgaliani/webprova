<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>

<t:principal>
	<jsp:body>
		<style>
			.form-check{
				padding: 5px;
			}
			.input-group{
				padding: 5px;
			}
		</style>
		<h3 class="col">Cadastro de prova</h3>
		
		<form id="formProva" class="col col-6">
        
		  <div class="form-group col col-12">
		    <label for="nome">Título</label>
		    <input type="text" class="form-control question-form" id="titulo" name="titulo">
		  </div>
		  
		  <hr/>
		  <h6>Questões</h6>
		  
		  <div id="containerQuestoes">
		  	<div id="questao1">
			  <div class="form-group col col-12">
			    <label>Pergunta</label>
			    <div class="input-group">
				    <input type="text" class="form-control question-form" name="pergunta">
				    <span class="input-group-btn">
					    <button type="button" id="btnNovaQuestao" class="btn btn-primary"> + </button>
				    </span>
				</div>
				
				<div class="form-group col col-12">
					
					<div class="input-group">
					  <div class="input-group-prepend">
					    <div class="input-group-text">
					    <input type="radio" name="questao1" class="question-form">
					    </div>
					  </div>
					  <input type="text" class="form-control question-form" name="questao1">
					  <button type="button" id="btnNovaAlternativa" class="btn btn-primary btnNovaAlternativa"> + </button>
					</div>
					
			  	</div>
			  </div>
			</div>
		  </div>
		  		  
		  <div class="col col-12" style="text-align: right;">
			  <button type="button" id="btnCadastrarProva" class="btn btn-success">Cadastrar Prova</button>
		  </div>
		</form>
		
		<script src="${pageContext.request.contextPath}/resources/js/prova/cadastroProva.js"></script>
    </jsp:body>
</t:principal>