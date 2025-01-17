<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<link rel="stylesheet" href="../resources/main.css">
 <script src="../resources/main.js"></script>
<script type="text/javascript">
//택배 <=> 샛별 변하기
/* window.onload=function()
{
	    var ck=0;
  	setInterval(function() //setInterval(함수,초) => 함수 => function(){기능정의};
  	{
  		if(ck%2 == 0)
  			document.getElementById("first_in").innerHTML="서울·경기·인천 &nbsp;<b style='color:purple'>샛별배송  </b>";
  		else
  			document.getElementById("first_in").innerHTML="수도권 이외지역 &nbsp;<b style='color:purple'>택배배송  </b>";
  		ck++;
  	},2000);
} */
$(function()
		  {
			var ck=0;
		  	setInterval(function()
		  	{
		  		if(ck%2 == 0)
		  			$(".inter").html("<span>서울·경기·인천 &nbsp;<b style='color:purple'>샛별배송  </b></span>");
		  		else
		  			$(".inter").html("<span>수도권 이외지역 &nbsp;<b style='color:purple'>택배배송  </b></span>");
		  		ck++;
		  	},2000);
		  });
		  
// var timeout1;
// var timeout2;

// function timeout_baesong1()
// {
//    timeout = setTimeout('baesong1()',2000)   
// }

// function timeout_baesong2()
// {
//    timeout = setTimeout('baesong2()',2000)   
// }

// function baesong1()
// {
//    document.getElementsByClassName("inter1").style.display="block";      
//    document.getElementsByClassName("inter").style.display="none";
//    timeout_baesong2()
//    clearTimeout(timeout1)
// }
// function baesong2()
// {
//    document.getElementsByClassName("inter1").style.display="block";      
//    document.getElementsByClassName("inter").style.display="none";
//    timeout_baesong1()
//    clearTimeout(timeout2)
// }		  
</script>
</head>
 <decorator:head />
<body>
	<div id="first">
	  <div id="inn">
	  <span id="left"> 지금 가입하고 인기상품 100원에 받아가세요! &nbsp;&nbsp; > </span>
	  <span id="right"><a href="javascript:first_hide()">X</a></span>
	 </div>
	</div>
	<div id="second">
	 <div class="inter" id="left"><span> 수도권 이외지역: 택배배송&nbsp;></span></div>
<!-- 	 <div class="inter1" id="left"><span> 수도권 이외지역: 택배배송&nbsp;></span></div> -->
	 <div id="right">
	 	<ul>
	 	<c:if test="${userid!=null}"><!-- 세션이 있을 경우 // 로그인 한 상태 -->
	 	 <li><span>일반 </span>${name}님!!</li>
	 	 <li><a href="../login/logout">로그아웃</a></li>
	 	</c:if>
	 	<c:if test="${userid==null}"><!-- 세션이 없을 경우  // 비로그인 상태.-->
	 	 <li><a href="/kurly/member/member">회원가입&nbsp;</a>|</li>
	 	 <li><a href="../login/login">로그인&nbsp;</a>|</li>
	 	</c:if>
	 	 <li id="outer" onmouseover="view()" onmouseout="hide()">고객센터
	 	 	<ul id="inner">
	 	 	 <li>공지사항</li>
	 	 	 <li>자주하는 질문</li>
	 	 	 <li>1:1 문의</li>
	 	 	 <li>상품제안</li>
	 	 	 <li>에코포장 피드백</li>
	 	 	</ul>
	 	 </li>
	 	</ul>
	</div>
	</div>
	<div id="third">
	 <p><a href="../main/index"><img src="../resources/img/logo.png"></a></p>
	</div>
	<div id="fourth">
	 <ul>
	 	<li>전체카테고리</li>
	 	<li>신상품</li>
	 	<li>베스트</li>
	 	<li>알뜰쇼핑</li>
	 	<li>금주혜택</li>
	 	<li>검색창<img src="../resources/img/1.png"></li>
	 	<li id="mini"><img src="../resources/img/2.png"></li>
	 	<li id="mini"><img src="../resources/img/3.png"></li>
	 </ul>
	</div>
	
	
	<decorator:body />
	
	
	<div id="eight">
		<img src="../resources/img/bottom.png">
	</div>
</body>
</html>