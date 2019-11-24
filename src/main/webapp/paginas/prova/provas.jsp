<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>

<t:principal>
	<jsp:body>
		<h2 class="col">Provas</h2>
		<script src="${pageContext.request.contextPath}/resources/js/prova/provas.js"></script>
		
		<table id="tblProvas" class="table table-bordered table-striped">
			<thead>
			  <tr>
			    <th>Título</th>
			    <th>Qtd questões</th>
			    <th>Ações</th>
			  </tr>
			</thead>
		  	<tbody></tbody>
		</table>

    </jsp:body>
</t:principal>