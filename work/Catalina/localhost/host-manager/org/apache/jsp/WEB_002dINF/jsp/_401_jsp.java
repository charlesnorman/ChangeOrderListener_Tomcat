/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.95
 * Generated at: 2024-10-05 18:10:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class _401_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01//EN\" \"http://www.w3.org/TR/html4/strict.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write(" <head>\r\n");
      out.write("  <title>401 Unauthorized</title>\r\n");
      out.write("  <style type=\"text/css\">\r\n");
      out.write("    <!--\r\n");
      out.write("    BODY {font-family:Tahoma,Arial,sans-serif;color:black;background-color:white;font-size:12px;}\r\n");
      out.write("    H1 {font-family:Tahoma,Arial,sans-serif;color:white;background-color:#525D76;font-size:22px;}\r\n");
      out.write("    PRE, TT {border: 1px dotted #525D76}\r\n");
      out.write("    A {color : black;}A.name {color : black;}\r\n");
      out.write("    -->\r\n");
      out.write("  </style>\r\n");
      out.write(" </head>\r\n");
      out.write(" <body>\r\n");
      out.write("   <h1>401 Unauthorized</h1>\r\n");
      out.write("   <p>\r\n");
      out.write("    You are not authorized to view this page. If you have not changed\r\n");
      out.write("    any configuration files, please examine the file\r\n");
      out.write("    <tt>conf/tomcat-users.xml</tt> in your installation. That\r\n");
      out.write("    file must contain the credentials to let you use this webapp.\r\n");
      out.write("   </p>\r\n");
      out.write("   <p>\r\n");
      out.write("    For example, to add the <tt>admin-gui</tt> role to a user named\r\n");
      out.write("    <tt>tomcat</tt> with a password of <tt>s3cret</tt>, add the following to the\r\n");
      out.write("    config file listed above.\r\n");
      out.write("   </p>\r\n");
      out.write("<pre>\r\n");
      out.write("&lt;role rolename=\"admin-gui\"/&gt;\r\n");
      out.write("&lt;user username=\"tomcat\" password=\"s3cret\" roles=\"admin-gui\"/&gt;\r\n");
      out.write("</pre>\r\n");
      out.write("   <p>\r\n");
      out.write("    Note that for Tomcat 7 onwards, the roles required to use the host manager\r\n");
      out.write("    application were changed from the single <tt>admin</tt> role to the\r\n");
      out.write("    following two roles. You will need to assign the role(s) required for\r\n");
      out.write("    the functionality you wish to access.\r\n");
      out.write("   </p>\r\n");
      out.write("    <ul>\r\n");
      out.write("      <li><tt>admin-gui</tt> - allows access to the HTML GUI</li>\r\n");
      out.write("      <li><tt>admin-script</tt> - allows access to the text interface</li>\r\n");
      out.write("    </ul>\r\n");
      out.write("   <p>\r\n");
      out.write("    The HTML interface is protected against CSRF but the text interface is not.\r\n");
      out.write("    To maintain the CSRF protection:\r\n");
      out.write("   </p>\r\n");
      out.write("   <ul>\r\n");
      out.write("    <li>Users with the <tt>admin-gui</tt> role should not be granted the\r\n");
      out.write("       <tt>admin-script</tt> role.</li>\r\n");
      out.write("    <li>If the text interface is accessed through a browser (e.g. for testing\r\n");
      out.write("        since this interface is intended for tools not humans) then the browser\r\n");
      out.write("        must be closed afterwards to terminate the session.</li>\r\n");
      out.write("   </ul>\r\n");
      out.write(" </body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
