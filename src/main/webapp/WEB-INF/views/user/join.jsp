<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>blog</title>
</head>
<body>

	<!-- 해더 -->
	
	
	<!-- 회원가입 폼 -->

  <div class="card">
    <div class="card-body register-card-body">
      <form action="${pageContext.request.contextPath}/user/join" method="post">
      	<div class="panel-heading">
      		회원가입
        </div>
      
        <div class="form-group has-feedback">
          <input type="text" class="form-control" placeholder="아이디" name="userId">
        </div>
        <div class="form-group has-feedback">
          <input type="text" class="form-control" placeholder="이름" name="userName">
        </div>
        <div class="form-group has-feedback">
          <input type="text" class="form-control" placeholder="닉네임" name="userSname">
        </div>
        <div class="form-group has-feedback">
          <input type="password" class="form-control" placeholder="패스워드" name="userPw">
        </div>
        <div class="form-group has-feedback">
          <input type="password" class="form-control" placeholder="패스워드확인" name="userPw1">
        </div>
        <div class="form-group has-feedback">
          <input type="email" class="form-control" placeholder="이메일" name="userEmail">
        </div>
        <div class="row">
          <div class="col-8">
            <div class="checkbox icheck">
              <label>
                <input type="checkbox"> I agree to the <a href="#">terms</a>
              </label>
            </div>
          </div>
          <!-- /.col -->
          <div class="col-4">
            <button type="submit" class="btn btn-primary btn-block btn-flat">가입</button>
          </div>
          <!-- /.col -->
        </div>
      </form>
	</div>
	</div>

</body>
</html>