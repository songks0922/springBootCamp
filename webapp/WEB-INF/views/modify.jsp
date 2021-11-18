<%--
  Created by IntelliJ IDEA.
  User: songk
  Date: 2021-11-18
  Time: 오후 10:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ page session="false"%>

<!DOCTYPE>
<html>
<head>
    <title>글수정</title>
</head>
<body>
글 수 정     페 이 지
<form action="modify" method = "post">
    <p><label>글번호</label> <input type="text" name ="bno" value ="${boardVo.bno}" readonly="readonly"></p>
    <p><label>제목</label ><input type="text" name ="title" value ="${boardVo.title}" ></p>
    <p><label>작성자</label> <input type="text" name="writer" size="15" value = "${boardVo.writer}"></p>
    <label>내용</label>
    <textarea name=content rows ="10" cols="70" >${boardVo.content}</textarea><br>

    <button type ="submit">완료</button>
</form>
</body>
</html>