package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import com.aludena.mtkweb.getset.DatosTramaGetSet;
import java.util.ArrayList;

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
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/estilotabla.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/miestilo.css\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"widgets/datepicker/jquery-ui.css\">\r\n");
      out.write("<script src=\"widgets/datepicker/jquery.js\"></script>\r\n");
      out.write("<script src=\"widgets/datepicker/jquery-ui.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("  \t\t$(function() {\r\n");
      out.write("    \t\t$( \"#datepicker\" ).datepicker();\r\n");
      out.write("    \t\t$( \"#datepicker2\" ).datepicker();\r\n");
      out.write("  \t\t});\r\n");
      out.write("  \t</script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t\r\n");
      out.write("\t\tfunction carga(){\r\n");
      out.write("\t\t\tdocument.getElementById(\"imei\").focus();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\tfunction consultar() {\r\n");
      out.write("\t\t\tvar imei = document.getElementById(\"imei\");\r\n");
      out.write("\t\t\tif(imei.value == ''){\r\n");
      out.write("\t\t\t\talert(\"Debe ingresar el numero IMEI a consultar\");\r\n");
      out.write("\t\t\t\timei.focus();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\telse {\r\n");
      out.write("\t\t\t\tvar formaMain = document.getElementById(\"formaMain\");\r\n");
      out.write("\t\t\t\tvar accion = document.getElementById(\"accion\");\r\n");
      out.write("\t\t\t\taccion.value = \"consultar\";\r\n");
      out.write("\t\t\t\tformaMain.action = \"consultaServlet.alg\";\r\n");
      out.write("\t\t\t\tformaMain.submit();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction ubicar(latitud,longitud,fecha,velocidad) {\r\n");
      out.write("\t\t\tvar formaMain = document.getElementById(\"formaMain\");\r\n");
      out.write("\t\t\tvar lat = document.getElementById(\"lat\");\r\n");
      out.write("\t\t\tvar lon = document.getElementById(\"lon\");\r\n");
      out.write("\t\t\tvar fec = document.getElementById(\"fec\");\r\n");
      out.write("\t\t\tvar vel = document.getElementById(\"vel\");\r\n");
      out.write("\t\t\tlat.value = latitud;\r\n");
      out.write("\t\t\tlon.value = longitud;\r\n");
      out.write("\t\t\tfec.value = fecha;\r\n");
      out.write("\t\t\tvel.value = velocidad;\r\n");
      out.write("\t\t\tformaMain.action = \"mapaServlet.alg\";\r\n");
      out.write("\t\t\tformaMain.submit();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction ruta() {\r\n");
      out.write("\t\t\tvar formaMain = document.getElementById(\"formaMain\");\r\n");
      out.write("\t\t\tformaMain.action = \"rutaMapa.jsp\";\r\n");
      out.write("\t\t\tformaMain.submit();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body onload=\"carga()\">\r\n");
      out.write("\t<form action=\"\" method=\"post\" name=\"formaMain\" id=\"formaMain\">\r\n");
      out.write("\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"accion\" id=\"accion\"> <input\r\n");
      out.write("\t\t\t\ttype=\"hidden\" name=\"lat\" id=\"lat\"> <input type=\"hidden\"\r\n");
      out.write("\t\t\t\tname=\"lon\" id=\"lon\"> <input type=\"hidden\" name=\"fec\"\r\n");
      out.write("\t\t\t\tid=\"fec\"> <input type=\"hidden\" name=\"vel\" id=\"vel\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"listaRuta\" id=\"listaRuta\">\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\r\n");
      out.write("\t\t<p align=\"center\" class=\"titulo\">MONITOREO DE VEHICULOS</p>\r\n");
      out.write("\t\t<p align=\"center\">\r\n");
      out.write("\t\t\t\tIMEI : <input type=\"text\" value=\"");
      out.print((String)session.getAttribute("imei") );
      out.write("\" name=\"imei\" id=\"imei\"> <input\r\n");
      out.write("\t\t\t\ttype=\"button\" value=\"Consultar\" onclick=\"consultar()\">\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t\t<p class=\"parrafo\">Usuario Logeado</p>\r\n");
      out.write("\t\t<h1>\r\n");
      out.write("\t\t\tDesde : <input type=\"text\" name=\"datepicker\" id=\"datepicker\">\r\n");
      out.write("\t\t</h1>\r\n");
      out.write("\t\t<h2>\r\n");
      out.write("\t\t\tHasta : <input type=\"text\" name=\"datepicker2\" id=\"datepicker2\">\r\n");
      out.write("\t\t</h2>\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t\t<input type=\"button\" value=\"Ruta\" onclick=\"ruta()\">\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\r\n");
      out.write("\t\t<table align=\"center\" class=\"mitabla\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th>ITEM</th>\r\n");
      out.write("\t\t\t\t<th>IMEI</th>\r\n");
      out.write("\t\t\t\t<th>COMANDO</th>\r\n");
      out.write("\t\t\t\t<th>EVENTO</th>\r\n");
      out.write("\t\t\t\t<th>LATITUD</th>\r\n");
      out.write("\t\t\t\t<th>LONGITUD</th>\r\n");
      out.write("\t\t\t\t<th>FECHA</th>\r\n");
      out.write("\t\t\t\t<th>GPS</th>\r\n");
      out.write("\t\t\t\t<th>SATELITES</th>\r\n");
      out.write("\t\t\t\t<th>GSM</th>\r\n");
      out.write("\t\t\t\t<th>VELOCIDAD</th>\r\n");
      out.write("\t\t\t\t<th>HEADING</th>\r\n");
      out.write("\t\t\t\t<th>HDOP</th>\r\n");
      out.write("\t\t\t\t<th>ALTITUD</th>\r\n");
      out.write("\t\t\t\t<th>ODOMETRO</th>\r\n");
      out.write("\t\t\t\t<th>HOROMETRO</th>\r\n");
      out.write("\t\t\t\t<th>MAPA</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t");

				SimpleDateFormat oldDf = new SimpleDateFormat("yyMMddHHmmss");
				SimpleDateFormat newDf = new SimpleDateFormat("yy/MM/dd HH:mm:ss");
				ArrayList<DatosTramaGetSet> lista = (ArrayList<DatosTramaGetSet>) session
						.getAttribute("listaDatos");
				System.out.println(lista);
				int i = 0;
				for (DatosTramaGetSet obj : lista) {
					i++;
					Date fecha = oldDf.parse(obj.getFecha());
			
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(i);
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(obj.getImei());
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(obj.getComando());
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(obj.getEvento());
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(obj.getLatitud());
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(obj.getLongitud());
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(newDf.format(fecha));
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(obj.getGps());
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(obj.getSatelites());
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(obj.getGsm());
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(obj.getVelocidad());
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(obj.getHeading());
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(obj.getHdop());
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(obj.getAltitud());
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(obj.getOdometro());
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(obj.getHorometro());
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td><a\r\n");
      out.write("\t\t\t\t\tonclick=\"ubicar(");
      out.print(obj.getLatitud());
      out.write(',');
      out.print(obj.getLongitud());
      out.write(',');
      out.print(obj.getFecha());
      out.write(',');
      out.print(obj.getVelocidad());
      out.write(")\">Ubicar</a>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t");

				}
			
      out.write("\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\r\n");
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
