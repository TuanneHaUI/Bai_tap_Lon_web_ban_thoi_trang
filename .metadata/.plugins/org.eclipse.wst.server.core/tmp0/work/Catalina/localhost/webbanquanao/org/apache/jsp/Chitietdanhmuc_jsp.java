/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/11.0.0-M22
 * Generated at: 2024-12-14 11:09:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import model.SanPham;
import java.util.List;
import Reponsitory.LaydulieuReponsitory;

public final class Chitietdanhmuc_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("Reponsitory.LaydulieuReponsitory");
    _jspx_imports_classes.add("model.SanPham");
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
      out.write("<html lang=\"vi\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Chi Tiết Sản Phẩm</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        body {\r\n");
      out.write("            font-family: 'Arial', sans-serif;\r\n");
      out.write("            background-color: #f4f4f4;\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .product {\r\n");
      out.write("            max-width: 1200px;\r\n");
      out.write("            margin: 50px auto;\r\n");
      out.write("            padding: 30px;\r\n");
      out.write("            background-color: #ffffff;\r\n");
      out.write("            border-radius: 10px;\r\n");
      out.write("            box-shadow: 0 8px 30px rgba(0, 0, 0, 0.1);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .product-title {\r\n");
      out.write("            font-size: 2.5rem;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("            color: #333;\r\n");
      out.write("            margin-bottom: 20px;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .product-info {\r\n");
      out.write("            display: flex;\r\n");
      out.write("            align-items: center;\r\n");
      out.write("            justify-content: center; /* Căn giữa */\r\n");
      out.write("            margin-bottom: 30px;\r\n");
      out.write("            flex-wrap: wrap; /* Cho phép các phần tử cuộn xuống nếu không đủ chỗ */\r\n");
      out.write("            padding: 20px;\r\n");
      out.write("            border-radius: 10px;\r\n");
      out.write("            background-color: rgba(255, 255, 255, 0.8); /* Màu nền mờ */\r\n");
      out.write("            box-shadow: 0 8px 30px rgba(0, 0, 0, 0.1); /* Hiệu ứng đổ bóng nhẹ */\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .product-image {\r\n");
      out.write("            width: 150px;\r\n");
      out.write("            height: 150px;\r\n");
      out.write("            object-fit: cover;\r\n");
      out.write("            border-radius: 10px;\r\n");
      out.write("            box-shadow: 0 6px 15px rgba(0, 0, 0, 0.1);\r\n");
      out.write("            margin-right: 20px;\r\n");
      out.write("            margin-bottom: 20px; /* Khoảng cách giữa ảnh và thông tin */\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .product-details {\r\n");
      out.write("            display: flex;\r\n");
      out.write("            flex-direction: column;\r\n");
      out.write("            align-items: flex-start;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .product-id,\r\n");
      out.write("        .product-name,\r\n");
      out.write("        .product-quantity,\r\n");
      out.write("        .product-price {\r\n");
      out.write("            font-size: 1.4rem;\r\n");
      out.write("            margin-bottom: 10px;\r\n");
      out.write("            color: #555;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .product-id {\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .product-quantity {\r\n");
      out.write("            color: #777;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .product-price {\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("            color: #333;\r\n");
      out.write("            font-size: 1.8rem;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .back-button {\r\n");
      out.write("            display: inline-flex;\r\n");
      out.write("            align-items: center;\r\n");
      out.write("            font-size: 1.4rem;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("            color: #ffffff;\r\n");
      out.write("            background-color: #4CAF50;\r\n");
      out.write("            padding: 12px 25px;\r\n");
      out.write("            border-radius: 8px;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            transition: background 0.3s ease;\r\n");
      out.write("            margin-top: 30px;\r\n");
      out.write("            justify-content: center;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .back-button img {\r\n");
      out.write("            width: 20px;\r\n");
      out.write("            margin-right: 10px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .back-button:hover {\r\n");
      out.write("            background-color: #45a049;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .cangiua {\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            margin-bottom: 30px;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"product\">\r\n");
      out.write("        <!-- Nút quay lại -->\r\n");
      out.write("        <a href=\"javascript:history.back()\" class=\"back-button\">\r\n");
      out.write("            <img src=\"https://img.icons8.com/ios/452/left.png\" alt=\"Quay lại\"> Quay lại\r\n");
      out.write("        </a>\r\n");
      out.write("    \r\n");
      out.write("        <h1 class=\"product-title\">Chi Tiết Sản Phẩm</h1>\r\n");
      out.write("        ");

        HttpSession ss = request.getSession(false);
        int id = (int) ss.getAttribute("idthamchieu");
        LaydulieuReponsitory lg = new LaydulieuReponsitory();
        List<SanPham> sp = lg.Laythongtinsanpham();
        for(SanPham s : sp){
        	if(s.getMaDanhMuc()==id){
        
      out.write("\r\n");
      out.write("        <div class=\"product-info\">\r\n");
      out.write("            <img src=\"");
      out.print(s.getDuongDanAnh());
      out.write("\" alt=\"Sản phẩm\" class=\"product-image\">\r\n");
      out.write("            <div class=\"product-details\">\r\n");
      out.write("                <div class=\"product-id\">Mã Sản Phẩm: ");
      out.print(s.getMaSanpham() );
      out.write("</div>\r\n");
      out.write("                <div class=\"product-name\">Tên Sản Phẩm: ");
      out.print(s.getTenSanPham());
      out.write("</div>\r\n");
      out.write("                <div class=\"product-quantity\">Số Lượng: ");
      out.print(s.getSoLuong());
      out.write("</div>\r\n");
      out.write("                <div class=\"product-price\">Giá: $");
      out.print(s.getGia());
      out.write("</div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        ");
}} 
      out.write("\r\n");
      out.write("       <!--  <div class=\"cangiua\">\r\n");
      out.write("            <button class=\"back-button\" onclick=\"window.history.back()\">Quay lại</button>\r\n");
      out.write("        </div> -->\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
