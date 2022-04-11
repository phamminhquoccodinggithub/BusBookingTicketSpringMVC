<%-- 
    Document   : index
    Created on : Mar 15, 2022, 12:49:17 AM
    Author     : Quoc
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>    
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<img src="<c:url value="/img/bus.jpg"/>" style="width: 100%"/> <br><br><br>
<c:url value="/trip" var="homeAction"/>
<form action="${homeAction}">
    <div class="container">
        <div>            
            <label></label>
            <input type="text" placeholder="Source" name="kw" style="padding: 10px"/>
            <label  style="padding: 10px"></label>
            <input  type="text" placeholder="Destination" style="padding: 10px"/>
            <label  style="padding: 10px"></label>
            <input type="date" style="padding: 10px">
            <label  style="padding: 10px"></label>
            <input type="submit" value="Search" class="btn btn-primary" />
        </div> 
    </div>
</form>

