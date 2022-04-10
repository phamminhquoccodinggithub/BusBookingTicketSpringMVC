<%--
    Document   : index
    Created on : Mar 15, 2022, 12:49:17 AM
    Author     : Quoc
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Homepage</title>
    <link href="<c:url value="/css/style.css"/>" rel="stylesheet"/>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
    <link
      rel="stylesheet"
      href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
    />
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"></script>
  </head>
  <body>
    <nav class="navbar navbar-default navbar-fixed-top navbar-dark bg-dark navbar-expand" role="navigation">
      <div class="container-fluid">
        <div class="navbar">

          <!-- branch -->
          <a class="navbar-brand" href="#">Bus Booking Tickets</a>

          <!-- toggler/collase button -->
          <button
          type="button"
          class="navbar-toggler"
          data-toggle="collapse"
          data-target="#navbar-collapse-main"
        >
          <span class="navbar-toggler-icon"></span>
        </button>

          <!-- Navbar links  -->
          <div class="collapse navbar-collapse" id="navbar-collapse-main">
            <ul class="navbar-nav">
          <li class="nav-item">
              <a class="nav-link" href="#">Home</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">Bus</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">Trip</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">Login</a>
            </li>
          </ul>
          </div>
        </div>
      </div>
      </div>
    </nav>
    <!-- Home page -->
    <!-- <div class="" style="background-image: url('img/bus.jpg'); background-repeat: no-repeat; background-position: center center;">
      <div class="mask rgba-gradient align-items-center"> -->
        <img class="img-fluid" src="<c:url value="/img/bus.jpg"/>" />

        <div class="container">
          <!--Grid row-->
          <div class="row">

            <!--Grid column-->
            <div class="col-md white-text text-center text-md-left mt-xl-5 mb-5">
              <h1 class="h1-responsive font-weight-bold mt-sm-5">Bus Booking Tickets</h1>
              <hr class="hr-light">
              <form action="#" class="form-group">
                <div class="input-group form-rounded">
                  <div class="input-group-addon d-flex align-items-center small">
                  <input class="input-group" type="text" placeholder="From?">&nbsp;
                  <input type="search" placeholder="To?">&nbsp;
                  <input type="date">&nbsp;
                  <button class="btn btn-info" type="submit">
                    <i class="fa fa-search"></i>
                </button>
                </div>
              </form>
            </div>
    </div>
    </div>
  </div>
    <!-- Footer -->
    <footer class="bg-dark text-center text-white">
      <!-- Grid container -->
      <div class="container p-4 pb-0">
        <!-- Section: Form -->
        <section>
          <form action="">
            <!--Grid row-->
            <div class="row d-flex justify-content-center">
              <!--Grid column-->
              <div class="col-auto">
                <p class="pt-2">
                  <strong>Subscribe to get our latest updates and offers</strong>
                </p>
              </div>
              <div class="col-md-5 col-12">
                <!-- Email input -->
                <div class="form-outline form-white mb-4">
                  <input type="email" id="mail" class="form-control" placeholder="Email address"/>
                </div>
              </div>
              <div class="col-auto">
                <!-- Submit button -->
                <button type="submit" class="btn btn-outline-light mb-4">
                  Subscribe
                </button>
              </div>
            </div>
          </form>
        </section>
  </body>
</html>

