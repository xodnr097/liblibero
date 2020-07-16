<%@ page contentType="text/html; charset=EUC-KR"%>
<%@ page import="com.libero.service.domain.*" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<meta charset="EUC-KR">
</head>
<body>
<input type="hidden" value=${post.postNo}/>
${post.user.nickName}
${post.postName}
${post.postContent}
</body>
</html>