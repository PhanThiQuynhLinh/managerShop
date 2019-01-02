<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html>
<head>

</head>
<body>
	<div class="page-container">
		<div class="left-content">
			<div class="mother-grid-inner">
				<tiles:insertAttribute name="header"></tiles:insertAttribute>
				<tiles:insertAttribute name="content"></tiles:insertAttribute>
				<tiles:insertAttribute name="footer"></tiles:insertAttribute>
			</div>
		</div>
		<tiles:insertAttribute name="navigation"></tiles:insertAttribute>
	</div>
</body>
</html>