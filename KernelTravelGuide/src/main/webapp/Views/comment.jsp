<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.List"%>
<!DOCTYPE  html>
<html lang="en">
<body>
	<div class="comments-area">
		<h4>05 Comments</h4>
		<div class="comment-list">
			<div class="single-comment justify-content-between d-flex">
				<div class="user justify-content-between d-flex">
					<div class="thumb">
						<img src="Content/image/blog/c1.jpg" alt="">
					</div>
					<div class="desc">
						<h5>
							<a href="#">Emilly Blunt</a>
						</h5>
						<p class="date">December 4, 2017 at 3:12 pm</p>
						<p class="comment">Never say goodbye till the end comes!</p>
					</div>
				</div>
				<div class="reply-btn">
					<a href="#" class="btn-reply text-uppercase">reply</a>
				</div>
			</div>
		</div>
		<div class="comment-list left-padding">
			<div class="single-comment justify-content-between d-flex">
				<div class="user justify-content-between d-flex">
					<div class="thumb">
						<img src="Content/image/blog/c2.jpg" alt="">
					</div>
					<div class="desc">
						<h5>
							<a href="#">Elsie Cunningham</a>
						</h5>
						<p class="date">December 4, 2017 at 3:12 pm</p>
						<p class="comment">Never say goodbye till the end comes!</p>
					</div>
				</div>
				<div class="reply-btn">
					<a href="#" class="btn-reply text-uppercase">reply</a>
				</div>
			</div>
		</div>
		<div class="comment-list left-padding">
			<div class="single-comment justify-content-between d-flex">
				<div class="user justify-content-between d-flex">
					<div class="thumb">
						<img src="Content/image/blog/c3.jpg" alt="">
					</div>
					<div class="desc">
						<h5>
							<a href="#">Annie Stephens</a>
						</h5>
						<p class="date">December 4, 2017 at 3:12 pm</p>
						<p class="comment">Never say goodbye till the end comes!</p>
					</div>
				</div>
				<div class="reply-btn">
					<a href="#" class="btn-reply text-uppercase">reply</a>
				</div>
			</div>
		</div>
		<div class="comment-list">
			<div class="single-comment justify-content-between d-flex">
				<div class="user justify-content-between d-flex">
					<div class="thumb">
						<img src="Content/image/blog/c4.jpg" alt="">
					</div>
					<div class="desc">
						<h5>
							<a href="#">Maria Luna</a>
						</h5>
						<p class="date">December 4, 2017 at 3:12 pm</p>
						<p class="comment">Never say goodbye till the end comes!</p>
					</div>
				</div>
				<div class="reply-btn">
					<a href="#" class="btn-reply text-uppercase">reply</a>
				</div>
			</div>
		</div>
		<div class="comment-list">
			<div class="single-comment justify-content-between d-flex">
				<div class="user justify-content-between d-flex">
					<div class="thumb">
						<img src="Content/image/blog/c5.jpg" alt="">
					</div>
					<div class="desc">
						<h5>
							<a href="#">Ina Hayes</a>
						</h5>
						<p class="date">December 4, 2017 at 3:12 pm</p>
						<p class="comment">Never say goodbye till the end comes!</p>
					</div>
				</div>
				<div class="reply-btn">
					<a href="#" class="btn-reply text-uppercase">reply</a>
				</div>
			</div>
		</div>
	</div>
	<div class="comment-form">
		<h4>Leave a Reply</h4>
		<form>
			<div class="form-group form-inline">
				<div class="form-group col-lg-6 col-md-6 name">
					<input type="text" class="form-control" id="name"
						placeholder="Enter Name" onfocus="this.placeholder = ''"
						onblur="this.placeholder = 'Enter Name'">
				</div>
				<div class="form-group col-lg-6 col-md-6 email">
					<input type="email" class="form-control" id="email"
						placeholder="Enter email address" onfocus="this.placeholder = ''"
						onblur="this.placeholder = 'Enter email address'">
				</div>
			</div>
			<div class="form-group">
				<input type="text" class="form-control" id="subject"
					placeholder="Subject" onfocus="this.placeholder = ''"
					onblur="this.placeholder = 'Subject'">
			</div>
			<div class="form-group">
				<textarea class="form-control mb-10" rows="5" name="message"
					placeholder="Messege" onfocus="this.placeholder = ''"
					onblur="this.placeholder = 'Messege'" required=""></textarea>
			</div>
			<a href="#" class="primary-btn button_hover">Post Comment</a>
		</form>
	</div>


</body>


</html>