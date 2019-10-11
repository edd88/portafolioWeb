<%-- 
    Document   : Evento
    Created on : 22/08/2019, 12:03:13 PM
    Author     : mauri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <title>No más Accidentes</title>
  <%@include file="head.jsp" %>
</head>

<body data-spy="scroll" data-target=".site-navbar-target" data-offset="300">

  <div class="site-wrap">

    <%@include file="header.jsp" %>
      
    <%@include file="navbar.jsp" %>

    <div class="site-section ftco-subscribe-1 site-blocks-cover pb-4" style="background-image: url('images/fondo.jpg')">
        <div class="container">
          <div class="row align-items-end justify-content-center text-center">
            <div class="col-lg-7">
              <h2 class="mb-0">Evento</h2>
              <p>
                  Aqui hay que poner las cosas de los evento, ej: si hay 
                  visitas de autoridades o si hay accidentes
              </p>
            </div>
          </div>
        </div>
      </div> 
    

    <div class="custom-breadcrumns border-bottom">
      <div class="container">
        <a href="index.jsp">Home</a>
        <span class="mx-3 icon-keyboard_arrow_right"></span>
        <span class="current">Evento</span>
      </div>
    </div>

    <div class="site-section">
        <div class="container">


            <div class="row justify-content-center">
                <div class="col-md-5">
                    <div class="row">
                        <div class="col-md-12 form-group">
                            <label for="Usuario">Tipo de evento</label>
                            <select class="form-control-lg">
                                <option value="0">Seleccione</option>
                                <option value="1">Accidente</option>
                                <option value="2">Visita del gobierno</option>
                                <option value="3">Multa</option>
                                <option value="3">otra cosa</option>
                            </select>
                        </div>
                        <div class="col-md-12 form-group">
                            <label for="contraseña">Fecha</label>
                            <input type="date" id="contraseña" class="form-control form-control-lg">
                        </div>
                        <div class="col-md-12 form-group" >
                            <label for="nombreAfec">Descripción:</label>
                            <textarea class="form-control rounded-0" id="exampleFormControlTextarea1" rows="10"></textarea>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-12">
                            <input type="submit" value="Registrar" class="btn btn-primary btn-lg px-5">
                        </div>
                    </div>
                </div>
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
