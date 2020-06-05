<%--
  Created by IntelliJ IDEA.
  User: Yuqin
  Date: 6/3/2020
  Time: 4:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>success页面</title>
</head>
<body>
<h2>已经内部forward到success.jsp页面！</h2>
${requestScope.msg}
<%--session域中也有 msg=东方老赢--%>
${sessionScope.msg}
</body>
</html>
