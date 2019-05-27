function getDetails() {
	jQuery
			.ajax({
				url : "http://localhost:8081/cart/list/",
				type : "GET",
				contentType : "application/json",
				dataType : 'json',
				success : function(data, textStatus, errorThrown) {
					// here is your json.
					// process it
					$("#title").text(data.title);
					$("#price").text(data.price);

				},
				error : function(jqXHR, textStatus, errorThrown) {
					$("#title").text("Sorry! item not found!");
					$("#price").text("");
				},
				timeout : 120000,
			});
};

function addItemIntoCart() {
	jQuery.ajax({
		url : "http://localhost:8081/cart/new" + $("#pid").val() + "/" + $("#pname").val() + "/" + $("#price").val(),
		type : "POST",
		contentType : "application/json",
		dataType : 'json',
		success : function(data, textStatus, errorThrown) {
			// here is your json.
			// process it
			$("#addResult").text("item added sucessfully");
		},
		error : function(jqXHR, textStatus, errorThrown) {
			$("#addResult").text("Sorry! item not added!");
		},
		timeout : 120000,
	});
};

function removeBook() {
	jQuery.ajax({
		url : "http://localhost:8081/cart/delete/" + $("#deleteId").val(),
		type : "DELETE",
		contentType : "application/json",
		dataType : 'json',
		success : function(data, textStatus, errorThrown) {
			$("#deleteResult").text("item deleted sucessfully!");
		},
		error : function(jqXHR, textStatus, errorThrown) {
			$("#deleteResult").text("Sorry! item not deleted!");
		},
		timeout : 120000,
	});
};