<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%
	request.setCharacterEncoding("utf-8");
	response.setCharacterEncoding("utf-8");
%>

<c:if test="${empty user.username}" var="username">
	<c:redirect url="/index.jsp"/>
</c:if>