$(function() {
  // Sidebar toggle behavior
  $('#sidebarCollapse').on('click', function() {
    $('#sidebar, #content').toggleClass('active');
  });
	$('#sidenav-icon').click(function(){
		$(this).toggleClass('open');
	});
	$(window).scroll(function(){
		
		if($(window).scrollTop() > 10){
			$('#navbar-top').removeClass('transparent');
			$('#navbar-top a').css('color','white');
			$('#sidenav-icon span').css('background-color','white');
			$('#navbar-top a span').css('color','white');
			$('#search-box').css('border-color','white');
		} else {
			$('#navbar-top').addClass('transparent');
			$('#navbar-top a').css('color','black');
			$('#navbar-top a span').css('color','black');
			$('#sidenav-icon span').css('background-color','black');
			$('#search-box').css('border-color','black');

		}
	})
	
});
