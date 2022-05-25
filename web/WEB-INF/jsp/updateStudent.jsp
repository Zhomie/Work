<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改学生</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>
                        修改学生
                    </small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/student/update" method="post">
        <%----%>
        <%--前端传递隐藏域--%>
            <input type="hidden" name="studentID" value="${fstudent.studentID}">
        <div class="form-group">
            <label>学生名称</label>
            <input type="text" name="studentName" class="form-control" value="${fstudent.studentName}" required>
        </div>
            <div class="form-group">
                <label>学生学号</label>
                <input type="text" name="studentNumber" class="form-control" value="${fstudent.studentNumber}" required>
            </div>
        <div class="form-group">
            <label>学生年龄</label>
            <input type="text" name="studentAge" class="form-control" value="${fstudent.studentAge}" required>
        </div>
        <div class="form-group">
            <label>学生信息</label>
            <input type="text" name="detail" class="form-control" value="${fstudent.detail}" required>
        </div>
        <div class="form-group">
            <input type="submit" class="form-control" value="修改">
        </div>
    </form>

</div>
</body>
</html>
