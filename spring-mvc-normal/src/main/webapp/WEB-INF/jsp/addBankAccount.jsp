<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Add Bank Account to RentMo</title>
</head>
<body>
	<div style="display: table; position: ; vertical-align: center; padding-top: 0cm; left: 0; top: 0; height: 50px; width: 428px; margin: auto; border-style: dotted; background-color: white;" align="center">
		<div style="display: table-cell; float: none; width: 33%; height: 100%; border-style: dotted;  vertical-align: middle; text-align: left;"> menu</div>
		<div style="display: table-cell; float: none; width: 33%; height: 100%; border-style: dotted; vertical-align: middle;" align="center"><img src="${pageContext.request.contextPath}/static/images/rentmo.png" style="float: center; height: 30px;"/></div>
		<div style="display: table-cell; float: none; width: 33%; height: 100%; border-style: dotted; color: #fe9d00; vertical-align: middle; text-align: right;"> <a style="color: #fe9d00;" href="/landing">Later</a></div>
	</div>
	<div class="addBankAccount">
		<div style="position: relative; left: 0; top: 0; height: 525px; border-style: dotted;" align="center"></div>
		<div style="display: table; position: ; vertical-align: center; padding-top: 0cm; left: 0; top: 0; height: 50px; width: 428px; margin: auto; border-style: dotted; " align="center">
			<div style="display: table-cell; float: none; width: 33%; height: 100%; border-style: dotted;  color: white; vertical-align: middle; text-align: center;">
				<img style="height: 50px;" src="${pageContext.request.contextPath}/static/images/paypal-logo.png" />
				<p>Paypal</p>
			</div>
			<div style="display: table-cell; float: none; width: 33%; height: 100%; border-style: dotted; color: white; vertical-align: middle;" align="center">
				<img style="height: 50px;" src="${pageContext.request.contextPath}/static/images/venmo-logo.png" />
				<p>Venmo</p>
			</div>
			<div style="display: table-cell; float: none; width: 33%; height: 100%; border-style: dotted; color: white; vertical-align: middle; text-align: center;">
				<img style="height: 50px;" src="${pageContext.request.contextPath}/static/images/stripe-logo.png" />
				<p>Stripe</p>
			</div>
		</div>		
	</div>
</body>
</html>