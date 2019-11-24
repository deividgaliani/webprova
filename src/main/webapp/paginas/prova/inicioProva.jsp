<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<script>var idProva = "<%=request.getAttribute("idProva")%>"</script>

<t:principal>
	<jsp:body>
		<script src="${pageContext.request.contextPath}/resources/js/prova/inicioProva.js"></script>
		<h2 id="tituloProva" class="col">Prova</h2>
		

    </jsp:body>
</t:principal>