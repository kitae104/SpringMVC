<%--
  Created by IntelliJ IDEA.
  User: UserK
  Date: 2024-02-05
  Time: 오후 11:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/student/view" method="get">
        이름 : <input type="text" name="name"><br />
        나이 : <input type="text" name="age"><br />
        학년 : <input type="text" name="gradeNum"><br />
        번호 : <input type="text" name="classNum"><br />
        <input type="submit" value="전송">
    </form>
</body>
</html>
