<%@page import="com.aludena.mtk.getset.DatosMapaGetSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Insert title here</title>
</head>
<body>

<input type="hidden" name="fyh" id="fyh" value=<%=((DatosMapaGetSet)session.getAttribute("paraMapa")).getTimeDate()%>>
<input type="hidden" name="lat" id="lat" value=<%=((DatosMapaGetSet)session.getAttribute("paraMapa")).getLatitud()%>>
<input type="hidden" name="lon" id="lon" value=<%=((DatosMapaGetSet)session.getAttribute("paraMapa")).getLongitud()%>>
<input type="hidden" name="vel" id="vel" value=<%=((DatosMapaGetSet)session.getAttribute("paraMapa")).getSpeed()%>>

<p>Google Maps</p>
<p>Fecha y Hora : <%=((DatosMapaGetSet)session.getAttribute("paraMapa")).getTimeDate()%></p>
<p>Latitud : <%=((DatosMapaGetSet)session.getAttribute("paraMapa")).getLatitud()%></p>
<p>Longitud : <%=((DatosMapaGetSet)session.getAttribute("paraMapa")).getLongitud()%></p>
<p>Velocidad : <%=((DatosMapaGetSet)session.getAttribute("paraMapa")).getSpeed()%></p>

	<div id="map" style="width: 500px; height: 400px;"></div>
	
	<script src="http://maps.google.com/maps/api/js?sensor=false&callback=init"></script>
	
	<script type="text/javascript">
		var fyh = document.getElementById("fyh");
		var lat = document.getElementById("lat");
		var lon = document.getElementById("lon");
		var vel = document.getElementById("vel");
		var map;
		var place;
		var marker;
		
		function init() {
			var mapOptions = {
				center: new google.maps.LatLng(lat.value, lon.value),
				zoom: 15,
				mapTypeId: google.maps.MapTypeId.ROADMAP
			}
			map = new google.maps.Map(document.getElementById("map"),mapOptions);
			
			place = new google.maps.LatLng(lat.value, lon.value);
			marker = new google.maps.Marker({
			        position: place,
			        title: "Detalle de Ubicacion",
			        map: map,
			});
			google.maps.event.addListener(marker, "click", showInfo);
		}

		function showInfo() {
				map.setZoom(15);
				map.setCenter(marker.getPosition());
				var iw = new google.maps.InfoWindow({
					content:'<p>Detalles</p>'+
							'<p>Fecha y Hora: '+ fyh.value +'</p>'+
							'<p>Latitud:'+ lat.value +'</p>'+
							'<p>Longitud:'+ lon.value +'</p>'+
							'<p>Velocidad:'+ vel.value + " Kmh" +'</p>'
				});
				iw.open(map,marker);
		}
		
	</script>
</body>
</html>