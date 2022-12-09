<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:import url="../layout/header.jsp" />

<script type="text/javascript">

$(document).ready(function() {
		
	    var hobbyCheck = false;
	    var getMail = RegExp(/^[A-Za-z0-9_\.\-]+@[A-Za-z0-9\-]+\.[A-Za-z0-9\-]+/);
	    var getCheck= RegExp(/^[a-zA-Z0-9]{4,12}$/);
	    var getName= RegExp(/^[가-힣]+$/);
	    var fmt = RegExp(/^\d{6}[1234]\d{6}$/); //형식 설정
	    var buf = new Array(13); //주민등록번호 배열
	    var regExp = /^[0-9]*$/; //숫자만
	
	
	
	$("#submit").on("click", function(){
		

		 //아이디 공백 확인
		if($("#userid").val()==""){
			alert("아이디를 입력해주세요.");
			$("#userid").focus();
			return false;
		}
		 
		 //이메일 공백 확인
		if($("#useremail").val()==""){
			alert("이메일을 입력해주세요.");
			$("#useremail").focus();
			return false;
		}
		 
	      //이메일 유효성 검사
	      if(!getMail.test($("#email").val())){
	        alert("이메일형식에 맞게 입력해주세요")
	        $("#email").val("");
	        $("#email").focus();
	        return false;
	      }
	
	      
	})

})

$(document).ready(function() {
	
	$("#goback").click(function() {
		$(location).attr("href", "/member/login")
	})
	
})


</script>


<style type="text/css">


.container {

	height: 800px;

}

#pwfind {
	position: relative;
	top: 300px;
	left: 100px;
}

#findform{
	position: relative;
	right: 100px;
}

#findform  .col-sm-offset-4 {
	position: relative;
	left: 90px;
}

</style>




    <div class="container">
   
   
    
    <div id="pwfind">
    <form action="./pwfindresult" method="post" class="form-horizontal">
    
 <div id="findform"> 
   <div class="form-group">
    	<label for="userid" class="col-sm-4 control-label">아이디</label>
  	  	<div class="col-sm-4">
    		<input type="text" class="form-control" id="userid" name="userid" placeholder="아이디 입력">
   		</div>
   </div>
    
    <div class="form-group">
   		 <label for="userpw" class="col-sm-4 control-label">이메일</label>
   		 <div class="col-sm-4">
   		 	<input type="text" class="form-control" id="email" name="email" placeholder="이메일 입력">
    	 </div> 
    </div>
    
        <div class="form-group">
    
     	 <div class="col-sm-offset-4">
     	 	<button id= "submit" class="btn btn-warning">확인</button>
     	 	<input type="reset" id="cancel" class="btn btn-danger" value="취소"/>
     	 	<button type= "button" id="goback" class="btn btn-info">돌아가기</button>
    	 </div>
    
    </div>
  </div>  
        </form>   
    </div>
    
    
    
    </div><!-- container end  -->

<c:import url="../layout/footer.jsp" />