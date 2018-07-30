<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
  Time: 4:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
        .head1{
            color:darkblue;
            alignment: center;
            font-size:30px;
            margin-top:50px;
            font-variant: small-caps;
            font-family:Arial, Helvetica, sans-serif;
        }

        .head3{
            font-family:Arial, Helvetica, sans-serif;
        }

        .button {
            background-color: #4CAF50;
            border: none;
            color: white;
            padding: 4px 20px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 14px;
            margin: 4px 2px;
            cursor: pointer;
        }

    </style>

    <title>User Information System</title>
</head>
<body>
<div align="center">
    <h1 class="head1">Users List</h1>
    <h3 class="head3">
        <a href="newUser">Add New User</a>
    </h3>
    <input type="text" id="myInput" onkeyup="myFunction()" placeholder="Search for names.." title="Type in a name">
    <button type="button" onclick="viewAll()" class="button">View All</button> <br><br>


    <table border="2" id="AllTable">

        <th>Name</th>
        <th>Age</th>
        <th>Address</th>
        <th>Username</th>
        <th></th>

        <c:forEach var="user" items="${listUser}">
            <tr>

                <td>${user.name}</td>
                <td>${user.age}</td>
                <td>${user.address}</td>
                <td>${user.username}</td>
                <td><a href="/editUser?id=${user.user_id}">Edit</a>
                    <a href="/deleteUser?id=${user.user_id}">Delete</a></td>

            </tr>
        </c:forEach>

    </table>


    <script>

        function viewAll() {

            var input, filter, table, tr, td, i;
            input = document.getElementById("myInput");
            filter = input.value.toUpperCase();
            table = document.getElementById("AllTable");
            tr = table.getElementsByTagName("tr");
            for (i = 0; i < tr.length; i++) {
                td = tr[i].getElementsByTagName("td")[0];
                tr[i].style.display = "";
            }
        }


        function myFunction() {
            var input, filter, table, tr, td, i;
            input = document.getElementById("myInput");
            filter = input.value.toUpperCase();
            table = document.getElementById("AllTable");
            tr = table.getElementsByTagName("tr");
            for (i = 0; i < tr.length; i++) {
                td = tr[i].getElementsByTagName("td")[0];
                if (td) {
                    if (td.innerHTML.toUpperCase().indexOf(filter) > -1) {
                        tr[i].style.display = "";
                    } else {
                        tr[i].style.display = "none";
                    }
                }
            }
        }
    </script>
</div>

</body>
</html>
