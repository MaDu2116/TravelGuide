<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List"%>
<!DOCTYPE  html>
<html lang="en">

<!-- Mirrored from localhost:2012/Home/DetailHotel/2 by HTTrack Website Copier/3.x [XR&CO'2014], Fri, 25 Feb 2022 14:19:30 GMT -->
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
                <a class="navbar-brand logo_h" href="../../index.html"><img src="Content/image/Logo.png" alt=""></a>
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
                                <li class="nav-item"><a class="nav-link" href="ShowAllTouristSpot.html">Tourist Spots</a></li>
                                <li class="nav-item"><a class="nav-link" href="ShowAllHotel.html">Hotel</a></li>
                                <li class="nav-item"><a class="nav-link" href="ShowAllRestaurant.html">Restaurant</a></li>
                                <li class="nav-item"><a class="nav-link" href="ShowAllResort.html">Resort</a></li>
                                <li class="nav-item"><a class="nav-link" href="ShowAllTravel.html">Travel</a></li>
                            </ul>
                        </li>
                        <li class="nav-item"><a class="nav-link" href="../AboutUs.html">About us</a></li>
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
    

<section class="blog_area single-post-area">
    <div class="container">
        <div class="row">
            <div class="col-lg-8 posts-list">
                <div class="single-post row">
                    <div class="col-lg-12">
                        <div class="feature-img">
                            <img class="img-fluid" src="${hotelDto.imageDetailHotel}" alt="">
                        </div>
                    </div>
                    <div class="col-lg-3  col-md-3">
                        <div class="blog_info text-right">
                            <ul class="blog_meta list_style">
                                <li>
                                        <a><div type="button" class="btn btn-success">Available</div></a>
                                </li>
                                <li><a>${hotelDto.addressHotel}<i class="lnr lnr-home"></i></a></li>
                                <li><a>${hotelDto.nameCity}<i class="lnr lnr-map-marker"></i></a></li>
                                <li><a>1.2M Views<i class="lnr lnr-eye"></i></a></li>
                                <li><a>${hotelDto.qualityHotel}/ 10<i class="lnr lnr-star"></i></a></li>
                                <li><a><h5>$${hotelDto.priceHotel}<small>/night</small></h5></a></li>
                            </ul>
                            <ul class="social-links">
                                <li><a><i class="fa fa-facebook"></i></a></li>
                                <li><a><i class="fa fa-twitter"></i></a></li>
                                <li><a><i class="fa fa-github"></i></a></li>
                                <li><a><i class="fa fa-behance"></i></a></li>
                            </ul>
                        </div>
                    </div>
                    <div class="col-lg-9 col-md-9 blog_details">
                        <h2>${hotelDto.nameHotel}</h2>
                        <p class="excert">
                            ${hotelDto.introductHotel}
                        </p>
                        <p>
                            ${hotelDto.desHotel}
                        </p>
                    </div>
                    <div class="col-lg-12">
                        <div class="quotes">
                            MCSE boot camps have its supporters and its detractors. Some people do not understand why you should have to spend money on boot camp when you can get the MCSE study materials yourself at a fraction of the camp price. However, who has the willpower to actually sit through a self-imposed MCSE training.
                        </div>
                        <div class="row">
                            <div class="googleMap"></div>
                        </div>
                    </div>
                </div>
                
            </div>
            <div class="col-lg-4">
                <div class="blog_right_sidebar">
                    <aside class="single_sidebar_widget popular_post_widget">
                        <h3 class="widget_title">Popular Posts</h3>
                        <div class="media post_item">
                            <img src="Content/image/blog/post1.jpg" alt="post">
                            <div class="media-body">
                                <a href="blog-details.jsp"><h3>Space The Final Frontier</h3></a>
                                <p>02 Hours ago</p>
                            </div>
                        </div>
                        <div class="media post_item">
                            <img src="Content/image/blog/post2.jpg" alt="post">
                            <div class="media-body">
                                <a href="blog-details.jsp"><h3>The Amazing Hubble</h3></a>
                                <p>02 Hours ago</p>
                            </div>
                        </div>
                        <div class="media post_item">
                            <img src="Content/image/blog/post3.jpg" alt="post">
                            <div class="media-body">
                                <a href="blog-details.jsp"><h3>Astronomy Or Astrology</h3></a>
                                <p>03 Hours ago</p>
                            </div>
                        </div>
                        <div class="media post_item">
                            <img src="Content/image/blog/post4.jpg" alt="post">
                            <div class="media-body">
                                <a href="blog-details.jsp"><h3>Asteroids telescope</h3></a>
                                <p>01 Hours ago</p>
                            </div>
                        </div>
                        <div class="br"></div>
                    </aside>
                    <aside class="single_sidebar_widget ads_widget">
                        <a href="#"><img class="img-fluid" src="Content/image/blog/add.jpg" alt=""></a>
                        <div class="br"></div>
                    </aside>
                </div>
            </div>
        </div>
    </div>
</section>

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
                            <li><img src="../../Content/image/instagram/Image-01.jpg" alt=""></li>
                            <li><img src="../../Content/image/instagram/Image-02.jpg" alt=""></li>
                            <li><img src="../../Content/image/instagram/Image-03.jpg" alt=""></li>
                            <li><img src="../../Content/image/instagram/Image-04.jpg" alt=""></li>
                            <li><img src="../../Content/image/instagram/Image-05.jpg" alt=""></li>
                            <li><img src="../../Content/image/instagram/Image-06.jpg" alt=""></li>
                            <li><img src="../../Content/image/instagram/Image-07.jpg" alt=""></li>
                            <li><img src="../../Content/image/instagram/Image-08.jpg" alt=""></li>
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
    <script src="../../Content/js/jquery-3.2.1.min.js"></script>
    <script src="../../Content/js/popper.js"></script>
    <script src="../../Content/js/bootstrap.min.js"></script>
    <script src="../../Content/vendors/owl-carousel/owl.carousel.min.js"></script>
    <script src="../../Content/js/jquery.ajaxchimp.min.js"></script>
    <script src="../../Content/js/mail-script.js"></script>
    <script src="../../Content/vendors/bootstrap-datepicker/bootstrap-datetimepicker.min.js"></script>
    <script src="../../Content/vendors/nice-select/js/jquery.nice-select.js"></script>
    <script src="../../Content/js/mail-script.js"></script>
    <script src="../../Content/js/stellar.js"></script>
    <script src="../../Content/vendors/lightbox/simpleLightbox.min.js"></script>
    <script src="../../Content/js/custom.js"></script>

</body>

<!-- Mirrored from localhost:2012/Home/DetailHotel/2 by HTTrack Website Copier/3.x [XR&CO'2014], Fri, 25 Feb 2022 14:19:30 GMT -->
</html>