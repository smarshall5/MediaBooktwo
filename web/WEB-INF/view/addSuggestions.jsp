<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Marsh
  Date: 11/30/2019
  Time: 2:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="resources/css/style.css">
    <title>Media+Books</title>
</head>
<div id="wrapper">
    <body>
    <header><img src="resources/img/frontpage.jpg" height="400" width="400" alt="frontMain"></header>
    <nav class="navigation">
        <p class="menu-item"><a href="${pageContext.request.contextPath}/">Home</a></p>
        <p class="menu-item"><a href="${pageContext.request.contextPath}/Anime">Anime</a></p>
        <p class="menu-item"><a href="${pageContext.request.contextPath}/Books">Books</a></p>
        <p class="menu-item"><a href="${pageContext.request.contextPath}/addSuggestions">Suggestions</a></p>

    </nav>
    <div class="main">
        <div>Add Media</div>
        <br/>
        <br/>
        <form:form action="save" modelAttribute="pleaseMedia" method="post">
            <form:hidden path="mediaID" value="${pleaseMedia.mediaID}"/>
            <table>
                <tr>
                    <td><label>Title</label></td>
                    <td><form:input path="title"/></td>
                </tr>
                <tr>
                    <td><label>Year Of make</label></td>
                    <td><form:input path="yearofMake"/></td>
                </tr>
                <tr>
                    <td><label>Maker</label></td>
                    <td><form:input path="maker"/></td>
                </tr>
                <tr>
                    <td><label>mediaType</label></td>
                    <td>
                        <form:select path="mediaType"
                                     items="${mediaType}"
                                     itemLabel="Name"
                                     itemValue="mediaTypeId">
                        </form:select>
                    </td>
                </tr>
                <tr>
                    <td><label>Category</label></td>
                    <td>
                        <form:select path="category"
                                     items="${category}"
                                     itemLabel="Name"
                                     itemValue="categoryId">
                        </form:select>
                    </td>
                </tr>

            </table>
            <tr>
                <td></td>
                <td><input type="submit" value="save" class="save"></td>
            </tr>
        </form:form>


    </div>

    </body>
</div>
</html>