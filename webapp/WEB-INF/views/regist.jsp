<%--
  Created by IntelliJ IDEA.
  User: songk
  Date: 2021-11-18
  Time: 오후 10:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
    <title>글쓰기</title>
</head>
<body>
<form method = "post">

    <p><label>제목</label><input type="text" name ="title"></p>
    <p><label>작성자</label><input type="text" name="writer" size="15">
    </p>
    <label>내용</label><p>
        <textarea rows="15" cols="65" name = "content"></textarea><p>
        <button type = "submit">등록</button>
</form>
</body>
</html>