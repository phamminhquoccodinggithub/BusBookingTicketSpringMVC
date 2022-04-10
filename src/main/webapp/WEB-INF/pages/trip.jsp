<%-- 
    Document   : trip
    Created on : Apr 11, 2022, 12:35:01 AM
    Author     : Quoc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trip Management</title>
        <link href="<c:url value="/css/style.css"/>" rel="stylesheet"/>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    </head>
    <body>
        <!--        Navbar-->
        <nav class="navbar navbar-expand-md bg-dark navbar-dark">
            <!-- Brand -->
            <a class="navbar-brand" href="/">Bus Booking Tickets</a>

            <!-- Toggler/collapsibe Button -->
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
                <span class="navbar-toggler-icon"></span>
            </button>

            <!-- Navbar links -->
            <div class="collapse navbar-collapse" id="collapsibleNavbar">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link" href="/">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/">Bus</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/">Trip</a>
                    </li>
                </ul>
            </div>
        </nav>
        <div class="container">
            <h1 class="text-center text-danger">Trip Management</h1>
            <c:if test="${errMsg != null}">
                <div class="alert alert-danger">
                    ${errMsg}
                </div>
            </c:if>
            <form:form method="post" action="" modelAttribute="trip" enctype="multipart/form-data">
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
                    <form:select path="" class="form-control">
                        <c:forEach items="${buses}" var="b">
                            <option>${b.busNo}</option>
                        </c:forEach>
                    </form:select>
                </div>                
                <input type="submit" value="Add Trip" class="btn btn-danger"/>
            </form:form>
            
        </div>        
    </body>
</html>
