<%-- 
    Document   : login
    Created on : Apr 11, 2022, 8:04:37 PM
    Author     : Quoc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<h1 class="text-center text-danger">Login</h1>
<c:url value="/login" var="action"/>
<div class="container">
    <form method="post" action="${action}">
        <div class="form-group"> 
            <label>Username</label>
            <input type="text" name="username" class="form-control"/>
        </div>
        <div class="form-group"> 
            <label>Password</label>
            <input type="text" name="password" class="form-control"/>
        </div>
        <input type="submit" value="Login" class="btn btn-danger"/>
    </form>
</div>

