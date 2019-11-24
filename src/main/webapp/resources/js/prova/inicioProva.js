//var TEMPLATE_QUESTAO = 
//	'<hr><div id="questao[Q_NUMBER]"><div class="form-group col col-12"><label>Pergunta</label><div class="form-group">' +
//	'<input type="text" class="form-control question-form" name="pergunta"></div><div class="form-group col col-12">' +
//	'<div class="input-group"><div class="input-group-prepend"><div class="input-group-text"><input type="radio" name="questao[Q_NUMBER]" class="question-form"></div></div>' +
//	'<input type="text" class="form-control question-form" name="questao[Q_NUMBER]"><button type="button" id="btnNovaAlternativa" class="btn btn-primary btnNovaAlternativa"> + </button></div></div></div></div>';
//
//var TEMPLATE_ALTERNATIVA = '<div class="input-group"> <div class="input-group-prepend"><div class="input-group-text">' +
//  '<input type="radio" name="[ALTERNATIVA_NAME]" class="question-form"></div></div><input type="text" class="form-control question-form" name="[ALTERNATIVA_NAME]"></div>';

$(document).ready(function() {
	recuperarProva(idProva);
	
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
}