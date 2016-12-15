<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html>
<head></head>
<body>
	<table border="0" width="600px">
		<tr>
			<td align="center" style="font-size:24px; color:#666">用户添加</td>
		</tr>
		<tr>
			<td align="right"><a href="javascript:document.getElementById('saveForm').submit()">保存</a>
			 &nbsp;&nbsp; <a href="javascript:history.go(-1)">退回
			</a>
			</td>
		</tr>
	</table>
	<br />
	<br>
	<s:form id="saveForm" action="users_save" method="post" namespace="/" theme="simple">
		<table style="font-size::16px">
			<tr>
				<td>用户名：</td>
				<td><s:textfield name="username"/></td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><s:password name="password"/></td>
			</tr>
			<tr>
				<td>联系电话：</td>
				<td><s:textfield name="phoneNum"/></td>
			</tr>
		</table>
	</s:form>
</body>
</html>
