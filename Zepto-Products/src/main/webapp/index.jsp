<!DOCTYPE html>
<html>
<head>
    <title>Zepto Product - Reseller</title>

    <style>
        body {
            font-family: Arial, sans-serif;
            background: linear-gradient(to right, #6a11cb, #2575fc);
            margin: 0;
            padding: 0;
        }

        .container {
            width: 400px;
            margin: 80px auto;
            background: #fff;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0px 8px 20px rgba(0,0,0,0.2);
        }

        h2 {
            text-align: center;
            color: #333;
            margin-bottom: 25px;
        }

        label {
            font-weight: bold;
            display: block;
            margin-bottom: 5px;
            color: #555;
        }

        input[type="text"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 5px;
            transition: 0.3s;
        }

        input[type="text"]:focus {
            border-color: #2575fc;
            outline: none;
            box-shadow: 0 0 5px rgba(37,117,252,0.5);
        }

        input[type="submit"] {
            width: 100%;
            padding: 12px;
            background: #6a11cb;
            color: white;
            border: none;
            border-radius: 5px;
            font-size: 16px;
            cursor: pointer;
            transition: 0.3s;
        }

        input[type="submit"]:hover {
            background: #2575fc;
        }
    </style>
</head>

<body>

<div class="container">
    <h2>🛒 Zepto Product - Reseller</h2>

    <form action="uploadProduct" method="post">
        
        <label>Product Name</label>
        <input type="text" name="productName">

        <label>Product Quantity</label>
        <input type="text" name="qty">

        <label>Product Description</label>
        <input type="text" name="description">

        <label>Product Price</label>
        <input type="text" name="price">

        <label>Sold By</label>
        <input type="text" name="soldBy">

        <input type="submit" value="Upload Product">

    </form>
</div>

</body>
</html>