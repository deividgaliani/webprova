<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>

<t:principal>
	<jsp:body>
		<div class="p-3">
			<div class="page-header">
				<h1>Bem vindo(a)!</h1>
			</div>
			<p>
				Prova Digital
			</p>

		</div>
		<script src="${pageContext.request.contextPath}/resources/js/prova/index.js"></script>
    </jsp:body>
</t:principal>