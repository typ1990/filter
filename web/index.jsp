<%--
  Created by IntelliJ IDEA.
  User: lisa
  Date: 2016/9/12
  Time: 15:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
  <head>
    <base href="<%=basePath%>">
    <title>My JSP 'index.jsp' starting page</title>
  </head>
  <body>
  This is my JSP page. <br>

  <%
    System.out.println("处理过程完成");
  %>
  </body>
</html>
