<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List"%>
<!DOCTYPE  html>
<html lang="en">

<!-- Mirrored from localhost:2012/Home/ShowAllResort by HTTrack Website Copier/3.x [XR&CO'2014], Fri, 25 Feb 2022 14:18:48 GMT -->
<!-- Added by HTTrack --><meta http-equiv="content-type" content="text/html;charset=utf-8" /><!-- /Added by HTTrack -->
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="icon" href="../Content/image/favicon.png" type="image/png">
    <title>Karnel Travel Guild</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="../Content/css/bootstrap.css">
    <link rel="stylesheet" href="../Content/vendors/linericon/style.css">
    <link rel="stylesheet" href="../Content/css/font-awesome.min.css">
    <link rel="stylesheet" href="../Content/vendors/owl-carousel/owl.carousel.min.css">
    <link rel="stylesheet" href="../Content/vendors/bootstrap-datepicker/bootstrap-datetimepicker.min.css">
    <link rel="stylesheet" href="../Content/vendors/nice-select/css/nice-select.css">
    <link rel="stylesheet" href="../Content/vendors/owl-carousel/owl.carousel.min.css">
    <!-- main css -->
    <link rel="stylesheet" href="../Content/css/style.css">
    <link rel="stylesheet" href="../Content/css/responsive.css">
    <!-- Jquery-->
    <script src="../Scripts/jquery-3.3.1.min.js"></script>
    <script src="../Scripts/pnotify.custom.min.js"></script>
    <link rel="stylesheet" href="../Scripts/pnotify.custom.min.css">
</head>
<body>
    <!--================Header Area =================-->
    <header class="header_area">
        <div class="container">
            <nav class="navbar navbar-expand-lg navbar-light">
                <!-- Brand and toggle get grouped for better mobile display -->
                <a class="navbar-brand logo_h" href="../index.html"><img src="../Content/image/Logo.png" alt=""></a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse offset" id="navbarSupportedContent">
                    <ul class="nav navbar-nav menu_nav ml-auto">
                        <li class="nav-item active"><a class="nav-link" href="../index.html">Home</a></li>
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
                        <li class="nav-item"><a class="nav-link" href="AboutUs.html">About us</a></li>
                        <li class="nav-item"><a class="nav-link" href="gallery.html">Gallery</a></li>
                        <li class="nav-item"><a class="nav-link" href="contact.html">Contact</a></li>
                                <li class="nav-item"><a class="nav-link" href="../Account/Register.html">Register</a></li>
                                <li class="nav-item"><a class="nav-link" href="../Account/Login.html">Login</a></li>

                    </ul>
                </div>
            </nav>
        </div>
    </header>
    <!--================Header Area =================-->
    <!--================Body Area =================-->
    


<section class="blog_area">
    <div class="container">
        <div class="row">
            <div class="col-lg-8">
                        <div class="blog_left_sidebar">
                            <article class="row blog_item">
                                <div class="col-md-3">
                                    <div class="blog_info text-right">
                                        <ul class="blog_meta list_style">
                                            <li>
                                                    <a href="#"><div class="btn btn-success">Available</div></a>
                                            </li>
                                            <li><a href="#">Ward 1, Bac Lieu<i class="lnr lnr-home"></i></a></li>
                                            <li><a href="#">Bac Lieu<i class="lnr lnr-map-marker"></i></a></li>
                                            <li><a href="#">1.2M Views<i class="lnr lnr-eye"></i></a></li>
                                            <li><a href="#">9/ 10<i class="lnr lnr-star"></i></a></li>
                                            <li><a href="#"><h5>$500<small>/night</small></h5></a></li>
                                        </ul>
                                    </div>
                                </div>
                                <div class="col-md-9">
                                    <div class="blog_post">
                                        <img src="../Content/image/Resort/info/BL_infor_4.jpg" alt="">
                                        <div class="blog_details">
                                            <a href="DetailResort/1.html">
                                                <h2>Ho Nam Resort</h2>
                                            </a>
                                            <p>You will enjoy popular activities such as sightseeing, cycling and casual walks around the charming town centre, observing local people trading in the colourful open market</p>
                                            <a href="DetailResort/1.html" class="view_btn button_hover">View More</a>
                                        </div>
                                    </div>
                                </div>
                            </article>
                        </div>
                        <div class="blog_left_sidebar">
                            <article class="row blog_item">
                                <div class="col-md-3">
                                    <div class="blog_info text-right">
                                        <ul class="blog_meta list_style">
                                            <li>
                                                    <a href="#"><div class="btn btn-success">Available</div></a>
                                            </li>
                                            <li><a href="#">Nha Mat Resort, Nha Mat District, Bac Lieu Province<i class="lnr lnr-home"></i></a></li>
                                            <li><a href="#">Bac Lieu<i class="lnr lnr-map-marker"></i></a></li>
                                            <li><a href="#">1.2M Views<i class="lnr lnr-eye"></i></a></li>
                                            <li><a href="#">8/ 10<i class="lnr lnr-star"></i></a></li>
                                            <li><a href="#"><h5>$500<small>/night</small></h5></a></li>
                                        </ul>
                                    </div>
                                </div>
                                <div class="col-md-9">
                                    <div class="blog_post">
                                        <img src="../Content/image/Resort/info/BL_infor_5.jpg" alt="">
                                        <div class="blog_details">
                                            <a href="DetailResort/2.html">
                                                <h2>Nha Mat Resort</h2>
                                            </a>
                                            <p>
You will enjoy popular activities such as sightseeing, cycling and casual walks around the charming town centre, observing local people trading in the colourful open market.</p>
                                            <a href="DetailResort/2.html" class="view_btn button_hover">View More</a>
                                        </div>
                                    </div>
                                </div>
                            </article>
                        </div>
                        <div class="blog_left_sidebar">
                            <article class="row blog_item">
                                <div class="col-md-3">
                                    <div class="blog_info text-right">
                                        <ul class="blog_meta list_style">
                                            <li>
                                                    <a href="#"><div class="btn btn-success">Available</div></a>
                                            </li>
                                            <li><a href="#">708 Nguyen Van Tu Street, Ward 7, Ben Tre, Ben Tre<i class="lnr lnr-home"></i></a></li>
                                            <li><a href="#">Binh Thuan<i class="lnr lnr-map-marker"></i></a></li>
                                            <li><a href="#">1.2M Views<i class="lnr lnr-eye"></i></a></li>
                                            <li><a href="#">7/ 10<i class="lnr lnr-star"></i></a></li>
                                            <li><a href="#"><h5>$500<small>/night</small></h5></a></li>
                                        </ul>
                                    </div>
                                </div>
                                <div class="col-md-9">
                                    <div class="blog_post">
                                        <img src="../Content/image/Resort/info/BT_infor_1.jpg" alt="">
                                        <div class="blog_details">
                                            <a href="DetailResort/3.html">
                                                <h2>Ben Tre Riverside Resort</h2>
                                            </a>
                                            <p>You will enjoy popular activities such as sightseeing, cycling and casual walks around the charming town centre, observing local people trading in the colourful open market</p>
                                            <a href="DetailResort/3.html" class="view_btn button_hover">View More</a>
                                        </div>
                                    </div>
                                </div>
                            </article>
                        </div>
                        <div class="blog_left_sidebar">
                            <article class="row blog_item">
                                <div class="col-md-3">
                                    <div class="blog_info text-right">
                                        <ul class="blog_meta list_style">
                                            <li>
                                                    <a href="#"><div class="btn btn-success">Available</div></a>
                                            </li>
                                            <li><a href="#">Phu Khuong, Phu Tuc, Chau Thanh, Ben Tre, Phu Tuc, Chau Thanh, Ben Tre<i class="lnr lnr-home"></i></a></li>
                                            <li><a href="#">Binh Thuan<i class="lnr lnr-map-marker"></i></a></li>
                                            <li><a href="#">1.2M Views<i class="lnr lnr-eye"></i></a></li>
                                            <li><a href="#">6/ 10<i class="lnr lnr-star"></i></a></li>
                                            <li><a href="#"><h5>$500<small>/night</small></h5></a></li>
                                        </ul>
                                    </div>
                                </div>
                                <div class="col-md-9">
                                    <div class="blog_post">
                                        <img src="../Content/image/Resort/info/BT_infor_10.jpg" alt="">
                                        <div class="blog_details">
                                            <a href="DetailResort/4.html">
                                                <h2>Forever Green Resort</h2>
                                            </a>
                                            <p>You will enjoy popular activities such as sightseeing, cycling and casual walks around the charming town centre, observing local people trading in the colourful open market</p>
                                            <a href="DetailResort/4.html" class="view_btn button_hover">View More</a>
                                        </div>
                                    </div>
                                </div>
                            </article>
                        </div>
                <nav class="blog-pagination justify-content-center d-flex">
                    <div class="pagination-container"><ul class="pagination"><li class="active"><a>1</a></li><li><a href="ShowAllResort4658.html?page=2">2</a></li><li><a href="ShowAllResort9ba9.html?page=3">3</a></li><li class="PagedList-skipToNext"><a href="ShowAllResort4658.html?page=2" rel="next">Â»</a></li></ul></div>
                </nav>
            </div>
            <div class="col-lg-4">
<form action="http://localhost:2012/Home/ShowAllResort" method="post">                    <div class="blog_right_sidebar">
                        <aside class="single_sidebar_widget search_widget">
                            <div class="input-group">
                                <input id="SearchString" name="SearchString" type="text" value="" />
                                <span class="input-group-btn">
                                    <button class="btn btn-default submitButton" type="submit"><i class="lnr lnr-magnifier"></i></button>
                                </span>

                            </div>
                            <div class="br"></div>
                            <!-- /input-group -->
                        </aside>
                        <aside class="single_sidebar_widget author_widget">
                            <a class="genric-btn info-border circle arrow advanceSearchButton" data-toggle="collapse" data-target="#advanceSearch">
                                Advance Search<span class="iconButton lnr lnr-chevron-down"></span>
                            </a>
                            <div id="advanceSearch" class="collapse">
                                <div class="container" style="margin-top: 30px">
                                    <div class="mt-10" style="margin-bottom: 20px">
                                        <div class="col-lg-12">
                                            <div class="errorInput alert alert-danger"></div>
                                        </div>
                                    </div>
                                    <div class="mt-10" style="margin-bottom: 20px">
                                        <div class="col-lg-12">
                                            <div class="input-group-icon mt-10">
                                                <div class="icon"><i class="fa fa-plane" aria-hidden="true"></i></div>
                                                <div class="form-select" id="citySelect">
                                                    <select name="city">
                                                        <option value="">City</option>
                                                            <option value="BL">Bac Lieu</option>
                                                            <option value="BT">Binh Thuan</option>
                                                            <option value="BTR">Ben Tre</option>
                                                            <option value="CM">Ca Mau</option>
                                                            <option value="CT">Can Tho</option>
                                                            <option value="Dla">Da Lat</option>
                                                            <option value="DN">Da Nang</option>
                                                            <option value="DNA">Dong Nai</option>
                                                            <option value="KG">Kien Giang</option>
                                                            <option value="NT">Nha Trang</option>
                                                            <option value="PT">Phan Thiet</option>
                                                            <option value="QN">Quang Ninh</option>
                                                            <option value="SG">Sai Gon</option>
                                                            <option value="TN">Tay Ninh</option>
                                                            <option value="TV">Tra Vinh</option>
                                                            <option value="VT">Vung Tau</option>
                                                    </select>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="mt-10" style="margin-bottom: 20px">
                                        <div class="col-lg-12">
                                            <div class="switch-wrap d-flex justify-content-between" style="margin-top: 20px;">
                                                <label> Available </label>
                                                <div class="confirm-switch">
                                                    <input type="checkbox" name="isAvailable" id="confirm-switch" value="true" checked disabled>
                                                    <label for="confirm-switch"></label>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="mt-10" style="margin-bottom: 20px">
                                        <div class="col-lg-12">
                                            <div class="switch-wrap d-flex justify-content-between" style="margin-top: 20px;">
                                                <label for="formControlRange">Quality</label>
                                                <input type="range" min="1" max="10" value="" class="slider" name="quality" id="quality" style="margin-left: 10px;" disabled>
                                                <input type="text" id="resultRange" value="1" style="width: 30px; margin-left: 10px;margin-right:10px" disabled />/10 <i class="lnr lnr-star"></i>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="mt-10" style="margin-bottom: 20px">
                                        <div class="col-lg-12">
                                            <div class="switch-wrap d-flex justify-content-between" style="margin-top: 20px;">
                                                <label>Price</label>
                                                <input class="form-control" type="number" name="minPrice" id="minPrice" value="0" style="width:75px" disabled>
                                                <label>To</label>
                                                <input class="form-control" type="number" name="maxPrice" id="maxPrice" value="0" style="width:75px" disabled>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="mt-10">
                                        <div class="col-lg-12">
                                            <div class="switch-wrap d-flex justify-content-between" style="margin-top: 20px;">
                                                <label>Discount</label>
                                                <div class="primary-checkbox text-left">
                                                    <input type="checkbox" name="isDiscount" id="primary-checkbox" value="true" checked disabled>
                                                    <label for="primary-checkbox"></label>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="button-group-area mt-40">
                                        <button type="submit" class="submitAdvance genric-btn primary circle">Search</button>
                                    </div>
                                </div>
                            </div>
                        </aside>
                    </div>
</form>            </div>
        </div>
    </div>
</section>

<script>
    $(document).ready(function () {
        //$(".pagination-container").removeClass('pagination-container');
        $('.pagination').find('li').addClass('page-item').find('a').addClass('page-link');
        $('.blog-pagination').append($('.pagination'));
        $('.errorInput').hide();

        $('#SearchString').addClass('form-control').attr('placeholder', "Search");

        $("#quality").on('change', function () {
            $("#resultRange").val($("#quality").val());
        });

        $(".submitAdvance").hide();

        $('.advanceSearchButton').click(function () {
            if ($(this).find('.iconButton').hasClass('lnr-chevron-down')) {
                $(".submitButton").hide();
                $(".submitAdvance").show();
                $(this).find('.iconButton').removeClass('lnr-chevron-down').addClass('lnr-chevron-up');
                insideElement = $('form :input');
                for (let i = 0; i < insideElement.length; i++) {
                    let type = $(insideElement[i]).prop('type');
                    let id = $(insideElement[i]).prop('id')
                    if (type != 'submit' && id != 'resultRange') {
                        if (type == 'select-one') {
                            $(insideElement[i]).siblings('.nice-select').removeClass("disabled");
                        } else {
                            $(insideElement[i]).prop("disabled", false);
                        }

                    }
                }
            } else {
                $(".submitButton").show();
                $(".submitAdvance").hide();
                $(this).find('.iconButton').addClass('lnr-chevron-down').removeClass('lnr-chevron-up');
                insideElement = $('form :input');
                for (let i = 0; i < insideElement.length; i++) {
                    let type = $(insideElement[i]).prop('type');
                    let id = $(insideElement[i]).prop('id')
                    if (type != 'submit' && id != 'SearchString') {
                        if (type == 'select-one') {
                            $(insideElement[i]).siblings('.nice-select').addClass("disabled");
                        } else {
                            $(insideElement[i]).prop("disabled", true);
                        }

                    }
                }
            }

        });
        $('#maxPrice').change(function () {
            let minPrice = $('#minPrice').val();
            let maxPrice = $('#maxPrice').val();
            if (minPrice > maxPrice) {
                $('.errorInput').show();
                $('.errorInput').text('Max Price must greater than Min Price!');
            } else {
                $('.errorInput').hide();
            }
        })
        $('#minPrice').change(function () {
            let minPrice = $(this).val();
            let maxPrice = $('#maxPrice').val();
            if (minPrice > maxPrice) {
                $('.errorInput').show();
                $('.errorInput').text('Max Price must greater than Min Price!');
            } else {
                $('.errorInput').hide();
            }

        });

        $('#isDiscount').change(function () {
            if (!$(this).is(':checked')) {
                $(this).val(false);
            } else {
                $(this).val(true);
            }
        })

        $('#isAvailable').change(function () {
            if (!$(this).is(':checked')) {
                $(this).val(false);
            } else {
                $(this).val(true);
            }
        })
    });
</script>

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
                            <li><img src="../Content/image/instagram/Image-01.jpg" alt=""></li>
                            <li><img src="../Content/image/instagram/Image-02.jpg" alt=""></li>
                            <li><img src="../Content/image/instagram/Image-03.jpg" alt=""></li>
                            <li><img src="../Content/image/instagram/Image-04.jpg" alt=""></li>
                            <li><img src="../Content/image/instagram/Image-05.jpg" alt=""></li>
                            <li><img src="../Content/image/instagram/Image-06.jpg" alt=""></li>
                            <li><img src="../Content/image/instagram/Image-07.jpg" alt=""></li>
                            <li><img src="../Content/image/instagram/Image-08.jpg" alt=""></li>
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
    <script src="../Content/js/jquery-3.2.1.min.js"></script>
    <script src="../Content/js/popper.js"></script>
    <script src="../Content/js/bootstrap.min.js"></script>
    <script src="../Content/vendors/owl-carousel/owl.carousel.min.js"></script>
    <script src="../Content/js/jquery.ajaxchimp.min.js"></script>
    <script src="../Content/js/mail-script.js"></script>
    <script src="../Content/vendors/bootstrap-datepicker/bootstrap-datetimepicker.min.js"></script>
    <script src="../Content/vendors/nice-select/js/jquery.nice-select.js"></script>
    <script src="../Content/js/mail-script.js"></script>
    <script src="../Content/js/stellar.js"></script>
    <script src="../Content/vendors/lightbox/simpleLightbox.min.js"></script>
    <script src="../Content/js/custom.js"></script>

</body>

<!-- Mirrored from localhost:2012/Home/ShowAllResort by HTTrack Website Copier/3.x [XR&CO'2014], Fri, 25 Feb 2022 14:19:07 GMT -->
</html>