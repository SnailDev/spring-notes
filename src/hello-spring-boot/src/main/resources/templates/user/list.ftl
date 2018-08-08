<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <title>用户列表</title>
    <link href="/css/main.css" rel="stylesheet" />
</head>
<body>
<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>姓名</th>
        <th>生日</th>
        <th>性别</th>
    </tr>
    </thead>
    <tbody>
            <#list userList as user>
            <tr>
                <td>${user.id}</td>
                <td>${user.username}</td>
                <td>${user.birthday?string('yyyy-MM-dd')}</td>
                <td>${user.sex}</td>
            </tr>
            </#list>
    </tbody>
</table>
</body>
</html>