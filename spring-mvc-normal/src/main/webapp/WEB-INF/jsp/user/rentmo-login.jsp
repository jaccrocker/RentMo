<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <title>Welcome to Rentmo!</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/social-buttons-3.css"/>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/style.css"/>
</head>
<body>
<sec:authorize access="isAnonymous()">
	<div class="rentmo-login">
	<!-- <div style="border-style: dotted; background-image: url('/background.png'); width: 750px; height: 1334px;"> -->
		<div style="position: relative; left: 0; top: 0; height: 525px; border-style: dotted; text-align: center">
			<img src="${pageContext.request.contextPath}/static/images/rentmo.png" style="position: ; margin: auto; height: 50px;"/>
		</div>
		<div style="position: relative; bottom: 5px; border-style: dotted;" align="center">
			<a href="${pageContext.request.contextPath}/auth/facebook"><button class="btn btn-facebook"><i class="icon-facebook"></i> | <spring:message code="label.facebook.sign.in.button"/></button></a>
		</div>
		<div style="position: relative; bottom: 0px; border-style: dotted;" align="center">
			<a href="${pageContext.request.contextPath}/auth/twitter"><button class="btn btn-twitter"><i class="icon-twitter"></i> | <spring:message code="label.twitter.sign.in.button"/></button></a>
		</div>
	</div>
</sec:authorize>
<sec:authorize access="isAuthenticated()">
    <p><spring:message code="text.login.page.authenticated.user.help"/></p>
</sec:authorize>
</body>
</html>