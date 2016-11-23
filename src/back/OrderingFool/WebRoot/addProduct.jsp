<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>添加商品页面</title>
  </head>
  
  <body>	
    <s:form action="product_save" method="post" theme="simple" namespace="/">
    	<table border="1">
    		<tr><td>商品名称:</td><td><s:textfield name="pname"></s:textfield></td></tr>
    		<tr><td>商品价格:</td><td><s:textfield name="price"></s:textfield></td></tr>
    		<tr><td colspan="2"><input type="submit" value="添加商品"/></td></tr>
    	</table>
    </s:form>
  </body>
</html>
