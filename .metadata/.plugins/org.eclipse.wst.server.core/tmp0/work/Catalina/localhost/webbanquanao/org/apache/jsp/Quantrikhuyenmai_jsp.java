/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/11.0.0-M22
 * Generated at: 2024-12-21 16:13:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import model.KhuyenMai;
import Reponsitory.Laydulieuchonguoidung;
import model.SanPham;
import java.util.List;
import Reponsitory.LaydulieuReponsitory;

public final class Quantrikhuyenmai_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.LinkedHashSet<>(7);
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("model.KhuyenMai");
    _jspx_imports_classes.add("Reponsitory.LaydulieuReponsitory");
    _jspx_imports_classes.add("Reponsitory.Laydulieuchonguoidung");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"vi\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Quản Lý Khuyến Mãi</title>\r\n");
      out.write("    <!-- Thêm Font Awesome từ CDN -->\r\n");
      out.write("<link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    \r\n");
      out.write("    <style>\r\n");
      out.write("        * {\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("            box-sizing: border-box;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        body {\r\n");
      out.write("            font-family: Arial, sans-serif;\r\n");
      out.write("            background-color: #f4f7fc;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .container {\r\n");
      out.write("            max-width: 1200px;\r\n");
      out.write("            margin: 0 auto;\r\n");
      out.write("            padding: 20px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .header {\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            margin-bottom: 30px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        h1 {\r\n");
      out.write("            color: #333;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .btn {\r\n");
      out.write("            background-color: #4CAF50;\r\n");
      out.write("            color: white;\r\n");
      out.write("            border: none;\r\n");
      out.write("            padding: 10px 20px;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            font-size: 16px;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .btn:hover {\r\n");
      out.write("            background-color: #45a049;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .promo-form {\r\n");
      out.write("            background-color: white;\r\n");
      out.write("            padding: 20px;\r\n");
      out.write("            border-radius: 8px;\r\n");
      out.write("            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);\r\n");
      out.write("            margin-bottom: 30px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .promo-form h2 {\r\n");
      out.write("            margin-bottom: 20px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .promo-form input, .promo-form select, .promo-form textarea {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            padding: 10px;\r\n");
      out.write("            margin-bottom: 15px;\r\n");
      out.write("            border: 1px solid #ccc;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("            font-size: 16px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .promo-form input[type=\"number\"] {\r\n");
      out.write("            max-width: 100px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .promo-form .cancel {\r\n");
      out.write("            background-color: #f44336;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .promo-list {\r\n");
      out.write("            margin-top: 30px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .promo-list table {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            border-collapse: collapse;\r\n");
      out.write("            margin-top: 20px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .promo-list th, .promo-list td {\r\n");
      out.write("            border: 1px solid #ddd;\r\n");
      out.write("            padding: 10px;\r\n");
      out.write("            text-align: left;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .promo-list th {\r\n");
      out.write("            background-color: #f1f1f1;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .promo-list td {\r\n");
      out.write("            background-color: white;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .promo-list td button {\r\n");
      out.write("            background-color: #ff9800;\r\n");
      out.write("            color: white;\r\n");
      out.write("            border: none;\r\n");
      out.write("            padding: 5px 10px;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            font-size: 14px;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .promo-list td button:hover {\r\n");
      out.write("            background-color: #e68900;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .back-btn {\r\n");
      out.write("            margin-top: 20px;\r\n");
      out.write("            display: inline-block;\r\n");
      out.write("            background-color: #2196F3;\r\n");
      out.write("            padding: 10px 20px;\r\n");
      out.write("            color: white;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            font-size: 16px;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .back-btn:hover {\r\n");
      out.write("            background-color: #1e88e5;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .hidden {\r\n");
      out.write("            display: none;\r\n");
      out.write("        }\r\n");
      out.write("        .search-container {\r\n");
      out.write("            margin-bottom: 20px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .search-container input {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            padding: 10px;\r\n");
      out.write("            font-size: 16px;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("            border: 1px solid #ccc;\r\n");
      out.write("            max-width: 400px;\r\n");
      out.write("            margin: 0 auto;\r\n");
      out.write("            display: block;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <header class=\"header\">\r\n");
      out.write("            <h1>Quản Lý Khuyến Mãi</h1>\r\n");
      out.write("            <button id=\"addPromoBtn\" class=\"btn\">Thêm Khuyến Mãi Mới</button>\r\n");
      out.write("        </header>\r\n");
      out.write("\r\n");
      out.write("        <a href=\"Bieudodoanhthu\" class=\"back-btn\">Quay lại Trang Chính</a>\r\n");
      out.write("\r\n");
      out.write("		<div class=\"search-container\">\r\n");
      out.write("			<input type=\"text\" id=\"searchInput\"\r\n");
      out.write("				placeholder=\"Tìm kiếm theo tên hoặc mô tả khuyến mãi...\">\r\n");
      out.write("		</div>\r\n");
      out.write("		<div id=\"promoForm\" class=\"promo-form hidden\">\r\n");
      out.write("            <h2>Thêm Khuyến Mãi</h2>\r\n");
      out.write("            <form id=\"promoFormContent\" action=\"ThemKhuyenMai\" method=\"post\">\r\n");
      out.write("                <label for=\"promoName\">Tên Khuyến Mãi</label>\r\n");
      out.write("                <input type=\"text\" id=\"promoName\" name=\"tenKhuyenMai\" required>\r\n");
      out.write("                \r\n");
      out.write("                <label for=\"promoDescription\">Mô Tả</label>\r\n");
      out.write("                <textarea id=\"promoDescription\" name=\"moTa\" required></textarea>\r\n");
      out.write("                \r\n");
      out.write("                <label for=\"promoDiscount\">Giảm Giá (%)</label>\r\n");
      out.write("                <input type=\"number\" id=\"promoDiscount\" name=\"phanTramGiamGia\" required min=\"0\" step=\"0.1\" max=\"100\">\r\n");
      out.write("                \r\n");
      out.write("                <label for=\"promoProduct\">Chọn Sản Phẩm</label>\r\n");
      out.write("                <select id=\"promoProduct\" name=\"idchonSanPham\" required>\r\n");
      out.write("                    <option value=\"\">Chọn sản phẩm</option>\r\n");
      out.write("                    ");

                    LaydulieuReponsitory lg = new LaydulieuReponsitory();
                	List<SanPham> sp = lg.Laythongtinsanpham();
                	for(SanPham s : sp){
                    
      out.write("\r\n");
      out.write("                    <option value=\"");
      out.print( s.getMaSanpham());
      out.write('"');
      out.write('>');
      out.print(s.getTenSanPham() );
      out.write("</option>\r\n");
      out.write("                    \r\n");
      out.write("                    ");
} 
      out.write("\r\n");
      out.write("                </select>\r\n");
      out.write("                \r\n");
      out.write("                <button type=\"submit\" class=\"btn\">Lưu Khuyến Mãi</button>\r\n");
      out.write("               <!--  <button type=\"button\" id=\"cancelBtn\" class=\"btn cancel\">Hủy</button> -->\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <section class=\"promo-list\">\r\n");
      out.write("            <h2>Danh Sách Khuyến Mãi</h2>\r\n");
      out.write("            <table id=\"promoTable\">\r\n");
      out.write("                <thead>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th>ID</th>\r\n");
      out.write("                        <th>Tên</th>\r\n");
      out.write("                        <th>Mô Tả</th>\r\n");
      out.write("                        <th>Giảm Giá (%)</th>\r\n");
      out.write("                        <th>Sản Phẩm</th>\r\n");
      out.write("                        <th>Hành Động</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("                <tbody>\r\n");
      out.write("                    ");

                    Laydulieuchonguoidung lgn = new Laydulieuchonguoidung();
                    List<KhuyenMai> km = lgn.LayThongTinKhuyenMai();
                    int i = 1;
                    for(KhuyenMai khuyenMai : km){
                    	
                    
      out.write("\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>");
      out.print(i );
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print(khuyenMai.getMaKhuyenMai() );
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print(khuyenMai.getNoiDungKhuyenMai() );
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print( khuyenMai.getPhanTramKhuyenMai()*100);
      out.write("%</td>\r\n");
      out.write("                        <td>");
      out.print(khuyenMai.getMaSanpham() );
      out.write("</td>\r\n");
      out.write("                        <td text-center>\r\n");
      out.write("                        <form action=\"XoaKhuyenMai\" method=\"post\">\r\n");
      out.write("                        <input name=\"idXoa\" value=\"");
      out.print(khuyenMai.getMaKhuyenMai());
      out.write("\" type=\"hidden\">\r\n");
      out.write("                         <button class=\"deleteBtn\" data-index=\"0\" onclick=\"thongbao()\">Xóa</button>\r\n");
      out.write("                        </form>\r\n");
      out.write("                           \r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    ");

                    i= i+1;
                    } 
                    String thongBaoXoaThanhCong = (String) request.getAttribute("xoa");
                    String thongBaoXoaThatBai = (String) request.getAttribute("loi");
                    if(thongBaoXoaThanhCong != null){
                    
      out.write("\r\n");
      out.write("					<script>\n");
      out.write("					 alert(\"Xóa khuyến mãi thành công.\");\n");
      out.write("                   </script>\r\n");
      out.write("					");

					}
                    if(thongBaoXoaThatBai != null){
					
      out.write("\r\n");
      out.write("					<script>\r\n");
      out.write("					 alert(\"Xóa sản phẩm thất bại.\");\r\n");
      out.write("                   </script>\r\n");
      out.write("					");
} 
      out.write("\r\n");
      out.write("                </tbody>\r\n");
      out.write("            </table>\r\n");
      out.write("        </section>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <script>\r\n");
      out.write("        document.addEventListener('DOMContentLoaded', () => {\r\n");
      out.write("            const promoList = [\r\n");
      out.write("                { id: 1, name: 'Khuyến Mãi 1', description: 'Giảm giá 20% cho sản phẩm A', discount: 20, product: 'Sản phẩm 1' },\r\n");
      out.write("                { id: 2, name: 'Khuyến Mãi 2', description: 'Giảm giá 15% cho sản phẩm B', discount: 15, product: 'Sản phẩm 2' },\r\n");
      out.write("            ];\r\n");
      out.write("            const promoTable = document.getElementById('promoTable').getElementsByTagName('tbody')[0];\r\n");
      out.write("            const addPromoBtn = document.getElementById('addPromoBtn');\r\n");
      out.write("            const promoForm = document.getElementById('promoForm');\r\n");
      out.write("            const cancelBtn = document.getElementById('cancelBtn');\r\n");
      out.write("            const promoFormContent = document.getElementById('promoFormContent');\r\n");
      out.write("\r\n");
      out.write("            let editIndex = -1;\r\n");
      out.write("\r\n");
      out.write("            addPromoBtn.addEventListener('click', () => {\r\n");
      out.write("                promoForm.classList.remove('hidden');\r\n");
      out.write("                editIndex = -1; \r\n");
      out.write("                promoFormContent.reset();\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            cancelBtn.addEventListener('click', () => {\r\n");
      out.write("                promoForm.classList.add('hidden');\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            promoFormContent.addEventListener('submit', (e) => {\r\n");
      out.write("                e.preventDefault();\r\n");
      out.write("\r\n");
      out.write("                const newPromo = {\r\n");
      out.write("                    id: editIndex === -1 ? promoList.length + 1 : promoList[editIndex].id,\r\n");
      out.write("                    name: e.target.promoName.value,\r\n");
      out.write("                    description: e.target.promoDescription.value,\r\n");
      out.write("                    discount: e.target.promoDiscount.value,\r\n");
      out.write("                    product: e.target.promoProduct.value,\r\n");
      out.write("                };\r\n");
      out.write("\r\n");
      out.write("                if (editIndex === -1) {\r\n");
      out.write("                    promoList.push(newPromo);\r\n");
      out.write("                } else {\r\n");
      out.write("                    promoList[editIndex] = newPromo;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                updatePromoTable();\r\n");
      out.write("                promoForm.classList.add('hidden');\r\n");
      out.write("                e.target.reset();\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            function updatePromoTable() {\r\n");
      out.write("                promoTable.innerHTML = '';\r\n");
      out.write("                promoList.forEach((promo, index) => {\r\n");
      out.write("                    const row = promoTable.insertRow();\r\n");
      out.write("                    row.innerHTML = `\r\n");
      out.write("                        <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${promo.id}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${promo.name}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${promo.description}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${promo.discount}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("%</td>\r\n");
      out.write("                        <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${promo.product}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <button class=\"editBtn\" data-index=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${index}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">Sửa</button>\r\n");
      out.write("                            <button class=\"deleteBtn\" data-index=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${index}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">Xóa</button>\r\n");
      out.write("                        </td>\r\n");
      out.write("                    `;\r\n");
      out.write("                });\r\n");
      out.write("\r\n");
      out.write("                const deleteBtns = document.querySelectorAll('.deleteBtn');\r\n");
      out.write("                deleteBtns.forEach((btn) => {\r\n");
      out.write("                    btn.addEventListener('click', (e) => {\r\n");
      out.write("                        const index = e.target.getAttribute('data-index');\r\n");
      out.write("                        promoList.splice(index, 1);\r\n");
      out.write("                        updatePromoTable();\r\n");
      out.write("                    });\r\n");
      out.write("                });\r\n");
      out.write("\r\n");
      out.write("                const editBtns = document.querySelectorAll('.editBtn');\r\n");
      out.write("                editBtns.forEach((btn) => {\r\n");
      out.write("                    btn.addEventListener('click', (e) => {\r\n");
      out.write("                        const index = e.target.getAttribute('data-index');\r\n");
      out.write("                        const promo = promoList[index];\r\n");
      out.write("\r\n");
      out.write("                        document.getElementById('promoName').value = promo.name;\r\n");
      out.write("                        document.getElementById('promoDescription').value = promo.description;\r\n");
      out.write("                        document.getElementById('promoDiscount').value = promo.discount;\r\n");
      out.write("                        document.getElementById('promoProduct').value = promo.product;\r\n");
      out.write("\r\n");
      out.write("                        promoForm.classList.remove('hidden');\r\n");
      out.write("                        editIndex = index;\r\n");
      out.write("                    });\r\n");
      out.write("                });\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            updatePromoTable();\r\n");
      out.write("        });\r\n");
      out.write("        document.addEventListener('DOMContentLoaded', () => {\r\n");
      out.write("            const searchInput = document.getElementById('searchInput');\r\n");
      out.write("            const promoTable = document.getElementById('promoTable').getElementsByTagName('tbody')[0];\r\n");
      out.write("\r\n");
      out.write("            // Hàm lọc các khuyến mãi\r\n");
      out.write("            function filterPromos() {\r\n");
      out.write("                const query = searchInput.value.toLowerCase();\r\n");
      out.write("                const rows = promoTable.getElementsByTagName('tr');\r\n");
      out.write("\r\n");
      out.write("                for (const row of rows) {\r\n");
      out.write("                    const cells = row.getElementsByTagName('td');\r\n");
      out.write("                    const promoName = cells[1].textContent.toLowerCase();\r\n");
      out.write("                    const promoDescription = cells[2].textContent.toLowerCase();\r\n");
      out.write("\r\n");
      out.write("                    if (promoName.includes(query) || promoDescription.includes(query)) {\r\n");
      out.write("                        row.style.display = ''; // Hiển thị dòng\r\n");
      out.write("                    } else {\r\n");
      out.write("                        row.style.display = 'none'; // Ẩn dòng\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            // Lắng nghe sự kiện khi người dùng gõ vào ô tìm kiếm\r\n");
      out.write("            searchInput.addEventListener('input', filterPromos);\r\n");
      out.write("        });\r\n");
      out.write("        function thongbao() {\r\n");
      out.write("        	\r\n");
      out.write("                alert(\"Bạn có chắc xóa sản phẩm này chứ\");\r\n");
      out.write("                \r\n");
      out.write("            \r\n");
      out.write("		}\r\n");
      out.write("    </script>\r\n");
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
