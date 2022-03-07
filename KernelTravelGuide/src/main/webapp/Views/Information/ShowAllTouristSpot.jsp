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
					<c:forEach items="${touristSpotDtoList}" var="touristSpot">
						<div class="blog_left_sidebar">
							<article class="row blog_item">
								<div class="col-md-3">
									<div class="blog_info text-right" style="font-size: 30px;">
										<ul class="blog_meta list_style">
											<li><a href="#"><c:out
														value="${touristSpot.addressTouristSpot}" /><i
													class="lnr lnr-home"></i></a></li>
											<li><a href="#"><c:out
														value="${touristSpot.nameCity}" /><i
													class="lnr lnr-map-marker"></i></a></li>
											<li><a href="#">1.2M Views<i class="lnr lnr-eye"></i></a></li>
											<li><a href="#"><c:out
														value="${touristSpot.qualityTouristSpots}" />/ 10<i
													class="lnr lnr-star"></i></a></li>
										</ul>
									</div>
								</div>
								<div class="col-md-9">
									<div class="blog_post">
										<img src="../${touristSpot.imageTouristSpots}" alt="">
										<div class="blog_details">
											<a
												href="/KernelTravelGuide/detailTouristSpot?idTouristSpot=${touristSpot.idTouristSpot}">
												<h2>
													<c:out value="${touristSpot.nameTouristSpot}" />
												</h2>
											</a>
											<p>Note that the Students.cs has a StudentPhoto property
												which is assigned with [Required] attribute. This makes the
												relation one-to-one between Students and StudentPhotoes
												tables.</p>
											<a
												href="/KernelTravelGuide/detailTouristSpot?idTouristSpot=${touristSpot.idTouristSpot}"
												class="view_btn button_hover">View More</a>
										</div>
									</div>
								</div>
							</article>
						</div>
					</c:forEach>
					<nav class="blog-pagination justify-content-center d-flex">
						<div class="pagination-container">
							<ul class="pagination">
								<c:url value="showAllTouristSpot" var="myURL">
									<c:if
										test="${not empty requestScope.quality or not empty requestScope.SearchString}">
										<c:param name="SearchString" value="${SearchString}"></c:param>
										<c:param name="city" value="${city}" />
										<c:if test="${not empty requestScope.quality}">
											<c:param name="quality" value="${quality}" />
										</c:if>
									</c:if>
								</c:url>
								<c:forEach var="pageId" items="${listPaging}"
									varStatus="pageIndex">
									<c:if test="${pageIndex.first and pageId > 3}">
										<c:url value="${myURL}" var="myURLL">
											<c:param name="currentPage" value="${pageId - 1}" />
										</c:url>
										<li class="page-item"><a href="${myURLL}"
											class="page-link">&laquo;</a></li>
									</c:if>
									<c:choose>

										<c:when test="${fn:length(listPaging) gt 1}">
											<c:url value="${myURL}" var="myURLL">
												<c:param name="currentPage" value="${pageId}" />
											</c:url>
											<c:choose>
												<c:when test="${ currentPage eq pageId }">
													<li class="page-item active"><a href="${myURLL}"
														class="page-link">${pageId}</a></li>
												</c:when>
												<c:otherwise>
													<li class="page-item"><a href="${myURLL}"
														class="page-link">${pageId}</a></li>
												</c:otherwise>
											</c:choose>
											<c:if test="${pageIndex.last and pageId < totalPage}">
												<c:url value="${myURL}" var="myURLL">
													<c:param name="currentPage" value="${pageId+1}" />
												</c:url>
												<li class="page-item"><a href="${myURLL}"
													class="page-link">&raquo;</a></li>
											</c:if>
										</c:when>
										<c:when
											test="${(fn:length(listPaging) eq 1) and (pageId gt 3)}">
											<c:url value="${myURL}" var="myURLL">
												<c:param name="currentPage" value="${pageId}" />
											</c:url>
											<li class="page-item active"><a href="${myURLL}"
												class="page-link">${pageId}</a></li>
										</c:when>
									</c:choose>

								</c:forEach>
							</ul>
						</div>
					</nav>

				</div>

				<div class="col-lg-4">
					<form action="/KernelTravelGuide/infomation/showAllTouristSpot"
						method="get">
						<input type="hidden" name="currentPage" value="1" />
						<div class="blog_right_sidebar">
							<aside class="single_sidebar_widget search_widget">
								<div class="input-group">

									<input id="SearchString" name="SearchString" type="text"
										value="<c:out value="${requestScope.SearchString}"/>" /> <span class="input-group-btn">
										<button class="btn btn-default submitButton" type="submit">
											<i class="lnr lnr-magnifier"></i>
										</button>
									</span>
								</div>
								<!-- /input-group -->
								<div class="br"></div>
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
															<c:forEach var="nameCity" items="${nameCityList}">
																<option value="${nameCity}" <c:if test="${nameCity eq requestScope.city}">selected="selected"</c:if>>${nameCity}</option>
															</c:forEach>
														</select>
													</div>
												</div>
											</div>
										</div>
										<div class="mt-10" style="margin-bottom: 20px">
											<div class="col-lg-12">
												<div class="switch-wrap d-flex justify-content-between"
													style="margin-top: 20px;">
													<label for="formControlRange">Quality</label> <input
														type="range" min="1" max="10" value="<c:out value="${requestScope.quality}"/>" class="slider"
														disabled name="quality" id="quality"
														style="margin-left: 10px;"> <input type="text"
														id="resultRange"
														<c:choose>
															<c:when test="${empty requestScope.quality}">
																value="6"
															</c:when>
															<c:otherwise>
																value="<c:out value="${requestScope.quality}"/>"
															</c:otherwise>
														</c:choose>
														style="width: 30px; margin-left: 10px; margin-right: 10px"
														disabled />/10 <i class="lnr lnr-star"></i>
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
                            $(insideElement[i]).val("");
                        } else {
                            $(insideElement[i]).prop("disabled", true);
                        }
                    }
                }
            }

        });
    });
	</script>
	<jsp:include page="../footer.jsp" />
</body>

</html>