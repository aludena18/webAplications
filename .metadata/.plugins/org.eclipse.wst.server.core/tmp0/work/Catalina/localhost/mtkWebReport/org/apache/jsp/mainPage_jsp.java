package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
import com.aludena.mtk.getset.DatosTramaGetSet;

public final class mainPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("\t<title>Insert title here</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"Estilos/Estilos.css\">\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tfunction consultar() {\r\n");
      out.write("\t\t\tvar formaMain = document.getElementById(\"formaMain\");\r\n");
      out.write("\t\t\tvar accion = document.getElementById(\"accion\");\r\n");
      out.write("\t\t\tformaMain.action = \"consultaServlet.alg\";\r\n");
      out.write("\t\t\taccion.value = \"consulta\";\r\n");
      out.write("\t\t\tformaMain.submit();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction ubicar(latitud,longitud,timeDate,speed) {\r\n");
      out.write("\t\t\tvar formaMain = document.getElementById(\"formaMain\");\r\n");
      out.write("\t\t\tvar lat = document.getElementById(\"lat\");\r\n");
      out.write("\t\t\tvar lon = document.getElementById(\"lon\");\r\n");
      out.write("\t\t\tvar tDate = document.getElementById(\"timeDate\");\r\n");
      out.write("\t\t\tvar spd = document.getElementById(\"speed\");\r\n");
      out.write("\t\t\tformaMain.action = \"ubicaMapaServlet.alg\";\r\n");
      out.write("\t\t\tlat.value = latitud;\r\n");
      out.write("\t\t\tlon.value = longitud;\r\n");
      out.write("\t\t\ttDate.value = timeDate;\r\n");
      out.write("\t\t\tspd.value = speed;\r\n");
      out.write("\t\t\tformaMain.submit();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<form action=\"\" method=\"post\" id=\"formaMain\" >\r\n");
      out.write("\t<input type=\"hidden\" name=\"accion\" id=\"accion\">\r\n");
      out.write("\t\r\n");
      out.write("\t<input type=\"hidden\" name=\"lat\" id=\"lat\"> \r\n");
      out.write("\t<input type=\"hidden\" name=\"lon\" id=\"lon\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"timeDate\" id=\"timeDate\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"speed\" id=\"speed\">\r\n");
      out.write("\t\r\n");
      out.write("\t<p>Bienvenido ");
      out.print(session.getAttribute("datosLogin") );
      out.write("</p>\r\n");
      out.write("\t<p align=\"center\">\r\n");
      out.write("\t\tIMEI : \r\n");
      out.write("\t\t<input type=\"text\" name=\"imei\" id=\"imei\">\r\n");
      out.write("\t\t<input type=\"button\" value=\"Consultar\" onclick=\"consultar()\">\r\n");
      out.write("\t</p>\r\n");
      out.write("\t<table align=\"center\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th>IMEI</th>\r\n");
      out.write("\t\t\t<th>NUMERO DE EVENTO</th>\r\n");
      out.write("\t\t\t<th>LATITUD</th>\r\n");
      out.write("\t\t\t<th>LONGITUD</th>\r\n");
      out.write("\t\t\t<th>FECHA Y HORA</th>\r\n");
      out.write("\t\t\t<th>VELOCIDAD</th>\r\n");
      out.write("\t\t\t<th>MAPA</th>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t");

		ArrayList<DatosTramaGetSet> lista = (ArrayList<DatosTramaGetSet>) session.getAttribute("listaDatosTrama");
		//System.out.println("mainPage.jsp : "+ lista);
		for(DatosTramaGetSet obj : lista){
		
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(obj.getImei());
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(obj.getEvent_code());
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(obj.getLatitude());
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(obj.getLongitude());
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(obj.getFecha_hora());
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(obj.getVelocidad());
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td><a onclick=\"ubicar(");
      out.print(obj.getLatitude());
      out.write(',');
      out.print(obj.getLongitude());
      out.write(',');
      out.print(obj.getFecha_hora());
      out.write(',');
      out.print(obj.getVelocidad());
      out.write(")\">Ver Mapa</a></td>\r\n");
      out.write("\t\t\t</tr>\t\r\n");
      out.write("\t\t");

		}
		
      out.write("\r\n");
      out.write("\t</table>\r\n");
      out.write("\t</form>\r\n");
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
