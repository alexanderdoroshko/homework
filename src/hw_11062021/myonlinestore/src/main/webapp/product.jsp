<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>List Product</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <script>
        function productAddedToShoppingCartMsg() {
            window.confirm("Продукт добавлен в корзину!");
        }
    </script>

</head>
<body style="background-color: ghostwhite">
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<div class="container-fluid">
    <br>
    <c:if test="${not empty products}">
        <c:forEach items="${products}" var="products">
            <div class="row">
                <div class="col-sm-3" style="background-color:lavender;">
                    <img src="${contextPath}/images/${products.getImageName()}" class="float-left"
                         alt="${products.getName()}"
                         width="220" height="240">
                </div>
                <div class="col-sm-9" style="background-color:lavender;">
                    <p>${products.getName()}</p>
                    <p>${products.getDescription()}</p>
                    <p>${products.getPrice()}</p>
                    <a href="${contextPath}/eshop?command=add-product-to-cart&product_id=${products.getId()}">
                        <button id="addProductToCart" type="submit" onclick="productAddedToShoppingCartMsg()">Добавить в
                            корзину
                        </button>
                    </a>
                </div>
            </div>
            <br>
        </c:forEach>
    </c:if>
</div>
<a href="${contextPath}/eshop?command=redirect-to-shopping-cart">
    <button id="cartRedirect" type="submit">Перейти к корзине</button>
</a>
</body>
</html>
