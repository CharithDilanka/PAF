<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="css/bootstrap.min.css" rel="stylesheet">
<title>Cart Details</title>
</head>
<body>
<h1>Shopping Cart</h1>
	<div class="form-comtrol">
		<table class="table">
			<thead class="thead-dark">
			<tr>
				<th scope="col">Product ID</th> 
				<th scope="col">Cart ID</th>
				<th scope="col">Product Name</th>
				<th scope="col">Price</th>
			</tr>
			</thead>
		<tbody>
			<tr>
				
			</tr>
		</tbody>
		<div onload="getDetails()">
	<p />
        <div id="title"></div>
	<p />
        <div id="price"></div>
</div>
		</table>
	</div>
</body>
</html>