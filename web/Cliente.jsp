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
              <h2 class="mb-0">Plan</h2>
              <p>Costo del plan inicial para contratar a nuestra empresa.</p>
            </div>
          </div>
        </div>
      </div> 
    

    <div class="custom-breadcrumns border-bottom">
      <div class="container">
        <a href="index.jsp">Home</a>
        <span class="mx-3 icon-keyboard_arrow_right"></span>
        <span class="current">Cliente</span>
      </div>
    </div>
      <center>
      <div class="site-section"  >
        <div class="align-content-md-center" >
            <div class="container" >
                

                <div class="col-lg-4 col-md-6 mb-4">
                    <div class="course-1-item">
                        <figure class="thumnail">
                                <img src="images/course_2.jpg" alt="Image" class="img-fluid">
                        <div class="price">$###.###</div>
                        <div class="category"><h3>Visitas mensuales</h3></div>  
                        </figure>
                        <div class="course-1-content pb-4">
                        <h2>Las visitas tendran el check-list que necesita.</h2>
                        <div class="rating text-center mb-3">
                            <span class="icon-star2 text-warning"></span>
                            <span class="icon-star2 text-warning"></span>
                            <span class="icon-star2 text-warning"></span>
                            <span class="icon-star2 text-warning"></span>
                            <span class="icon-star2 text-warning"></span>
                        </div>
                        <p class="desc mb-4">2 visitas personalizadas y con propuestas de mejoras revisadas por otros profesionales.</p>
                        <p><a href="" class="btn btn-primary rounded-0 px-4">Contratar</a></p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
          </center>

    <%@include file="footer.jsp" %>
   
  </div>
  <!-- .site-wrap -->

  <!-- loader -->
  <div id="loader" class="show fullscreen"><svg class="circular" width="48px" height="48px"><circle class="path-bg" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke="#eeeeee"/><circle class="path" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke-miterlimit="10" stroke="#51be78"/></svg></div>

  <%@include file="scripts.jsp" %>

</body>

</html>