<%--
  Created by IntelliJ IDEA.
  User: songk
  Date: 2021-11-18
  Time: 오후 10:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ page session="false"%>

<!DOCTYPE html>
<html>
<head>
    <title>글읽기</title>
</head>
<body>
<form>


    <p><label>글번호</label> <input type="text" name ="bno" value ="${boardVo.bno}" readonly="readonly"></p>
    <p><label>제목</label> <input type="text" name ="title" style="background-color:#B0E0E6;" value ="${boardVo.title}" readonly="readonly"></p>
    <p><label>작성자</label> <input type="text" name="writer" size="15" value = "${boardVo.writer}"readonly="readonly"><p>
        <label>내용</label> <textarea name=content rows ="10" cols="70"  style="background-color:#B0E0E6;"    readonly="readonly">${boardVo.content}</textarea><br>

        <button type="submit" formaction="modify" formmethod="get">수정</button>
        <button type="submit" formaction="remove" formmethod="post">삭제</button>
        <button type="submit" formaction="listAll" formmethod="get">목록</button>
</form>
</body>

</html>