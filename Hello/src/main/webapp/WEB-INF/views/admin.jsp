<%@ page language="java" contentType="text/html; charset=UTF-8"  
    pageEncoding="UTF-8"%>  
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>      
<!DOCTYPE html>  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
<title>${title}</title>  
</head>  
<body>  
    <h1>Title : ${title}</h1>  
    <h1>Message : ${message}</h1>  
    <c:if test="${pageContext.request.userPrincipal.name != null}">  
        <h2>  
             Welcome : ${pageContext.request.userPrincipal.name} | <a href="<c:url value="/j_spring_security_logout" />"> Logout</a>  
        </h2>  
    </c:if>    
</body>  
</html>  