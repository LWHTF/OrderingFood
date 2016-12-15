<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<!doctype html>
<html>
<head>
<link href="dtree.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="dtree.js"></script>
</head>

<body bgColor=#DDF0FB leftMargin=0 topMargin=0 marginwidth="0" marginheight="0">
<table width="90%" border="0" cellspacing="1" cellpadding="2" align="center">
<div class="dtree">
  <script type="text/javascript">
    d=new dTree('d');

    d.add('01','-1','妈饿了后台管理系统');
    d.add('0101','01','实体管理');
    d.add('010101','0101','用户管理','${pageContext.request.contextPath}/users_findAll.action','','right');
    d.add('010102','0101','商家管理','${pageContext.request.contextPath}/business_findAll.action','','right');

    d.add('010103','0101','菜单管理','${pageContext.request.contextPath}/menus_findAll.action','','right');
    document.write(d);
  </script>
</div>
</table>

</body>
</html>

