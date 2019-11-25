var TEMPLATE_QUESTAO = 
	'<hr><div><div class="form-group col col-12"><h5>Questão [PERGUNTA_N]</h5><label><b>[Q_PERGUNTA]</b></label></div>';

var TEMPLATE_ALTERNATIVA = 
	'<div class="col"><input type="radio" name="[ALTERNATIVA_NAME]" class="question-form" id="[ID_RADIO]" value="[ID_ALTERNATIVA]"><label for="[ID_RADIO]">[ALTERNATIVA_TXT]</label></div>';

$(document).ready(function() {
	recuperarProva(idProva);
	
	$("#btnEntregarProva").off('click');
	$("#btnEntregarProva").on('click', function(){
		let respostas = recuperarRespostasPreenchidas();
		entregarProva(idProva, respostas);
	});
});

var recuperarProva = function(id){
	$.ajax({
        url: "/prova/recuperarProva",
        type: 'GET',
        data: {idProva: id},
        success: function(resultado){
        	if(resultado.sucesso){
        		montaViewProva(resultado.dado);
        	}else{
        		alert(resultado.mensagem);
        	}
        }
	});
}

var montaViewProva = function(prova){
	$("#tituloProva").html(prova.titulo);
	
	prova.questoes.forEach(function(e, i){
		let template = TEMPLATE_QUESTAO.replace('[PERGUNTA_N]', (i + 1)).replace('[Q_PERGUNTA]', e.pergunta);
		var idQuestao = e.id;
		var templateAlternativas = '';
		e.alternativas.forEach(function(el, index){
			templateAlternativas += TEMPLATE_ALTERNATIVA
					.replace('[ALTERNATIVA_NAME]', idQuestao)
					.replace('[ALTERNATIVA_TXT]', el.texto)
					.replace('[ID_RADIO]', '' + idQuestao + el.nroAlternativa)
					.replace('[ID_RADIO]', '' + idQuestao + el.nroAlternativa)
					.replace('[ID_ALTERNATIVA]', el.idAlternativa);
		});
		
		template += templateAlternativas + '</div>';		
		$("#containerProva").append(template);
	});
}

var recuperarRespostasPreenchidas = function(){
	let $respostas = $("input:checked");
	let idsRespostas = [];
	$respostas.each(function(i, e){
		idsRespostas.push(e.value);
	});
	return idsRespostas;
}

var entregarProva = function(provaId, questoes){
	let prova = {};
	prova.idProva = provaId;
	prova.respostas = questoes;
	$.ajax({
        url: "/prova/entregarProva",
        contentType: "application/json; charset=utf-8",
        type: 'POST',
        data: JSON.stringify(prova),
        success: function(resultado){
        	if(resultado.sucesso){
        		alert("sucesso");
        	}else{
        		alert(resultado.mensagem);
        	}
        }
	});
}