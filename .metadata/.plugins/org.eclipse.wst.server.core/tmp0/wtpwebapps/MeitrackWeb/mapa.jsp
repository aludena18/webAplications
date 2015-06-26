<%@page import="com.aludena.mtkweb.getset.DatosMapaGetSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Insert title here</title>
	
	 <script type="text/javascript"
      src="http://maps.google.com/maps/api/js?sensor=false">
    </script>
    <script type="text/javascript">
      function initialize() {
    	var lat = document.getElementById("lat");  
    	var lon = document.getElementById("lon");
    	var fec = document.getElementById("fec");
    	var vel = document.getElementById("vel");
    	var miLatLon = new google.maps.LatLng(lat.value, lon.value);
    	
        var mapOptions = {
          center: miLatLon,
          zoom: 15,
          mapTypeId: google.maps.MapTypeId.ROADMAP
        };
        
        var map = new google.maps.Map(document.getElementById("map_canvas"),
            mapOptions);
        
        var marker = new google.maps.Marker({
            position: miLatLon,
            map: map,
            title:"Hello World!"
        });
        
        var contentString = '<p>Detalles</p>'+
						'<p>Fecha y Hora: '+ fec.value +'</p>'+
						'<p>Latitud:'+ lat.value +'</p>'+
						'<p>Longitud:'+ lon.value +'</p>'+
						'<p>Velocidad:'+ vel.value + " Kmh" +'</p>';
		
        var infowindow = new google.maps.InfoWindow({
            content: contentString
        });
        
        google.maps.event.addListener(marker, 'click', function() {
            infowindow.open(map,marker);
          });
      }
    </script>
</head>

<body onload="initialize()">

	<div id="map_canvas" style="width: 800px; height: 600px;"></div>

	<%
		DatosMapaGetSet datosMapa = (DatosMapaGetSet)session.getAttribute("GoogleMaps");
	%>
	<input type="hidden" value="<%=datosMapa.getLatMap() %>" name="lat" id="lat">
	<input type="hidden" value="<%=datosMapa.getLonMap() %>" name="lon" id="lon">
	<input type="hidden" value="<%=datosMapa.getFecMap() %>" name="fec" id="fec">
	<input type="hidden" value="<%=datosMapa.getVelMap() %>" name="vel" id="vel">


</body>
</html>