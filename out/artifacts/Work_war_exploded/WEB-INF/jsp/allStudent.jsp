<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生展示</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>
                        学生列表   ------     显示所有学生
                    </small>
                </h1>
            </div>
        </div>
        <div class="row">
            <div class="col-md-4 column">
                <a class="btn btn-primary" href="${pageContext.request.contextPath}/student/addStudent">新增学生</a>
                <a class="btn btn-primary" href="${pageContext.request.contextPath}/student/allStudent">显示全部学生</a>
            </div>
            <div class="col-md-4 column"></div>
            <div class="col-md-4 column">
                <form class="form-inline" action="${pageContext.request.contextPath}/student/findStudentByNumber" method="post" style="float:right">
                    <span style="color:red;font-weight: bold">${error}</span>
                    <input type="text" name="number" class="form-control" placeholder="请输入要查询的学生学号">
                    <input type="submit" value="查询" class="btn btn-primary">
                </form>
                <form class="form-inline" action="${pageContext.request.contextPath}/student/findStudent" method="post" style="float:right">
                    <span style="color:red;font-weight: bold">${error}</span>
                    <input type="text" name="findStudentName" class="form-control" placeholder="请输入要查询的学生名称">
                    <input type="submit" value="查询" class="btn btn-primary">
                </form>
                <form class="form-inline" action="${pageContext.request.contextPath}/student/students" method="post" style="float:right">
                    <span style="color:red;font-weight: bold">${error}</span>
                    <input type="text" name="detail" class="form-control" placeholder="请输入要查询的社团名称">
                    <input type="submit" value="查询" class="btn btn-primary">
                </form>

            </div>
        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>学生编号</th>
                    <th>学生姓名</th>
                    <th>学生学号</th>
                    <th>学生年龄</th>
                    <th>所在社团</th>
                </tr>
                </thead>

                <tbody>
                <c:forEach var="student" items="${list}">
                    <tr>
                        <td>${student.studentID}</td>
                        <td>${student.studentName}</td>
                        <td>${student.studentNumber}</td>
                        <td>${student.studentAge}</td>
                        <td>${student.detail}</td>
                        <td>

                            <a href="${pageContext.request.contextPath}/student/updateStudent?id=${student.studentID}">修改</a>
                            &nbsp; | &nbsp;
                            <a href="${pageContext.request.contextPath}/student/deleteStudent/${student.studentID}">删除</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>
