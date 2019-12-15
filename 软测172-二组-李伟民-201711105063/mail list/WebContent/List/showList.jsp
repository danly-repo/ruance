<%@ page language="java" contentType="text/html; charset=utf-8"  pageEncoding="utf-8" errorPage="/error.jsp"  %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="/LoginCheck.jsp" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>用户管理</title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/common.css" />
	</head>
	<body>
	  <div id="wrapper">
	 	<!-- header -->
	   <div class="header">
			<jsp:include page="/header.jsp" flush="true"/>
	    </div>
		<!-- menu -->
		<div class="menu">
			<jsp:include page="/List/menu.jsp"/>
		</div>
		<!-- content -->
		<div class="content">
		<div class="form1">
			<form action="${pageContext.request.contextPath}/GetListsServlet" method="post">
				用户名：<input type="text" name="alname" value="${param.alname}"/>&nbsp;&nbsp;
				电话号码：<input type="text" name="altel" value="${param.altel}"/>
				<input type="submit" value="查询"/>
			</form>
		</div>
			<table class="mtable2">
				<caption>用户列表</caption>
				<tr><a href="${pageContext.request.contextPath}/DeleteAllListServlet">全部删除</a><tr>
				<tr><th>序号</th><th>用户名</th><th>电话号码</th><th>地址</th><th>邮政编码</th><th>操作</th></tr>
				<c:forEach var="tmp" items="${lists}" varStatus="s">
					<tr>
						<td>${s.index+1}</td>
						<td>${tmp.alname}</td>
					    <td>${tmp.altel}</td>
					    <td>${tmp.address}</td>
					    <td>${tmp.pcode}</td>
					    <td><a href="${pageContext.request.contextPath}/List/UpdateList.jsp?alname=${tmp.alname}">修改</a>
					   	 &nbsp;&nbsp;&nbsp;&nbsp;
					    	<a href="${pageContext.request.contextPath}/DeleteListServlet?alname=${tmp.alname}"
					    	onclick="if(!confirm('确定要删除吗？')) return false;">删除</a></td>
					</tr>
				</c:forEach>
			</table>
			${error}
		</div>
		<!-- footer -->
		<div class="footer">
			<jsp:include page="/footer.jsp" flush="true"/>
		</div>
	  </div>
		
	</body>
</html>