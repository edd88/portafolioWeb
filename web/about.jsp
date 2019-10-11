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
                            <h2 class="mb-0">Sobre Nosotros</h2>
                            <p></p>
                        </div>
                    </div>
                </div>
            </div> 

            <div class="custom-breadcrumns border-bottom">
                <div class="container">
                    <a href="index.jsp">Home</a>
                    <span class="mx-3 icon-keyboard_arrow_right"></span>
                    <span class="current">sobre nosotros </span>
                </div>
            </div>

            <div class="container pt-5 mb-5">
                <div class="row">
                    <div class="col-lg-4">
                        <h2 class="section-title-underline">
                            <span>Historia de "No Más Accidente"</span>
                        </h2>
                    </div>

                    <div class="col-lg-4">
                        <p>Nuestra empresa se creo a partir de un grupo de profesionales que al ver el aumento de accidentes decidio hacer algo para reducir este numero que apesar de las leyes y normativas no disminuye.</p>
                    </div>

                </div>
            </div> -->

            <div class="site-section">
                <div class="container">
                    <div class="row mb-5">
                        <div class="col-lg-6 mb-lg-0 mb-4">
                            <img src="images/course_4.jpg" alt="Image" class="img-fluid"> 
                        </div>
                        <div class="col-lg-5 ml-auto align-self-center">
                            <h2 class="section-title-underline mb-5">
                                <span>¿Porque contratar "No Más Accidentes"?</span>
                            </h2>
                            <p>Nuestro servicio se adaptara a tu empresa, con actividades personalizadas para las necesidades de tu empresa.</p>
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
