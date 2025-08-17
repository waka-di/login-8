<%@ page language = "java" contentType = "text/html; charset=UTF-8" pageEncoding = "utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%><%--毎回固定 --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Iログイン画面</title>
</head>
<body>
	<!-- strutsタグ＝<s:～>で表す -->
	<s:form action = "LoginAction">  <!-- LoginActionに送信（submit） -->
		<s:textfield name = "name"/>
		<s:password name="password"/>
		<s:submit value="ログイン"/>
	</s:form> 

</body>
</html>