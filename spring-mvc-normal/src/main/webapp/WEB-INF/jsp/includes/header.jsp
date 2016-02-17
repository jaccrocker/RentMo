<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div id="header">
	<div id="header-left">
		<c:choose>
			<c:when test="${not fn:endsWith(pageContext.request.requestURI, '/landlord/addProperty')}">
				<a href="/landing"><img style="width: 20px; margin-left: 20px;" src="${pageContext.request.contextPath}/static/images/header/menu-icon.png" /></a>
		    </c:when>    
		    <c:otherwise>
		        <a href="/landing"><img style="width: 20px; margin-left: 20px;" src="${pageContext.request.contextPath}/static/images/header/plus-sign-icon.png" /></a>
		   </c:otherwise>
		</c:choose>
	</div>
	<div id="header-center">
		<img style="width: 125px"
			src="${pageContext.request.contextPath}/static/images/rentmo.png"
			style="float: center; height: 30px;" />
	</div>
	<div id="header-right">
		<c:choose>
		    <c:when test="${not fn:endsWith(pageContext.request.requestURI, '/landlord/addProperty')}">
		        <a onclick="gpsfunction()" href="#" id="gps"><img style="width: 25px; margin-right: 20px;"
			src="${pageContext.request.contextPath}/static/images/header/gps-icon.png" /></a>
		    </c:when>    
		    <c:otherwise>
		        <a href="/landing"><img style="width: 20px; margin-right: 20px;"
			src="${pageContext.request.contextPath}/static/images/header/menu-icon.png" /></a>
		    </c:otherwise>
		</c:choose>
	</div>
</div>