<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>MASHIE STORE</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <link href="bootstrap-4.3.1-dist/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="bootstrap-4.3.1-dist/css/bootstrap.css" rel="stylesheet" type="text/css"/> 
        <script src="bootstrap-4.3.1-dist/js/bootstrap.min.js" type="text/javascript"></script>
        <script src="bootstrap-4.3.1-dist/js/bootstrap.js" type="text/javascript"></script>
        <link href="Style.css" rel="stylesheet" type="text/css"/>
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Anton&family=Gugi&family=Lato:wght@300&family=Roboto:wght@300&family=Sofia&display=swap" rel="stylesheet">
        <script src="https://kit.fontawesome.com/14cceac8da.js" crossorigin="anonymous"></script>
    </head>
    <body>
        <header>
            <div class="container">
            <div class="row">
            <div class="col-md-4 col-sm-12 col-12">
  
            <div class="btn-group">
            <button class="btn boarder dropdown-toggle my-md-4 my-2" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">LOGO?</button>
            <div class="dropdown-menu">
            <a href="#" class="dropdown-item">ERU- Euro</a>
            </div>
            </div>
            </div>
                
            <div class="col-md-4 col-12 text-center">
            <h2 class="my-md-3 site-title text-white"> Online Store</h2>
            </div>
            <div class="col-md-4 col-12 text-right">
            <p class="my-md-4 header-links">
            <a href="#" class="px-2">Sign In </a>
            <a href="#" class="px-1">Create an Account </a>
            </p>    
            </div>
            </div>
            </div>
            
            <div class="container-fluid p-0">
            <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
            <li class="nav-item active">
            <a class="nav-link" href="#">HOME <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
            <a class="nav-link" href="#">FEATURES</a>
            </li>
            <li class="nav-item">
            <a class="nav-link" href="#">COLLECTION</a>
            </li>
            <li class="nav-item">
            <a class="nav-link" href="#">SHOP</a>
            </li>
            <li class="nav-item">
            <a class="nav-link" href="#">ABOUT US</a>
            </li>
            <li class="nav-item">
            <a class="nav-link" href="#">CONTACT US</a>
            </li>
            </ul>
            </div>
                <div class="navbar-nav">
                    <li class="nav-item boarder rounded-circle mx-2 search-icon ">
                    <i class="fas fa-search p-2"></i>
                    </li>
                    <li class="nav-item boarder rounded-circle mx-2 basket-icon ">
                    <i class="fas fa-shopping-cart p-2"></i>
                    </li>
                </div>
            </nav>
            </div>
        </header>
      
        <main>
            <!---Slider-->
                <div class="container-fluid">
                <div class="site-slider">    
                <div class="slider-one">  
<div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
  <ol class="carousel-indicators">
    <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
    <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
    <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
  </ol>
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img class="d-block w-100" src="img/slider1.jpg" class="img-fluid" alt="First slide">
    </div>
    <div class="carousel-item">
      <img class="d-block w-100" src="img/slider2.png" class="img-fluid" alt="Second slide">
    </div>
    <div class="carousel-item">
      <img class="d-block w-100" src="img/slider3.jpg" class="img-fluid" alt="Third slide">
    </div>
  </div>
  <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
  <span><i class="fa fa-chevron-right" aria-hidden="true"></i></span>
  <span class="sr-only">Next</span>
  </a>
     <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
  <span><i class="fa fa-chevron-left" aria-hidden="true"></i></span>
  <span class="sr-only">Previous</span>
     </a>
                </div>
                </div>
                </div>
                </div>
            <!--Second Slider-->
            <div class="container-fluid">
            <div class="site-slider-two px-md-4">
                <div class="row slider-two text-center">
                <div class="col-md-2 product pt-md-5 pt-4">
                    <img src="" alt="product1"/>
                    <pan class="border site-btn btn-span">Product1</pan>
                    </div> 
                <img src="" alt="product2"/>
                <pan class="border site-btn btn-span">Product2</pan>
            </div>
            </div> 
            </div>
            </div>
        </main>
        <script src="https://code.jquery.com/jquery.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.bundle.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
        <script src="mainjs.js" type="text/javascript"></script>
        
    </body>
</html>
