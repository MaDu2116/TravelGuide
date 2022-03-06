<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page import="java.util.List"%>
<!DOCTYPE  html>
<html lang="en">
<jsp:include page="../header.jsp" />
<body>
	<section class="blog_area">
		<div class="container">
			<div class="row">
				<div class="col-lg-8">
					<div class="blog_left_sidebar">
						<article class="row blog_item">
							<div class="col-md-3">
								<div class="blog_info text-right">
									<ul class="blog_meta list_style">
										<li><a href="#"><div class="btn btn-success">Available</div></a>
										</li>
										<li><a href="#">128 Vo Thi Sau Street, Zone 2, Ward
												8, Bac Lieu City, Vietnam<i class="lnr lnr-home"></i>
										</a></li>
										<li><a href="#">Bac Lieu<i class="lnr lnr-map-marker"></i></a></li>
										<li><a href="#">1.2M Views<i class="lnr lnr-eye"></i></a></li>
										<li><a href="#">9/ 10<i class="lnr lnr-star"></i></a></li>
										<li><a href="#"><h5>
													$500<small>/night</small>
												</h5></a></li>
									</ul>
								</div>
							</div>
							<div class="col-md-9">
								<div class="blog_post">
									<img src="../Content/image/Restaurant/infor/BL_infor_1.jpg"
										alt="">
									<div class="blog_details">
										<a href="DetailRestaurant/1.html">
											<h2>Thuyen Trang Quan</h2>
										</a>
										<p>Serving delicious international and local cuisine in a
											romantic ambience. The delectable buffet spread, together
											with the amorous setting of both the indoor and terrace
											seating areas</p>
										<a href="DetailRestaurant/1.html"
											class="view_btn button_hover">View More</a>
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
										<li><a href="#"><div class="btn btn-success">Available</div></a>
										</li>
										<li><a href="#">98 C My Thanh An, Ben Tre 83000,
												Vietnam<i class="lnr lnr-home"></i>
										</a></li>
										<li><a href="#">Ben Tre<i class="lnr lnr-map-marker"></i></a></li>
										<li><a href="#">1.2M Views<i class="lnr lnr-eye"></i></a></li>
										<li><a href="#">9/ 10<i class="lnr lnr-star"></i></a></li>
										<li><a href="#"><h5>
													$500<small>/night</small>
												</h5></a></li>
									</ul>
								</div>
							</div>
							<div class="col-md-9">
								<div class="blog_post">
									<img src="../Content/image/Restaurant/infor/DN_infor_2.jpg"
										alt="">
									<div class="blog_details">
										<a href="DetailRestaurant/2.html">
											<h2>3D Coffee</h2>
										</a>
										<p>Serving delicious international and local cuisine in a
											romantic ambience. The delectable buffet spread, together
											with the amorous setting of both the indoor and terrace
											seating areas</p>
										<a href="DetailRestaurant/2.html"
											class="view_btn button_hover">View More</a>
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
										<li><a href="#"><div class="btn btn-success">Available</div></a>
										</li>
										<li><a href="#">2 Hai Ba Trung | Tan An, Ninh Kieu,
												Can Tho 10.029656, Vietnam<i class="lnr lnr-home"></i>
										</a></li>
										<li><a href="#">Can Tho<i class="lnr lnr-map-marker"></i></a></li>
										<li><a href="#">1.2M Views<i class="lnr lnr-eye"></i></a></li>
										<li><a href="#">9/ 10<i class="lnr lnr-star"></i></a></li>
										<li><a href="#"><h5>
													$500<small>/night</small>
												</h5></a></li>
									</ul>
								</div>
							</div>
							<div class="col-md-9">
								<div class="blog_post">
									<img src="../Content/image/Restaurant/infor/CT_infor_2.jpg"
										alt="">
									<div class="blog_details">
										<a href="DetailRestaurant/3.html">
											<h2>Caf&#233; Lotus Ninh Kieu</h2>
										</a>
										<p>Serving delicious international and local cuisine in a
											romantic ambience. The delectable buffet spread, together
											with the amorous setting of both the indoor and terrace
											seating areas</p>
										<a href="DetailRestaurant/3.html"
											class="view_btn button_hover">View More</a>
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
										<li><a href="#"><div class="btn btn-success">Available</div></a>
										</li>
										<li><a href="#">29 Quang Dung Street, Thanh Khe
												District, Danang<i class="lnr lnr-home"></i>
										</a></li>
										<li><a href="#">Da Nang<i class="lnr lnr-map-marker"></i></a></li>
										<li><a href="#">1.2M Views<i class="lnr lnr-eye"></i></a></li>
										<li><a href="#">9/ 10<i class="lnr lnr-star"></i></a></li>
										<li><a href="#"><h5>
													$500<small>/night</small>
												</h5></a></li>
									</ul>
								</div>
							</div>
							<div class="col-md-9">
								<div class="blog_post">
									<img src="../Content/image/Restaurant/infor/DN_infor_1.jpg"
										alt="">
									<div class="blog_details">
										<a href="DetailRestaurant/4.html">
											<h2>Anchor Beer Club</h2>
										</a>
										<p>Serving delicious international and local cuisine in a
											romantic ambience. The delectable buffet spread, together
											with the amorous setting of both the indoor and terrace
											seating areas</p>
										<a href="DetailRestaurant/4.html"
											class="view_btn button_hover">View More</a>
									</div>
								</div>
							</div>
						</article>
					</div>
					<nav class="blog-pagination justify-content-center d-flex">
						<div class="pagination-container">
							<ul class="pagination">
								<li class="active"><a>1</a></li>
								<li><a href="ShowAllRestaurant4658.html?page=2">2</a></li>
								<li><a href="ShowAllRestaurant9ba9.html?page=3">3</a></li>
								<li class="PagedList-skipToNext"><a
									href="ShowAllRestaurant4658.html?page=2" rel="next">Â»</a></li>
							</ul>
						</div>
					</nav>
				</div>
				<div class="col-lg-4">
					<form action="http://localhost:2012/Home/ShowAllRestaurant"
						method="post">
						<div class="blog_right_sidebar">
							<aside class="single_sidebar_widget search_widget">
								<div class="input-group">
									<input id="SearchString" name="SearchString" type="text"
										value="" /> <span class="input-group-btn">
										<button class="btn btn-default submitButton" type="submit">
											<i class="lnr lnr-magnifier"></i>
										</button>
									</span>

								</div>
								<div class="br"></div>
								<!-- /input-group -->
							</aside>
							<aside class="single_sidebar_widget author_widget">
								<a
									class="genric-btn info-border circle arrow advanceSearchButton"
									data-toggle="collapse" data-target="#advanceSearch">
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
													<div class="icon">
														<i class="fa fa-plane" aria-hidden="true"></i>
													</div>
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
												<div class="switch-wrap d-flex justify-content-between"
													style="margin-top: 20px;">
													<label> Available </label>
													<div class="confirm-switch">
														<input type="checkbox" name="isAvailable"
															id="confirm-switch" value="true" checked disabled>
														<label for="confirm-switch"></label>
													</div>
												</div>
											</div>
										</div>
										<div class="mt-10" style="margin-bottom: 20px">
											<div class="col-lg-12">
												<div class="switch-wrap d-flex justify-content-between"
													style="margin-top: 20px;">
													<label for="formControlRange">Quality</label> <input
														type="range" min="1" max="10" value="" class="slider"
														name="quality" id="quality" style="margin-left: 10px;"
														disabled> <input type="text" id="resultRange"
														value="1"
														style="width: 30px; margin-left: 10px; margin-right: 10px"
														disabled />/10 <i class="lnr lnr-star"></i>
												</div>
											</div>
										</div>
										<div class="mt-10" style="margin-bottom: 20px">
											<div class="col-lg-12">
												<div class="switch-wrap d-flex justify-content-between"
													style="margin-top: 20px;">
													<label>Price</label> <input class="form-control"
														type="number" name="minPrice" id="minPrice" value="0"
														style="width: 75px" disabled> <label>To</label> <input
														class="form-control" type="number" name="maxPrice"
														id="maxPrice" value="0" style="width: 75px" disabled>
												</div>
											</div>
										</div>
										<div class="mt-10">
											<div class="col-lg-12">
												<div class="switch-wrap d-flex justify-content-between"
													style="margin-top: 20px;">
													<label>Discount</label>
													<div class="primary-checkbox text-left">
														<input type="checkbox" name="isDiscount"
															id="primary-checkbox" value="true" checked disabled>
														<label for="primary-checkbox"></label>
													</div>
												</div>
											</div>
										</div>
										<div class="button-group-area mt-40">
											<button type="submit"
												class="submitAdvance genric-btn primary circle">Search</button>
										</div>
									</div>
								</div>
							</aside>
						</div>
					</form>
				</div>
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
        $("#city").on('change', function () {
            $("#resultRange").val($("#city").val());
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
	<jsp:include page="../footer.jsp" />
</body>

<!-- Mirrored from localhost:2012/Home/ShowAllRestaurant by HTTrack Website Copier/3.x [XR&CO'2014], Fri, 25 Feb 2022 14:18:48 GMT -->
</html>