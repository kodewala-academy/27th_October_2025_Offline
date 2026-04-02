<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Rapido - Ride Booking</title>
    <style>
        body {
            margin: 0;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: linear-gradient(to right, #ffcc00, #ff9900);
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .container {
            background: white;
            padding: 40px;
            border-radius: 15px;
            text-align: center;
            box-shadow: 0 10px 25px rgba(0,0,0,0.2);
            width: 350px;
        }

        h2 {
            color: #333;
            margin-bottom: 10px;
        }

        p {
            color: #777;
            margin-bottom: 25px;
        }

        .btn {
            display: inline-block;
            padding: 12px 25px;
            background: #ffcc00;
            color: #333;
            text-decoration: none;
            border-radius: 25px;
            font-weight: bold;
            transition: 0.3s;
        }

        .btn:hover {
            background: #ff9900;
            color: white;
            transform: scale(1.05);
        }

        .logo {
            font-size: 28px;
            font-weight: bold;
            color: #ff9900;
            margin-bottom: 10px;
        }
    </style>
</head>
<body>

<div class="container">
    <div class="logo">Rapido 🚀</div>
    <h2>Ride Booking App</h2>
    <p>Fast, Safe & Affordable rides at your fingertips</p>

    <a href="showPage" class="btn">Sign Up</a>
</div>

</body>
</html>