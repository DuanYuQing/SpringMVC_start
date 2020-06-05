<%--
  Created by IntelliJ IDEA.
  User: Yuqin
  Date: 6/4/2020
  Time: 11:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>请求参数绑定到JavaBean</title>
</head>
<body>
<form action="params/saveAccount" method="post">
    用户名: <input type="text" name="username"><br>
    密码: <input type="password" name="password"><br>
    金额: <input type="text" name="money"><br>

    <%--复杂字段--%>
    地址(省): <input type="text" name="address.province">
    地址(市): <input type="text" name="address.city">
    街道编号: <input type="text" name="address.roadNum"><br>

    <%--自定义类型转换器--%>
    生日: <input type="text" name="birthday"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
