<%-- 
    Document   : cart
    Created on : 25-Nov-2018, 11:56:43 AM
    Author     : TVD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>checkout</title>
</head>
<body>
	<br />
	<br />

	<div class="container">
		<div class="content">
			<div class="shopping_cart">
				<div class="cart_box">
					<div class="message">
						<div class="list_img">
							<img src='<c:url value = "/resources/common/images/pi1.jpg" />'
								class="img-responsive" alt="">
						</div>
						<div class="list_close">
							<a href="#">Remove item</a>
						</div>
						<div class="list_desc">
							<h4>
								<a href="#">Áo thun</a>
							</h4>
							3 X $30 = $60
						</div>
						<div class="clearfix"></div>
					</div>
					<div class="message">
						<div class="list_img">
							<img src='<c:url value = "/resources/common/images/pi1.jpg" />'
								class="img-responsive" alt="">
						</div>
						<div class="list_close">
							<a href="#">Remove item</a>
						</div>
						<div class="list_desc">
							<h4>
								<a href="#">Áo thun</a>
							</h4>
							3 X $30 = $60
						</div>
						<div class="clearfix"></div>
					</div>
				</div>
			</div>
			<div class="total">
				<div class="total_right">Free Shipping</div>
				<div class="clearfix"></div>
				<div class="total_right">
					Total: $120
				</div>
				<div class="clearfix"></div>
				<div class="total_right">
					VAT (10%): $12
				</div>
				<div class="clearfix"></div>
				<div class="total_right">
					Pay: $140
				</div>
				<div class="clearfix"></div>
			</div>
			
			<div class="clearfix"></div>
		</div>
		<div class="clearfix"></div>

		<div class="contact">
			<h2 class=" contact-in">CHECKOUT</h2>
			<div class="col-md-6 contact-top">
				<form>
					<h3>Want to work with me?</h3>
					<div>
						<span>Your Name</span>
						<input type = "text" name = "name" >
					</div>
					<div>
						<span>Your Email</span>
							<input type = "text" name = "email" >
					</div>
					<div>
						<span>Your Address</span>
							<input type = "text" name = "address" >
					</div>
					<input type="submit" value="SEND">
				</form>
			</div>
			<div class="clearfix"></div>
		</div>

	</div>

	<br />
	<br />

</body>
</html>
