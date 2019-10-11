<!DOCTYPE html>
<html lang="en">

<head>
  <title>No Más accidentes</title>
  <%@include file="head.jsp" %>
</head>

<body data-spy="scroll" data-target=".site-navbar-target" data-offset="300">

  <div class="site-wrap">

    <%@include file="header.jsp" %>
      
    <%@include file="navbar.jsp" %>

    
    <div class="site-section ftco-subscribe-1 site-blocks-cover pb-4" style="background-image: url('images/fondo.jpg')">
        <div class="container">
          <div class="row align-items-end">
            <div class="col-lg-7">
              <h2 class="mb-0">Profesional</h2>
              <p></p>
            </div>
          </div>
        </div>
      </div> 
    

    <div class="custom-breadcrumns border-bottom">
      <div class="container">
        <a href="index.jsp">Home</a>
        <span class="mx-3 icon-keyboard_arrow_right"></span>
        <span class="current">Profesional</span>
      </div>
    </div>

    <div class="site-section">
        <div class="container">
            
                    <h2 class="section-heading mb-5">
                        <span>Inicio</span>
                    </h2>
            <div class="row">
                <ul class="list-unstyled">
                    <li><a href="register.jsp" class="alert-link" >Crear Check-List</a></li>
                    <li><a href="crearMejora.jsp" class="alert-link" >Crear mejora</a></li>
                    <li><a href="aceptarMejora.jsp" class="alert-link" >Aceptar mejora</a></li>
                </ul>
            </div>
                    
        </div>
    </div>

    <%@include file="footer.jsp" %>

  </div>
  <!-- .site-wrap -->

  <!-- loader -->
  <div id="loader" class="show fullscreen"><svg class="circular" width="48px" height="48px"><circle class="path-bg" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke="#eeeeee"/><circle class="path" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke-miterlimit="10" stroke="#51be78"/></svg></div>

  <%@include file="scripts.jsp" %>

</body>

</html>
