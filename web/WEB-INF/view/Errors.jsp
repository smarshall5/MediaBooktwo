<%--
  Created by IntelliJ IDEA.
  User: Marsh
  Date: 12/4/2019
  Time: 5:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set value="${pageContext.request.contextPath}" var="contextPath"/>
<html>
<head>
    <title>Oops! An error occurred</title>
    <link rel="stylesheet" href="resources/css/style.css">>
</head>
<body>
<div id="wrapper">
    <div id="header">
        <h3>An Error has occurred</h3>
    </div>
</div>
<div id="container">
    <div id="content">
        <p>${errorMessage}</p>
    </div>
</div>
</body>
</html>
