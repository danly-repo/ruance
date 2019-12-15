<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="/LoginCheck.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>个人信息</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/style.css" />
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/common.css" />
</head>
<body>
	
	<div id="wrapper">
		<div class="header">
			<jsp:include page="../header.jsp" flush="true"/>
		</div>
		<div class="menu">
			<ul>
				<li><a href="${pageContext.request.contextPath}/List/showList.jsp">查询通讯录信息</a></li>
				<li><a href="${pageContext.request.contextPath}/List/AddList.jsp">增加通讯信息</a></li>
				<li><a href="${pageContext.request.contextPath}/List/UserM.jsp">管理个人信息</a></li>
			</ul>
		</div>
		<div class="content">
			<form action="${pageContext.request.contextPath}/UpdateMServlet" method="post">
				<table class="mtable3" align=center>
					<caption>个人基本信息</caption>
					<tr><td>id：</td>
						<td><input type="hidden" name="userid" 
									value="${user.getUserById1(user.username).getUserid()}"/>${user.getUserById1(user.username).getUserid()}</td></tr>
					<tr><td>姓名:</td>
						<td><input type="text" name="username" 
									value="${user.username}"/>${errors.username}</td></tr>
					<tr><td>性别</td>
						<td><input type="text" name="sex" value="${user.getUserById1(user.username).getSex()}"/></td></tr>
					<tr><td>年龄</td>
						<td><input type="text" name="age" value="${user.getUserById1(user.username).getAge()}"/></td></tr>
					<tr><td>出生日期</td>
						<td><input type="text" name="birthday" value="${user.getUserById1(user.username).getBirthday()}"/></td></tr>
					<tr><td>密码：</td>
						<td><input type="text" name="password" value="${user.password}"/></td></tr>
					<tr><td><input type="submit" value="修改信息"/></td></tr>
				</table>
				${errors.othererr}
			</form>
		</div>
		<div class="footer">
			<jsp:include page="../footer.jsp" flush="true"/>
		</div>
	</div>

</body>
</html>