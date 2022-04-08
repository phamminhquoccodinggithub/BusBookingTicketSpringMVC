<%-- 
    Document   : index
    Created on : Mar 15, 2022, 12:49:17 AM
    Author     : Quoc
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Homepage</title>
        <link href="<c:url value="/css/style.css"/>" rel="stylesheet"/>
    </head>
    <body>
        <h1><spring:message code="page.title"/></h1>
        <h1>Hello ${name}!</h1>
        <h3><spring:message code="page.welcome"/></h3>
        <h3><img src="<c:url value="/img/bus.jpg"/>"</h3>
    </body>
</html>
