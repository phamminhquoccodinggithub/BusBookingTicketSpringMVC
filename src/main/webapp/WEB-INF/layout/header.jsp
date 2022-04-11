<%-- 
    Document   : header.jsp
    Created on : Apr 11, 2022, 7:57:38 AM
    Author     : Quoc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!--        Navbar-->
<nav class="navbar navbar-expand-md bg-dark navbar-dark">
    <!-- Brand -->
    <a class="navbar-brand" href="<c:url value="/" />">Bus Booking Tickets</a>

    <!-- Toggler/collapsibe Button -->
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
        <span class="navbar-toggler-icon"></span>
    </button>

    <!-- Navbar links -->
    <div class="collapse navbar-collapse" id="collapsibleNavbar">
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link" href="<c:url value="/" />">Home</a>
            </li>            
            <li class="nav-item">
                <a class="nav-link" href="<c:url value="/trip" />">Trip</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="<c:url value="/register" />">Register</a>
            </li>
        </ul>
    </div>
</nav>


