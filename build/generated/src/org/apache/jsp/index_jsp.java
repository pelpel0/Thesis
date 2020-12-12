package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("        <title>MASHIE STORE</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("        <link href=\"bootstrap-4.3.1-dist/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"bootstrap-4.3.1-dist/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/> \n");
      out.write("        <script src=\"bootstrap-4.3.1-dist/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"bootstrap-4.3.1-dist/js/bootstrap.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link href=\"Style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Anton&family=Gugi&family=Lato:wght@300&family=Roboto:wght@300&family=Sofia&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"https://kit.fontawesome.com/14cceac8da.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("            <div class=\"col-md-4 col-sm-12 col-12\">\n");
      out.write("  \n");
      out.write("            <div class=\"btn-group\">\n");
      out.write("            <button class=\"btn boarder dropdown-toggle my-md-4 my-2\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">LOGO?</button>\n");
      out.write("            <div class=\"dropdown-menu\">\n");
      out.write("            <a href=\"#\" class=\"dropdown-item\">ERU- Euro</a>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("                \n");
      out.write("            <div class=\"col-md-4 col-12 text-center\">\n");
      out.write("            <h2 class=\"my-md-3 site-title text-white\"> Online Store</h2>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-4 col-12 text-right\">\n");
      out.write("            <p class=\"my-md-4 header-links\">\n");
      out.write("            <a href=\"#\" class=\"px-2\">Sign In </a>\n");
      out.write("            <a href=\"#\" class=\"px-1\">Create an Account </a>\n");
      out.write("            </p>    \n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"container-fluid p-0\">\n");
      out.write("            <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("            <ul class=\"navbar-nav\">\n");
      out.write("            <li class=\"nav-item active\">\n");
      out.write("            <a class=\"nav-link\" href=\"#\">HOME <span class=\"sr-only\">(current)</span></a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"#\">FEATURES</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"#\">COLLECTION</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"#\">SHOP</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"#\">ABOUT US</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"#\">CONTACT US</a>\n");
      out.write("            </li>\n");
      out.write("            </ul>\n");
      out.write("            </div>\n");
      out.write("                <div class=\"navbar-nav\">\n");
      out.write("                    <li class=\"nav-item boarder rounded-circle mx-2 search-icon \">\n");
      out.write("                    <i class=\"fas fa-search p-2\"></i>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item boarder rounded-circle mx-2 basket-icon \">\n");
      out.write("                    <i class=\"fas fa-shopping-cart p-2\"></i>\n");
      out.write("                    </li>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("      \n");
      out.write("        <main>\n");
      out.write("            <!---Slider-->\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                <div class=\"site-slider\">    \n");
      out.write("                <div class=\"slider-one\">  \n");
      out.write("<div id=\"carouselExampleIndicators\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("  <ol class=\"carousel-indicators\">\n");
      out.write("    <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("    <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"1\"></li>\n");
      out.write("    <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"2\"></li>\n");
      out.write("  </ol>\n");
      out.write("  <div class=\"carousel-inner\">\n");
      out.write("    <div class=\"carousel-item active\">\n");
      out.write("      <img class=\"d-block w-100\" src=\"img/slider1.jpg\" class=\"img-fluid\" alt=\"First slide\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"carousel-item\">\n");
      out.write("      <img class=\"d-block w-100\" src=\"img/slider2.png\" class=\"img-fluid\" alt=\"Second slide\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"carousel-item\">\n");
      out.write("      <img class=\"d-block w-100\" src=\"img/slider3.jpg\" class=\"img-fluid\" alt=\"Third slide\">\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <a class=\"carousel-control-prev\" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"prev\">\n");
      out.write("      <span><i class=\"fa fa-angle-left\" aria-hidden=\"true\"</i> </span>\n");
      out.write("  <span class=\"sr-only\">Previous</span>\n");
      out.write("  </a>\n");
      out.write("  <a class=\"carousel-control-next\" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"next\">\n");
      out.write("  <span><i class=\"fa fa-angle-right\" aria-hidden=\"true\"></i></span>\n");
      out.write("  <span class=\"sr-only\">Next</span>\n");
      out.write("  </a>\n");
      out.write("                </div>\n");
      out.write("                </div>\n");
      out.write("                </div>\n");
      out.write("                </div>\n");
      out.write("        </main>\n");
      out.write("        <script src=\"https://code.jquery.com/jquery.js\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"mainjs.js\" type=\"text/javascript\"></script>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
