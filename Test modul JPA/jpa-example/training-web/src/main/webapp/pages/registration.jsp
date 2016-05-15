<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="template" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<template:template>
	<jsp:attribute name="customHead">
	</jsp:attribute>
	<jsp:attribute name="header">
        <h1 class="page-header"> Blog <small> Registration</small>
		</h1>
    </jsp:attribute>
	<jsp:body>

</head>
<body onload="document.loginForm.username.focus();">



		

		<c:if test="${not empty error}">
			<div class="error">${error}</div>
		</c:if>
		<c:if test="${not empty msg}">
			 <div class="alert alert-success">
 		 <strong>${msg}</strong> ${msg}
	</div>
			<script>
				setTimeout(function() {
					window.location.href = '<c:url value="/index.jsp" />';
				}, 5000);
			</script>

		</c:if>

		<form name="loginForm" action="<c:url value="/RegistrationServlet" />"
				method="POST">

		 <div class="form-group">
				<label for="username">User</label>
				<input type="text" class="form-control" name="username"
						id="username">
		</div>
				
				 <div class="form-group">
				<label for="password">Password</label>
				<input type="password" class="form-control" name="password"
						id="password">
		</div>
		
		 <div class="form-group">
				<label for="password2">Confirm password</label>
				<input type="password" class="form-control" name="password2"
						id="password2">
		</div>
			<input name="submit" type="submit" class="btn btn-primary"
					value="Registration" />
		</form> 
	
	
	
	
	</jsp:body>
</template:template>