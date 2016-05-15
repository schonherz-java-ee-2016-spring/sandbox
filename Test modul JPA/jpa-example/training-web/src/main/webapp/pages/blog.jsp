<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="template" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<template:template>
	<jsp:attribute name="customHead">
     <script src="${pageContext.request.contextPath}/resources/js/blog.js"></script>
    </jsp:attribute>
	<jsp:attribute name="header">
        <h1 class="page-header"> Blog <small> Create</small>
		</h1>
    </jsp:attribute>
	<jsp:body>
	 
 <div id="blogs" class="text_padding"></div>
 
 <sec:authorize access="hasRole('USER')">
 <div class="well">
                    <h4>Leave a Comment:</h4>
                  
                        <div class="form-group">
                            <textarea class="form-control" id="comment" rows="3"></textarea>
                        </div>
                        <button  id="addComment" type="button"  onclick="addComment();" class="btn btn-primary">Submit</button>
                
                </div>
</sec:authorize>

	
	<div id="comments" class="text_padding"></div>
	
<input type="hidden" id="blogId" value="${param.blogId}"></input>
	</jsp:body>
</template:template>


