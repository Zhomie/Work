<%--
  Created by IntelliJ IDEA.
  User: 张homie
  Date: 2022/5/23
  Time: 16:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增学生</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>
                        新增学生
                    </small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/student/add" method="post">
        <div class="form-group">
            <label>学生名称</label>
            <input type="text" name="studentName" class="form-control" required>
        </div>
        <div class="form-group">
            <label>学生学号</label>
            <input type="text" name="studentNumber" class="form-control" required>
        </div>
        <div class="form-group">
            <label>学生年龄</label>
            <input type="text" name="studentAge" class="form-control" required>
        </div>
        <div class="form-group">
            <label>学生信息</label>
            <input type="text" name="detail" class="form-control" required>
        </div>
        <div class="form-group">
            <input type="submit" class="form-control" value="添加">
        </div>
    </form>

</div>
</body>
</html>
