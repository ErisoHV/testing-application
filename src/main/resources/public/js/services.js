/**
 * 
 */

function processForm(data, url, type, onSuccess, onError){
	event.preventDefault();
    
    $.ajax({
		url: url,
		type: type,
		contentType: "application/json; charset=utf-8",
	    data: JSON.stringify(data),
	    dataType: 'json'
	})
	.done(onSuccess)
	.fail(onError);
}


function getService(url, onSuccess, onError){
	$.get(url)
	.done(onSuccess)
	.fail(onError);
}


function loadSelectionList(data, select, namePropertie){
	  var select = $(select);
	  
	  var applications;
	  if(data._embedded != null)
	  	applications = data._embedded[namePropertie];

	  $.each(applications, function(){
		  select.append($('<option>').text(this.name).attr('value', this.id));
		  
	  }) 
}


function loadSelectionListFromSelection(url, selectionFrom, selectionTo, nameFrom, elementList){
	var cUrl = url + $(selectionFrom).val() + "/" + nameFrom;
	getService(cUrl, function(data){loadSelectionList(data, selectionTo, elementList)}, null);
}

function loadSelectionListOnChange(url, selectionFrom, selectionTo, nameFrom, elementList){
	
	 $(selectionTo).children().remove();
	 $(selectionTo).append('<option></option>');
	 loadSelectionListFromSelection(url, selectionFrom, selectionTo, nameFrom, elementList);
	
}
