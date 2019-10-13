<!DOCTYPE html>
<html lang="en">

    <head>
        <title>No Más Accidentes</title>
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
                            <h2 class="mb-0">Login</h2>
                            <p>Para ingresar debes estar previamente registrado.</p>
                        </div>
                    </div>
                </div>
            </div> 


            <div class="custom-breadcrumns border-bottom">
                <div class="container">
                    <a href="index.jsp">Home</a>
                    <span class="mx-3 icon-keyboard_arrow_right"></span>
                    <span class="current">Login</span>
                </div>
            </div>
            
            <form action="ServletLogin" method="post">
                <div class="site-section">
                <div class="container">
                    <div class="row justify-content-center">
                        <div class="col-md-5">
                            <div class="row">
                                <div class="col-md-12 form-group">
                                    <label for="Usuario">Usuario</label>
                                    <input type="text" id="usuario" name="txtUsuario" class="form-control form-control-lg">
                                </div>
                                <div class="col-md-12 form-group">
                                    <label for="contraseÃ±a">Contraseña</label>
                                    <input type="password" id="pass" name="txtPass" class="form-control form-control-lg">
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-12">
                                    <input type="submit" value="Ingresar" class="btn btn-primary btn-lg px-5">
                                </div>
                            </div>
                        </div>
                    </div>

                </div>
            </div>
            </form>
            
            <%            if (request.getAttribute("mensaje") != null) {
                    out.println(request.getAttribute("mensaje"));
                }
                if (sesion.getAttribute("usuario") != null) {
                    out.println("El usuario esta logeado");
                    //ClUsuario usuario = (ClUsuario)sesion.getAttribute("usuario");
                    out.println(usuario.getUsuario().toString());
                }
            %>
            

            <%@include file="footer.jsp" %>

        </div>
        <!-- .site-wrap -->

        <!-- loader -->
        <div id="loader" class="show fullscreen"><svg class="circular" width="48px" height="48px"><circle class="path-bg" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke="#eeeeee"/><circle class="path" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke-miterlimit="10" stroke="#51be78"/></svg></div>

        <%@include file="footer.jsp" %>
        
        <%@include file="scripts.jsp" %>

    </body>

</html>
