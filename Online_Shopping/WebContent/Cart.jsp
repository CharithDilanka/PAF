<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, inicial-scale=1">
<link href="css/bootstrap.min.css" rel="stylesheet">
<script src="js/jquery-3.4.0.min.js" type="text/javascript"></script>
<title>Add Cart</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<script src="cart.js"></script>

</head>
<body>
<div class="form-group">
	<label for="pid">Product ID:</label>
	<input type="text" class="form-control" id="pid" placeholder="Enter Product ID" required>
</div>	
<div class="form-group">
	<label for="pname">Product Name:</label>
	<!-- <input type="text" id="pname" placeholder="Enter Product Name" required> -->
	<select class="form-control" id="exampleFormControlSelect1">
      <option>Notepad</option>
      <option>Desktop</option>
      <option>Palmtop</option>
      <option>Nokia</option>
      <option>Samsung</option>
    </select>
</div>
<div class="form-group">	
	<label for="price">Price:</label>
	<input type="text" class="form-control" id="price" placeholder="Enter Price" required>
	<br><br>
	
	<button type="button" class="btn btn-primary" name="addcart" onClick="addItemIntoCart()">Add Cart</button>
	<div id="addResult"></div>
</div>


</body>
</html>