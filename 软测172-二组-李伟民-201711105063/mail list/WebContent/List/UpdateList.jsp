<%@ page language="java" contentType="text/html; charset=utf-8"  pageEncoding="utf-8" errorPage="/error.jsp"  %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ include file="/LoginCheck.jsp" %>

<c:if test="${empty updateList}">
	<c:set var="alname" value="${param.alname}"/>
	<jsp:useBean id="listbpo" class="bpo.ListBpo"/>
	<c:set var="updateList" value="${listbpo.getListById(alname)}"/>
</c:if>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>修改用户信息</title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css" />
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
			<form action="${pageContext.request.contextPath}/UpdateListServlet" method="post">
				<table class="mtable3" align=center>
					<caption>修改用户基本信息</caption>
					<tr><td>用户名：</td>
						<td><input type="text" name="alname" 
									value="${updateList.alname}"/></td></tr>
					<tr><td>电话号码:</td>
						<td><input type="text" name="altel" 
									value="${updateList.altel}"/>${errors.altel}</td></tr>
					<tr><td>地址:</td>
						<td><input type="text" name="address" value="${updateList.address}"/></td></tr>
					<tr><td>邮政编码:</td>
						<td><input type="text" name="pcode" value="${updateList.pcode}"/></td></tr>
					<tr><td><input type="submit" value="保存"/></td></tr>
				</table>
				${errors.othererr}
			</form>
		</div>
		<!-- footer -->
		<div class="footer">
			<jsp:include page="/footer.jsp" flush="true"/>
		</div>
	  </div>
		
	</body>
</html>