<%-- 
    Document   : register
    Created on : Apr 11, 2022, 5:33:24 PM
    Author     : Quoc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<h1 class="text-center text-info">Register for user</h1>
<c:if test="${errMsg != null}">
    <div class="alert alert-danger">
        ${errMsg}
    </div>
    
</c:if>
<c:url value="/register" var="action"/>
<div class="container">
    <form:form method="post" action="${action}" modelAttribute="account" enctype="multipart/form-data">
        <form:errors path="*" element="div" cssClass="alert alert-danger"/>
        <div class="form-group">
            <label>Username</label>
            <form:input path="username" class="form-control" />
            <form:errors path="username" cssClass="text-danger"/>
        </div>
        <div class="form-group">
            <label>Password</label>
            <form:password path="password" class="form-control" />
            <form:errors path="password" cssClass="alert alert-danger"/>
        </div>
        <div class="form-group">
            <label>Confirm Password</label>
            <form:password path="confirmPassword" class="form-control" />
        </div>
        <div class="form-group">
            <label>Avatar</label>
            <form:input type="file" path="file" class="form-control" />                    
        </div>
                              
        <input type="submit" value="Register" class="btn btn-danger"/>
    </form:form>
</div>