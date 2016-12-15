<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<frameset rows="80,*">
   <frame name="top" src="${ pageContext.request.contextPath }/frame/top.jsp">
   <frameset cols="150,*" id="main">

      <frame src="${ pageContext.request.contextPath }/frame/left.jsp"> 
     <frame name="right" src="${ pageContext.request.contextPath }/frame/right.jsp">
   </frameset>
</frameset>
