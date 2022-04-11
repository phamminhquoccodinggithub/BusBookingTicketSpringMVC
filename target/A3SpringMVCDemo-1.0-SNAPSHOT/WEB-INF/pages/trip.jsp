<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>    
<br><br>

<div class="container">
    <h1 class="text-center text-danger">Trip Detail </h1><br><br>

    <div class="container"><c:url value="/trip" var="homeAction"/>
        <form action="${homeAction}">
            <div class="container">
                <div>            
                    <label></label>
                    <input type="text" placeholder="Source" name="source" style="padding: 10px"/>
                    <label  style="padding: 10px"></label>
                    <input  type="text" placeholder="Destination" style="padding: 10px"/>
                    <label  style="padding: 10px"></label>
                    <input type="date" style="padding: 10px">
                    <label  style="padding: 10px"></label>
                    <input type="submit" value="Search" class="btn btn-primary" />
                </div> 
            </div>
        </form><br><br></div>
    <ul class="pagination">
        <c:forEach begin="1" end="${Math.ceil(tripCounter/6)}" var="i">
            <c:url value="/trip" var="myAction">
                <c:param name="page" value="${i}" />
            </c:url>
        <li class="page-item"><a class="page-link" href="${myAction}">${i}</a></li>
        </c:forEach>
    </ul>
    <table class="table table-hover">        
            <tr>
                <th>Source</th>
                <th>Destination</th>
                <th>Departure-time</th>
                <th>Arrive-time</th>
                <th>Price</th>
                <th>Bus No</th>
                <th>Booking</th>            
            </tr>
            <c:forEach items="${trips}" var="trip">                      
                <tr>
                    <td>${trip.source}</td>
                    <td>${trip.destination}</td>
                    <td>${trip.depatureTime}</td>
                    <td>${trip.arriveTime}</td>
                    <td>${trip.price} VND</td>
                    <td>
                        ${trip.busId.busNo}</td>
                    <td>
                        <input type="submit" value="Book" class="btn btn-primary" />
                    </td>
                </tr>
            </c:forEach>
        
    </table>
</div>