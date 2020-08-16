$(function(){
	
	var pid = $('#pid').val();
	var mnum = $('#mnum').val();
	$.ajax({
		type:"POST",
		url:"/mate/mateRoom.do",
		data:{
			"pid":pid,
			"mnum":mnum
		},
		success:function(data){
			
			//공연정보
			var mate = data.mate;
			var performance = data.mate.performance;
			var schedule = data.mate.performance.schedule;
			var hallInfo = data.mate.performance.schedule[0].hallinfo;
			var mateCat = data.mateCategory;
			var mateTag = data.mate.mateTags[0];
			

			var mateTagName = mateTag.tagName;
			var mateCatId = mateCat.id;
			var seatRate = mate.seatRate;
			var pStartDate = performance.startDate;
			var pEndDate = performance.endDate;
			var pTitle = performance.title;
			var pImage = performance.imagePath;
			var pRating = performance.rating;
			var pCat = performance.category;
			var pPlace = hallInfo.name;
			var pShowDate = schedule[0].showDate;
			var pShowTime = schedule[0].showTime;
			var pShowNumber = schedule[0].showNumber;

			$('#seatRate').text(seatRate);
			$('#mcat').val(mateCatId);
			$('#pStartDate').text($.datepicker.formatDate('yy-mm-dd',new Date(pStartDate)));
			$('#pEndDate').text($.datepicker.formatDate('yy-mm-dd',new Date(pEndDate)));
			$('#pTitle').text(pTitle);
			$('#pImage').css({"background-image":"url("+pImage+")"});
			$('#pRating').text(pRating);
			$('#pCat').text(pCat);
			$('#pShowDate').text($.datepicker.formatDate('mm월dd일',new Date(pShowDate)));
			var pShowTimeHour = new Date(pShowTime).getHours();
			var pShowTimeMin = (new Date(pShowTime).getMinutes() < 10) ? "0"+new Date(pShowTime).getMinutes() : new Date(pShowTime).getMinutes();
			$('#pShowTime').text(pShowTimeHour+'시'
						+pShowTimeMin+'분');
			$('#pShowNumber').text(pShowNumber);
			$('#mTag').text(mateTagName);
			
			
			//timeline
			var timeline = data.timeline;
			var totalLength = timeline.length;
			$('#totalLength').val(totalLength);
			var type = '';
			chatList(timeline);
			$('#chat').scrollTop($('#chat')[0].scrollHeight);

		}
		
	})
	//실시간 감시
	setInterval(function(){
		
		$.ajax({
			url:"/mate/mateTimeLineCount.do",
			type:"POST",
			data:{
				"pid":pid,
				"mnum":mnum
			},
			success:function(data){
				var count = data.count;
				var timeline = data.time;
				if($('#totalLength').val() < count){
					var content = timeline.content;
					var userId = timeline.user.id;
					var regDate = timeline.regDate;
					var nickname = timeline.user.nickname;
					addChat(userId, content, regDate, nickname);
				}
				$('#totalLength').val(count);
			}
		})
		$('#chat').scrollTop($('#chat')[0].scrollHeight);
	},5000);
	
	$('#chat-submit-btn').click(function(){
		var chatContent = $('#chat-content-box').val();
		if(chatContent == ''){
			return;
		}
		$('#chat-content-box').val('');
		
		$.ajax({
			type:"POST",
			url:"/mate/mateTimeLine.do",
			dataType:"json",
			data:{
				"content":chatContent,
				"mnum":mnum
			},
			success:function(data){
				console.log(data);
			}
		})
	})
	
	
	
})
//timeline function
	function chatList(timeline){
		for(var i in timeline){
			var content = timeline[i].content;
			var userId = timeline[i].user.id;
			var regDate = timeline[i].regDate;
			var nickname = timeline[i].user.nickname;
				
			addChat(userId, content, regDate, nickname);
				
		}
		
	}

	function addChat(userId, content, regDate, nickname){
		
		var regDateMonth = new Date(regDate).getMonth()+1;
		var regDateDay = new Date(regDate).getDate();
		var regDateHour = new Date(regDate).getHours();
		var regDateMinute = (new Date(regDate).getMinutes() < 10) ? "0"+new Date(regDate).getMinutes() : new Date(regDate).getMinutes();

		var chatrows = '';
			if(userId == 'dahun424'){
				
				chatrows += '<li class="me">'
				chatrows += '<div class="entete">'
				chatrows += '<h3>'+regDateMonth+'월'+regDateDay+'일 ,'+regDateHour+':'+regDateMinute
							+' </h3>'
				chatrows += '<h2 class="ml-1">'+userId+'</h2>'
				chatrows += '<span class="status blue"></span>'
				chatrows += '</div>'
				chatrows += '<div class="triangle"></div>'
				chatrows += '<div class="message">'+content+'</div>'
				chatrows += '</li>'
				
			//상대
			} else {
				chatrows += '<li class="you">'
				chatrows += '<div class="entete">'
				chatrows += '<span class="status green"></span>'
				chatrows += '<h2 class="mr-1">'+userId+'</h2>'
				chatrows += '<h3>'+regDateMonth+'월'+regDateDay+'일 ,'+regDateHour+':'+regDateMinute
							+' </h3>'
				chatrows +=	'</div>'
				chatrows += '<div class="triangle"></div>'
				chatrows += '<div class="message">'+content+'</div>'
				chatrows +=	'</li>'
			}
		$('#chat').append(chatrows);
		
	}
