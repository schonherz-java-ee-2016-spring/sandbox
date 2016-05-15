<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="template" tagdir="/WEB-INF/tags"%>

<template:template>
	<jsp:attribute name="customHead">
     <script
			src="${pageContext.request.contextPath}/resources/js/blogs.js"></script>
     <style>
.blog {
	max-height: 200px;
	overflow: hidden;
	margin-bottom: 20px;
}
</style>
    </jsp:attribute>
	<jsp:attribute name="header">
        <h1 class="page-header"> Blog <small> Sport</small>
        
        <select id="pageSize" class="form-control"
				onchange="checkPage();getBlogs();" style="float: right; width: 70px;">
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="10">10</option>
		</select>
		<input type="hidden" id="oldPageSize" value="${sessionScope.pageSize}">
		<input type="hidden" id="blogSize" value="${sessionScope.blogSize}">
		<input type="hidden" id="currentPage" value="${sessionScope.currentPage}">
		</h1>
		
    </jsp:attribute>
	<jsp:body>
	<div id="blogs" class="text_padding"></div>
	  <ul class="pager">
           <li class="previous">
               <a href="#" id="previous" onclick="page(1); ">&larr; Older</a>
           </li>
           <li class="next" >
               <a href="#" id="next" onclick="page(-1); ">Newer &rarr;</a>
           </li>
       </ul>
	</jsp:body>
</template:template>


