<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<title>Welcome to Rentmo!</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/css/tenantProperties.css" />
</head>
<body>
	<div id="property-1">
		<img id="property-1-image"
			src="${pageContext.request.contextPath}/static/images/tenantProperties/property-1-image.png" />
		<div id="address-bar-1">
			<img id="rentmo-icon-1"
				src="${pageContext.request.contextPath}/static/images/tenantProperties/rentmo-icon.png" />
			<div id="address-1-text">
				<div id="-hermosa-ave">
					<p class="text-style-2">2917 Hermosa Ave</p>
				</div>
				<div id="hermosa-beach-ca-90254">
					<p>Hermosa Beach, CA 90254</p>
				</div>
				<div id="apt-2-1">
					<p>APT 2</p>
				</div>
			</div>
			<img id="right-arrow-1"
				src="${pageContext.request.contextPath}/static/images/tenantProperties/right-arrow-1.png" />
		</div>
		<div id="tenant-group-1">
			<img id="tenant-1-pic-1"
				src="${pageContext.request.contextPath}/static/images/tenantProperties/tenant-1-pic-1.png" />
			<div id="tenant-1-halo-1"></div>
		</div>
		<img id="address-bottom-line"
			src="${pageContext.request.contextPath}/static/images/tenantProperties/address-bottom-line.png" />
	</div>
	<%-- <div id="property-1">
		<img id="property-1-image"
			src="${pageContext.request.contextPath}/static/images/tenantProperties/property-2-image.png" />
		<div id="address-bar-1">
			<img id="rentmo-icon-1"
				src="${pageContext.request.contextPath}/static/images/tenantProperties/rentmo-icon.png" />
			<div id="address-1-text">
				<div id="-hermosa-ave">
					<p class="text-style-2">2556 Miami Beach</p>
				</div>
				<div id="apt-2-1">
					<p>APT 2</p>
				</div>
				<div id="hermosa-beach-ca-90254">
					<p>Miami Beach, FL 14222</p>
				</div>
			</div>
			<img id="right-arrow-1"
				src="${pageContext.request.contextPath}/static/images/tenantProperties/right-arrow.png" />
		</div>
		<div id="tenant-group-1">
			<img id="tenant-1-pic-1"
				src="${pageContext.request.contextPath}/static/images/tenantProperties/tenant-1-pic.png" />
			<div id="tenant-1-halo-1"></div>
			<img id="tenant-1-pic-1"
				src="${pageContext.request.contextPath}/static/images/tenantProperties/tenant-2-pic.png" />
			<div id="tenant-1-halo-1"></div>
			<img id="tenant-1-pic-1"
				src="${pageContext.request.contextPath}/static/images/tenantProperties/tenant-3-pic.png" />
			<div id="tenant-1-halo-1"></div>
		</div>
	</div> --%>
</body>
</html>