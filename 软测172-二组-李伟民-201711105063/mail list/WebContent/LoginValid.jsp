<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" errorPage="/error.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.HashSet" %>
<%
	request.setCharacterEncoding("UTF-8");
	response.setCharacterEncoding("UTF-8");

%>
<body>
    <jsp:useBean id="user" class="bean.UserBean" scope="request"/>
	<jsp:setProperty name="user" property="username" param="name"/>
	<jsp:setProperty name="user" property="password"/>
	<jsp:setProperty property="userType" name="user"/>
	<c:set var="successflag" value="${user.validlogin()}"/>
	
	<c:choose>
		<c:when test="${successflag&&user.userType eq '1'}">
			<c:set var="user" value="${user}" scope="session"/>
			<c:redirect url="LoginSuccess.jsp"/>
		</c:when>
		<c:when test="${successflag&&user.userType eq '2'}">
			<%
			HashSet sessions=(HashSet)application.getAttribute("sessions");
    		if(sessions==null){
    			sessions=new HashSet();
    			application.setAttribute("sessions",sessions);
    		}
    		sessions.add(sessions);
			%>
			<c:set var="user" value="${user}" scope="session"/>
			<c:redirect url="ListMag.jsp"/>
			
		</c:when>
		<c:otherwise>
			<jsp:forward page="index.jsp">
				<jsp:param value="用户名或密码不正确，登陆失败！" name="error"/>
			</jsp:forward>
		</c:otherwise>
	</c:choose>
	
</body>
