$(document).ready(function() {
	$("#tblProvas").DataTable({
		ajax: {
			url: '/prova/recuperarProvasAluno',
			dataSrc: ''
		},
		columns: [				
			{ data: 'titulo' },
	        { data: 'qtdQuestoes' },
	        { data: 'id', 
	        	render: function(data, type, full, meta){
	        		return '<button type="button" class="btnInicioProva btn-xs btn-success">Iniciar prova</button>';
	        	} 
	        }
		],
		"initComplete": function( settings, json ) {
			$(".btnInicioProva").off('click');
			$(".btnInicioProva").on('click', function(){
				let id = $('#tblProvas').DataTable().row( $(this).parent().parent() ).data().id;
				window.location.href = `/prova/inciarProva/?id=${id}`
			});
		}
	});
	
});