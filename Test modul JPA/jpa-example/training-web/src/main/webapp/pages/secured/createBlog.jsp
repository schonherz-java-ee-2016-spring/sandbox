<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="template" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<template:template>
	<jsp:attribute name="customHead">
   
		
<script src="//cdn.ckeditor.com/4.5.7/standard/ckeditor.js"></script>
    </jsp:attribute>
	<jsp:attribute name="header">
        <h1 class="page-header"> Blog <small>Create new blog</small>
		</h1>
    </jsp:attribute>
	<jsp:body>
	 
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
		
<form action="${pageContext.request.contextPath}/createBlog"
			method="post" enctype="multipart/form-data">
			
	 <div class="form-group">
				<label for="file">Image</label>
				<input id="file" name="file" type="file" class="file" multiple
					data-show-upload="false" data-show-caption="true">
		</div>
		
		 <div class="form-group">
				<label for="title">Title</label>
				<input type="text" class="form-control" name="title" id="title">
		</div>
		
		 <div class="form-group">
				<label for="username">Text</label>
				
				<label for="title">Title</label>
				<textarea  rows="10" cols="80" class="form-control" name="text" id="text"> </textarea>
				 <script>
                // Replace the <textarea id="editor1"> with a CKEditor
                // instance, using default configuration.
                CKEDITOR.replace( 'text' );
            </script>
				
		</div>
						
						
  <input name="submit" type="submit" class="btn btn-primary"
				value="Create" />


</form>
	</jsp:body>
</template:template>


