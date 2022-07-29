<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="../default/header.jsp" %>
 
<div class="wrap">
 <div align="center">
 <h2>회원등록</h2>
<form>
<table>
<tr>
<th> <input type="text" name="id" placeholder="아이디"> </th>
</tr>
 <tr>
<th>  <input type="text" name="pwd" placeholder="비밀번호">  </th>
</tr>

<tr>
<th> <input type="text" name="addr" placeholder="주소"> </th>
</tr>
  
  <tr>
<th> <hr> </th>
</tr>
<tr>
<td> <input type="submit" value="회원가입"> </td>
</tr>
 
 </table>
 </form>
 </div>
  

  
</div>

</body>
</html>