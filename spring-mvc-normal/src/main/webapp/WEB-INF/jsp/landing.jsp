<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Tenant Properties</title>
</head>
<body>
	<div style="display: table; position: ; vertical-align: center; padding-top: 0cm; left: 0; top: 0; width: 428px; margin: auto; background-color: beige;">
		<div style="display: table-row; float: none; border-style: dotted; vertical-align: top; text-align: center;">
			<img src="${pageContext.request.contextPath}/static/images/rentmo.png" style="float: center; height: 30px;"/>
		</div>
		<div style="display: table-row; vertical-align: middle; text-align: center;">
			LOG IN
		</div>
		<div style="display: table-row; vertical-align: middle; text-align: center; background-color: #018dc0; color: white;">
			<a style="color: white;" href="/tenant/properties">LOG IN AS A TENANT</a>
		</div>
		<div style="display: table-row; vertical-align: bottom; text-align: center; background-color: #fd8d00; color: white;"> 
			<a style="color: white;" href="/landlord/addProperty">LOGIN AS A LANDLORD</a>
		</div>
	</div>
</body>
</html>