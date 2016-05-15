<%@tag description="Overall Page template" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

<%@attribute name="header" fragment="true"%>
<%@attribute name="footer" fragment="true"%>
<%@attribute name="customHead" fragment="true"%>
<%@attribute name="title" fragment="true"%>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title><jsp:invoke fragment="title" /></title>

<link rel="stylesheet"
	href="http://cdn.ckeditor.com/4.5.7/standard-all/contents.css?t=G14D" />
<!-- Bootstrap Core CSS -->
<link href="<c:url value="/resources/css/bootstrap.min.css"/>"
	rel="stylesheet">

<!-- Custom CSS -->
<link href="<c:url value="/resources/css/blog-home.css"/>"
	rel="stylesheet">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

<script src="<c:url value="/resources/js/jquery.js"/>"></script>
<link rel="stylesheet"
	href="https:////code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css" />

<script src="https://code.jquery.com/ui/1.11.4/jquery-ui.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>

<jsp:invoke fragment="customHead" />

</head>

<body>

	<!-- Navigation -->
	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="container">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#bs-example-navbar-collapse-1">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="<c:url value="/pages/blogs.jsp"/>">Home</a>
			</div>
			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					<c:if test="${ pageContext.request.userPrincipal == null  }">
						<li><a href="<c:url value="/pages/login.jsp"/>">Login</a></li>
						<li><a href="<c:url value="/pages/registration.jsp"/>">SignUp</a></li>
					</c:if>
					<c:if test="${ pageContext.request.userPrincipal != null  }">
						<li><a href="<c:url value="/logout"/>">Logout</a></li>
					</c:if>
					<li><a href="<c:url value="/pages/secured/createBlog.jsp"/>">Create</a></li>

				</ul>
				<c:if test="${ pageContext.request.userPrincipal != null  }">
					<p
						style="color: b; color: darkgrey; float: right; padding-top: 15px;">Hello,
						${pageContext.request.userPrincipal.name}</p>
				</c:if>
			</div>



			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container -->
	</nav>


	<!-- Page Content -->
	<div class="container">

		<div class="row">

			<!-- Blog Entries Column -->
			<div class="col-md-8">

				<jsp:invoke fragment="header" />




				<jsp:doBody />

			</div>

			<!-- Blog Sidebar Widgets Column -->
			<div class="col-md-4">

				<!-- Blog Search Well -->
				<div class="well">
					<h4>Blog Search</h4>
					<div class="input-group">
						<input type="text" id="searchTitle" class="form-control"> <span
							class="input-group-btn">
							<button class="btn btn-default" type="button" id="search" onclick="searchBlogs();">
								<span class="glyphicon glyphicon-search"></span>
							</button>
						</span>
					</div>
					<!-- /.input-group -->
				</div>

				<!-- Blog Categories Well -->
				<div class="well">
					<h4>Blog Categories</h4>
					<div class="row">
						<div class="col-lg-6">
							<ul class="list-unstyled">
								<li><a href="#">Category Name</a></li>
								<li><a href="#">Category Name</a></li>
								<li><a href="#">Category Name</a></li>
								<li><a href="#">Category Name</a></li>
							</ul>
						</div>
						<!-- /.col-lg-6 -->
						<div class="col-lg-6">
							<ul class="list-unstyled">
								<li><a href="#">Category Name</a></li>
								<li><a href="#">Category Name</a></li>
								<li><a href="#">Category Name</a></li>
								<li><a href="#">Category Name</a></li>
							</ul>
						</div>
						<!-- /.col-lg-6 -->
					</div>
					<!-- /.row -->
				</div>

				<!-- Side Widget Well -->
				<div class="well">
					<h4>Side Widget Well</h4>
					<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
						Inventore, perspiciatis adipisci accusamus laudantium odit aliquam
						repellat tempore quos aspernatur vero.</p>
				</div>

			</div>

		</div>
		<!-- /.row -->

		<hr>

		<!-- Footer -->
		<footer>
			<div class="row">
				<div class="col-lg-12">
					<p>Copyright &copy; Your Website 2014</p>
				</div>
				<!-- /.col-lg-12 -->
			</div>
			<!-- /.row -->
		</footer>

	</div>
	<!-- /.container -->


</body>

</html>

