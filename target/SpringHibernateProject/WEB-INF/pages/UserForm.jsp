<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  ~  Copyright 2006-2007 hSenid Software International (Pvt) Limited.
  ~  All Rights Reserved.
  ~
  ~ These materials are unpublished, proprietary, confidential source code of
  ~ hSenid Software International (Pvt) Limited and constitute a TRADE SECRET
  ~ of hSenid Software International (Pvt) Limited.
  ~
  ~ hSenid Software International (Pvt) Limited retains all title to and intellectual
  ~ property rights in these materials.
  --%>

<%--
  Created by IntelliJ IDEA.
  User: charana
  Date: 7/17/18
  Time: 5:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit User</title>
</head>
<body>
<div align="center">
    <h1>Edit User</h1>
    <form:form action="saveUser" method="post" modelAttribute="user">

        <!--form:form action="saveUser" method="post" modelAttribute="user"-->
        <table>
            <form:hidden path="user_id"/>
            <tr>
                <td>Name:</td>
                <td><form:input path="name" /></td>
            </tr>
            <tr>
                <td>Age:</td>
                <td><form:input path="age" /></td>
            </tr>
            <tr>
                <td>Address:</td>
                <td><form:input path="address" /></td>
            </tr>
            <tr>
                <td>Username:</td>
                <td><form:input path="username" /></td>
            </tr>
            <tr>
                <td>Password:</td>
                <td><form:input path="password" /></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Save"></td>
            </tr>
        </table>
    </form:form>
</div>

</body>
</html>
