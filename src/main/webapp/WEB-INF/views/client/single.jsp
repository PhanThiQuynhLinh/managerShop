<%-- 
    Document   : single
    Created on : 24-Nov-2018, 11:27:07 AM
    Author     : TVD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>single</title>
    </head>
    <body>

            <div class="container">
                <div class="single">
                    <div class="col-md-9 top-in-single">
                        <div class="col-md-5 single-top">
                            <img class="img-responsive fashion" src ='<c:url value = "/resources/common/images/si.jpg" />'alt="">
                    </div>	
                    <div class="col-md-7 single-top-in">
                        <div class="single-para">
                            <h4>Lorem ipsum dolor sit amet, consectetur adipisicing elit</h4>
                            <div class="para-grid">
                                <span  class="add-to">$32.8</span>
                                <a href="#" class="hvr-shutter-in-vertical cart-to">Add to Cart</a>					
                                <div class="clearfix"></div>
                            </div>
                            <h5>100 items in stock</h5>
                            <div class="available">
                                <h6>Available Options :</h6>
                                <ul>
                                   
                                    <li>Quality:<select>
                                            <option>1</option>
                                            <option>2</option>
                                            <option>3</option>
                                            <option>4</option>
                                            <option>5</option>
                                        </select></li>
                                </ul>
                            </div>
                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.</p>
                        </div>
                    </div>
                    <div class="clearfix"> </div>
                </div>
              
                <div class="clearfix"> </div>
            </div>
        </div>
    </body>
</html>
