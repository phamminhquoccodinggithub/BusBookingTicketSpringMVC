<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>    
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<br><br>

<div class="container">
    <h1 class="text-center text-danger">Book Ticket </h1><br><br>
   
    <form>
        <div>
            <label style="padding-bottom: 10px">Picking Source</label>
            
        </div>
        <div>
            <label style="padding-bottom:  10px">Destination</label>
            
        </div>
        <div>
            <label>Name</label>
            <input class="form-control" type="text" />
        </div>
        <div>
            <label>Phone</label>
            <input class="form-control" type="text" />
        </div>
        <div>
            <label>Email</label>
            <input class="form-control" type="text" />
        </div>
        <div>
            <label>Address</label>
            <input class="form-control" type="text" />
        </div>
        <div>
            <label style="padding: 10px">Price</label>            
        </div>
        <input type="button" value="Pay" class="btn btn-danger"/>
    </form>
</div>
