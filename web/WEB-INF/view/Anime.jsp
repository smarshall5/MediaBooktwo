<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
    <header><img src="resources/img/animetop.jpg" height="400" width="400" alt="animeMain"></header>
    <nav class="navigation">
        <p class="menu-item"><a href="${pageContext.request.contextPath}/">Home</a></p>
        <p class="menu-item"><a href="${pageContext.request.contextPath}/Anime">Anime</a></p>
        <p class="menu-item"><a href="${pageContext.request.contextPath}/Books">Books</a></p>
        <p class="menu-item"><a href="${pageContext.request.contextPath}/addSuggestions">Suggestions</a></p>
    </nav>


    <p id="animeDesc"> Click on the Anime for more info</p>

    <div class="main">
        <form:form action="search" method="GET">
            <input type="search" name="searchTerm">
            <input type="submit" value="search" class="add-button">
        </form:form>
        <br/>
        <br/>
        <ul>

            <c:forEach var="media" items="${mediaList}">
                <c:url var="Details" value="/Details">
                    <c:param name="mediaID" value="${media.mediaID}"/>
                </c:url>
                <li><a href="${Details}">${media.title}</a></li>

                <c:url var="updateLink" value="/updateMedia">
                    <c:param name="mediaID" value="${media.mediaID}"/>
                </c:url>
                <ul><a href="${updateLink}"> update</a></ul>


                <c:url var="deleteLink" value="/deleteMedia">
                    <c:param name="mediaID" value="${media.mediaID}"/>
                </c:url>
                <ul><a href="${deleteLink}">delete</a></ul>
            </c:forEach>
        </ul>

        <%--   <p class="category"><a href="lifeAnime.html">Life</a></p>
           <br/>
           <p class="category"><a href="fantasyAnime.html">Fantasy</a></p>
           <br/>
           <p class="category"><a href="scifiAnime.html">Sci-Fi</a></p>
           <br/>
           <p class="category"><a href="sportAnime.html">Sports</a></p>--%>
    </div>
    </body>
</div>
</html>
