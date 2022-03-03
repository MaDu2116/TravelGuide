<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.List"%>
<!DOCTYPE  html>
<html lang="en">

<!-- Mirrored from localhost:2012/Home/DetailHotel/2 by HTTrack Website Copier/3.x [XR&CO'2014], Fri, 25 Feb 2022 14:19:30 GMT -->
<!-- Added by HTTrack -->
<meta http-equiv="content-type" content="text/html;charset=utf-8" />
<!-- /Added by HTTrack -->
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="icon"
	href="<c:url value ='/Content/image/favicon.png' /> " type=" image/png" />
<title>Karnel Travel Guild</title>
<!-- Bootstrap CSS -->
<link href="<c:url value ='/Content/css/bootstrap.css'/> "
	rel="stylesheet" />
<link href="<c:url value ='/Content/vendors/linericon/style.css'/> "
	rel="stylesheet" />
<link rel="stylesheet"
	href="<c:url value = '../Content/css/font-awesome.min.css'/> " />
<link rel="stylesheet"
	href="<c:url value = '/Content/vendors/owl-carousel/owl.carousel.min.css'/> " />
<link rel="stylesheet"
	href="<c:url value ='/Content/vendors/bootstrap-datepicker/bootstrap-datetimepicker.min.css'/> " />
<link rel="stylesheet"
	href="<c:url value ='/Content/vendors/nice-select/css/nice-select.css'/> " />
<link rel="stylesheet"
	href="<c:url value ='/Content/vendors/owl-carousel/owl.carousel.min.css'/> " />
<!-- main css -->
<link rel="stylesheet" href="<c:url value ='/Content/css/style.css'/>" />
<link rel="stylesheet"
	href="<c:url value ='/Content/css/responsive.css'/> " />
<!-- Jquery-->
<script src="<c:url value ='/Scripts/jquery-3.3.1.min.js'/> "></script>
<script src="<c:url value ='/Scripts/pnotify.custom.min.js'/>"></script>
<link rel="stylesheet"
	href="<c:url value ='/Scripts/pnotify.custom.min.css'/> " />
</head>
<body>
	<!--================Header Area =================-->
	<header class="header_area">
		<div class="container">
			<nav class="navbar navbar-expand-lg navbar-light">
				<!-- Brand and toggle get grouped for better mobile display -->
				<a class="navbar-brand logo_h" href="home"><img
					src="<c:url value ='/Content/image/Logo.png'/>" alt=""></a>
				<button class="navbar-toggler" type="button" data-toggle="collapse"
					data-target="#navbarSupportedContent"
					aria-controls="navbarSupportedContent" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse offset"
					id="navbarSupportedContent">
					<ul class="nav navbar-nav menu_nav ml-auto">
						<li class="nav-item active"><a class="nav-link"
							href="/KernelTravelGuide/home">Home</a></li>
						<li class="nav-item submenu dropdown"><a href="#"
							class="nav-link dropdown-toggle" data-toggle="dropdown"
							role="button" aria-haspopup="true" aria-expanded="false">Information</a>
							<ul class="dropdown-menu">
								<li class="nav-item"><a class="nav-link"
									href="/KernelTravelGuide/infomation/showAllTouristSpot">Tourist
										Spots</a></li>
								<li class="nav-item"><a class="nav-link"
									href="/KernelTravelGuide/infomation/showAllHotel">Hotel</a></li>
								<li class="nav-item"><a class="nav-link"
									href="/KernelTravelGuide/infomation/showAllRestaurant">Restaurant</a></li>
								<li class="nav-item"><a class="nav-link"
									href="/KernelTravelGuide/infomation/showAllResort">Resort</a></li>
								<li class="nav-item"><a class="nav-link"
									href="/KernelTravelGuide/infomation/showAllTravel">Travel</a></li>
							</ul></li>
						<li class="nav-item"><a class="nav-link" href="AboutUs.jsp">About
								us</a></li>
						<li class="nav-item"><a class="nav-link" href="gallery.jsp">Gallery</a></li>
						<li class="nav-item"><a class="nav-link" href="contact.jsp">Contact</a></li>
						<li class="nav-item"><a class="nav-link"
							href="Account/Register.jsp">Register</a></li>
						<li class="nav-item"><a class="nav-link"
							href="Account/Login.jsp">Login</a></li>

					</ul>
				</div>
			</nav>
		</div>
	</header>

	<!--================ End footer Area  =================-->
	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="<c:url value ='/Content/js/jquery-3.2.1.min.js '/> "></script>
	<script src="<c:url value ='/Content/js/popper.js '/> "></script>
	<script src="<c:url value ='/Content/js/bootstrap.min.js '/> "></script>
	<script
		src="<c:url value ='/Content/vendors/owl-carousel/owl.carousel.min.js '/> "></script>
	<script src="<c:url value ='/Content/js/jquery.ajaxchimp.min.js '/> "></script>
	<script src="<c:url value ='/Content/js/mail-script.js '/> "></script>
	<script
		src="<c:url value ='/Content/vendors/bootstrap-datepicker/bootstrap-datetimepicker.min.js '/> "></script>
	<script
		src="<c:url value ='/Content/vendors/nice-select/js/jquery.nice-select.js '/> "></script>
	<script src="<c:url value ='/Content/js/mail-script.js '/> "></script>
	<script src="<c:url value ='/Content/js/stellar.js '/> "></script>
	<script
		src="<c:url value ='/Content/vendors/lightbox/simpleLightbox.min.js '/> "></script>
	<script src="<c:url value ='/Content/js/custom.js '/> "></script>
</body>

</html>