<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="/LoginCheck.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>组长管理页面</title>
</head>
<body>
	<div id="wrapper">
		<div class="header">
			<jsp:include page="header.jsp"/>
		</div>
		<div class="menu">
			<ul>
				<li><a href="${pageContext.request.contextPath }/manager/dataManager.jsp">数据管理</a></li>
				<li><a href="${pageContext.request.contextPath }/manager/ManagerM.jsp">个人信息</a></li>
			</ul>
		</div>
		<div class="content"></div>
		<div class="footer">
			<jsp:include page="/footer.jsp" flush="true"/>
		</div>
	</div>
</body>
</html>