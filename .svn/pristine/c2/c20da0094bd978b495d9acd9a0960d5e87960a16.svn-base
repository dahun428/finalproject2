<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>같이 보자! 공공연한사이</title>
<link rel="stylesheet" href="/resources/css/jquery.fullPage.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.css">
<link rel="stylesheet" href="/resources/bootstrap-datepicker/css/bootstrap-datepicker.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.8.2/css/all.min.css" />
<link rel="stylesheet" href="/resources/css/style.css" />
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.js"></script>
<script src="/resources/bootstrap-datepicker/js/bootstrap-datepicker.min.js"></script>
<script src="/resources/bootstrap-datepicker/locales/bootstrap-datepicker.ko.min.js"></script>
<script type="text/javascript" src="/resources/js/jquery.color.js"></script>
<script type="text/javascript" src="/resources/js/custom.js"></script>
</head>
<body>
<div class="header">
<%@ include file="../common/navi.jsp" %>
</div>
<div class="container " style="margin-top: 150px;">
	<div class="row ">
		<div class="col-6 mx-auto" >
			<form  id="signin-form" method="GET" action="signin.do">
				<div class="card border-0">
					<div class="card-header bg-white text-black font-weight-bolder card border-0"><h4>회원 로그인</h4></div>
					<div class="card-body">
						<div class="form-row">
							<div class="form-group col-md-8">
      							<input type="text" class="form-control" id="" name="userId"  placeholder="아이디를 입력하세요">
							</div>
							
						</div>
						
						<div class="form-row">
							<div class="form-group col-md-8">
      							<input type="text" class="form-control" id="" name="password" placeholder="비밀번호를 입력하세요 ">
							</div>
						</div>
						
						<div class="form-row">
							<div class="form-group col-md-4 text-center mt-3">
      							<button type="submit" class="btn btn-primary" style="width: 160px;">로 그 인</button>
							</div>
							<div class="form-group col-md-4 text-center mt-3">
      							<a href="term.do"><button type="button" class="btn btn-secondary" style="width: 160px;">회원가입</button></a>
							</div>
						</div>
						<div class="form-row">
							<div class="form-group col-md-1.5">
								<p><a href="findId.do" style="color: gray"><small>아이디 찾기</small></a></p>
							</div>
							<div class="form-group col-md-3">
								<p><a href="findPwd.do" style="color: gray"><small>비밀번호 찾기</small></a></p>
							</div>
						</div>
						<div class="form-row mb-4" >
							<div>
								<a href="term.do"><button type="button" class="btn btn-warning" style="width: 330px; height:50px; margin-left: 3.5px;">카카오 아이디로 로그인</button></a>
							</div>
						</div>
						<div class="form-row mb-4" >
							<div>
								<a href="term.do"><button type="button" class="btn btn-primary" style="width: 330px; height:50px; margin-left: 3.5px;">페이스북 아이디로 로그인</button></a>
							</div>
						</div>
						<div class="form-row mb-4" >
							<div>
								<a href="term.do"><button type="button" class="btn btn-success" style="width: 330px; height:50px; margin-left: 3.5px;">네이버 아이디로 로그인</button></a>
							</div>
						</div>
					</div>
				</div>
			</form>
		</div>
	</div>
</div>
</body>

<script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script type="text/javascript">
$(function() {
	// 등록버튼 클릭시 실행됨
	$("#signin-form").submit(function() {
		checkAll(this);
	
	});
	
		function checkAll(form) {
		    if (!checkUserId(form.userId.value)) {
		    	console.log(form.userId.value);
		        return false;
		    } else if (!checkPassword(form.password.value)) {
		        return false; 
		    }
		    return true;
		}
		
		function checkExistData(value, dataName) {
		    if (value == "") {
		        alert(dataName + " 입력해주세요!");
		        return false;
		    }
		    return true;
		}
		
		function checkUserId(id) {
		    //Id가 입력되었는지 확인하기
		    if (!checkExistData(id, "아이디를"))
		        return false;
		}
			return true;
})
</script>

</html>