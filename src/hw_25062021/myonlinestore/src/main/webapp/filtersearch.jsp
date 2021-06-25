<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Поик по фильтрам</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container mt-3">
    <form action="/action_page.php">
        <select name="category" class="custom-select mb-3">
            <option selected>Select category</option>
            <option value="mobile phones">mobile phones</option>
            <option value="laptop">laptop</option>
            <option value="fridges">fridges</option>
            <option value="cameras">cameras</option>
            <option value="gps navigator">gps navigator</option>
            <option value="car">car</option>
        </select>
        <div>
            <label>Цена </label>
            <input name="price" type="text">
            <input name="price" type="text">
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div>


</body>
</html>
