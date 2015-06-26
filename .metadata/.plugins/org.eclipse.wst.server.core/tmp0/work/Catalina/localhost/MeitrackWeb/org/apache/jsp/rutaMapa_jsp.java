package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import com.aludena.mtkweb.getset.DatosTramaGetSet;

public final class rutaMapa_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("\t<title>Insert title here</title>\r\n");
      out.write("\t\r\n");
      out.write("\t<script type=\"text/javascript\"\r\n");
      out.write("      src=\"http://maps.google.com/maps/api/js?sensor=false\">\r\n");
      out.write("    </script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("    ");
 
		ArrayList<DatosTramaGetSet> listaRuta = (ArrayList<DatosTramaGetSet>)session.getAttribute("listaDatos"); 
		System.out.println("ruta : " + listaRuta);
	
      out.write("\r\n");
      out.write("      function initialize() {\r\n");
      out.write("    \tvar miLatLon = new google.maps.LatLng(-12.169885, -77.009406);\r\n");
      out.write("        var mapOptions = {\r\n");
      out.write("          center: miLatLon,\r\n");
      out.write("          zoom: 14,\r\n");
      out.write("          mapTypeId: google.maps.MapTypeId.ROADMAP\r\n");
      out.write("        };\r\n");
      out.write("        var map = new google.maps.Map(document.getElementById(\"map_canvas\"),\r\n");
      out.write("            mapOptions);\r\n");
      out.write("        \r\n");
      out.write("        ");

        	System.out.println("marker");
        	int i = 0;
        	for(DatosTramaGetSet obj: listaRuta){
        		i++;
        		
      out.write("\r\n");
      out.write("        \t\tvar marker");
      out.print(i);
      out.write(" = new google.maps.Marker({\r\n");
      out.write("                    position: new google.maps.LatLng(");
      out.print( obj.getLatitud());
      out.write(',');
      out.write(' ');
      out.print(obj.getLongitud() );
      out.write("),\r\n");
      out.write("                    map: map,\r\n");
      out.write("                    title:\"Detalle\"\r\n");
      out.write("                });\r\n");
      out.write("        \t\t\r\n");
      out.write("        \t\tvar contentString");
      out.print(i);
      out.write(" = '<p>Detalles</p>'+\r\n");
      out.write("\t\t\t\t\t\t\t'<p>Fecha y Hora: '+");
      out.print(obj.getFecha() );
      out.write(" +'</p>'+\r\n");
      out.write("\t\t\t\t\t\t\t'<p>Latitud:' +");
      out.print(obj.getLatitud() );
      out.write(" + '</p>'+\r\n");
      out.write("\t\t\t\t\t\t\t'<p>Longitud:' +");
      out.print(obj.getLongitud() );
      out.write(" + '</p>'+\r\n");
      out.write("\t\t\t\t\t\t\t'<p>Velocidad:' +");
      out.print(obj.getVelocidad() );
      out.write(" + \" Kmh\" +'</p>';\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tvar infowindow");
      out.print(i);
      out.write(" = new google.maps.InfoWindow({\r\n");
      out.write("\t\t\t\t\t\t\t      content: contentString");
      out.print(i);
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t  });\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tgoogle.maps.event.addListener(marker");
      out.print(i);
      out.write(", 'click', function() {\r\n");
      out.write("\t\t            infowindow");
      out.print(i);
      out.write(".open(map,marker");
      out.print(i);
      out.write(");\r\n");
      out.write("\t\t          });\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("        \t\t");

        	}
        
      out.write("\r\n");
      out.write("        \r\n");
      out.write("      }\r\n");
      out.write("    </script>\r\n");
      out.write("    \r\n");
      out.write("</head>\r\n");
      out.write("<body onload=\"initialize()\">\r\n");
      out.write("<form action=\"\" method=\"post\" id=\"formaRuta\">\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"map_canvas\" style=\"width: 800px; height: 600px;\"></div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("</form>\r\n");
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
