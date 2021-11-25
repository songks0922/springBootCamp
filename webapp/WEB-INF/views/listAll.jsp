<%--
  Created by IntelliJ IDEA.
  User: songk
  Date: 2021-11-18
  Time: 오후 10:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
         pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page session="false"%>

<!DOCTYPE html>
<html>
<head>
    <title>게시판 목록</title>
</head>
<form action = "regist" method = "get">
    <body>
    <table border="1" width="880">
        <tr>
            <td width="77">
                <p align="center">글번호</p>
            </td>

            <td width="327">
                <p align="center">제목</p>
            </td>
            <td width="197">
                <p align="center">작성자</p>
            </td>

            <td width="155">
                <p align="center">작성일</p>
            </td>
            <td width="90">
                <p align="center">조회수</p>
            </td>
        </tr>

        <c:forEach items="${list}" var="boardVo">
            <tr>
                <td>${boardVo.bno}</td>
                <td><a href='/read?bno=${boardVo.bno}'>${boardVo.title}</a></td>
                <td>${boardVo.writer}</td>
                <td><fmt:formatDate pattern="yyyy-MM-dd HH:mm"
                                    value="${boardVo.regdate}" /></td>
                <td><span class="badge bg-red">${boardVo.viewcnt}</span></td>
            </tr>
        </c:forEach>
    </table>
    <button type ="submit">글쓰기</button>
    </body>
</form>

</html>