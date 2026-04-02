<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Rapido - Book Ride!</title>

<style>
    body {
        margin: 0;
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background: #f5f5f5;
    }

    .header {
        background: #ffcc00;
        padding: 15px;
        text-align: center;
        font-size: 22px;
        font-weight: bold;
    }

    .container {
        padding: 20px;
        text-align: center;
    }

    .success {
        color: green;
        font-weight: bold;
        margin-bottom: 20px;
    }

    .rides {
        display: flex;
        justify-content: center;
        gap: 20px;
        flex-wrap: wrap;
    }

    .card {
        background: white;
        width: 220px;
        padding: 20px;
        border-radius: 15px;
        box-shadow: 0 5px 15px rgba(0,0,0,0.2);
        transition: 0.3s;
    }

    .card:hover {
        transform: scale(1.05);
    }

    .ride-title {
        font-size: 18px;
        font-weight: bold;
        margin-bottom: 10px;
    }

    .price {
        color: #ff9900;
        font-weight: bold;
        margin-bottom: 15px;
    }

    .btn {
        padding: 10px 15px;
        background: #ffcc00;
        border: none;
        border-radius: 20px;
        cursor: pointer;
        font-weight: bold;
        transition: 0.3s;
    }

    .btn:hover {
        background: #ff9900;
        color: white;
    }
</style>

</head>
<body>

<div class="header">Rapido 🚀</div>

<div class="container">
    <div class="success">✅ Signup Successful!</div>
    <h3>Select Your Ride</h3>

    <div class="rides">

        <div class="card">
            <div class="ride-title">Bike</div>
            <div class="price">₹50 - ₹120</div>
            <form action="bookRide">
                <input type="hidden" name="rideType" value="Bike">
                <button class="btn">Book Now</button>
            </form>
        </div>

        <div class="card">
            <div class="ride-title">Auto</div>
            <div class="price">₹80 - ₹200</div>
            <form action="bookRide">
                <input type="hidden" name="rideType" value="Auto">
                <button class="btn">Book Now</button>
            </form>
        </div>

        <div class="card">
            <div class="ride-title">Cab</div>
            <div class="price">₹150 - ₹400</div>
            <form action="bookRide">
                <input type="hidden" name="rideType" value="Cab">
                <button class="btn">Book Now</button>
            </form>
        </div>

    </div>
</div>

</body>
</html>