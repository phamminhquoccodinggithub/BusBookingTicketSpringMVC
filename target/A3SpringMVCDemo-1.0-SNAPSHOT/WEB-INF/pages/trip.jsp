<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>    
<br><br>

<div class="container">
    <h1 class="text-center text-danger">Trip Detail</h1>
    <table class="table table-hover">
        <thead>
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
        </thead>
    </table>
</div>