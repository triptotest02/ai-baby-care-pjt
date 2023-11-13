<%@page import="java.util.List"%>
<%@page import="com.hackathon.abc.test.dto.TestDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<%
	List<TestDTO> dto = (List<TestDTO>)request.getAttribute("testDto");
%>
<html>
<head>
<meta charset="EUC-KR">
<script type="text/javascript">
	console.log("<%=dto%>")
</script>
</head>
<body>
</body>
</html>