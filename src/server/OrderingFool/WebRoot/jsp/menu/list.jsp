<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<style type="text/css">
.table1 {
	border: 1px solid #ddd;
	width: 900px;
}
img {
    border:0;
}
thead {
	background-color: lightblue;
}
</style>
</head>
<body>
	<table border="0" width="900px">
		<tr>
			<td align="center" style="font-size:24px; color:#666">商铺管理</td>
		</tr>
		<tr>
			<td align="right"><a href="${pageContext.request.contextPath }/menu_saveUI.action">添加</a>
			</td>
		</tr>
	</table>
	<br />


	<table cellspacing="0" border="1" class="table1">
		<thead>
			<tr>
				<td align="center">编号</td>
				<td align="center">菜名</td>
				<td align="center">简介</td>
				<td align="center">原料</td>
				<td align="center">价格</td>
				<td align="center">编辑</td>
				<td align="center">删除</td>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="list" var="m">
			<tr>
				<td align="center"><s:property value="#m.mid"/></td>
				<td align="center"><s:property value="#m.name"/></td>
				<td align="center"><s:property value="#m.synopsis"/></td>
				<td align="center"><s:property value="#m.material"/></td>
				<td align="center"><s:property value="#m.price"/></td>
				<td align="center">
				<a href="${pageContext.request.contextPath }/menu_edit.action?mid=<s:property value="#m.mid"/>"><img  
						src="${pageContext.request.contextPath}/images/edit.png"></img>
				</a>
				</td>
				<td align="center">
				<a href="${pageContext.request.contextPath }/menu_delete.action?mid=<s:property value="#m.mid"/>"><img 
						src="${pageContext.request.contextPath}/images/delete.png"></img>
				</a>
				</td>
				
			</tr>
			</s:iterator>
		</tbody>
	</table>
	<br />

	<table table border="0" cellspacing="0" cellpadding="0" width="900px">
		<tr>
			<td align="right"><span>第<s:property value="currPage" />/<s:property
						value="totalPage" />页</span> &nbsp;&nbsp;<span>总记录数:<s:property
						value="totalCount" />&nbsp;&nbsp;每页显示：<s:property value="pageSize" />
					</span>&nbsp;&nbsp; 
					<span> 
						<s:if test="currPage!=1">
							<a href="${pageContext.request.contextPath }/business_findAll.action?currPage=1">[首页]</a>&nbsp;&nbsp; 
							<a href="${pageContext.request.contextPath }/business_findAll.action?currPage=<s:property value="currPage-1"/>">[上一页]</a>&nbsp;&nbsp; 
						</s:if>
						<s:if test="currPage!=totalPage">
							<a href="${pageContext.request.contextPath }/business_findAll.action?currPage=<s:property value="currPage+1"/>">[下一页]</a>&nbsp;&nbsp; 
							<a href="${pageContext.request.contextPath }/business_findAll.action?currPage=<s:property value="totalPage"/>">[尾页]</a>&nbsp;&nbsp; 
						</s:if>
					</span>
			</td>
		</tr>
	</table>
</body>
</html>