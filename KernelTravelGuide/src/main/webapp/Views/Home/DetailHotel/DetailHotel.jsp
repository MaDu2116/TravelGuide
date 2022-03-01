<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.List"%>
<!DOCTYPE  html>
<html lang="en">

<jsp:include page="../../header.jsp" />
<body>
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
									<li><a><div type="button" class="btn btn-success">Available</div></a>
									</li>
									<li><a>${hotelDto.addressHotel}<i class="lnr lnr-home"></i></a></li>
									<li><a>${hotelDto.nameCity}<i
											class="lnr lnr-map-marker"></i></a></li>
									<li><a>1.2M Views<i class="lnr lnr-eye"></i></a></li>
									<li><a>${hotelDto.qualityHotel}/ 10<i
											class="lnr lnr-star"></i></a></li>
									<li><a><h5>
												$${hotelDto.priceHotel}<small>/night</small>
											</h5></a></li>
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
							<p class="excert">${hotelDto.introductHotel}</p>
							<p>${hotelDto.desHotel}</p>
						</div>
						<div class="col-lg-12">
							<div class="quotes">MCSE boot camps have its supporters and
								its detractors. Some people do not understand why you should
								have to spend money on boot camp when you can get the MCSE study
								materials yourself at a fraction of the camp price. However, who
								has the willpower to actually sit through a self-imposed MCSE
								training.</div>
							<div class="row">
								<div class="googleMap"></div>
							</div>
						</div>
					</div>

					<jsp:include page="../../comment.jsp" />
				</div>
				<jsp:include page="../../popularPost.jsp" />
			</div>
		</div>
		
	</section>

	<jsp:include page="../../footer.jsp" />

</body>

</html>