<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List"%>
<!DOCTYPE  html>
<html lang="en">

<!-- Mirrored from localhost:2012/ by HTTrack Website Copier/3.x [XR&CO'2014], Fri, 25 Feb 2022 14:11:45 GMT -->
<!-- Added by HTTrack --><meta http-equiv="content-type" content="text/html;charset=utf-8" /><!-- /Added by HTTrack -->
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="icon" href="Content/image/favicon.png" type="image/png">
    <title>Karnel Travel Guild</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="Content/css/bootstrap.css">
    <link rel="stylesheet" href="Content/vendors/linericon/style.css">
    <link rel="stylesheet" href="Content/css/font-awesome.min.css">
    <link rel="stylesheet" href="Content/vendors/owl-carousel/owl.carousel.min.css">
    <link rel="stylesheet" href="Content/vendors/bootstrap-datepicker/bootstrap-datetimepicker.min.css">
    <link rel="stylesheet" href="Content/vendors/nice-select/css/nice-select.css">
    <link rel="stylesheet" href="Content/vendors/owl-carousel/owl.carousel.min.css">
    <!-- main css -->
    <link rel="stylesheet" href="Content/css/style.css">
    <link rel="stylesheet" href="Content/css/responsive.css">
    <!-- Jquery-->
    <script src="Scripts/jquery-3.3.1.min.js"></script>
    <script src="Scripts/pnotify.custom.min.js"></script>
    <link rel="stylesheet" href="Scripts/pnotify.custom.min.css">
</head>
<body>
    <!--================Header Area =================-->
    <header class="header_area">
        <div class="container">
            <nav class="navbar navbar-expand-lg navbar-light">
                <!-- Brand and toggle get grouped for better mobile display -->
                <a class="navbar-brand logo_h" href="index.html"><img src="Content/image/Logo.png" alt=""></a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse offset" id="navbarSupportedContent">
                    <ul class="nav navbar-nav menu_nav ml-auto">
                        <li class="nav-item active"><a class="nav-link" href="home">Home</a></li>
                        <li class="nav-item submenu dropdown">
                            <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Information</a>
                            <ul class="dropdown-menu">
                                <li class="nav-item"><a class="nav-link" href="Home/ShowAllTouristSpot.html">Tourist Spots</a></li>
                                <li class="nav-item"><a class="nav-link" href="Home/ShowAllHotel.html">Hotel</a></li>
                                <li class="nav-item"><a class="nav-link" href="Home/ShowAllRestaurant.html">Restaurant</a></li>
                                <li class="nav-item"><a class="nav-link" href="Home/ShowAllResort.html">Resort</a></li>
                                <li class="nav-item"><a class="nav-link" href="Home/ShowAllTravel.html">Travel</a></li>
                            </ul>
                        </li>
                        <li class="nav-item"><a class="nav-link" href="Home/AboutUs.html">About us</a></li>
                        <li class="nav-item"><a class="nav-link" href="gallery.html">Gallery</a></li>
                        <li class="nav-item"><a class="nav-link" href="contact.html">Contact</a></li>
                                <li class="nav-item"><a class="nav-link" href="Account/Register.html">Register</a></li>
                                <li class="nav-item"><a class="nav-link" href="Account/Login.html">Login</a></li>
                    </ul>
                </div>
            </nav>
        </div>
    </header>
    <!--================Header Area =================-->
    <!--================Body Area =================-->
        <!--================Banner Area =================-->
<section class="banner_area">
    <div class="booking_table d_flex align-items-center">
        <div class="overlay bg-parallax" data-stellar-ratio="0.9" data-stellar-vertical-offset="0" data-background=""></div>
        <div class="container">
            <div class="banner_content text-center">
                <h6>Away from monotonous life</h6>
                <h2>Relax Your Mind</h2>
                <p>If you are looking at blank cassettes on the web, you may be very confused at the<br> difference in price. You may see some for as low as $.17 each.</p>
            </div>
        </div>
    </div>
    <div class="hotel_booking_area position">
        <div class="container">
        </div>
    </div>
</section>

<!--================Banner Area =================-->


<section class="accomodation_area section_gap">

    <div class="container">
        <div class="section_title text-center">
            <h2 class="title_color">Hotel Accommodation</h2>
            <p>We all live in an age that belongs to the young at heart. Life that is becoming extremely fast, </p>
        </div>
        <div class="testimonial_slider owl-carousel">
             <c:forEach items="${hotelEntityList}" var="hotel">
             
                <div class="media testimonial_item">
                    <div class="accomodation_item text-center">
                        <div class="hotel_img">
                            <img src="<c:out value="${hotel.imageHotel}"/>" style="width: 263px; height: 270px" alt="">
                            <a href="Home/DetailHotel/1.html" class="btn theme_btn button_hover">Book Now</a>
                        </div>
                        <a href="Home/DetailHotel/1.html"><h4 class="sec_h4"> <c:out value="${hotel.nameHotel}"/></h4></a>
                        <h5>$<c:out value="${hotel.priceHotel}"/><small>/night</small></h5>
                    </div>
                    <div class="media-body">
                        <p> <c:out value="${hotel.introductHotel}"/></p>
                                <a><div class="btn btn-success">Available</div></a>
                        <div class="star">
                            <p>
                                Rate: <c:out value="${hotel.qualityHotel}"/> <a><i class="fa fa-star"></i></a>
                            </p>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>
    </div>
</section>


<section class="accomodation_area section_gap">
    <div class="container">
        <div class="section_title text-center">
            <h2 class="title_color">Restaurant</h2>
            <p>We all live in an age that belongs to the young at heart. Life that is becoming extremely fast, </p>
        </div>
        <div class="testimonial_slider owl-carousel">
          <c:forEach items="${restaurantEntityList}" var="restaurant">
                <div class="media testimonial_item">
                    <div class="accomodation_item text-center">
                        <div class="hotel_img">
                            <img src="<c:out value="${restaurant.imageRestaurant}"/>" style="width: 263px; height: 270px" alt="">
                            <a href="Home/DetailRestaurant/1.html" class="btn theme_btn button_hover">Book Now</a>
                        </div>
                        <a href="Home/DetailRestaurant/1.html"><h4 class="sec_h4"><c:out value="${restaurant.nameRestaurant}"/></h4></a>
                        <h5>$<c:out value="${restaurant.priceRestaurant}"/><small>/night</small></h5>
                    </div>
                    <div class="media-body">
                        <p><c:out value="${restaurant.introductRestaurant}"/></p>
                            <a><div class="btn btn-success">Available</div></a>
                        <div class="star">
                            <p>
                                Rate: <c:out value="${restaurant.qualityRestaurant}"/> <a><i class="fa fa-star"></i></a>
                            </p>
                        </div>
                    </div>
                </div>
           </c:forEach>
        </div>
    </div>
    

</section><section class="accomodation_area section_gap">
    <div class="container">
        <div class="section_title text-center">
            <h2 class="title_color">Resort Accomodation</h2>
            <p>We all live in an age that belongs to the young at heart. Life that is becoming extremely fast, </p>
        </div>
        <div class="testimonial_slider owl-carousel">
          <c:forEach items="${resortEntityList}" var="resort">
                <div class="media testimonial_item">
                    <div class="accomodation_item text-center">
                        <div class="hotel_img">
                            <img src="<c:out value="${resort.imageResort}"/>" style="width: 263px; height: 270px" alt="">
                            <a href="Home/DetailResort/1.html" class="btn theme_btn button_hover">Book Now</a>
                        </div>
                        <a href="Home/DetailResort/1.html"><h4 class="sec_h4"><c:out value="${resort.nameResort}"/></h4></a>
                        <h5>$<c:out value="${resort.priceResort}"/><small>/night</small></h5>
                    </div>
                    <div class="media-body">
                        <p><c:out value="${resort.introductResort}"/></p>
                            <a><div class="btn btn-success">Available</div></a>
                        <div class="star">
                            <p>
                                Rate: <c:out value="${resort.qualityResort}"/> <a><i class="fa fa-star"></i></a>
                            </p>
                        </div>
                    </div>
                </div>
           </c:forEach>
        </div>
    </div>
    
    
    
</section><section class="accomodation_area section_gap">
    <div class="container">
        <div class="section_title text-center">
            <h2 class="title_color">Tourist Spot</h2>
            <p>We all live in an age that belongs to the young at heart. Life that is becoming extremely fast, </p>
        </div>
        <div class="testimonial_slider owl-carousel">
            <c:forEach items="${tourisSpotsEntityList}" var="touristSpot">
                <div class="media testimonial_item">
                    <div class="accomodation_item text-center">
                        <div class="hotel_img">
                            <img src="<c:out value="${touristSpot.imageTouristSpots}"/>" style="width: 263px; height: 270px" alt="">
                            <a href="Home/DetailTouristSpot/1.html" class="btn theme_btn button_hover">View Detail</a>
                        </div>
                        <a href="Home/DetailTouristSpot/1.html"><h4 class="sec_h4"><c:out value="${touristSpot.nameTouristSpot}"/></h4></a>
                    </div>
                    <div class="media-body">
                        <p><c:out value="${touristSpot.introduceTouristSpots}"/></p>
                        <div class="star">
                            <p>
                                Rate: <c:out value="${touristSpot.qualityTouristSpots}"/> <a><i class="fa fa-star"></i></a>
                            </p>
                        </div>
                    </div>
                </div>
           </c:forEach>
        </div>
    </div>
</section>




<section class="accomodation_area section_gap">
    <div class="container">
        <div class="section_title text-center">
            <h2 class="title_color">Travel</h2>
            <p>We all live in an age that belongs to the young at heart. Life that is becoming extremely fast, </p>
        </div>
        <div class="testimonial_slider owl-carousel">
           <c:forEach items="${travelEntityList}" var="travel">
                <div class="media testimonial_item">
                    <div class="accomodation_item text-center">
                        <div class="hotel_img">
                            <img src="<c:out value="${travel.imageTravel}"/>" style="width: 263px; height: 270px" alt="">
                            <a href="Home/DetailTravel/1.html" class="btn theme_btn button_hover">Book Now</a>
                        </div>
                        <a href="Home/DetailTravel/1.html"><h4 class="sec_h4"><c:out value="${travel.nameTravel}"/></h4></a>
                    </div>
                    <div class="media-body">
                        <p><c:out value="${travel.introductTravel}"/></p>
                            <a><div class="btn btn-success">Available</div></a>
                        <div class="star">
                            <p>
                                Rate: <c:out value="${travel.qualityTravel}"/> <a><i class="fa fa-star"></i></a>
                            </p>
                        </div>
                    </div>
                </div>
             </c:forEach>
        </div>
    </div>
</section>


<!--================ About History Area  =================-->
<section class="about_history_area section_gap">
    <div class="container">
        <div class="row">
            <div class="col-md-6 d_flex align-items-center">
                <div class="about_content ">
                    <h2 class="title title_color">About Us <br>Our History<br>Mission & Vision</h2>
                    <p>inappropriate behavior is often laughed off as a boys will be boys,a women face higher conduct standards especially in the workplace. Thatâs why itâs crucial that, as women, our behavior on the job is beyond reproach. inappropriate behavior is often laughed.</p>
                    <a href="#" class="button_hover theme_btn_two">Request Custom Price</a>
                </div>
            </div>
            <div class="col-md-6">
                <img class="img-fluid" src="Content/image/about_bg.jpg" alt="img">
            </div>
        </div>
    </div>
</section>


<!--================ About History Area  =================-->
<!--================ Testimonial Area  =================-->
<section class="testimonial_area section_gap">
    <div class="container">
        <div class="section_title text-center">
            <h2 class="title_color">Testimonial from our Clients</h2>
            <p>The French Revolution constituted for the conscience of the dominant aristocratic class a fall from </p>
        </div>
        <div class="testimonial_slider owl-carousel">
            <div class="media testimonial_item">
                <img class="rounded-circle" src="Content/image/testtimonial-1.jpg" alt="">
                <div class="media-body">
                    <p>As conscious traveling Paupers we must always be concerned about our dear Mother Earth. If you think about it, you travel across her face, and She is the </p>
                    <a href="#"><h4 class="sec_h4">Fanny Spencer</h4></a>
                    <div class="star">
                        <a href="#"><i class="fa fa-star"></i></a>
                        <a href="#"><i class="fa fa-star"></i></a>
                        <a href="#"><i class="fa fa-star"></i></a>
                        <a href="#"><i class="fa fa-star"></i></a>
                        <a href="#"><i class="fa fa-star-half-o"></i></a>
                    </div>
                </div>
            </div>
            <div class="media testimonial_item">
                <img class="rounded-circle" src="Content/image/testtimonial-1.jpg" alt="">
                <div class="media-body">
                    <p>As conscious traveling Paupers we must always be concerned about our dear Mother Earth. If you think about it, you travel across her face, and She is the </p>
                    <a href="#"><h4 class="sec_h4">Fanny Spencer</h4></a>
                    <div class="star">
                        <a href="#"><i class="fa fa-star"></i></a>
                        <a href="#"><i class="fa fa-star"></i></a>
                        <a href="#"><i class="fa fa-star"></i></a>
                        <a href="#"><i class="fa fa-star"></i></a>
                        <a href="#"><i class="fa fa-star-half-o"></i></a>
                    </div>
                </div>
            </div>
            <div class="media testimonial_item">
                <img class="rounded-circle" src="Content/image/testtimonial-1.jpg" alt="">
                <div class="media-body">
                    <p>As conscious traveling Paupers we must always be concerned about our dear Mother Earth. If you think about it, you travel across her face, and She is the </p>
                    <a href="#"><h4 class="sec_h4">Fanny Spencer</h4></a>
                    <div class="star">
                        <a href="#"><i class="fa fa-star"></i></a>
                        <a href="#"><i class="fa fa-star"></i></a>
                        <a href="#"><i class="fa fa-star"></i></a>
                        <a href="#"><i class="fa fa-star"></i></a>
                        <a href="#"><i class="fa fa-star-half-o"></i></a>
                    </div>
                </div>
            </div>
            <div class="media testimonial_item">
                <img class="rounded-circle" src="Content/image/testtimonial-1.jpg" alt="">
                <div class="media-body">
                    <p>As conscious traveling Paupers we must always be concerned about our dear Mother Earth. If you think about it, you travel across her face, and She is the </p>
                    <a href="#"><h4 class="sec_h4">Fanny Spencer</h4></a>
                    <div class="star">
                        <a href="#"><i class="fa fa-star"></i></a>
                        <a href="#"><i class="fa fa-star"></i></a>
                        <a href="#"><i class="fa fa-star"></i></a>
                        <a href="#"><i class="fa fa-star"></i></a>
                        <a href="#"><i class="fa fa-star-half-o"></i></a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<!--================ Testimonial Area  =================-->

    <!--================End Body =================-->
    <!--================ start footer Area  =================-->
    <footer class="footer-area section_gap">
        <div class="container">
            <div class="row">
                <div class="col-lg-3  col-md-6 col-sm-6">
                    <div class="single-footer-widget">
                        <h6 class="footer_title">About Agency</h6>
                        <p>The world has become so fast paced that people donât want to stand by reading a page of information, they would much rather look at a presentation and understand the message. It has come to a point </p>
                    </div>
                </div>
                <div class="col-lg-3 col-md-6 col-sm-6">
                    <div class="single-footer-widget">
                        <h6 class="footer_title">Navigation Links</h6>
                        <div class="row">
                            <div class="col-4">
                                <ul class="list_style">
                                    <li><a href="#">Home</a></li>
                                    <li><a href="#">Feature</a></li>
                                    <li><a href="#">Services</a></li>
                                    <li><a href="#">Portfolio</a></li>
                                </ul>
                            </div>
                            <div class="col-4">
                                <ul class="list_style">
                                    <li><a href="#">Team</a></li>
                                    <li><a href="#">Pricing</a></li>
                                    <li><a href="#">Blog</a></li>
                                    <li><a href="#">Contact</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-md-6 col-sm-6">
                    <div class="single-footer-widget">
                        <h6 class="footer_title">Newsletter</h6>
                        <p>For business professionals caught between high OEM price and mediocre print and graphic output, </p>
                        <div id="mc_embed_signup">
                            <form target="_blank" action="https://spondonit.us12.list-manage.com/subscribe/post?u=1462626880ade1ac87bd9c93a&amp;id=92a4423d01" method="get" class="subscribe_form relative">
                                <div class="input-group d-flex flex-row">
                                    <input name="EMAIL" placeholder="Email Address" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Email Address '" required="" type="email">
                                    <button class="btn sub-btn"><span class="lnr lnr-location"></span></button>
                                </div>
                                <div class="mt-10 info"></div>
                            </form>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-md-6 col-sm-6">
                    <div class="single-footer-widget instafeed">
                        <h6 class="footer_title">InstaFeed</h6>
                        <ul class="list_style instafeed d-flex flex-wrap">
                            <li><img src="Content/image/instagram/Image-01.jpg" alt=""></li>
                            <li><img src="Content/image/instagram/Image-02.jpg" alt=""></li>
                            <li><img src="Content/image/instagram/Image-03.jpg" alt=""></li>
                            <li><img src="Content/image/instagram/Image-04.jpg" alt=""></li>
                            <li><img src="Content/image/instagram/Image-05.jpg" alt=""></li>
                            <li><img src="Content/image/instagram/Image-06.jpg" alt=""></li>
                            <li><img src="Content/image/instagram/Image-07.jpg" alt=""></li>
                            <li><img src="Content/image/instagram/Image-08.jpg" alt=""></li>
                        </ul>
                    </div>
                </div>
            </div>
            <div class="border_line"></div>
            <div class="row footer-bottom d-flex justify-content-between align-items-center">
                <p class="col-lg-8 col-sm-12 footer-text m-0">
                    <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                    Copyright &copy;
                    <script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="fa fa-heart-o" aria-hidden="true"></i> by <a href="https://colorlib.com/" target="_blank">Colorlib</a>
                    <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                </p>
                <div class="col-lg-4 col-sm-12 footer-social">
                    <a href="#"><i class="fa fa-facebook"></i></a>
                    <a href="#"><i class="fa fa-twitter"></i></a>
                    <a href="#"><i class="fa fa-dribbble"></i></a>
                    <a href="#"><i class="fa fa-behance"></i></a>
                </div>
            </div>
        </div>
    </footer>
    <!--================ End footer Area  =================-->
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="Content/js/jquery-3.2.1.min.js"></script>
    <script src="Content/js/popper.js"></script>
    <script src="Content/js/bootstrap.min.js"></script>
    <script src="Content/vendors/owl-carousel/owl.carousel.min.js"></script>
    <script src="Content/js/jquery.ajaxchimp.min.js"></script>
    <script src="Content/js/mail-script.js"></script>
    <script src="Content/vendors/bootstrap-datepicker/bootstrap-datetimepicker.min.js"></script>
    <script src="Content/vendors/nice-select/js/jquery.nice-select.js"></script>
    <script src="Content/js/mail-script.js"></script>
    <script src="Content/js/stellar.js"></script>
    <script src="Content/vendors/lightbox/simpleLightbox.min.js"></script>
    <script src="Content/js/custom.js"></script>

</body>

</html>