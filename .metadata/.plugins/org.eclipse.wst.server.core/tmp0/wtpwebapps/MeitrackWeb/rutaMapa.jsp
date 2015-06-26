<%@page import="java.util.ArrayList"%>
<%@page import="com.aludena.mtkweb.getset.DatosTramaGetSet"%>
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
    <% 
		ArrayList<DatosTramaGetSet> listaRuta = (ArrayList<DatosTramaGetSet>)session.getAttribute("listaDatos"); 
		System.out.println("ruta : " + listaRuta);
	%>
      function initialize() {
    	var miLatLon = new google.maps.LatLng(-12.169885, -77.009406);
        var mapOptions = {
          center: miLatLon,
          zoom: 14,
          mapTypeId: google.maps.MapTypeId.ROADMAP
        };
        var map = new google.maps.Map(document.getElementById("map_canvas"),
            mapOptions);
        
        <%
        	System.out.println("marker");
        	int i = 0;
        	for(DatosTramaGetSet obj: listaRuta){
        		i++;
        		%>
        		var marker<%=i%> = new google.maps.Marker({
                    position: new google.maps.LatLng(<%= obj.getLatitud()%>, <%=obj.getLongitud() %>),
                    map: map,
                    title:"Detalle"
                });
        		
        		var contentString<%=i%> = '<p>Detalles</p>'+
							'<p>Fecha y Hora: '+<%=obj.getFecha() %> +'</p>'+
							'<p>Latitud:' +<%=obj.getLatitud() %> + '</p>'+
							'<p>Longitud:' +<%=obj.getLongitud() %> + '</p>'+
							'<p>Velocidad:' +<%=obj.getVelocidad() %> + " Kmh" +'</p>';
				
				var infowindow<%=i%> = new google.maps.InfoWindow({
							      content: contentString<%=i%>
							  });
				
				google.maps.event.addListener(marker<%=i%>, 'click', function() {
		            infowindow<%=i%>.open(map,marker<%=i%>);
		          });
				
        		<%
        	}
        %>
        
      }
    </script>
    
</head>
<body onload="initialize()">
<form action="" method="post" id="formaRuta">

	<div id="map_canvas" style="width: 800px; height: 600px;"></div>
	
	
</form>
</body>
</html>