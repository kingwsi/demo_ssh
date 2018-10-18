<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>DEMO</title>
</head>
<body>
<h1>SSH整合 - 插入数据测试</h1>
<s:form action="ssh_save" method="post" namespace="/" theme="simple">
	<table border="1" width="400">
		<tr>
			<td>NAME</td>
			<td><s:textfield name="bname"/></td>
		</tr>
		<tr>
			<td>AUTHOR</td>
			<td><s:textfield name="author"/></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="SUBMIT"></td>
		</tr>
	</table>
</s:form>
</body>
</html>