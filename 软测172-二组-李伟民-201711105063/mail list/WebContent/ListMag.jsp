<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="/LoginCheck.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>学生操作界面</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/style.css"/>
</head>
<body>
	<div id="wrapper">
		<div class="header">
			<jsp:include page="header.jsp" flush="true"/>
		</div>
		<div class="menu">
			<ul>
				<li><a href="${pageContext.request.contextPath }/List/showList.jsp">查询通讯录</a></li>
				<li><a href="${pageContext.request.contextPath }/List/AddList.jsp">增加通讯录</a></li>
				<li><a href="${pageContext.request.contextPath }/List/UserM.jsp">个人信息</a></li>
			</ul>
		</div>
		<div class="content">
		
		</div>
		<div class="footer">
			<jsp:include page="footer.jsp" flush="true"/>
		</div>
	</div>
</body>
</html>