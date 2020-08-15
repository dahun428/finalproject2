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
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.js"></script>
<script type="text/javascript" src="/resources/js/jquery.color.js"></script>
<script type="text/javascript" src="/resources/js/custom.js"></script>
<style type="text/css">
.category{
	background-color: #C0C0C0;
    transition: all 0.5s;
    transition-timing-function: ease;
}
.category .col:hover{
    transition: all 0.5s;
    transition-timing-function:ease;
    background-color: white;
    cursor: pointer;
}
.category .col {
	font-size: 25px;
	padding-top: 15px;
	padding-bottom: 15px;
}
.pagination { 
	font-family: "Roboto", sans-serif;
}

.pagination li a {
	border-radius:10!important; color:#333 !important; 
}

.pagination li.active a { 
	color:#fff !important; background:#444 !important; border-color:#444 !important; 
}
</style>
</head>
<body>
<div class="header">
	<%@ include file="../common/navi.jsp" %>
</div>
<div class="body" style="margin-top: 100px;">
	<div class="container">
		<div class="row">
			<div class="col-12">
				<div class="row">
					<div class="col-12">
						<div class="row category" id="category" align="center">
							<div class="col" id="notice-list"><a href="/notice/list.do">공지사항</a></div>
							<div class="col" id="QnA-list"><a href="/qna/list.do">QnA</a></div>
							<div class="col">자주하는질문</div>
							<div class="col">나의문의내역</div>
						</div>
					</div>
				</div>
				<div class="row mt-4 mb-3">
					<div class="col-6">
						<div class="dropdown">
							<button type="button" class="btn btn-secondary dropdown-toggle" data-toggle="dropdown">분 류</button>
							<div class="dropdown-menu">
								<a class="dropdown-item" href="#">분류</a>
								<a class="dropdown-item" href="#">서비스소식</a>
								<a class="dropdown-item" href="#">서비스오픈</a>
								<a class="dropdown-item" href="#">서비스종료</a>
								<a class="dropdown-item" href="#">안내</a>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-12">
						<table class="table table-bordered table-hover" style="text-align: center;">
							<colgroup>
								<col width="10%">
								<col width="15%">
								<col width="45%">
								<col width="10%">
								<col width="10%">
								<col width="10%">
							</colgroup>
							<thead class="table-dark">
								<tr style="background-color: black !important; color: white !important;">
									<th>No.</th>
									<th>분 류</th>
									<th style="text-align: left !important;">제 목</th>
									<th>작성자</th>
									<th>조회수</th>
									<th>등록일</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>1</td>
									<td>서비스소식</td>
									<td style="text-align: left !important; "><a style="color: black;" href="/notice/detail.do">
									<span class="badge badge-danger">단독판매</span> [2020 예술의전당  뮤지컬 총 결산] 티켓오픈안내</a></td>
									<td>관리자</td>
									<td>1</td>
									<td>2020.08.08</td>
								</tr>
								<tr>
									<td>2</td>
									<td>서비스오픈</td>
									<td style="text-align: left !important; "><span class="badge badge-info">새소식</span> 메이트 앱 출시</td>
									<td>관리자</td>
									<td>1</td>
									<td>2020.08.08</td>
								</tr>
								<tr>
									<td>3</td>
									<td>서비스종료</td>
									<td style="text-align: left !important; ">메이트 web서비스 일부 종료 안내</td>
									<td>관리자</td>
									<td>1</td>
									<td>2020.08.08</td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
				<!-- 관리자로 접속했을 경우만 표시 -->
				<div class="row">
					<div class="col-12" align="right">
						<div><a href="/notice/add.do" class="btn btn-primary">공지등록</a></div>
					</div>
				</div>
				<!-- 페이지 하단 검색창 -->
				<div class="row">
					<div class="col-12 d-flex justify-content-center">
						<form class="form-inline" action="#">
							<input class="form-control mr-2" type="text" placeholder="검색어를 입력하세요">
							<button class="btn btn-success" type="button">검색</button>
						</form>
					</div>
				</div>
				<!-- 페이지 하단 페이지네이션 -->
				<div class="row">
					<div class="col-12 mt-5 d-flex justify-content-center">
						<ul class="pagination">
							<li class="page-item"><a class="page-link" href="#">◀◀</a></li>
							<li class="page-item"><a class="page-link" href="#">◀</a></li>
							<li class="page-item active"><a class="page-link" href="#">1</a></li>
							<li class="page-item"><a class="page-link" href="#">2</a></li>
							<li class="page-item"><a class="page-link" href="#">3</a></li>
							<li class="page-item"><a class="page-link" href="#">4</a></li>
							<li class="page-item"><a class="page-link" href="#">5</a></li>
							<li class="page-item"><a class="page-link" href="#">▶</a></li>
							<li class="page-item"><a class="page-link" href="#">▶▶</a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="container-fluid" style="background-color: #f5f5f5; width: 100%;">
		<div class="row" style="height: 100px;">
			<div class="col-6">
				<div class="row">
					<div class="col-1"></div>
					<div class="col-1" style="margin-right: 10px;">
						<i class="fas fa-headphones fa-4x" style="margin-top: 15px;"></i>
					</div>
					<div class="col-3" style="margin-top: 25px;">
						<span><strong>고객센터 이용안내</strong></span><br/>
						<span>전화 : 000-000-0000</span>
					</div>
					<div class="col-" style="margin-top: 15px">
						<span><strong>이용시간</strong></span><br/>
						<span>평일 : 09:00 ~ 17:00(점심시간 13:00 ~ 14:00)</span><br/>
						<span>주말 : 09:00 ~ 13:00</span>
					</div>
				</div>
			</div>
			<div class="col-6">
				<div class="row">
					<div class="col-1" style="margin-right: 10px;">
						<i class="far fa-question-circle fa-4x" style="margin-top: 15px;"></i>
					</div>
					<div class="col-10" style="margin-top: 15px;">
						<span style="margin-right: 10px;"><strong>1:1 문의</strong></span><button class="btn btn-success btn-sm">문의하기</button><br/>
						<strong>잠깐!</strong><span> 1:1 문의 전 자주하는 질문을 먼저 확인해주세요</span>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<script type="text/javascript">
$(function() {
	//현재 페이지의 URL주소를 가져온다.
	var URL = window.location.href;
	// URL에 notice가 포함되어있으면 배경색을 흰색으로 바꿔준다.
	if (URL.indexOf("notice") != -1) {
		$("#notice-list").css("background-color","white")
	}
})
</script>
</body>
</html>