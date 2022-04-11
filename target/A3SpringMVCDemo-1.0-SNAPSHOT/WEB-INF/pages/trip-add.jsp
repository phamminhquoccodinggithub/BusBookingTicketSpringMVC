<%-- 
    Document   : trip
    Created on : Apr 11, 2022, 12:35:01 AM
    Author     : Quoc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<div class="container">
    <h1 class="text-center text-danger">Trip Management</h1>
    <c:if test="${errMsg != null}">
        <div class="alert alert-danger">
            ${errMsg}
        </div>
    </c:if>
    <form:form method="post" action="" modelAttribute="trips" >
        <div class="form-group">
            <label>Source</label>
            <form:input path="source" class="form-control" />
        </div>
        <div class="form-group">
            <label>Destination</label>
            <form:input path="destination" class="form-control" />
        </div>
        <div class="form-group">
            <label>Departure Time</label>
            <form:input path="depatureTime" class="form-control" />                    
        </div>
        <div class="form-group">
            <label>Arrive Time</label>
            <form:input path="arriveTime" class="form-control" />
        </div>
        <div class="form-group">
            <label>Price</label>
            <form:input path="price" class="form-control" />
        </div>
        <div class="form-group">
            <label>Bus No</label>
            <form:select path="busId" class="form-control">
                <c:forEach items="${buses}" var="b">
                    <option value="${b.id}">${b.busNo}</option>
                </c:forEach>
            </form:select>
        </div>                
        <input type="submit" value="Add Trip" class="btn btn-danger"/>
    </form:form>

</div>        