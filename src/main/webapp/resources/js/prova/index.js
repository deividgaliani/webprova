$(document).ready(function() {
	
});

//var getProdutos = function(){
//	$.ajax({
//		  url: "/produto_web/produto", 
//		  success: function(result){
//			  var resultado = $.parseJSON(result);
//			  if(resultado.sucesso){
//				  adicionaDadosTabela(resultado.dados);
//			  }else{
//				  alert(resultado.mensagem);
//			  }
//		  }
//	});
//};

//var adicionaDadosTabela = function(produtos){
//	$tblBody = $("#tblProduto tbody");
//	$("#tblProduto tbody tr").remove();
//	$.each(produtos, function(index, produto){
//		$tblBody.append(
//			"<tr>" +
//				"<td>" + produto.id +"</td>" +
//				"<td>" + produto.nome +"</td>" +
//				"<td>" + produto.descricao +"</td>" +
//				"<td>" + produto.valor +"</td>" +
//				"<td>" + produto.descricaoCategoria +"</td>" +
//				"<td><a onclick='excluirProduto(" + produto.id + ")' href='#'>excluir</a>" + 
//				" <a onclick='alterarProduto(" + produto.id + ")' href='#'>alterar</a></td>" +
//			"</tr>"	);
//	});
//}
//
//var excluirProduto = function(id){
//	$.ajax({
//		  url: "/produto_web/produto",
//		  data: {acao: 'excluir', idProduto: id},
//		  type: "POST",
//		  success: function(result){
//			  var resultado = $.parseJSON(result);
//			  if(resultado.sucesso){
//				  getProdutos();
//				  alert("Produto excluido com sucesso");
//			  }else{
//				  alert(resultado.mensagem);
//			  }
//		  }
//	});
//}
//
//var alterarProduto = function(id){
//	$.ajax({
//		  url: "/produto_web/produto",
//		  data: {acao: 'buscar', idProduto: id},
//		  type: "POST",
//		  success: function(result){
//			  var resultado = $.parseJSON(result);
//			  if(resultado.sucesso){
//				  var produto = resultado.dados[0];
//				  $("#idProduto").val(produto.id);
//				  $("#nome").val(produto.nome);
//				  $("#descricao").val(produto.descricao);
//				  $("#valor").val(produto.valor);
//				  $("#categoria").val(produto.categoria);
//				  $('#modalAlterarProduto').modal('show');
//			  }
//		  }
//	});
//}