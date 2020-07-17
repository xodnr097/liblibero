<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>




	<tbody>
			<c:forEach var="prod" items="${list}">
					<td align="left"> title="Click : 상품정보 확인">
							<p class="hidden">${prod.prodNo}</p>
							${prod.prodName}
					</td>
					
			</c:forEach>
	
	
	
	</tbody>


</body>
</html>