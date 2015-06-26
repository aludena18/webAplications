package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.aludena.mtk.getset.DatosMapaGetSet;

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
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<input type=\"hidden\" name=\"fyh\" id=\"fyh\" value=");
      out.print(((DatosMapaGetSet)session.getAttribute("paraMapa")).getTimeDate());
      out.write(">\r\n");
      out.write("<input type=\"hidden\" name=\"lat\" id=\"lat\" value=");
      out.print(((DatosMapaGetSet)session.getAttribute("paraMapa")).getLatitud());
      out.write(">\r\n");
      out.write("<input type=\"hidden\" name=\"lon\" id=\"lon\" value=");
      out.print(((DatosMapaGetSet)session.getAttribute("paraMapa")).getLongitud());
      out.write(">\r\n");
      out.write("<input type=\"hidden\" name=\"vel\" id=\"vel\" value=");
      out.print(((DatosMapaGetSet)session.getAttribute("paraMapa")).getSpeed());
      out.write(">\r\n");
      out.write("\r\n");
      out.write("<p>Google Maps</p>\r\n");
      out.write("<p>Fecha y Hora : ");
      out.print(((DatosMapaGetSet)session.getAttribute("paraMapa")).getTimeDate());
      out.write("</p>\r\n");
      out.write("<p>Latitud : ");
      out.print(((DatosMapaGetSet)session.getAttribute("paraMapa")).getLatitud());
      out.write("</p>\r\n");
      out.write("<p>Longitud : ");
      out.print(((DatosMapaGetSet)session.getAttribute("paraMapa")).getLongitud());
      out.write("</p>\r\n");
      out.write("<p>Velocidad : ");
      out.print(((DatosMapaGetSet)session.getAttribute("paraMapa")).getSpeed());
      out.write("</p>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"map\" style=\"width: 500px; height: 400px;\"></div>\r\n");
      out.write("\t\r\n");
      out.write("\t<script src=\"http://maps.google.com/maps/api/js?sensor=false&callback=init\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tvar fyh = document.getElementById(\"fyh\");\r\n");
      out.write("\t\tvar lat = document.getElementById(\"lat\");\r\n");
      out.write("\t\tvar lon = document.getElementById(\"lon\");\r\n");
      out.write("\t\tvar vel = document.getElementById(\"vel\");\r\n");
      out.write("\t\tvar map;\r\n");
      out.write("\t\tvar place;\r\n");
      out.write("\t\tvar marker;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction init() {\r\n");
      out.write("\t\t\tvar mapOptions = {\r\n");
      out.write("\t\t\t\tcenter: new google.maps.LatLng(lat.value, lon.value),\r\n");
      out.write("\t\t\t\tzoom: 15,\r\n");
      out.write("\t\t\t\tmapTypeId: google.maps.MapTypeId.ROADMAP\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tmap = new google.maps.Map(document.getElementById(\"map\"),mapOptions);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tplace = new google.maps.LatLng(lat.value, lon.value);\r\n");
      out.write("\t\t\tmarker = new google.maps.Marker({\r\n");
      out.write("\t\t\t        position: place,\r\n");
      out.write("\t\t\t        title: \"Detalle de Ubicacion\",\r\n");
      out.write("\t\t\t        map: map,\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\tgoogle.maps.event.addListener(marker, \"click\", showInfo);\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction showInfo() {\r\n");
      out.write("\t\t\t\tmap.setZoom(15);\r\n");
      out.write("\t\t\t\tmap.setCenter(marker.getPosition());\r\n");
      out.write("\t\t\t\tvar iw = new google.maps.InfoWindow({\r\n");
      out.write("\t\t\t\t\tcontent:'<p>Detalles</p>'+\r\n");
      out.write("\t\t\t\t\t\t\t'<p>Fecha y Hora: '+ fyh.value +'</p>'+\r\n");
      out.write("\t\t\t\t\t\t\t'<p>Latitud:'+ lat.value +'</p>'+\r\n");
      out.write("\t\t\t\t\t\t\t'<p>Longitud:'+ lon.value +'</p>'+\r\n");
      out.write("\t\t\t\t\t\t\t'<p>Velocidad:'+ vel.value + \" Kmh\" +'</p>'\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\tiw.open(map,marker);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t</script>\r\n");
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
