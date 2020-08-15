<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>같이 보자! 공공연한사이</title>
<link rel="stylesheet" href="/resources/css/jquery.fullPage.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.8.2/css/all.min.css" />

<link rel="stylesheet" href="/resources/css/style.css" />
<link rel="stylesheet" href="/resources/css/card.css" />
<link rel="stylesheet" href="/resources/css/chat.css" />

<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.js"></script>
<script type="text/javascript" src="/resources/js/jquery.color.js"></script>
<script type="text/javascript" src="/resources/js/custom.js"></script>

</head>
<body>
	<div class="header">
		<%@ include file="../common/navi.jsp"%>
	</div>
	<div class="body" style="background-color: rgba(0, 0, 0, 0.6);">
		<div class="mt-4 container">
			<div class="row">
				<div class="offset-3 col-9 mt-3">
					<div id="container">
						<aside>
							<header>
								<div class="row h5 text-white font-weight-bold">
									<div class="col-3">
										<span style="display: none; cursor: pointer;"
											id="mate-card-left"><i class="fas fa-chevron-left"></i></span>
									</div>
									<div class="col-9">
										<span class="">참여한 메이트</span>
									</div>
								</div>
							</header>
							<ul>
								<li>
									<!-- user image --> <img
									src="/resources/sample-images/sample-consert1.jpg" alt="">
									<div>
										<!-- user id -->
										<h2>홍길동</h2>
										<h3>
											<span class="text-primary"></span> #오늘도홍대
										</h3>
									</div>
								</li>
								<li>
									<!-- user image --> <img
									src="/resources/sample-images/sample-consert1.jpg" alt="">
									<div>
										<!-- user id -->
										<h2>홍길동</h2>
										<h3>
											<span class="text-primary"></span> #오늘도홍대
										</h3>
									</div>
								</li>
							</ul>
							<div class="col-12">
								<a href="matelist.do" class="btn btn-warning btn-lg">
									<i class="fas fa-arrow-left fa-2x"></i>
								</a>
								<span class="text-white">이전</span>
							</div>
							<div class="col-12 text-center mt-4">
								<button id="mate-out-btn" type="button" class="btn btn-danger btn-sm">메이트방 탈퇴</button>
							</div>
						</aside>
						<div class="main">
							<header>
								<div class="col-12 mt-3">
									<div class="input-group">
										<select class="custom-select" id="inputGroupSelect04"
											aria-label="Example select with button addon">
											<option selected>카테고리 등록</option>
											<option value="1" class="active">혼자 볼래요</option>
											<option value="2">같이 볼래요</option>

										</select>
										<div class="input-group-append">
											<button class="btn btn-outline-secondary" type="button">변경</button>
										</div>
										
									</div>
								</div>
								<div class="col-12 ml-3 mt-3">
									<span class="text-primary">#해시태그,#해시태그,#해시태그,#해시태그,#해시태그,#해시태그,#해시태그,#해시태그,#해시태그,#해시태그,</span>
									<button id="mate-plus-hastag" type="button"
										class="btn btn-primary btn-sm">
										<i class="fas fa-plus"></i>
									</button>
								</div>
								<div class="col-12 text-right">
									<hr class="m-2" />
									<button type="button" class="btn btn-primary">좌석미리보기</button>
									
								
								</div>
								
								<div id="mate-plus-hastag-box" class="col-12"
									style="display: none; position: absolute; top: 120px; width: 600px;">
									<div class="card">
										<div class="input-group m-3">
											<input type="text" class="form-control"
												placeholder="Recipient's username"
												aria-label="Recipient's username"
												aria-describedby="button-addon2">
											<div class="input-group-append mr-5">
												<button class="btn btn-outline-secondary" type="button"
													id="button-addon2">등록</button>
											</div>
										</div>

									</div>
								</div>

							</header>
							<ul id="chat">
								<li class="you">
									<div class="entete">
										<span class="status green"></span>
										<h2>UserId</h2>
										<h3>10:12AM, Today</h3>
									</div>
									<div class="triangle"></div>
									<div class="message">Lorem ipsum dolor sit amet,
										consectetuer adipiscing elit. Aenean commodo ligula eget
										dolor.</div>
								</li>
								<li class="me">
									<div class="entete">
										<h3>10:12AM, Today</h3>
										<h2>UserId</h2>
										<span class="status blue"></span>
									</div>
									<div class="triangle"></div>
									<div class="message">Lorem ipsum dolor sit amet,
										consectetuer adipiscing elit. Aenean commodo ligula eget
										dolor.</div>
								</li>
								<li class="me">
									<div class="entete">
										<h3>10:12AM, Today</h3>
										<h2>Vincent</h2>
										<span class="status blue"></span>
									</div>
									<div class="triangle"></div>
									<div class="message">OK</div>
								</li>
								<li class="you">
									<div class="entete">
										<span class="status green"></span>
										<h2>Vincent</h2>
										<h3>10:12AM, Today</h3>
									</div>
									<div class="triangle"></div>
									<div class="message">Lorem ipsum dolor sit amet,
										consectetuer adipiscing elit. Aenean commodo ligula eget
										dolor.</div>
								</li>
								<li class="me">
									<div class="entete">
										<h3>10:12AM, Today</h3>
										<h2>Vincent</h2>
										<span class="status blue"></span>
									</div>
									<div class="triangle"></div>
									<div class="message">Lorem ipsum dolor sit amet,
										consectetuer adipiscing elit. Aenean commodo ligula eget
										dolor.</div>
								</li>
								<li class="me">
									<div class="entete">
										<h3>10:12AM, Today</h3>
										<h2>Vincent</h2>
										<span class="status blue"></span>
									</div>
									<div class="triangle"></div>
									<div class="message">OK</div>
								</li>
							</ul>
							<footer>
								<textarea placeholder="Type your message"></textarea>
								<div class="col-12 text-right">
								 <button   class="btn btn-outline-primary">등록</button>
								</div>
							</footer>
						</div>
					</div>
				</div>
			</div>

		</div>
	</div>
	<div id="mate-override-card" class='music-card playing'>
		<div id="card-x-btn" class="text-right m-2 text-white"
			style="position: absolute; z-index: 20; cursor: pointer;">
			<i class="far fa-times-circle fa-2x"></i>
		</div>
		<div class='image'
			style="background-image: url('/resources/sample-images/sample-consert1.jpg');">
		</div>

		<div class='wave'></div>
		<div class='wave'></div>
		<div class='wave'></div>

		<div class='info'>
			<h2 class='title font-weight-bold'>콘서트이름</h2>
			<div class='artist text-primary'>시카고</div>
			<div class="row mt-4">
				<div class="col-12">
					<h4 style="display: inline-block;">
						<span>S</span>석 메이트방
					</h4>
				</div>
				<div class="col-12 text-left ml-3">
					<div class="card font-weight-bolder" style="width: 270px;">
						<div class="text-white h4 badge badge-info text-wrap">연극</div>
						<div class="ml-2">
							<table class="table table-boderless">
								<tbody>
									<tr>
										<td><i class="far fa-calendar-alt"></i> 공연기간 <small
											class="ml-2"> <span>2021.05.07</span> <span>~</span>
												<span>2021.05.08</span>
										</small></td>
									</tr>
									<tr>
										<td>
											<i class="fas fa-map-marker-alt"></i>공연장소
											<small>세종문화회관</small>
										</td>
									</tr>
									<tr>
										<td>
											<i class="fas fa-map-marker-alt"></i>관람시간
											<small>175분</small>
										</td>
									</tr>
									<tr>
										<td>
											<i class="fas fa-registered"></i>
											<small>15세</small>
										</td>
									</tr>
								</tbody>
							</table>
						
							
						</div>
						<div class="ml-2">
							
						</div>

					</div>
				</div>
				<div class="col-12 mt-2"></div>
			</div>
		</div>
	</div>
	<script type="text/javascript">
	$(function(){
		$('#card-x-btn').click(function() {
			$('#mate-override-card').hide();
			$('#mate-card-left').show();
		});
		$('#mate-card-left').click(function() {
			$('#mate-override-card').show();
			$('#mate-card-left').hide();
		});
		$('#mate-plus-hastag').click(function(){
			var $icon = $(this).find('i');
			var isPlus = $(this).find('i').hasClass('fas fa-plus');
			if(isPlus){
				$icon.removeClass('fas fa-plus').addClass('fas fa-minus');
			} else {
				$icon.removeClass('fas fa-minus').addClass('fas fa-plus');
			}
			$('#mate-plus-hastag-box').toggle();
		});
		$('#mate-out-btn').click(function(){
			confirm('정말로 해당 방에서 나가겠습니까?')
		})
		
	})
	</script>
</body>
</html>