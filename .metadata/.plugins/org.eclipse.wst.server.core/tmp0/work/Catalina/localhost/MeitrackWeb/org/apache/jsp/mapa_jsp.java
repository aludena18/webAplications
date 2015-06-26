package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.aludena.mtkweb.getset.DatosMapaGetSet;

public final class mapa_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("\t<title>Insert title here</title>\r\n");
      out.write("\t\r\n");
      out.write("\t <script type=\"text/javascript\"\r\n");
      out.write("      src=\"http://maps.google.com/maps/api/js?sensor=false\">\r\n");
      out.write("    </script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("      function initialize() {\r\n");
      out.write("    \tvar lat = document.getElementById(\"lat\");  \r\n");
      out.write("    \tvar lon = document.getElementById(\"lon\");\r\n");
      out.write("    \tvar fec = document.getElementById(\"fec\");\r\n");
      out.write("    \tvar vel = document.getElementById(\"vel\");\r\n");
      out.write("    \tvar miLatLon = new google.maps.LatLng(lat.value, lon.value);\r\n");
      out.write("    \t\r\n");
      out.write("        var mapOptions = {\r\n");
      out.write("          center: miLatLon,\r\n");
      out.write("          zoom: 15,\r\n");
      out.write("          mapTypeId: google.maps.MapTypeId.ROADMAP\r\n");
      out.write("        };\r\n");
      out.write("        \r\n");
      out.write("        var map = new google.maps.Map(document.getElementById(\"map_canvas\"),\r\n");
      out.write("            mapOptions);\r\n");
      out.write("        \r\n");
      out.write("        var marker = new google.maps.Marker({\r\n");
      out.write("            position: miLatLon,\r\n");
      out.write("            map: map,\r\n");
      out.write("            title:\"Hello World!\"\r\n");
      out.write("        });\r\n");
      out.write("        \r\n");
      out.write("        var contentString = '<p>Detalles</p>'+\r\n");
      out.write("\t\t\t\t\t\t'<p>Fecha y Hora: '+ fec.value +'</p>'+\r\n");
      out.write("\t\t\t\t\t\t'<p>Latitud:'+ lat.value +'</p>'+\r\n");
      out.write("\t\t\t\t\t\t'<p>Longitud:'+ lon.value +'</p>'+\r\n");
      out.write("\t\t\t\t\t\t'<p>Velocidad:'+ vel.value + \" Kmh\" +'</p>';\r\n");
      out.write("\t\t\r\n");
      out.write("        var infowindow = new google.maps.InfoWindow({\r\n");
      out.write("            content: contentString\r\n");
      out.write("        });\r\n");
      out.write("        \r\n");
      out.write("        google.maps.event.addListener(marker, 'click', function() {\r\n");
      out.write("            infowindow.open(map,marker);\r\n");
      out.write("          });\r\n");
      out.write("      }\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body onload=\"initialize()\">\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"map_canvas\" style=\"width: 800px; height: 600px;\"></div>\r\n");
      out.write("\r\n");
      out.write("\t");

		DatosMapaGetSet datosMapa = (DatosMapaGetSet)session.getAttribute("GoogleMaps");
	
      out.write("\r\n");
      out.write("\t<input type=\"hidden\" value=\"");
      out.print(datosMapa.getLatMap() );
      out.write("\" name=\"lat\" id=\"lat\">\r\n");
      out.write("\t<input type=\"hidden\" value=\"");
      out.print(datosMapa.getLonMap() );
      out.write("\" name=\"lon\" id=\"lon\">\r\n");
      out.write("\t<input type=\"hidden\" value=\"");
      out.print(datosMapa.getFecMap() );
      out.write("\" name=\"fec\" id=\"fec\">\r\n");
      out.write("\t<input type=\"hidden\" value=\"");
      out.print(datosMapa.getVelMap() );
      out.write("\" name=\"vel\" id=\"vel\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
