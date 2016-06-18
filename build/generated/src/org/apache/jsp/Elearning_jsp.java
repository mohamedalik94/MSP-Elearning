package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import libs.shared;
import model.*;
import libs.*;

public final class Elearning_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write('\n');
      out.write('\n');

request.getSession(true);
UserModel currenctuser = (UserModel) session.getAttribute("user");
StaffMoled currnetstaff = (StaffMoled)session.getAttribute("staff");
String pass =(String) request.getContextPath();


      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang = \"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <title>");
out.print(shared.title); 
      out.write("</title>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\"> <!-- Font awesome css file -->\n");
      out.write("    \n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\"> <!-- Bootstrap css file -->\n");
      out.write("    \n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\"> <!-- my style css file -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/pages.css\"> <!-- my style css file -->\n");
      out.write("\n");
      out.write("    <!-- google Fonts -->\n");
      out.write("    <link href='https://fonts.googleapis.com/css?family=Droid+Sans:400,700' rel='stylesheet' type='text/css'>\n");
      out.write("    <link href='https://fonts.googleapis.com/css?family=Raleway' rel='stylesheet' type='text/css'>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <!--For html5 tags -->\n");
      out.write("    <!--[if lt IE 9]-->\n");
      out.write("        <script src=\"js/html5shiv.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("  </head>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  <body>\n");
      out.write("    \n");
      out.write("    <!-- ******************** Nav*************** -->\n");
      out.write("    \n");
      out.write("    <nav class=\"navbar navbar-default\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    \n");
      out.write("    <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("    \n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#first-nav\" aria-expanded=\"false\">\n");
      out.write("        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("      </button>\n");
      out.write("      <a href=\"home\" target=\"_self\"><img src=\"images/Logo.png\" class=\"img-responsive\" width=\"300\" height=\"200\" style=\"margin-right:10px\"></a>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"first-nav\">\n");
      out.write("    \n");
      out.write("  \n");
      out.write("            \n");
      out.write("      <ul class=\"nav navbar-nav\">\n");
      out.write("        <li class=\"dropdown\">\n");
      out.write("          <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">ABOUT <span class=\"caret\"></span></a>\n");
      out.write("          <ul class=\"dropdown-menu\">\n");
      out.write("            <li><a href=\"history.html\" >HISTORY</a></li>\n");
      out.write("            <li><a href=\"mission.html\" >MISSION</a></li>\n");
      out.write("            <li><a href=\"vision.html\">VISION</a></li>\n");
      out.write("            \n");
      out.write("            <li  class=\"Diaa\"> <a href=\"\">Department <span class=\"caret\"></a>\n");
      out.write("              <ul class=\"\">\n");
      out.write("               <li><a href=\"cs.html\">Computer Science</a></li>\n");
      out.write("                <li><a href=\"it.html\" >Information Technology</a></li>\n");
      out.write("                <li><a href=\"is.html\">Information System</a></li>\n");
      out.write("                <li><a href=\"or.html\">Operation Research</a></li>\n");
      out.write("                \n");
      out.write("              </ul>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("\n");
      out.write("        \n");
      out.write("\n");
      out.write("      </ul>\n");
      out.write("      \n");
      out.write("          \n");
      out.write("            \n");
      out.write("      <ul class=\"nav navbar-nav\">\n");
      out.write("        <li class=\"dropdown\">\n");
      out.write("          <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">COUNCILS <span class=\"caret\"></span></a>\n");
      out.write("          <ul class=\"dropdown-menu\">\n");
      out.write("            <li><a href=\"faculty-council-site.html\">Faculity Council Site</a></li>\n");
      out.write("            <li><a href=\"CouncilOFstudent-Affair.html\">\tStudent Affairs Council website</a></li>\n");
      out.write("            <li><a href=\"community-council.html\">Community Service Council and Environmental Affairs</a></li>\n");
      out.write("            <li role=\"separator\" class=\"divider\" ></li>\n");
      out.write("            <li><a href=\"electronic-services.html\">Site and electronic services unit</a></li>\n");
      out.write("            <li role=\"separator\" class=\"divider\"></li>\n");
      out.write("            <li><a href=\"Collage-Services.html\">Services college site</a></li>\n");
      out.write("            <li><a href=\"student-council.html\">Student Council </a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("      \n");
      out.write("                \n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("            \n");
      out.write("      <ul class=\"nav navbar-nav\">\n");
      out.write("        <li class=\"dropdown\">\n");
      out.write("          <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">ADMINSTRATION <span class=\"caret\"></span></a>\n");
      out.write("          <ul class=\"dropdown-menu\">\n");
      out.write("            <li><a href=\"Dean.html\">DEAN</a></li>\n");
      out.write("            <li><a href=\"#\">Vice dean of student affairs</a></li>\n");
      out.write("            <li><a href=\"#\">Vice College for Graduate Studies and Research</a></li>\n");
      out.write("            <li role=\"separator\" class=\"divider\"></li>\n");
      out.write("            <li><a href=\"#\">department heads</a></li>\n");
      out.write("            <li role=\"separator\" class=\"divider\"></li>\n");
      out.write("            <li><a href=\"#\">Secretary of the College</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("      \n");
      out.write("            \n");
      out.write("      <ul class=\"nav navbar-nav\">\n");
      out.write("        <li class=\"dropdown\">\n");
      out.write("          <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">STAFF <span class=\"caret\"></span></a>\n");
      out.write("          <ul class=\"dropdown-menu\">\n");
      out.write("            <li><a href=\"staffLogin.jsp\">Staff Login</a></li>\n");
      out.write("            <li><a href=\"logout\">Staff Logout</a></li>\n");
      out.write("            <li><a href=\"#\">Staff Search</a></li>\n");
      out.write("            <li><a href=\"staff-register.html\">Staff Registeration</a></li>\n");
      out.write("            <li><a href=\"#\">Staff CV</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("     \n");
      out.write("      <ul class=\"nav navbar-nav\">\n");
      out.write("        <li class=\"dropdown\">\n");
      out.write("          <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">STUDENT <span class=\"caret\"></span></a>\n");
      out.write("          <ul class=\"dropdown-menu\">\n");
      out.write("            <li class=\"Diaa\"><a href=\"#\">Postgraduate<span class=\"caret\"></span>\n");
      out.write("             <ul>\n");
      out.write("               <li><a href=\"\">Graduate Exam Schedule</a></li>\n");
      out.write("               <li><a href=\"\">Graduate Exam Result</a></li>\n");
      out.write("               <li><a href=\"\">Awarded Degree</a></li>\n");
      out.write("               <li><a href=\"\">Postgraduate Affairs</a></li>\n");
      out.write("               \n");
      out.write("             </ul>  \n");
      out.write("            </a>\n");
      out.write("             \n");
      out.write("            </li>\n");
      out.write("            <li role=\"separator\" class=\"divider\"></li>\n");
      out.write("            <li class=\"Diaa\"><a href=\"#\">Undergraduate <span class=\"caret\"></span>\n");
      out.write("              <ul>\n");
      out.write("                <li><a href=\"\">Student Site</a></li>\n");
      out.write("                \n");
      out.write("              </ul>\n");
      out.write("               \n");
      out.write("              </a>\n");
      out.write("\n");
      out.write("            </li>\n");
      out.write("            \n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("        <ul class=\"nav navbar-nav\">\n");
      out.write("        <li class=\"dropdown\">\n");
      out.write("          <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">RESEARCH <span class=\"caret\"></span></a>\n");
      out.write("          <ul class=\"dropdown-menu\">\n");
      out.write("            <li><a href=\"#\">Reseach Direction</a></li>\n");
      out.write("            <li><a href=\"#\">List Of M.sc</a></li>\n");
      out.write("            <li><a href=\"#\">List Of Ph.D</a></li>\n");
      out.write("            <li role=\"separator\" class=\"divider\"></li>\n");
      out.write("            <li><a href=\"#\">Journal</a></li>\n");
      out.write("            <li role=\"separator\" class=\"divider\"></li>\n");
      out.write("            <li><a href=\"#\">Research Ethics</a></li>\n");
      out.write("            <li><a href=\"#\">Research Ethics</a></li>\n");
      out.write("            <li><a href=\"#\">Intellectual Property Right Guide</a></li>\n");
      out.write("             <li><a href=\"#\">Library</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("      \n");
      out.write("      <ul class=\"nav navbar-nav\">\n");
      out.write("        <li><a href=\"\">NEWS</a></li>\n");
      out.write("      </ul>\n");
      out.write("\n");
      out.write("                  \n");
      out.write("       <ul class=\"nav navbar-nav\">\n");
      out.write("        <li><a href=\"Elearning\">E-LEARN PORTAL</a></li>\n");
      out.write("       </ul>\n");
      out.write("        ");
 if(currenctuser != null){ 
      out.write("\n");
      out.write("       <ul class=\"nav navbar-nav\">\n");
      out.write("        <li><a href=\"logout\">Logout</a></li>\n");
      out.write("       </ul>\n");
      out.write("       ");
}
      out.write("\n");
      out.write("      \n");
      out.write("      \n");
      out.write("    </div><!-- /.navbar-collapse -->\n");
      out.write("  </div><!-- /.container-fluid -->\n");
      out.write("</nav>\n");
      out.write("    \n");
      out.write("    <!-- ********************End Nav*************** -->");
      out.write("   \r\n");
      out.write("\r\n");

    ResultSet deptname = (ResultSet) session.getAttribute("deptname");
    ResultSet Firsttermmaterials = (ResultSet) request.getAttribute("Firsttermmaterials");
    ResultSet Secondtermmaterials = (ResultSet) request.getAttribute("Secondtermmaterials");
    //posts
    ResultSet posts = (ResultSet)request.getAttribute("posts");
    
    if (currenctuser != null || currnetstaff !=null) {
        if(Firsttermmaterials == null || Secondtermmaterials == null && currnetstaff!=null) {
        response.sendRedirect("staffLogin.jsp");
        }else if(Firsttermmaterials == null || Secondtermmaterials == null ) {
        response.sendRedirect("Elearning");
        }
    }else if (currenctuser == null) {
                request.getRequestDispatcher("login").forward(request, response);

        if (currnetstaff == null){   
            request.getRequestDispatcher("staffLogin.jsp").forward(request, response);
        }else{
        }
    }  


      out.write("\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("        <div class=\"profile text-center\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <h1>WELCOME  ");
if (currenctuser != null) {
                    out.print(currenctuser.getFname() + " " + currenctuser.getLname());
                }  
      out.write("\r\n");
      out.write("            </h1>\r\n");
      out.write("            ");
if (currnetstaff == null){
      out.write("\r\n");
      out.write("            <h1>your department is ");

                try {
                    out.print(deptname.getString("deptName"));
                } catch (Exception ex) {
                    out.print(ex.getMessage() + "  Exeption");
                }
                
      out.write("\r\n");
      out.write("            </h1>\r\n");
}
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-xs-12 col-md-4\">\r\n");
      out.write("                <aside class=\"profile-menu\">\r\n");
      out.write("\r\n");
      out.write("                    <h2>FIRST SEMISTER</h2>\r\n");
      out.write("\r\n");
      out.write("                    <form class=\"form-group\" name=\"f\" method=\"post\" action=\"details\">\r\n");
      out.write("                        <input type=\"hidden\" name=\"hidBt\" />\r\n");
      out.write("                        ");
 if (Firsttermmaterials != null)
                                while (Firsttermmaterials.next()) {
      out.write("\r\n");
      out.write("                        <input type=\"submit\" onclick=\"this.form.hidBt.value = this.value;\" class=\"form-control\" value=\"");
      out.print( Firsttermmaterials.getString(2));
      out.write("\" name=\"");
      out.print( Firsttermmaterials.getInt(1));
      out.write("\"/><br> \r\n");
      out.write("                        ");
}
      out.write("\r\n");
      out.write("                    </form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </aside>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("           \r\n");
      out.write("            \r\n");
      out.write("        \r\n");
      out.write("            \r\n");
      out.write("                  \r\n");
      out.write("            <div class=\"col-xs-12 col-md-offset-4 col-md-4\">\r\n");
      out.write("                <aside class=\"profile-menu\">  \r\n");
      out.write("                    <h2>SECOND SEMISTER</h2>\r\n");
      out.write("                    <form class=\"form-group\" name=\"f\" method=\"post\" action=\"details\">\r\n");
      out.write("                        <input type=\"hidden\" name=\"hidBt\" />\r\n");
      out.write("                        ");
 if (Secondtermmaterials != null)
                            while (Secondtermmaterials.next()) {
      out.write("\r\n");
      out.write("                        <input type=\"submit\" onclick=\"this.form.hidBt.value = this.value;\" class=\"form-control\" value=\"");
      out.print( Secondtermmaterials.getString(2));
      out.write("\" name=\"");
      out.print(Secondtermmaterials.getInt(1));
      out.write("\"/><br>                                      \r\n");
      out.write("                        ");
}
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    </form>\r\n");
      out.write("                </aside>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"col-xs-12 col-md-4\" style=\"\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    height: auto;\r\n");
      out.write("    margin-left:0 auto;\r\n");
      out.write("\">\r\n");
      out.write("    <div class=\"post\" >\r\n");
      out.write("               <div class=\"top-post\">\r\n");
      out.write("                 <textarea class=\"form-control\" name=\"write_post\" placeholder=\"write your post\"></textarea> \r\n");
      out.write("                 <input class=\"form-control\" name=\"post\" value=\"POST\" type=\"submit\">\r\n");
      out.write("                </div>\r\n");
      out.write("               \r\n");
      out.write("               <div class=\"bottom-post\" style=\"height:auto\">\r\n");
      out.write("                 <div class=\"first-post\">\r\n");
      out.write("                     <label style=\"font-size: 20px;\"> Amira Ahmed </label>\r\n");
      out.write("                  <input type=\"text\" class=\"form-control\" readonly name=\"post_preview\">\r\n");
      out.write("                 </div>\r\n");
      out.write("\r\n");
      out.write("                 \r\n");
      out.write("                 <div class=\"comment\">\r\n");
      out.write("                     <label> Mohamed ALi Khaskia</label>\r\n");
      out.write("                  <input type=\"text\" class=\"form-control\" readonly name=\"post_preview\">\r\n");
      out.write("                   \r\n");
      out.write("                     <label> Sayed Ahmed </label>\r\n");
      out.write("                  <input type=\"text\" class=\"form-control\" readonly name=\"post_preview\">\r\n");
      out.write("                   \r\n");
      out.write("                     <label> Diaa ibrahiem </label>\r\n");
      out.write("                  <input type=\"text\" class=\"form-control\" readonly name=\"post_preview\">\r\n");
      out.write("                   \r\n");
      out.write("                     <label> Ramadan Soubhi </label>\r\n");
      out.write("                  <input type=\"text\" class=\"form-control\" readonly name=\"post_preview\">\r\n");
      out.write("                    \r\n");
      out.write("                  <br>\r\n");
      out.write("                  \r\n");
      out.write("                  <label style=\"align-items: center\"> Add Comment .. </label>\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\">                  \r\n");
      out.write("                    <input class=\"form-control\" name=\"post\" value=\"Add\" type=\"submit\">\r\n");
      out.write("                    \r\n");
      out.write("                 </div>\r\n");
      out.write("                   <br><br>\r\n");
      out.write("                   <div class=\"first-post\">\r\n");
      out.write("                       <label style=\"font-size: 20px;\"> Diaa ibrahiem </label>\r\n");
      out.write("                  <input type=\"text\" class=\"form-control\" readonly name=\"post_preview\">\r\n");
      out.write("                 </div>\r\n");
      out.write("\r\n");
      out.write("                 \r\n");
      out.write("                 <div class=\"comment\">\r\n");
      out.write("                     <label> Mohamed ALi Khaskia</label>\r\n");
      out.write("                  <input type=\"text\" class=\"form-control\" readonly name=\"post_preview\">\r\n");
      out.write("                   \r\n");
      out.write("                     <label> Sayed Ahmed </label>\r\n");
      out.write("                  <input type=\"text\" class=\"form-control\" readonly name=\"post_preview\">\r\n");
      out.write("                   \r\n");
      out.write("                     <label> Diaa ibrahiem </label>\r\n");
      out.write("                  <input type=\"text\" class=\"form-control\" readonly name=\"post_preview\">\r\n");
      out.write("                   \r\n");
      out.write("                     <label> Ramadan Soubhi </label>\r\n");
      out.write("                  <input type=\"text\" class=\"form-control\" readonly name=\"post_preview\">\r\n");
      out.write("                     <label> Ramadan Soubhi </label>\r\n");
      out.write("                  <input type=\"text\" class=\"form-control\" readonly name=\"post_preview\">\r\n");
      out.write("                     <label> Ramadan Soubhi </label>\r\n");
      out.write("                  <input type=\"text\" class=\"form-control\" readonly name=\"post_preview\">\r\n");
      out.write("                    \r\n");
      out.write("                  <br>\r\n");
      out.write("                  \r\n");
      out.write("                  <label style=\"align-items: center\"> Add Comment .. </label>\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\">                  \r\n");
      out.write("                    <input class=\"form-control\" name=\"post\" value=\"Add\" type=\"submit\">\r\n");
      out.write("                    \r\n");
      out.write("                 </div>\r\n");
      out.write("                   \r\n");
      out.write("                   \r\n");
      out.write("                   \r\n");
      out.write("                   \r\n");
      out.write("                   \r\n");
      out.write("                   \r\n");
      out.write("                   \r\n");
      out.write("              <!--   \r\n");
      out.write("                 <div class=\"bottom-post\">\r\n");
      out.write("                 <div class=\"first-post\">\r\n");
      out.write("                     <label> Diaa ibrahiem </label>\r\n");
      out.write("                  <input type=\"text\" class=\"form-control\" readonly name=\"post_preview\">\r\n");
      out.write("                 </div>\r\n");
      out.write("\r\n");
      out.write("                 \r\n");
      out.write("                 <div class=\"comment\">\r\n");
      out.write("                     <label> Diaa ibrahiem </label>\r\n");
      out.write("                   <input type=\"text\" class=\"form-control\">\r\n");
      out.write("                   \r\n");
      out.write("                     <label> Diaa ibrahiem </label>\r\n");
      out.write("                   <input type=\"text\" class=\"form-control\">\r\n");
      out.write("                   \r\n");
      out.write("                     <label> Diaa ibrahiem </label>\r\n");
      out.write("                   <input type=\"text\" class=\"form-control\">\r\n");
      out.write("                   \r\n");
      out.write("                     <label> Diaa ibrahiem </label>\r\n");
      out.write("                   <input type=\"text\" class=\"form-control\">\r\n");
      out.write("                   \r\n");
      out.write("                 \r\n");
      out.write("                   \r\n");
      out.write("                   \r\n");
      out.write("                 </div>\r\n");
      out.write("                 \r\n");
      out.write("\r\n");
      out.write("               </div>\r\n");
      out.write("                 \r\n");
      out.write("                <div class=\"bottom-post\">\r\n");
      out.write("                 <div class=\"first-post\">\r\n");
      out.write("                     <label> Diaa ibrahiem </label>\r\n");
      out.write("                  <input type=\"text\" class=\"form-control\" readonly name=\"post_preview\">\r\n");
      out.write("                 </div>\r\n");
      out.write("\r\n");
      out.write("                 \r\n");
      out.write("                 <div class=\"comment\">\r\n");
      out.write("                     <label> Diaa ibrahiem </label>\r\n");
      out.write("                   <input type=\"text\" class=\"form-control\">\r\n");
      out.write("                   \r\n");
      out.write("                     <label> Diaa ibrahiem </label>\r\n");
      out.write("                   <input type=\"text\" class=\"form-control\">\r\n");
      out.write("                   \r\n");
      out.write("                     <label> Diaa ibrahiem </label>\r\n");
      out.write("                   <input type=\"text\" class=\"form-control\">\r\n");
      out.write("                   \r\n");
      out.write("                     <label> Diaa ibrahiem </label>\r\n");
      out.write("                   <input type=\"text\" class=\"form-control\">\r\n");
      out.write("                   \r\n");
      out.write("                 \r\n");
      out.write("                   \r\n");
      out.write("                   \r\n");
      out.write("                 </div>\r\n");
      out.write("                 \r\n");
      out.write("\r\n");
      out.write("               </div>\r\n");
      out.write("                 \r\n");
      out.write("-->\r\n");
      out.write("               </div>\r\n");
      out.write("               \r\n");
      out.write("\r\n");
      out.write("               \r\n");
      out.write("               \r\n");
      out.write("\r\n");
      out.write("             </div>\r\n");
      out.write("             \r\n");
      out.write("            </div>\r\n");
      out.write("                  \r\n");
      out.write("                        \r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- ******************** Footer ******************* -->\n");
      out.write("    <footer>\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("        <div class=\"col-md-4\">\n");
      out.write("          <div class=\"about\">\n");
      out.write("            <h1>ABOUT</h1>\n");
      out.write("            <p>The Faculty of Informatics and Computer Science at the British University in Egypt is an effective and modern Faculty offering a diverse range of specialisms. The overall mission of the Faculty is to provide Egypt, and the Middle East, with a British style of education of the highest quality, and to supply graduates that feed and stimulate industry and commercial activities \n");
      out.write("            </p>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-4\">\n");
      out.write("          <div class=\"contact\">\n");
      out.write("             <h1>CONTACT US</h1>\n");
      out.write("             <ul>\n");
      out.write("               <li><a href=\"\" > <i class=\"fa fa-envelope\"></i><span class=\"span\">MSP@Menofia.edu.eg </span></a>  </li>\n");
      out.write("               <li><i class=\"fa fa-phone\"></i><span class=\"span\">0125487983</span ></li>\n");
      out.write("               <li><i class=\"fa fa-location-arrow\"></i><span class=\"span\">FACULITY OF COMPUTERS AND INFORMATION</span></li>\n");
      out.write("            </ul>\n");
      out.write("           \n");
      out.write("            <div class=\"socail\">\n");
      out.write("              <a class=\"btn btn-social-icon  btn-facebook btn-lg\" href=\"\">\n");
      out.write("               <i class=\"fa fa-facebook\"></i>\n");
      out.write("              </a>\n");
      out.write("              \n");
      out.write("               <a class=\"btn btn-social-icon btn-twitter btn-lg\" href=\"#\" >\n");
      out.write("                    <i class=\"fa fa-twitter \"></i> \n");
      out.write("               </a>\n");
      out.write("              \n");
      out.write("                <a class=\"btn btn-social-icon btn-linkedin btn-lg\" href=\"#\" >\n");
      out.write("                    <i class=\"fa fa-linkedin \"></i> \n");
      out.write("                </a>\n");
      out.write("              \n");
      out.write("                <a class=\"btn btn-social-icon btn-rss btn-lg\" href=\"#\" >\n");
      out.write("                    <i class=\"fa fa-rss \"></i> \n");
      out.write("                </a>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("             \n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"col-md-4\">\n");
      out.write("          <div class=\"subscribe\">\n");
      out.write("            <h1>SUBSCRIBE</h1>\n");
      out.write("            <form action=\"\" method=\"post\" class=\"form-group\">\n");
      out.write("              <input class=\"form-control\" type=\"email\" placeholder=\"Write Your email\" name=\"email\">\n");
      out.write("              <textarea class=\"form-control\" placeholder=\"Type Your Message\" name=\"message\"></textarea>\n");
      out.write("              <input class=\"form-control\" type=\"submit\" value=\"Subscribe\" name=\"Subscribe\">\n");
      out.write("            </form>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("          \n");
      out.write("          <div class=\"clear\"></div>\n");
      out.write("          <hr>\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"col-xs-12\">\n");
      out.write("         <div class=\"copy-right text-center\">\n");
      out.write("           \n");
      out.write("           <span class=\"span\">All Right Reserved &copy; &nbsp;To Diaa Ibrahiem </span>\n");
      out.write("           \n");
      out.write("           \n");
      out.write("         </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        \n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("    </footer>\n");
      out.write("    <!-- ******************** END Footer ******************* -->\n");
      out.write("  \n");
      out.write("    \n");
      out.write("     <script src=\"js/jquery-1.11.1.min.js\" ></script> <!-- JQuery -->\n");
      out.write("    \n");
      out.write("    <script src=\"js/bootstrap.min.js\" ></script> <!-- Bootsrtap -->\n");
      out.write("    <script src=\"js/bootbox.min.js\" ></script> <!-- bootbox -->\n");
      out.write("  \n");
      out.write("  </body>\n");
      out.write("  \n");
      out.write("</html>");
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
