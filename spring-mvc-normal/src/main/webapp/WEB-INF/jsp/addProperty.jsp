<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Welcome to Rentmo!</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/css/addProperty.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/css/style.css" />
<!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script> -->
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
<script src="//code.jquery.com/jquery-1.10.2.js"></script>
<script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
<link rel="stylesheet" href="/resources/demos/style.css">
<script src="http://maps.googleapis.com/maps/api/js"></script>
<script>
/* function initialize() {
  var mapProp = {
    center:new google.maps.LatLng(33.8647556,-118.4059153),
    zoom:14,
    panControl:false,
    zoomControl:false,
    mapTypeControl:false,
    scaleControl:false,
    streetViewControl:false,
    overviewMapControl:false,
    rotateControl:false,  
    mapTypeId:google.maps.MapTypeId.ROADMAP
  };
  var map=new google.maps.Map(document.getElementById("googleMap"),mapProp);
  

	
	}
	google.maps.event.addDomListener(window, 'load', initialize); */
</script>
<script type="text/javascript">
	function gpsfunction() {
		document.getElementById('address-search-bar-white-background').value = '516 Bayview Dr Hermosa Beach, CA 90277';
	}
</script>
<script>
	$(function() {
		$("#due-date-input").datepicker();
	});
</script>
<script type="text/javascript">
	function generateFullName() {
		document.getElementById('address').value = document
				.getElementById('address-box-input').value
				+ ' '
				+ document.getElementById('address-box-1-input').value
				+ ' ' + document.getElementById('address-box-2-input').value;
	}
</script>
</head>
<body>
		<div id="content">
			<div id="address-search">
				<div id="address-search-bar-dark-background"></div>
				<!-- <div id="address-search-bar-white-background"></div> -->
				<input type="text" id="address-search-bar-white-background"
					class="address-search-bar-input" autofocus="autofocus" onkeypress="handle(event)"/> <img
					id="search-icon"
					src="${pageContext.request.contextPath}/static/images/addProperty/search-icon.png" />
				<img id="vertical-search-line"
					src="${pageContext.request.contextPath}/static/images/addProperty/vertical-search-line.png" />
			</div>
		<script>
			function handle(e) {
				if (e.keyCode === 13) {
					eventFire(document.getElementById('search-icon'), 'click');
				}

				return false;
			}
			function eventFire(el, etype){
				  if (el.fireEvent) {
				    el.fireEvent('on' + etype);
				  } else {
				    var evObj = document.createEvent('Events');
				    evObj.initEvent(etype, true, false);
				    el.dispatchEvent(evObj);
				  }
				}
		</script>
		<script>
				function initMap() {
					var map = new google.maps.Map(document
							.getElementById('googleMap'), {
						center:new google.maps.LatLng(33.8647556,-118.4059153),
					    zoom:14,
					    panControl:false,
					    zoomControl:false,
					    mapTypeControl:false,
					    scaleControl:false,
					    streetViewControl:false,
					    overviewMapControl:false,
					    rotateControl:false,
						//}
					});
					var geocoder = new google.maps.Geocoder();

					document.getElementById('search-icon').addEventListener('click',
							function() {
								geocodeAddress(geocoder, map);
							});
				}

				function geocodeAddress(geocoder, resultsMap) {
					var address = document.getElementById('address-search-bar-white-background').value;
					geocoder
							.geocode(
									{
										'address' : address
									},
									function(results, status) {
										if (status === google.maps.GeocoderStatus.OK) {
											resultsMap
													.setCenter(results[0].geometry.location);
											// Jac: Parse API results to address fields
											if(results[0].address_components[0].types == 'street_number')
											{
												var streetname = results[0].address_components[0].long_name + ' ' + results[0].address_components[1].long_name;
												document.getElementById('address-box-input').value = streetname;
												
												var cityStateZip = results[0].address_components[2].long_name + ',' + results[0].address_components[4].long_name + '  ' + results[0].address_components[6].long_name;
												document.getElementById('address-box-2-input').value = cityStateZip;
											}
											 
											
											var marker = new google.maps.Marker(
													{
														map : resultsMap,
														position : results[0].geometry.location
													});
											
										} else {
											alert('Geocode was not successful for the following reason: '
													+ status);
										}
									});
				}
			</script>
			<script
				src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBn7zHgHfvYUOnxV7fdc5FwGN0Mg12OmOM&signed_in=true&callback=initMap"
				async defer></script>
			<form:form
		action="${pageContext.request.contextPath}/landlord/addProperty"
		commandName="propertyDto" method="POST" enctype="utf8" role="form" id="addPropertySubmit">
		<input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
			
			<div id="address-search-results">
				<%-- <img id="google-map-overlay"
					src="${pageContext.request.contextPath}/static/images/addProperty/google-map-overlay.png" /> --%>
				<div id="googleMap" style="width:375px;height:250px;" class="google-map-overlay"></div>
				<!-- <div class="address-box"></div> -->
				<input type="text" id="address-box-input" class="address-box-input"
					value="2917 Hermosa Ave" onfocus="(this.value == '2917 Hermosa Ave') && (this.value = '')"
       onblur="(this.value == '') && (this.value = '2917 Hermosa Ave')"/>
				<!-- <div class="address-box-1"></div> -->
				<input type="text" id="address-box-1-input"
					class="address-box-input" value="Add aprtment #" onfocus="(this.value == 'Add aprtment #') && (this.value = '')"
       onblur="(this.value == '') && (this.value = 'Add aprtment #')"/>
				<!-- <div class="address-box-2"></div> -->
				<input type="text" id="address-box-2-input"
					class="address-box-input" value="Hermosa Beach, CA 90254" onfocus="(this.value == 'Hermosa Beach, CA 90254') && (this.value = '')"
       onblur="(this.value == '') && (this.value = 'Hermosa Beach, CA 90254')"/>
				<%-- <form:hidden path="address"/> --%>
				<!-- <input type="text" id="address" value=""/> -->
				<form:hidden path="simpleAddressBo.simpleAddress" id="address" />
				<div id="rental-details">
					<div id="security-deposit">
						<div id="security-deposit-text">Security Deposit:</div>
						<div id="security-deposit-div">
							<!-- <input type="text" id="security-deposit-input" value="$1,500"/> -->
							<form:input id="security-deposit-input" path="securityDeposit"
								value="$1,500" />
						</div>
					</div>
					<img id="under-deposit-line"
						src="${pageContext.request.contextPath}/static/images/addProperty/under-deposit-line.png" />
					<div id="rent-amount">
						<div id="rent-amount-text">Rent Amount:</div>
						<div id="rent-amount-div">
							<!-- <input type="text" id="rent-amount-input" value="$2,000"/> -->
							<form:input id="rent-amount-input" path="rentAmount"
								value="$2,000" />
						</div>
					</div>
					<img id="under-amount-line"
						src="${pageContext.request.contextPath}/static/images/addProperty/under-amount-line.png" />
					<div id="due-date">
						<div id="due-date-text">Due Date:</div>
						<div id="due-date-div">
							<!-- <input type="text" id="due-date-input" value="05/05/2014"/> -->
							<form:input id="due-date-input" path="dueDate" value="3/1/2016" />
							<%-- &nbsp;<img id="calendar-icon"
								src="${pageContext.request.contextPath}/static/images/addProperty/calendar-icon.png" /> --%>
						</div>
					</div>
				</div>
				<div id="action-buttons">
					<div id="add-photos-1">
						<img id="orange-oval"
							src="${pageContext.request.contextPath}/static/images/addProperty/orange-oval.png" />
						<div id="add-photos-icon">
							<img id="add-photos-frame"
								src="${pageContext.request.contextPath}/static/images/addProperty/add-photos-frame.png" />
							<img id="add-photos-mountain"
								src="${pageContext.request.contextPath}/static/images/addProperty/add-photos-mountain.png" />
							<div id="add-photos-sun"></div>
						</div>
						<div id="add-photos">
							<p class="text-style-3">Add Photos</p>
						</div>
					</div>
					<div id="add-tenants-1">
						<img id="blue-oval"
							src="${pageContext.request.contextPath}/static/images/addProperty/blue-oval.png" />
						<img id="add-tenant-icon"
							src="${pageContext.request.contextPath}/static/images/addProperty/add-tenant-icon.png" />
						<div id="add-tenants">
							<p class="text-style-3">Add Tenants</p>
						</div>
					</div>
				</div>
				<div id="pictures-section">
					<img id="under-buttons-line"
						src="${pageContext.request.contextPath}/static/images/addProperty/under-buttons-line.png" />
					<img id="left-arrow-1"
						src="${pageContext.request.contextPath}/static/images/addProperty/left-arrow.png" />
					<div id="pictures">
						<img id="property-pic"
							src="${pageContext.request.contextPath}/static/images/addProperty/property-pic.png" />
						<img id="property-pic-1"
							src="${pageContext.request.contextPath}/static/images/addProperty/property-pic-1.png" />
						<img id="property-pic-2"
							src="${pageContext.request.contextPath}/static/images/addProperty/property-pic-2.png" />
						<img id="property-pic-3"
							src="${pageContext.request.contextPath}/static/images/addProperty/property-pic-3.png" />
					</div>
					<img id="right-arrow"
						src="${pageContext.request.contextPath}/static/images/addProperty/right-arrow.png" />
				</div>
				<!-- <div id="create-property-button">
        <div id="create-orange-bar"></div>
        <div id="create">
            Create
        </div>
      </div> -->
				<button type="submit" onclick="generateFullName()"
					class="createButtonClass">Create</button>
			</div>
		</div>

	</form:form>
</body>
</html>