/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/11.0.0-M22
 * Generated at: 2024-12-19 13:31:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import model.GioHang;
import model.User;
import java.util.List;

public final class Xacnhangioahang_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(4);
    _jspx_imports_classes.add("model.GioHang");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("model.User");
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
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

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
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

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Trang Thanh Toán</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        body {\r\n");
      out.write("            font-family: Arial, sans-serif;\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("            background-color: #f4f4f4;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .container {\r\n");
      out.write("            max-width: 800px;\r\n");
      out.write("            margin: 30px auto;\r\n");
      out.write("            background: #fff;\r\n");
      out.write("            padding: 20px;\r\n");
      out.write("            border-radius: 8px;\r\n");
      out.write("            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        h1 {\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            color: #333;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .customer-info, .cart-container {\r\n");
      out.write("            margin-bottom: 20px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .customer-info h3, .cart-container h3 {\r\n");
      out.write("            margin-bottom: 10px;\r\n");
      out.write("            color: #555;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .customer-info p {\r\n");
      out.write("            margin: 5px 0;\r\n");
      out.write("            color: #666;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .cart-item {\r\n");
      out.write("            display: flex;\r\n");
      out.write("            align-items: center;\r\n");
      out.write("            justify-content: space-between;\r\n");
      out.write("            margin-bottom: 15px;\r\n");
      out.write("            padding: 10px;\r\n");
      out.write("            border: 1px solid #ddd;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .cart-item img {\r\n");
      out.write("            width: 80px;\r\n");
      out.write("            height: auto;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .cart-item .product-info {\r\n");
      out.write("            flex: 1;\r\n");
      out.write("            margin-left: 15px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .cart-item .product-info h4 {\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            color: #333;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .cart-item .product-info p {\r\n");
      out.write("            margin: 5px 0;\r\n");
      out.write("            color: #666;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .cart-item .product-info label {\r\n");
      out.write("            font-size: 14px;\r\n");
      out.write("            color: #333;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .cart-item input[type=\"number\"] {\r\n");
      out.write("            width: 60px;\r\n");
      out.write("            padding: 5px;\r\n");
      out.write("            border: 1px solid #ccc;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .actions {\r\n");
      out.write("            display: flex;\r\n");
      out.write("            justify-content: space-between;\r\n");
      out.write("            margin-top: 20px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .btn {\r\n");
      out.write("            padding: 10px 15px;\r\n");
      out.write("            border: none;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            font-size: 16px;\r\n");
      out.write("            width: 48%;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .btn-cancel {\r\n");
      out.write("            background-color: #ff4d4d;\r\n");
      out.write("            color: white;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .btn-confirm {\r\n");
      out.write("            background-color: #4CAF50;\r\n");
      out.write("            color: white;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <h1>Trang Thanh Toán</h1>\r\n");
      out.write("        \r\n");
      out.write("        ");

        List<User> user = (List<User>) request.getAttribute("user");
        List<GioHang> gioHang = (List<GioHang>) request.getAttribute("gioHang");
        for(User u : user){
        
      out.write("\r\n");
      out.write("        <!-- Thông tin khách hàng -->\r\n");
      out.write("        <div class=\"customer-info\">\r\n");
      out.write("            <h3>Thông tin khách hàng</h3>\r\n");
      out.write("            <input value=\"");
      out.print(u.getHoTen());
      out.write("\">\r\n");
      out.write("            <input value=\"");
      out.print(u.getSoDienThoai());
      out.write("\">\r\n");
      out.write("            <input value=\"");
      out.print(u.getDiaChi());
      out.write("\">\r\n");
      out.write("        </div>\r\n");
      out.write("        ");
} 
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Thông tin giỏ hàng -->\r\n");
      out.write("        <div class=\"cart-container\">\r\n");
      out.write("            <h3>Sản phẩm</h3>\r\n");
      out.write("            ");

            for(GioHang g : gioHang){
            
      out.write("\r\n");
      out.write("            <div class=\"cart-item\">\r\n");
      out.write("                <img src=\"");
      out.print(g.getDuongDan());
      out.write("\" alt=\"Sản phẩm\">\r\n");
      out.write("                <div class=\"product-info\">\r\n");
      out.write("                    <h4>");
      out.print(g.getTenSanPham());
      out.write("</h4>\r\n");
      out.write("                    <p>Giá: ");
      out.print(g.getGia() );
      out.write("</p>\r\n");
      out.write("                    <p>Số lượng: ");
      out.print(g.getSoLuong());
      out.write("</p>\r\n");
      out.write("                    <p>Màu sắc: ");
      out.print(g.getMauSac() );
      out.write("</p>\r\n");
      out.write("                    <p>Số lượng: ");
      out.print(g.getSoLuong() );
      out.write("</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            ");
} 
      out.write("\r\n");
      out.write("           \r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <form action=\"Xacnhangiohang\">\r\n");
      out.write("         <div class=\"actions\">\r\n");
      out.write("         ");

         for(User u : user){
         
      out.write("\r\n");
      out.write("         <input value=\"");
      out.print(u.getHoTen());
      out.write("\" name=\"hoTen\" type=\"hidden\">\r\n");
      out.write("            <input value=\"");
      out.print(u.getSoDienThoai());
      out.write("\" name=\"soDienThoai\" type=\"hidden\">\r\n");
      out.write("            <input value=\"");
      out.print(u.getDiaChi());
      out.write("\" name=\"diaChi\" type=\"hidden\">\r\n");
      out.write("            ");
} 
      out.write("\r\n");
      out.write("            <button class=\"btn btn-cancel\" name=\"Huy\" value=\"Huy\">Hủy</button>\r\n");
      out.write("            <button class=\"btn btn-confirm\" onclick=\"confirmOrder()\" name=\"Dathang\" value=\"Dathang\">Đặt hàng</button>\r\n");
      out.write("        </div>\r\n");
      out.write("        </form>\r\n");
      out.write("        \r\n");
      out.write("       \r\n");
      out.write("    </div>\r\n");
      out.write("     <script>\r\n");
      out.write("        \r\n");
      out.write("        function confirmOrder() {\r\n");
      out.write("            alert(\"Xác nhận đặt hàng\");\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("    ");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
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
