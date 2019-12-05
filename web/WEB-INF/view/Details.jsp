<%--
  Created by IntelliJ IDEA.
  User: Marsh
  Date: 11/30/2019
  Time: 1:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Marsh
  Date: 11/29/2019
  Time: 2:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="resources/css/style.css">
    <title>Anime</title>

</head>
<div id="wrapper">
    <body>
    <header><img src="animetop.jpg" height="400" width="400" alt="animeMain"></header>
    <nav class="navigation">
        <p class="menu-item"><a href="${pageContext.request.contextPath}/">Home</a></p>
        <p class="menu-item"><a href="${pageContext.request.contextPath}/Anime">Anime</a></p>
        <p class="menu-item"><a href="${pageContext.request.contextPath}/Books">Books</a></p>
        <p class="menu-item"><a href="${pageContext.request.contextPath}/addSuggestions">Suggestions</a></p>
    </nav>



    <p id="animeDesc"> Please pick a category of what the main theme of the anime is.</p>

    <div class="main">
        <ul>
            ${item.mediaID}
            ${item.title}
            ${item.maker}
            ${item.yearofMake}
            ${item.category}
            ${item.mediaType}
        </ul>
        <br/>
        <br/>
        <a href="${pageContext.request.contextPath}/Anime">Return</a>
    </div>
    </body>
</div>
</html>
