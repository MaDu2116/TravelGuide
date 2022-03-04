<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.List"%>
<!DOCTYPE  html>
<html lang="en">
<jsp:include page="../header.jsp" />
<body>
	<section class="about_history_area section_gap">
		<div class="container">
			<div class="row">
				<div class="col-md-6 d_flex align-items-center">
					<div class="about_content ">
						<h2 class="title title_color">Register Your Information</h2>


						<form action="RegisterInfor" method="post">
							<input name="__RequestVerificationToken" type="hidden"
								value="hga3TTRk2SrwwWbUHlFgZ7mR4_4ybrvY-cRiCd8euO1THJ8-y7EeNYWWfLhXJsHhQGP1BhC0tZRQQyTpCjTbXm4kNmbkIf3-wNUqovYhzjU1" />
							<div class="form-horizontal">


								<div class="form-group">
									<label class="control-label col-md-2" for="EMAIL_USER">Email
										Address</label>
									<div class="col-md-10">
										<input class="form-control text-box single-line"
											data-val="true" data-val-email="Invalid Email Address"
											data-val-length="The field Email Address must be a string with a maximum length of 50."
											data-val-length-max="50"
											data-val-regex="No white space allowed"
											data-val-regex-pattern="^\S*$"
											data-val-required="The Email Address field is required."
											id="EMAIL_USER" name="EMAIL_USER" type="email" value="" /> <span
											class="field-validation-valid text-danger"
											data-valmsg-for="EMAIL_USER" data-valmsg-replace="true"></span>
									</div>
								</div>
								<div class="form-group">
									<label class="control-label col-md-2" for="PASS_USER">Password</label>
									<div class="col-md-10">
										<input class="form-control text-box single-line password"
											data-val="true"
											data-val-length="The field Password must be a string with a maximum length of 50."
											data-val-length-max="50"
											data-val-regex="No white space allowed"
											data-val-regex-pattern="^\S*$"
											data-val-required="The Password field is required."
											id="PASS_USER" name="PASS_USER" type="password" value="" />
										<span class="field-validation-valid text-danger"
											data-valmsg-for="PASS_USER" data-valmsg-replace="true"></span>
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-md-2" for="NAME_USER">Full
										Name</label>
									<div class="col-md-10">
										<input class="form-control text-box single-line"
											data-val="true"
											data-val-length="The field Full Name must be a string with a maximum length of 200."
											data-val-length-max="200"
											data-val-maxlength="The field Full Name must be a string or array type with a maximum length of &#39;50&#39;."
											data-val-maxlength-max="50"
											data-val-required="The Full Name field is required."
											id="NAME_USER" name="NAME_USER" type="text" value="" /> <span
											class="field-validation-valid text-danger"
											data-valmsg-for="NAME_USER" data-valmsg-replace="true"></span>
									</div>
								</div>
								<div class="form-group">
									<label class="control-label col-md-2" for="TEL_USER">Phone</label>
									<div class="col-md-10">
										<input class="form-control text-box single-line"
											data-val="true"
											data-val-length="The field Phone must be a string with a maximum length of 10."
											data-val-length-max="10"
											data-val-phone="The Phone field is not a valid phone number."
											data-val-regex="No white space allowed"
											data-val-regex-pattern="^\S*$" id="TEL_USER" name="TEL_USER"
											type="tel" value="" /> <span
											class="field-validation-valid text-danger"
											data-valmsg-for="TEL_USER" data-valmsg-replace="true"></span>
									</div>
								</div>
								<div class="form-group">
									<label class="control-label col-md-2" for="ADDRESS_USER">Address</label>
									<div class="col-md-10">
										<input class="form-control text-box single-line"
											data-val="true"
											data-val-length="The field Address must be a string with a maximum length of 200."
											data-val-length-max="200" id="ADDRESS_USER"
											name="ADDRESS_USER" type="text" value="" /> <span
											class="field-validation-valid text-danger"
											data-valmsg-for="ADDRESS_USER" data-valmsg-replace="true"></span>
									</div>
								</div>

								<div class="form-group">
									<div class="col-md-offset-2 col-md-10">
										<input type="submit" value="Create"
											class="button_hover theme_btn_two" />
									</div>
								</div>
							</div>
						</form>
					</div>
				</div>
				<div class="col-md-6">
					<img class="img-fluid" src="Content/image/about_bg.jpg"
						alt="img">
				</div>
			</div>
		</div>
	</section>
	<jsp:include page="../footer.jsp" />
</body>

</html>