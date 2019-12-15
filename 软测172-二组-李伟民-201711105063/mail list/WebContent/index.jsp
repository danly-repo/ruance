<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登陆窗口</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/headerstyle.css" />

</head>
<body>
<div id="Bt">
<div id="cont">
 <h3>管理员登录</h3>
  <form action="LoginValid.jsp" method="post">
  	<table border=0>
  		<tr><td>用户名：</td><td><input name='name' type='text' value=''/></td></tr>
  		<tr></tr>
  		<tr></tr>
  		<tr></tr>
  		<tr></tr>
  		<tr><td>密码：</td><td><input name='password' type='password' value=''/></td></tr>
  		<tr></tr>
  		<tr></tr>
  		<tr></tr>
  		<tr></tr>
  		<tr>
  			<td>用户类型：</td>
  			<td><select name="userType">
  					<option value="1">用户管理员</option>
  					<option value="2">用户</option>
  					<option value="3">组长</option>
  				</select></td>
  		</tr>
  		${param.error}
  		<tr><td colspan=2 align=right>
  			<input type="reset" value="重置" class="btn">
  			<input type='submit' value='提交'/></td>
  		</tr>
  		
  		<tr><td colspan=2 align=right></td></tr>
  	</table>
  </form>
  </div>
  </div>
</body>
</html>