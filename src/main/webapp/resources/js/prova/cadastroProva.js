var TEMPLATE_QUESTAO = 
	'<hr><div id="questao[Q_NUMBER]"><div class="form-group col col-12"><label>Pergunta</label><div class="form-group">' +
	'<input type="text" class="form-control question-form" name="pergunta"></div><div class="form-group col col-12">' +
	'<div class="input-group"><div class="input-group-prepend"><div class="input-group-text"><input type="radio" name="questao[Q_NUMBER]" class="question-form"></div></div>' +
	'<input type="text" class="form-control question-form" name="questao[Q_NUMBER]"><button type="button" id="btnNovaAlternativa" class="btn btn-primary btnNovaAlternativa"> + </button></div></div></div></div>';

var TEMPLATE_ALTERNATIVA = '<div class="input-group"> <div class="input-group-prepend"><div class="input-group-text">' +
  '<input type="radio" name="[ALTERNATIVA_NAME]" class="question-form"></div></div><input type="text" class="form-control question-form" name="[ALTERNATIVA_NAME]"></div>';

var qNumber = 1;

$(document).ready(function() {
	loadEventsClick();
});

var loadEventsClick = function(){
	$(".btnNovaAlternativa").off('click');
	$(".btnNovaAlternativa").on('click', function(){
		let $container = $(this).parent().parent();
		let qId = $(this).parent().parent().parent().parent().attr('id');
		$container.append(TEMPLATE_ALTERNATIVA.replace('[ALTERNATIVA_NAME]', qId).replace('[ALTERNATIVA_NAME]', qId));
	});

	$("#btnNovaQuestao").off('click');
	$("#btnNovaQuestao").on('click', function(){
		let $container = $(this).parent().parent().parent().parent().parent();
		let numQuestao = ++qNumber;
		$container.append(TEMPLATE_QUESTAO.replace('[Q_NUMBER]', numQuestao).replace('[Q_NUMBER]', numQuestao).replace('[Q_NUMBER]', numQuestao));
		loadEventsClick();
	});
	
	$("#btnCadastrarProva").off('click');
	$("#btnCadastrarProva").on('click', function(){
		let prova = getJsonValues();
		salvarProva(prova);
	});
}

var getJsonValues = function(){
	let prova = {
			titulo: $("#titulo").val(),
			questoes: []
	};

	for(let i = 1; i <= qNumber; i++){
		let questao = {
				pergunta: '',
				alternativas: []
		};
		let $alternativasQuestao = $("#questao" + i).find("input[type='text']");
		let $radioBtns = $("#questao" + i).find("input[type='radio']");
		$alternativasQuestao.each(function(j){
			let alternativa = {};
			if(j == 0){
				questao.pergunta = this.value;
			}else{
				alternativa.nroAlternativa = j;
				alternativa.texto = this.value;
				alternativa.alternativaCorreta = false;
				questao.alternativas.push(alternativa);
			}
		});
		
		$radioBtns.each(function(j){
			if(this.checked){
				questao.alternativas[j].alternativaCorreta = true;
			}
		});
		prova.questoes.push(questao);
	}
	return prova;
}

var salvarProva = function(prova){
	$.ajax({
        url: "/prova/salvar",
        contentType: "application/json; charset=utf-8",
        type: 'POST',
        data: JSON.stringify(prova),
        success: function(resultado){
        	if(resultado.sucesso){
        		alert("Prova inserida com sucesso");
        	}else{
        		alert(resultado.mensagem);
        	}
        }
	});
}