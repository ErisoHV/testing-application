/**
 * 
 */
$(document).ready(function(){

	 $(".option-menu").click(function(){
		var url = $(this).attr("id");
		$("#view-load").load("views/" + url+".html")
		$(".app-name").html(" Testing Application > " + $(this).html())
		
	 });	 
});


function showAlert(message, type){
	$.notify({
		message: message
	},{
		// settings
		type: type,
		animate: {
			enter: 'animated fadeInDown',
			exit: 'animated fadeOutUp'
		}
	});
}



function validateFormFieldsEmpty(fields){
	if (fields != null && fields.lenght != 0){
		var correct = true;
		$.each(fields, function(i, value){
			if ($("#" + value).val() == null || $("#" + value).val().trim() == ""){
				$("#" + value).parent().addClass("has-error")
				correct = false;
			}else{
				$("#" + value).parent().removeClass("has-error")
				correct = true;
			}
		});
		return correct;
	}
} 

