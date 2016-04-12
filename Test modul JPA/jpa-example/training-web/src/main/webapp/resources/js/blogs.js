$(document).ready(function() {
	var old = $('#oldPageSize').val();
	if (old) {
		$('#pageSize').val(old);
	}
	
	 checkPage();
	
	getBlogs();

});

function getBlogs() {

	jQuery.ajax({
		url : "/blog-web/blog",
		dataType : "json",
		data : {
			'size' : $("#pageSize").val(),
			'page' : ($("#currentPage").val() ? $("#currentPage").val() : 0),
		},
		success : function(data) {
			$('#blogs').html('');
			$(data).each(
					function(index, value) {
						jQuery.ajax({
							async : false,
							url : "/blog-web/resources/template/blog.html",
							success : function(template) {
								template = template.replace('#title',
										value.title);
								template = template
										.replace('#text', value.text);
								template = template.replace('#createDate',
										value.createDate);
								template = template.replace('#creater',
										value.creator.userName);
								var find = '#id';
								var re = new RegExp(find, 'g');
								template = template.replace(re, value.id);
								$('#blogs').append(template);
							}
						});
					});
		},

	});

	

}

function searchBlogs() {

	jQuery.ajax({
		url : "/blog-web/blogSearch",
		dataType : "json",
		data : {
			'size' : $("#pageSize").val(),
			'page' : 0,
			'title': $("#searchTitle").val()
		},
		success : function(data) {
			$('#blogs').html('');
			$(data).each(
					function(index, value) {
						jQuery.ajax({
							async : false,
							url : "/blog-web/resources/template/blog.html",
							success : function(template) {
								template = template.replace('#title',
										value.title);
								template = template
										.replace('#text', value.text);
								template = template.replace('#createDate',
										value.createDate);
								template = template.replace('#creater',
										value.creator.userName);
								var find = '#id';
								var re = new RegExp(find, 'g');
								template = template.replace(re, value.id);
								$('#blogs').append(template);
							}
						});
					});
		},

	});

	

}

function addBlog() {
	console.log('add');
	jQuery.ajax({
		url : "/blog-web/blog",
		type : "POST",
		data : {
			'creator' : 'test user',
			'title' : $("#title").val(),
			'text' : $("#text").val()
		},
		success : function(data) {
			console.log(data);
			getBlogs();
			dialog.dialog("close");
		}
	});
}

function page(p) {
	var cp= $('#currentPage').val();
	$('#currentPage').val(new Number(cp) + p);
	 checkPage();
	getBlogs();

}

function checkPage(){
	var cp= $('#currentPage').val();
	
	if(cp ==0){
		$('#next').hide();
	}else{
		$('#next').show();	
	}
	var size= $('#blogSize').val();
	var pagesize= $("#pageSize").val();
	
	var max = Math.ceil(size/pagesize)-1;
	
	if(cp ==max){
		$('#previous').hide();
	}else{
		$('#previous').show();	
	}
}