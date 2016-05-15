<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="template" tagdir="/WEB-INF/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<template:template>
	<jsp:attribute name="customHead">
  

    </jsp:attribute>
	<jsp:attribute name="header">
        <h1 class="page-header"> Blog
        <small>Login</small>
		</h1>
    </jsp:attribute>
	<jsp:body>
	
		<form role="form" method="POST"
			action="${pageContext.request.contextPath}/login">
		<c:if test="${param.error}">
			<font color="red">Hibás felhasználóném vagy jelszó!</font>
		</c:if>

		 <div class="form-group">
				<label for="j_username">Login</label>
				<input type="text" class="form-control" name="j_username"
					id="j_username">
		</div>
		 <div class="form-group">
				<label for="j_password">Password</label>
				<input type="password" class="form-control" name="j_password"
					id="j_password">
		</div>
			
	<div class="form-group">        
			 

        <div class="checkbox">
          <label><input type="checkbox" class=""
						name="remember-me" id="remember-me" /> Remember me</label>
        </div>
   
    </div>
    
		
		<input type="submit" value="Login" class="btn btn-primary">

	</form>
	</jsp:body>
</template:template>


