<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Confirmation</title>

<style>
	body {
		font-family: Arial, sans-serif;
		background: #f5f6fa;
		margin: 0;
		padding: 0;
	}

	.container {
		width: 400px;
		margin: 80px auto;
		background: #fff;
		padding: 25px;
		border-radius: 10px;
		box-shadow: 0 4px 12px rgba(0,0,0,0.1);
		text-align: center;
	}

	h2 {
		color: #2ecc71;
		margin-bottom: 20px;
	}

	.info {
		background: #f1f2f6;
		padding: 10px;
		border-radius: 5px;
		margin-bottom: 20px;
		font-size: 14px;
	}

	.info span {
		font-weight: bold;
		color: #2f3542;
	}

	input[type="text"] {
		width: 90%;
		padding: 10px;
		margin-top: 10px;
		border: 1px solid #ccc;
		border-radius: 5px;
	}

	input[type="submit"] {
		margin-top: 15px;
		padding: 10px 20px;
		background: #6c5ce7;
		color: white;
		border: none;
		border-radius: 5px;
		cursor: pointer;
		font-size: 14px;
	}

	input[type="submit"]:hover {
		background: #5a4bd6;
	}

	.success {
		color: green;
		font-weight: bold;
	}
</style>

</head>
<body>

	<div class="container">
		<h2>✅ Product Uploaded</h2>

		<div class="info">
			Product ID : <span>${response.productId}</span><br>
			Message : <span class="success">${response.confirmationMsg}</span>
		</div>

		<form action="checkProductStatus">
			<h3>Check Product Status</h3>
			<input type="text" name="productId" placeholder="Enter Product ID">
			<br>
			<input type="submit" value="Check Status">
		</form>
	</div>

</body>
</html>