<%-- 
    Document   : header
    Created on : 24-Nov-2018, 10:53:53 AM
    Author     : TVD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>header</title>

<!-- css -->
<link href="<c:url value="/resources/common/css/bootstrap.css"/>"
	rel='stylesheet' type='text/css' />
<link href="<c:url value="/resources/common/css/etalage.css"/>"
	rel='stylesheet' type='text/css' />
<link href="<c:url value="/resources/common/css/style.css"/>"
	rel='stylesheet' type='text/css' />

<!--js-->
<script
	src="<c:url value="/resources/common/js/jquery.etalage.min.js" />"></script>
<script src="<c:url value="/resources/common/js/jquery.flexisel.js" />"></script>
<script src="<c:url value="/resources/common/js/jquery.min.js" />"></script>
<script src="<c:url value="/resources/common/js/nav.js" />"></script>
<script
	src="<c:url value="/resources/common/js/responsiveslides.min.js" />"></script>
<script type="application/x-javascript">
	
	
	
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); 
	 function hideURLbar(){ window.scrollTo(0,1); } 



</script>

<!--fonts-->
<link
	href='http://fonts.googleapis.com/css?family=Exo:100,200,300,400,500,600,700,800,900'
	rel='stylesheet' type='text/css'>

<style>
* {
	margin: 0;
	padding: 0;
}

/*==Style cơ bản cho website==*/
body {
	font-family: sans-serif;
	color: #333;
}

/*==Style cho menu===*/
#menu ul {
	background: #fb5e33;
	list-style-type: none;
	text-align: center;
}

#menu li {
	color: #f1f1f1;
	display: inline-block;
	width: 120px;
	height: 40px;
	line-height: 40px;
	margin-left: -5px;
}

#menu a {
	text-decoration: none;
	color: #fff;
	display: block;
}

#menu a:hover {
	background: #F1F1F1;
	color: #333;
}

/*==Dropdown Menu==*/
.sub-menu {
	display: none;
	position: absolute;
}

#menu li {
	position: relative;
}

#menu li:hover .sub-menu {
	display: block;
}

.sub-menu li {
	margin-left: 0 !important;
}

/*==Menu cấp 3==*/
.sub-menu>ul {
	display: none!mportant;
}

div#menu {
	margin-top: 15px;
}
Resources
</style>

<script type="text/javascript">
	jQuery(document).ready(function($) {
		$(".scroll").click(function(event) {
			event.preventDefault();
			$('html,body').animate({
				scrollTop : $(this.hash).offset().top
			}, 1000);
		});
	});
</script>
<!--slider-script-->
<script>
	$(function() {
		$("#slider1").responsiveSlides({
			auto : true,
			speed : 500,
			namespace : "callbacks",
			pager : true,
		});
	});
</script>
<!--//slider-script-->
<script>
	$(document).ready(function(c) {
		$('.alert-close').on('click', function(c) {
			$('.message').fadeOut('slow', function(c) {
				$('.message').remove();
			});
		});
	});
</script>
<script>
	$(document).ready(function(c) {
		$('.alert-close1').on('click', function(c) {
			$('.message1').fadeOut('slow', function(c) {
				$('.message1').remove();
			});
		});
	});
</script>

</head>
<body>

	<div class="header">
		<div class="header-top">
			<div class="container">
				<div class="header-top-in">
					<div class="logo">
						<a href="index"> <img
							src='<c:url value = "/resources/common/images/logo.png" />'
							alt=""></a>
					</div>
					<div class="header-in">
						<ul class="icon1 sub-icon1">
							<li><a href="wishlist">WISH LIST (0)</a></li>
							<li><a href="account"> MY ACCOUNT</a></li>
							<li><a href="/ManagerShop/cart"> SHOPPING CART</a></li>
							<li><a href="/ManagerShop/checkout">CHECKOUT</a></li>
							<li><div class="cart">
									<a href="#" class="cart-in"> </a> <span> 0</span>
								</div>
								<ul class="sub-icon1 list">
									<h3>Recently added items(2)</h3>
									<div class="shopping_cart">
										<div class="cart_box">
											<div class="message">
												<div class="alert-close"></div>
												<div class="list_img">
													<img
														src='<c:url value = "/resources/common/images/14.jpg"/>'
														class="img-responsive" alt="">
												</div>
												<div class="list_desc">
													<h4>
														<a href="#">velit esse molestie</a>
													</h4>
													1 x<span class="actual"> $12.00</span>
												</div>
												<div class="clearfix"></div>
											</div>
										</div>
										<div class="cart_box1">
											<div class="message1">
												<div class="alert-close1"></div>
												<div class="list_img">
													<img
														src='<c:url value = "/resources/common/images/15.jpg"/>'
														class="img-responsive" alt="">
												</div>
												<div class="list_desc">
													<h4>
														<a href="#">velit esse molestie</a>
													</h4>
													1 x<span class="actual"> $12.00</span>
												</div>
												<div class="clearfix"></div>
											</div>
										</div>
									</div>
									<div class="total">
										<div class="total_left">CartSubtotal :</div>
										<div class="total_right">$250.00</div>
										<div class="clearfix"></div>
									</div>
									<div class="login_buttons">
										<div class="check_button">
											<a href="checkout">Check out</a>
										</div>
										<div class="clearfix"></div>
									</div>
									<div class="clearfix"></div>
								</ul></li>
						</ul>
					</div>
					<div class="clearfix"></div>
				</div>
			</div>
		</div>
		<div class="header-bottom">

			<div id="menu">
				<ul>
					<li><a href="/ManagerShop/index">Home</a></li>
					<li><a href="#">Shop</a>
						<ul class="sub-menu">
							<li><a href="/category">CategoryA</a></li>
							<li><a href="products">CategoryB</a></li>
							<li><a href="products">CategoryC</a></li>
						</ul></li>
					<li><a href="/ManagerShop/contact">Contact</a></li>
				</ul>
			</div>

		</div>
		<div class="header-bottom-in">
			<div class="container">
				<div class="header-bottom-on">
					<p class="wel">
						<a href="#">Welcome visitor you can login or create an
							account.</a>
					</p>
					<div class="header-can">
						<ul class="social-in">
							<li><a href="#"><i> </i></a></li>
							<li><a href="#"><i class="facebook"> </i></a></li>
							<li><a href="#"><i class="twitter"> </i></a></li>
							<li><a href="#"><i class="skype"> </i></a></li>
						</ul>
						<div class="down-top">
							<select class="in-drop">
								<option value="Dollars" class="in-of">Dollars</option>
								<option value="Euro" class="in-of">Euro</option>
								<option value="Yen" class="in-of">Yen</option>
							</select>
						</div>
						<div class="search">
							<form>
								<input type="text" value="Search" onfocus="this.value = '';"
									onblur="if (this.value == '') {
                                                this.value = '';
                                            }">
								<input type="submit" value="">
							</form>
						</div>

						<div class="clearfix"></div>
					</div>
					<div class="clearfix"></div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>
