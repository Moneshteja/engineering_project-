/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.50
 * Generated at: 2022-04-18 09:49:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.sql.*;
import java.util.*;
import java.util.*;
import java.security.Key;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.util.encoders.Base64;
import java.sql.*;
import java.util.Random;
import java.io.PrintStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.security.DigestInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.io.BufferedInputStream;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import javax.crypto.Cipher;
import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

public final class Download2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/connect.jsp", Long.valueOf(1580296244000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.text.SimpleDateFormat");
    _jspx_imports_classes.add("java.io.FileOutputStream");
    _jspx_imports_classes.add("java.security.MessageDigest");
    _jspx_imports_classes.add("javax.crypto.Cipher");
    _jspx_imports_classes.add("java.security.Key");
    _jspx_imports_classes.add("java.util.Date");
    _jspx_imports_classes.add("java.security.KeyPairGenerator");
    _jspx_imports_classes.add("java.security.KeyPair");
    _jspx_imports_classes.add("java.io.PrintStream");
    _jspx_imports_classes.add("java.util.Random");
    _jspx_imports_classes.add("java.math.BigInteger");
    _jspx_imports_classes.add("java.security.DigestInputStream");
    _jspx_imports_classes.add("java.io.BufferedInputStream");
    _jspx_imports_classes.add("javax.crypto.spec.SecretKeySpec");
    _jspx_imports_classes.add("org.bouncycastle.util.encoders.Base64");
    _jspx_imports_classes.add("java.io.FileInputStream");
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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
      out.write("<title></title>\r\n");
      out.write("\r\n");
      out.write("\r\n");

	Connection connection = null;
 	try {
     

	  	Class.forName("com.mysql.jdbc.Driver");	
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Anefficient","root","root");
      	String sql="";

	}
	catch(Exception e)
	{
		System.out.println(e);
	}

      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<script type='text/javascript'>\r\n");
      out.write("\r\n");
      out.write("function saveTextAsFile()\r\n");
      out.write("{\r\n");
      out.write("\tvar textToWrite = document.getElementById(\"textarea\").value;\r\n");
      out.write("\tvar textFileAsBlob = new Blob([textToWrite], {type:'text/plain'});\r\n");
      out.write("\tvar fileNameToSaveAs = \"File.txt\";\r\n");
      out.write("\r\n");
      out.write("\tvar downloadLink = document.createElement(\"a\");\r\n");
      out.write("\tdownloadLink.download = fileNameToSaveAs;\r\n");
      out.write("\tdownloadLink.innerHTML = \"Download File\";\r\n");
      out.write("\tif (window.webkitURL != null)\r\n");
      out.write("\t{\r\n");
      out.write("\t\t// Chrome allows the link to be clicked\r\n");
      out.write("\t\t// without actually adding it to the DOM.\r\n");
      out.write("\t\tdownloadLink.href = window.webkitURL.createObjectURL(textFileAsBlob);\r\n");
      out.write("\t}\r\n");
      out.write("\telse\r\n");
      out.write("\t{\r\n");
      out.write("\t\t// Firefox requires the link to be added to the DOM\r\n");
      out.write("\t\t// before it can be clicked.\r\n");
      out.write("\t\tdownloadLink.href = window.URL.createObjectURL(textFileAsBlob);\r\n");
      out.write("\t\tdownloadLink.onclick = destroyClickedElement;\r\n");
      out.write("\t\tdownloadLink.style.display = \"none\";\r\n");
      out.write("\t\tdocument.body.appendChild(downloadLink);\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tdownloadLink.click();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function destroyClickedElement(event)\r\n");
      out.write("{\r\n");
      out.write("\tdocument.body.removeChild(event.target);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<title>Download2</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/coin-slider.css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/cufon-yui.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/cufon-aller.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.4.2.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/script.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/coin-slider.min.js\"></script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".style1 {font-size: 24px}\r\n");
      out.write(".style3 {font-weight: bold}\r\n");
      out.write(".style4 {\r\n");
      out.write("\tcolor: #FF0000;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write(".style5 {color: #FF0000}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"main\">\r\n");
      out.write("  <div class=\"header\">\r\n");
      out.write("    <div class=\"header_resize\">\r\n");
      out.write("      <div class=\"logo\">\r\n");
      out.write("        <h1><a href=\"index.html\" class=\"style1\">Privacy Preserving Searchable Encryption with Fine Grained Access Control\r\n");
      out.write("</a></h1>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"menu_nav\">\r\n");
      out.write("        <ul>\r\n");
      out.write("          <li><a href=\"index.html\"><span>Home Page</span></a></li>\r\n");
      out.write("          <li><a href=\"DataOwnerLogin.html\">Data Owner </a></li>\r\n");
      out.write("          <li><a href=\"EndUserLogin.html\">End User</a></li>\r\n");
      out.write("          <li class=\"active\"><a href=\"CloudServerLogin.html\">Cloud Server</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"clr\"></div>\r\n");
      out.write("      <div class=\"slider\">\r\n");
      out.write("        <div id=\"coin-slider\"> <a href=\"#\"><img src=\"images/slide1.jpg\" width=\"960\" height=\"320\" alt=\"\" /> </a> <a href=\"#\"><img src=\"images/slide2.jpg\" width=\"960\" height=\"320\" alt=\"\" /> </a> <a href=\"#\"><img src=\"images/slide3.jpg\" width=\"960\" height=\"320\" alt=\"\" /> </a> </div>\r\n");
      out.write("        <div class=\"clr\"></div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"clr\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"content\">\r\n");
      out.write("    <div class=\"content_resize\">\r\n");
      out.write("    \r\n");
      out.write("          <h2><span class=\"style4\">Dowload Your File    </span> <span class=\"style5\">-----  </span><a href=\"EndUserMainjsp.jsp\">Back</a></h2>\r\n");
      out.write("         \r\n");
      out.write("            ");

		  	
		    	try 
				{
				
				
           		String ename=(String)application.getAttribute("uname");
		  		String file = request.getParameter("t1");
				String trapdoor=request.getParameter("t12");
				String sk=request.getParameter("t13");
				
				application.setAttribute("file",file);
				application.setAttribute("sk",sk);
				
				String status="Yes";
				
				String strQuery = "select * from cloudserver where fname='"+file+"' ";
				ResultSet rs = connection.createStatement().executeQuery(strQuery);
					if(rs.next()==true)
					{
						String ct=rs.getString(3);
						String td=rs.getString(4);
						String sk1=rs.getString(5);
						String rank=rs.getString(6);
						
			
						String keys = "ef50a0ef2c3e3a5f";
						byte[] keyValue1 = keys.getBytes();
      					Key key1 = new SecretKeySpec(keyValue1,"AES");
      					Cipher c1 = Cipher.getInstance("AES");
      					c1.init(Cipher.DECRYPT_MODE, key1);
      					String decryptedValue = new String(Base64.decode(ct.getBytes()));
						String td1 = new String(Base64.decode(td.getBytes()));
						String sk11 = new String(Base64.decode(sk1.getBytes()));
				
						if(td1.equalsIgnoreCase(trapdoor) & sk11.equalsIgnoreCase(sk))
						{
						
						String strQuery1 = "select * from srequest where status='"+status+"' ";
					    ResultSet rs1 = connection.createStatement().executeQuery(strQuery1);
					
					       if(rs1.next()==true)
						 {
						int updaterank = Integer.parseInt(rank)+1;
						String strQuery2 = "update cloudserver set rank='"+updaterank+"' where fname='"+file+"'";
						connection.createStatement().executeUpdate(strQuery2);	
			
      out.write("\r\n");
      out.write("\t\t  </p>\r\n");
      out.write("\t\t  <p align=\"center\" class=\"style1\">File Contents</p>\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t    <label>\r\n");
      out.write("\t            <div align=\"center\">\r\n");
      out.write("\t              <textarea name=\"text\" id=\"textarea\" cols=\"45\" rows=\"17\">");
      out.print(decryptedValue);
      out.write("</textarea>\r\n");
      out.write("\t              <br/>\r\n");
      out.write("\t              <br/>\r\n");
      out.write("\t              <td><button onClick=\"saveTextAsFile()\">Download</button>\r\n");
      out.write("                  <p><a href=\"Download.jsp\">Back</a></p></td>\r\n");
      out.write("            </div>\r\n");
      out.write("\t\t    </label>\r\n");
      out.write("\t\t  <p align=\"center\">&nbsp; </p>\r\n");
      out.write("\t\t  <p>\r\n");
      out.write("\t\t    ");
	
			}
			else
			{
      out.write("\r\n");
      out.write("\t\t\t  \r\n");
      out.write("\t\t\t  <p>\r\n");
      out.write("\t\t  <h1 class=\"style1\">No Search Permission !!!</h1>\r\n");
      out.write("\t\t  </p>\r\n");
      out.write("\t\t\t  \r\n");
      out.write("\t\t\t");
}
			}
			else
			{
			
      out.write("\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t  <h1 class=\"style1\">Trapdoor / Secret Key Mismatch !!!</h1>\r\n");
      out.write("\t\t  </p><br />\r\n");
      out.write("\t\t\t\t\t\t<p><a href=\"Download.jsp\">Back</a></p>\r\n");
      out.write("\t\t\t");

			
			String type="Key Attacker";
			SimpleDateFormat sdfDate = new SimpleDateFormat("dd/MM/yyyy");
						SimpleDateFormat sdfTime = new SimpleDateFormat("HH:mm:ss");

						Date now = new Date();
		
						String strDate = sdfDate.format(now);
						String strTime = sdfTime.format(now);
						String dt = strDate + "   " + strTime;
				
						String user = (String) application.getAttribute("name");
						
						String strQuery22 = "insert into keyattacker(fname,sk,type,dt,Aname) values('"+file+"','"+sk+"','"+type+"','"+dt+"','"+ename+"')";
						connection.createStatement().executeUpdate(strQuery22);
			}
					
			}
					else
					{
						
		
      out.write("\r\n");
      out.write("\t      </p>\r\n");
      out.write("\t\t  <p>\r\n");
      out.write("\t\t  <h1 class=\"style1\">File Doesn't Exist !!!</h1>\r\n");
      out.write("\t\t  </p><br />\r\n");
      out.write("\t\t\t\t\t\t<p><a href=\"Download.jsp\">Back</a></p>\r\n");
      out.write("\t");

					}
				
	 			
		  connection.close();
		  } 
          catch(Exception e)
          {
            out.println(e.getMessage());
          }

      out.write("\r\n");
      out.write("      <div class=\"clr\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"fbg\">\r\n");
      out.write("    <div class=\"fbg_resize\">\r\n");
      out.write("      <div class=\"clr\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"footer\">\r\n");
      out.write("    <div class=\"footer_resize\">\r\n");
      out.write("\r\n");
      out.write("     \r\n");
      out.write("      <div style=\"clear:both;\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
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