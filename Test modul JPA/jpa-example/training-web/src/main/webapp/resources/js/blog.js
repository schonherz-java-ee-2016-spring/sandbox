$(document).ready(function() {
	
	getBlog();
	
});

function getBlog() {

	jQuery.ajax({
		url : "/blog-web/blog",
		dataType : "json",
		data : {
			'blogId' : $("#blogId").val()
		},
		success : function(data) {

			jQuery.ajax({
				url : "/blog-web/resources/template/blog.html",
				success : function(template) {
					template = template.replace('#title', data.title);
					template = template.replace('#text', data.text);
					template = template.replace('#createDate', data.createDate);
					template = template.replace('#creater', data.creator.userName);
					var find = '#id';
					var re = new RegExp(find, 'g');
					template = template.replace(re, data.id);
					$('#blogs').append(template);
					$('#more').hide();
				}
			});
			

			getComments();

		},

	});

}
function getComments(){
	jQuery.ajax({
		url : "/blog-web/comment",
		dataType : "json",
		data : {
			'blogId' : $("#blogId").val()
		},
		type : "GET",
		success : function(data) {
			$('#comments').html('');
			$(data).each(
					function(index, value) {
						console.log(value);
						jQuery.ajax({
							url : "/blog-web/resources/template/comment.html",
							success : function(template) {
								template = template.replace('#text',
										value.comment);
								template = template.replace('#createDate',
										value.createDate);
								template = template.replace('#id',
										value.creator.userName);
								template = template.replace('#user',
										value.creator.userName);
								$('#comments').append(template);
							}
						});
					});
		},

	});
}
function addComment() {

	jQuery.ajax({
		url : "/blog-web/comment",
		type : "POST",
		data : {
			'comment' : $("#comment").val(),
			'blogId' : $("#blogId").val()
		},
		success : function(data) {
			console.log(data);
			getComments();

		}
	});
}