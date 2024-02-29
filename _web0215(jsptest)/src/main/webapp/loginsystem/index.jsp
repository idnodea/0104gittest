<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>g&nbsp;m</title>
    <link rel="icon" type="image/png" href="http://example.com/myicon.png"> 
    <link href="https://fonts.googleapis.com/css?family=Nanum+Brush+Script|Nanum+Gothic:400,700,800|Nanum+Myeongjo:400,700,800|Nanum+Pen+Script&display=swap" rel="stylesheet">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">

    <script src="https://kit.fontawesome.com/97e21da77b.js" crossorigin="anonymous"></script>
    <link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">
    
    
    <style>
        *{padding: 0; margin: 0; position: relative;
            list-style: none;}
             a:link {  text-decoration: none;} 
            a:visited { text-decoration: none;} 
            a:hover {  text-decoration: underline;}

        body,html{width:100%; overflow-x:hidden; }
        /*팝업창 설정*/
        .pop_c{display: none;}
        .pop_black{display: none; width:100vw; height: 100vh; background-color: rgba(0,0,0,0.8); position: fixed; top: 0; left: 0; z-index: 10;}
        .pop_group{display: none; width: 100vw; height: 100vh; background-color: rgba(0,0,0,0.8); position: fixed; top:0; left: 0; display: flex; align-items: center; justify-content: center; z-index: 11;}
        .pop{display: none; max-width: 100vw; width:calc(100% - 100px); background-color: white; box-shadow: 0 0 10px rgba(0,0,0,0.3);
        border-radius: 3px;}
        .pop span{display: inline-block; text-align: center; width: 80px; height: 80px; background-color: antiquewhite; border-radius: 50%; cursor: pointer;}
        
        /*되돌이창*/
        .top_btn{position: fixed; right:20px; bottom: 20px; background-color: red; color: white; width:45px; height: 45px; text-align: center; line-height: 42px; z-index: 9; cursor: pointer; border-radius:10px;
        }
        
        /*머릿글*/
        .header{position: absolute; top: 0; left: 0; width: 100vw;  height: 100px; z-index: 10; background-color: rgba(0,0,0,0.8); display: flex;} 
        .header>nav{width: 100%; height: 100px; left: 0; }
        .header>nav>ul{height: 100px; max-width: 100vw; width:calc(100% - 100px); margin: 0 auto; display: flex; cursor: pointer;}
        .header>nav>ul>li{padding: 0 20px;}
        .nav_opacity{position: absolute; top: 0;
         color:white; font-weight: bold;}
        .nav_opacity>ul{position: absolute; left: 200px;}
        
        .nav_white{position: fixed; left: 0; top: 100px; background-color: rgba(255, 255, 255, 0.9);
         padding-top: 30px; margin: 0 auto;
        font-size: 30px;}
        
        
        
        /*서브메뉴*/
        .menu>.sub{display:none; font-size: 16px; text-indent: 20px;}
        .menu>.sub{position: absolute; top:100px; left: 0; width: 100%;}
        .menu .sub>.sub_menu{width:200px;}
        .menu .sub>.sub_menu:hover{color: red; font-size: 25px;}
        /*메뉴바*/
        .ham_bar{width:50px; height: 50px; position: fixed; top:2px; right: 10px; z-index: 9; cursor: pointer;
        }
        .ham_bar>span{display: block; background-color: white; width: 30px; height: 10px; border-radius: 5px; position: absolute; left: 0; top: 75px; transition: 0.3s;}
        .ham_bar>span:nth-child(1){transform:translate(0,0px) rotate(0); margin:0;
        top:50px;}
        
        .ham_bar>span:nth-child(2){
        transform:translate(0,30px) rotate(0); margin: 0; top:3px;   
        }
        .ham_bar>span:nth-child(3){top:50px;}
        
        .x_bar{ cursor: pointer;}
        .x_bar>span{display:inline-block;
            background-color:white;}
        .x_bar>span:nth-child(1){transform:translate(0,0) rotate(390deg);}
        .x_bar>span:nth-child(2){opacity: 0;}
        .x_bar>span:nth-child(3){transform:translate(0,0) rotate(-210deg);}
        
        /*black*/
         .pop_black{width:100vw; height: 100vh; background-color: rgba(0, 0, 0, 0.8); position: fixed; top:0; left: 0; z-index: 11; display: none;}
        .home_menu{ width:100vw; margin: 0 auto; display:none; position: fixed; top:100px; left: 0px; background-color: white; z-index: 12}
        .home_menu ul{font-size: 60px; transition: 0.3s 0.1s; box-sizing: border-box; box-shadow: 0 -3 5px rgba(0,0,0,0.5), inset; }
        .home_menu ul li{text-align: center; border-bottom: 1px solid black;}
        .home_menu ul li:nth-last-child(){border-bottom:none; justify-content: center; align-items: center;}
       /* .home_menu span:nth-child(){border-bottom:none; justify-content: center; align-items: center;}*/
        
        /*로그인버튼*/
        .login_chang{position: fixed; top:20px; right:20px; width:200px; height: 100px; color: white; font-size: 15px; text-align: center; margin-right: 15px; display:; cursor: pointer;} 
        .login_chang a{color: #fff;color: white; font-size: 15px; text-align: center;  }
        .login_chang a:hover{color: red;font-weight: bold;}
        .login_chang i:hover{color: red;}
        /*전체메뉴*/
        .menu_button{position: absolute; top: 20px; right: calc(100% - 400px); font-size: 40px; font-weight: bold; color: white; line-height: 60px; cursor: pointer;}


         /*탑메뉴설정 */
        @media (min-width:1px) and (max-width:630px)
        {.nav_opacity>ul{display: none !important;}
            .nav_white>ul>li{display: none;}
           .nav_menu{display: none;}
           .nav_menu_icon{display: none;}
            .login_chang{font-size: 13px;}
            .ham_bar{display: block;}
        }
        @media (min-width:511px) and (max-width:550px)
        { .nav_opacity>ul{display: none !important;}
            .nav_white>ul>li{display: none;}
           .menu_button{display: block;} 
           .nav_menu_icon{display: none;}
           
        }
        @media (min-width:551px) and (max-width:850px){
            .nav_opacity>ul{display: none !important;}
            .nav_white>ul>li{display: none;}
            .menu_button{display: block;}
            .nav_menu_icon{display: none;}
            
        }
        @media (min-width:631px) and (max-width:849px){
            .ham_bar{display: none;}
        }
        
        @media (min-width:851px) and (max-width:975px){
            .nav_opacity>ul{display: none !important;}
            .nav_white>ul{display:;}
            .menu_button{display: block;}
            .nav_menu_icon{display: none;}
            .ham_bar{display: none;}
        }
        @media (min-width:976px) and (max-width:1174px){
             .nav_opacity>ul{display: none !important;}
             .ham_bar{display: none;}
             .nav_menu_icon{display: none;}
            
        }
        
        @media (min-width:1175px) and (max-width:1300px){
            .nav_opacity>ul{font-size: 15px; line-height: 100px; }
            
            .menu_button{display: none;}
            .nav_menu_icon{display: none;}
            /*.login_chang{display: none;}*/
            .ham_bar{display: none;}
        }
        
        @media (min-width:1301px) and (max-width:3000px){
            .nav_opacity>ul{font-size: 20px; line-height: 100px;}
            /*.login_chang{display: none;}*/
            .menu_button{display: none;}
            .nav_menu_icon{display: none;}
            .ham_bar{display: none;}
            
        } 
       /*nav menu */
        
        .btn_group{list-style: none; }
    .btn_group .wrap{
            position: relative;
   
    }
        
    .btn_group .wrap ul{
        position: fixed;
    top: 36%;
    right: 35px;
    align-items: center;
    justify-content: center;
    width: 30px;
    height: 195px;
    text-align: center;
    border-radius: 13px;
    margin: 0 auto;
    font-size: 25px;
    line-height: 38px;
    z-index: 99;
   
    }

        .btn_group ul>li{color: aliceblue; cursor: pointer;}
        .btn_group ul>li>*{color: aliceblue; cursor: pointer;}
        .btn_group i{}
        
        .btn_group .warp .line{display: inline-block; position: fixed; top: 36.2%; right: 16px; width: 3px; height: 10px; background-color: red; z-index: 101;
        }
        
        .lr_btn{list-style: none; }
        .lr_btn ul{position: fixed; top:45%; left: 0; justify-content: space-around; align-items: center;
                width: 100vw; height: 100px; display: flex; margin:0 auto;  font-size: 25px; z-index: 99;}
        .lr_btn{font-size: 30px;}
        .lr_btn li:nth-child(1){ position: ; left: -100px; cursor: pointer; color: rgba(0,0,0,0.3);}
        .lr_btn li:nth-child(2){position:; left: 100px; cursor: pointer; color: rgba(0,0,0,0.3);}
        
        .tb_btn{width:100vw; height: 100vh; position: fixed; top: 0; left: 0; align-items: center; justify-content: center;
        }
        .tb_btn>.warp>nav>ul{align-items: center; justify-content: center; z-index: 100;   height: 100vh; font-size: 20px;}
        .tb_btn>.warp>nav>ul>li:nth-child(1){position: absolute;left:50%; top: 10%; text-align: center; color: rgba(0,0,0,0.3);  cursor: pointer;}
        .tb_btn>.warp>nav>ul>li:nth-child(2){position: absolute;left:50%; bottom: 12%; text-align: center; color: rgba(0,0,0,0.3); cursor: pointer;}
        
        
        
        /*page*/
        .page_group{width:100%;}
       .page_group>.section{width:100%;height:100vh;;overflow: hidden;
        box-sizing: border-box;}
        
        /*section*/
        .section{width:100%; max-width: 100%; height: 100vh;}
        /*section1*/
        .section1{
            background-color: black;
            }
        .section1>.wrap{display: flex; }
        .section1>.wrap>.item1{width:100vw; height:calc(100% - 100px); transition: 0.3s; position: absolute; top: 100px; left: 0;}
        .section1>.wrap>.item1>img{
            width: 100%; height: ; position: absolute; top: 0; left: 0; 
        }
        
        
        /*슬라이드버튼*/
        .slide_txt_group{position: absolute;
        top:10%; left: 50%; width: 200px; height: 100px; display: none;}
        .slide_txt{position: absolute; top: 30vh; left: 0; display: flex; flex-direction: column; justify-content: center; align-items: center; display: none;}
        
        .slide_txt>h1{font-size:16px;}
        .slide_txt>p{font-size:10px;}
        .slide_btn_group{position: absolute; top:40vh; left: 0px; background-color: black; width:30px; height: 50px; font-size: 16px; display: none; flex-direction: column;z-index: 3; border: 1px solid blue; cursor: pointer;}
        .slide_btn_group>*{border: 1px solid blue; text-align: center; color: white;cursor: pointer;}
        
        .slide_arrow_group{display: flex; position: absolute; top: 40vh; left: 30px; width:30px; height: 50px; align-items: center; justify-content: space-between; border: 1px solid red; background-color: black;z-index: 2; flex-direction: column;
        text-align: center; cursor: pointer;}
        .slide_arrow_group>*{border: 1px solid blue;}
        .slide_arrow_group>div{width: 50%; 
        height: 100%;}
        .slide_right{cursor: pointer;  font-size: 16px;cursor: pointer; } 
        .slide_left{cursor: pointer; font-size: 16px;cursor: pointer;}
        
            /*section1*/
        .section1{padding: 0 50px;}
        .section1 .slide_image_group{
            width: 100%;
            height: 100%;
        }
        .section1 .slide_image_group .slide_main_image1{
            position: absolute;
            top: 0;
            left: 0;
            background: url(img/bg_main02.jpg);
            background-size: cover;
            background-repeat: no-repeat;
            width: 100%;
            height: 100%;
        }
        .section1 .slide_image_group .slide_main_image2{
            position: absolute;
            top: 0;
            left: 0;
            display: none;
            background: url(img/bg_main03.jpg);
            background-size: cover;
            background-repeat: no-repeat;
            width: 100%;
            height: 100%;
           /* position: absolute;
            top: 0;
            left: 0;*/
        }
        .section1 .slide_image_group .slide_main_image3{
            position: absolute;
            top: 0;
            left: 0;
            background: url(img/bg_main04.jpg);
            background-size: cover;
            background-repeat: no-repeat;
            width: 100%;
            height: 100%;
        }
        .section1 .slide_image_group .slide_main_image4{
            position: absolute;
            top: 0;
            left: 0;
            background: url(img/bg_main05.jpg);
            background-size: cover;
            background-repeat: no-repeat;
            width: 100%;
            height: 100%;
        }
        .section1 .slide_image_group .slide_main_image5{
            position: absolute;
            top: 0;
            left: 0;
            background: url(img/bg_main01.jpg);
            background-size: cover;
            background-repeat: no-repeat;
            width: 100%;
            height: 100%;
        }
        .slide_main_image .slide_txt{
           
            color: #fff;
            font-size: 32px;
            line-height: 46px;
            position: absolute;
            left: 50%;
            top: 175px;
        }
        .slide_txt p{
            padding-top: 20px;
            font-size: 20px;
        }
        .section1 .slide_con{
            position: absolute;
            top: 0%;
            left: 0;
            width: 100%;
            height: 100px;
            z-index: 2;
        }
        .section1 .slide_con .next{
            left: 82px;
            display: block;
            position: absolute;
            top: 350px;
            z-index: 10;
            width: 25px;
            height: 47px;
            transform: translateY(-50%);
            background: url(image/prev_w.png) no-repeat;
            color: transparent;
            cursor: pointer;
        }
        .section1 .slide_con .prev{
            right: 82px;
            display: block;
            position: absolute;
            top: 350px;
            z-index: 10;
            width: 25px;
            height: 47px;
            transform: translateY(-50%);
            background: url(image/next_w.png) no-repeat;
            color: transparent;
            cursor: pointer;
        }
        .section1 .con_box{
            position: absolute;
            bottom: 50px;
            left: calc(100% - 57.2%);
            display: flex;
            width: 300px;
        }
        .section1 .con_box .bar_auto{
            display: flex;
            width: 100%;
        }
        .section1 .con_box .bar_auto .con_bar{
            display: block;
            width: 50px;
            height: 3px;
            vertical-align: middle;
            font-size: 0;
            text-indent: -9999px;
            background-color: #fff;
            opacity: .5;
            transition: all 0.3s;
            margin-left:5px;
            cursor: pointer;
        }
        .section1 .con_box .bar_auto .con_on{
            background-color: #fff;
            opacity: 1;
        }
        .con_bar:nth-child(1){
            margin-left: 0 !important;
        }
        .section1 .con_box .con_auto{
            display: flex;
            left: 30px;
            z-index: 2;
            top: -10px;
            font-size: 15px;
            
        }
        .section1 .con_box .con_auto .play{
            cursor: pointer;
            color: #dddddd;
        }
        .section1 .con_box .con_auto .pause{padding-left: 9px; transform: rotate(90deg);
        top: -4px; cursor: pointer;color: #dddddd;}
        


        
        /**/
        .section3{width: 100%; height: 100%;}
        .section3>img{width: 100%; height: 100%;}
        /**/
        .section4{width: 100%; height: 100%;}
        .section4>.item1{position: absolute; top: 0; left: 0;}
        .section4>img{width: 100%; height: 100%;}
        /**/
        .section5{}
        .section5 video{width:100%; height: 100%;}
        
    </style>
</head>
<body>
    


   <!--팝업검은창-->
<!--<div class="pop_c">   <div class="pop_black"></div>
        <div class="pop-group">
        <div class="pop pop1">
            <div class="top"><h1>popup one</h1><span>X</span></div>
            <div class="content middle"><p>행복하세요</p></div>
            <div class="bottom"><span>close</span></div>
        </div>
    </div>
</div>  -->
   <!--되돌이창-->
<div class="top_btn">▲</div>     
    <!--머릿글-->

<header class="header">
    <div class="logo"><img src="img/h1_charlotte.gif"></div>
    <!--<nav class="navbar navbar-expand-lg bg-body-tertiary">
        <div class="container-fluid">
          <a class="navbar-brand" href="#">Navbar</a>
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
              <li class="nav-item">
                <a class="nav-link active" aria-current="page" href="#">Home</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#">Link</a>
              </li>
              <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                  Dropdown
                </a>
                <ul class="dropdown-menu">
                  <li><a class="dropdown-item" href="#">Action</a></li>
                  <li><a class="dropdown-item" href="#">Another action</a></li>
                  <li><hr class="dropdown-divider"></li>
                  <li><a class="dropdown-item" href="#">Something else here</a></li>
                </ul>
              </li>
              <li class="nav-item">
                <a class="nav-link disabled" aria-disabled="true">Disabled</a>
              </li>
            </ul>
            <form class="d-flex" role="search">
              <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
              <button class="btn btn-outline-success" type="submit">Search</button>
            </form>
          </div>
        </div>
      </nav> -->


    <nav class="nav_opacity menu_btn">
        <ul>
            <li class="menu menu1">샤롯데시어터
             <ul class="sub">
                <li class="sub_menu">소개</li>
                <li class="sub_menu">시설 안내</li>
                <li class="sub_menu">특별 서비스</li>
                <li class="sub_menu">대관 안내</li>
                <li class="sub_menu">좌석 배치도</li>
                <li class="sub_menu">채용 공고</li>
                <li class="sub_menu">제휴 할인</li>
                         
             </ul>
            </li>
                   
            <li class="menu menu2">공연
               <ul class="sub">
                <li class="sub_menu">현재 공연</li>
                <li class="sub_menu">예정 공연</li>
                <li class="sub_menu">지난 공연</li>
                <li class="sub_menu">일정 안내</li>
                </ul>
            </li>
             
            <li class="menu menu3">행사
               <ul class="sub">
                 <li class="sub_menu">현재 행사</li>
                 <li class="sub_menu">예정 행사</li>
                 <li class="sub_menu">지난 행사</li>
                 <li class="sub_menu">행사 일정</li>
               </ul>
              </li>
              
            <li class="menu menu4">상품안내
               <ul class="sub">
                 <li class="sub_menu">제휴 상품</li>
                 <li class="sub_menu">제휴 패키지</li>
                 
               </ul>
            </li>
              
            <li class="menu menu5">티켓
               <ul class="sub">
                 <li class="sub_menu">티켓 예매</li>
                 <li class="sub_menu">예매 확인</li>
                 <li class="sub_menu">제휴 티켓</li>
                 
               </ul>
            </li>
            
            <li class="menu menu6">멀티미디어
               <ul class="sub">
                 <li class="sub_menu">갤러리</li>
                 <li class="sub_menu">영상</li>
                 
               </ul>
            </li>
            
            <li class="menu menu7">이벤트
               <ul class="sub">
                 <li class="sub_menu">진행 이벤트</li>
                 <li class="sub_menu">당첨자 발표</li>
                 <li class="sub_menu">지난 이벤트</li>
               </ul>
            </li>
            
            <li class="menu menu8">고객센터
               <ul class="sub">
                  <li class="sub_menu">공지사항</li>
                  <li class="sub_menu">고객문의 </li>
                  <li class="sub_menu">관람 안내</li>
                  <li class="sub_menu">오시는 길</li> 
               </ul>
            </li>
        </ul>
        
    </nav>-->
    <nav class="nav_white menu_btn">
        <ul>
            <li class="menu menu1"><i class="fas fa-feather-alt"></i></li>
            <li class="menu menu2"><i class="fas fa-person-booth"></i></li>
            <li class="menu menu3"><i class="fas fa-calendar-alt"></i></li>
            <li class="menu menu4"><i class="far fa-credit-card"></i></li>            
            <li class="menu menu5"><i class="fas fa-photo-video"></i></li>
            
        </ul>
    </nav>  
    
    <nav class="nav_opacity_icon">
        
    </nav>
 
    <div class="menu_bar">
       <div class="ham_bar">
        <span></span>
        <span></span>
        <span></span>
       </div>
    </div>
    <div class="home_menu">
        <ul>
            <span><li>샤롯데시어터</li></span>
            <span><li>공연</li></span>
            <span><li>행사</li></span>
            <span><li>티켓</li></span>
            <span><li>멀티미디어</li></span>
            <span><li>이벤트</li></span>
            <span><li>고객센터</li></span>
            
        </ul>    
    </div>

  <div class="menu_button">
       <span class="nav_menu">전체메뉴</span>
       <span class="nav_menu_icon"></span>

    </div> 
    
    <div class="login_chang">
       <ul>
        <li><a href="login-CloginForm.jsp">Login</a></li>
        <li><a href="login-Cmember_join_form.jsp">Join</a></li>
          <i class="fas fa-search"></i>   
       </ul> 
    </div> 
    
    
    
    
</header>

<div class="page_group">
    <section class="section section1 main_slide">
        <div class="slide_image_group">
            <div class="slide_main_image slide_main_image1"></div>
            <div class="slide_main_image slide_main_image2"></div>
            <div class="slide_main_image slide_main_image3"></div>
            <div class="slide_main_image slide_main_image4"></div>
            <div class="slide_main_image slide_main_image5">
                <!--<div class="slide_txt">
                샤롯데시어터<br>
                편안한 여가문화
                <p>대한민국 최고의 뮤지컬 전용 공연장 </p>
                </div>-->
            </div>
        </div>
        <div class="slide_txt_group">
            <div class="slide_main_txt"></div>
        </div>
        <div class="slide_con">
            <div class="next"></div>
            <div class="prev"></div>
        </div>
        <div class="con_box">
            <div class="bar_auto">
                <div class="con_bar"></div>
                <div class="con_bar"></div>
                <div class="con_bar"></div>
                <div class="con_bar"></div>
                <div class="con_bar"></div>
            </div>
            <div class="con_auto">
                <div class="play">▶</div>
                <div class="pause">〓</div>
            </div>
        </div>
        
    </section>
  <section class="section section2">
    <div class="wrap">
        <div class="item item1">
            <img src="img/section2-1.jpg">
        </div>
        <div class="item item2"></div>
        <div class="item item3"></div>
    </div>
  </section>
  <section class="section section3">
    <div class="wrap">
        <div class="item item1"><img src="img/section3-1.jpg"></div>
        <div class="item item2"></div>
        <div class="item item3"></div>
    </div>
  </section>
  <section class="section section4">
    <div class="wrap">
        <div class="item item1"><img src="img\tiket.png"></div>
        <div class="item item2"></div>
        <div class="item item3"></div>
    </div>
  </section>
  <section class="section section5">
    <div class="wrap">
        <div class="item item1"><video src="video/tod.mp4" autoplay muted loop></video></div>
        <div class="item item2"><h1>Charlottetheater</h1></div>
        <div class="item item3"><span>about</span></div>
    </div>
  </section>
</div>             

   <div class="btn_group btn_group1">
       <div class="warp">
         
            <ul>
                <li class="indigator">M</li>
                <li class="indigator"><i class="fas fa-person-booth"></i></li>
                <li class="indigator"><i class="fas fa-calendar-alt">
                </i></li>
                <li class="indigator"><i class="far fa-credit-card"></i></li>
                <li class="indigator"><i class="fas fa-photo-video"></i></li>
            </ul>
       
           <span class="line"></span>
       </div>  
   </div>
 <div class="step_btn">  
   <div class="lr_btn btn_group2" style="display:none">
       <div class="warp"> 
        <nav>
          <ul>
             <li class="left">◀</li>
             <li class="right">▶</li>    
            </ul>    
        </nav>
        </div>
    </div>
    <div class="tb_btn btn_group3" style="display:none">
       <div class="warp"> 
        <nav>
          <ul>
             <li class="prev top_b">▲</li>
             <li class="next bottom_b">▼</li>    
            </ul>    
        </nav>
        </div>
    </div>
  </div>                              
                
</body>
</html>
<script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
<script src="jquery-mousewheel-main/jquery.mousewheel.js"></script>
<script>
// 변수 지정
let nav_btn, section, nex_btn, pre_btn, item, win_h, win_w, scr_t;
nav_btn = $('.indigator');
section = $('.section');
nex_btn = $('.next');
pre_btn = $('.prev');
item = $('.item');
item1 = $('.item1');
item2 = $('.item2');
item3 = $('.item3');
item4 = $('.item4');

// 문서 시작 설정
$(document).ready(function () {
    scrTop = $(window).scrollTop();
    if (scrTop == 0) {
        $('.nav_white').stop().animate({ opacity: 0 }, 200).animate({ top: -100 }, 0);
    } else {
        $('.nav_white').stop().animate({ opacity: 1, top: 0 }, 300);
    }

    $('.menu > .sub').hide();
    slideaa();
    $('.top_btn').hide();
});

/* 첫번째 세션 */
$(document).ready(function () {
    clearInterval(timi_a);
    timi_a = setInterval(slide_fade, 4000);
});

// 슬라이드
let timi = 0;
let timi_a;
$('.con_auto > .play').click(function () {
    clearInterval(timi_a);
    timi_a = setInterval(slide_fade, 4000);
    console.log('play');
    $('.con_auto > .pause').stop().css({ 'color': '#dddddd' });
    $('.con_auto > .play').stop().css({ 'color': '#fff' });
});

$('.con_auto > .pause').click(function () {
    clearInterval(timi_a);
    console.log('pause');
    $('.con_auto > .play').stop().css({ 'color': '#dddddd' });
    $('.con_auto > .pause').stop().css({ 'color': '#fff' });
});

function slide_fade() {
    timi++;
    timi = timi % 4;
    $('.slide_image_group > .slide_main_image').eq(timi).stop().fadeIn();
    $('.slide_image_group > .slide_main_image ').not($('.slide_image_group > .slide_main_image').eq(timi)).stop().fadeOut();
    console.log(timi + 'time');
    $('.con_bar').eq(timi).stop().css({ 'opacity': '1' });
    $('.con_bar').not($('.con_bar').eq(timi)).stop().css({ 'opacity': '0.5' });
}

let num = 0, num2 = 0, num3 = 0;

$('.bar_auto > .con_bar').click(function () {
    num = $(this).index();
    console.log('con_bar');
    console.log('num' + num);
    bar_a();
});

$('.slide_con > .next').click(function () {
    num--;
    num = num % 5;
    bar_a();
});

$('.slide_con > .prev').click(function () {
    num++;
    num = num % 5;
    bar_a();
});

// 변수 지정

/* 팝업창 띄울 때, 변형
$('.btn_group > a').eq(0).click(function(){
    alert('1클릭');
    $('body').css({'overflow':'hidden'});
    $('.pop-black').fadeIn(200);
    $('.pop-group').fadeIn(200);
    $('.pop1').fadeIn(200);
    
}) */
/* 팝업창 닫기 */
$('.pop > span').click(function () {
    alert('닫힘');
    $('body').css({ 'overflow': 'auto' });
    $('.pop_c, .pop-black, .pop_group, .pop').css('display', 'block');
});

// 마우스휠 위아래 조정
$('.page_group').on('mousewheel DomMouseScroll', function (e, delta) {
    e.preventDefault();
    ani_img = $('html, .item').is(':animated');
    console.log(ani_img);
    if (delta < 0 && num < 5 && !ani_img) {
        num = num + 1;
        moveaa();
    } else if (delta > 0 && num > 0 && !ani_img) {
        num--;
        moveaa();
    }
});

// 각 페이지로 스크롤 이동
function moveaa() {
    win_h = $(window).height();
    console.log('함수a()의 num값:' + num);
    $('html').stop().animate({ scrollTop: win_h * num }, 500, function () {
        section.eq(num).find(item1).animate({ opacity: 1 }, 500);
        section.eq(num).find(item2).delay(200).animate({ opacity: 1 }, 500);
        section.eq(num).find(item3).delay(400).animate({ opacity: 1 }, 500);
        section.not(section.eq(num)).find(item).css('opacity', 0);
    });
    $('.indigator').eq(num).css({ 'color': 'white' });
    $('.indigator').not($('.indigator').eq(num)).css({ 'color': 'red' });
    if (num < 1) {
        pre_btn.fadeOut(500);
    } else if (num > 3) {
        nex_btn.fadeOut(500);
    } else {
        pre_btn.fadeIn(500);
        nex_btn.fadeIn(500);
    }
}

// 인디케이터(네비버튼)를 클릭했을때
$('.indigator').click(function () {
    num = $(this).index();
    moveaa();
});

$(document).ready(function () {
    win_h = $(window).height();
    scr_t = $(window).scrollTop();
    num = scr_t / win_h; // 소수점
    num = Math.round(num); // 정수로 변경
    moveaa();

    clearInterval(timi_a);
    timi_a=setInterval(slide_fade,4000);
    
});

nex_btn.click(function () {
    num = num + 1;
    moveaa();
});

pre_btn.click(function () {
    num = num - 1;
    moveaa();
});

$(window).keydown(function (e) {
    if (e.which == 38 && num > 0) {
        num = num - 1;
        moveaa();
    } else if (e.which == 40 && num < 4) {
        num = num + 1;
        moveaa();
    }
});

/* 메뉴클릭했을 때, 스크롤 이동 */
menu_btn = $('.menu_btn');
$('.menu_btn > li').click(function () {
    num = $(this).index();
    console.log('menu_btn의 num:' + num);
    $top = $('.section').eq(num).offset().top;
    $('html').stop().animate({ scrollTop: $top }, 500);
});

// 탑버튼
$('.top_btn').click(function () {
    $('html').stop().animate({ scrollTop: 0 });
});

// 메뉴창
$(window).scroll(function () {
    win_scrTop = $(window).scrollTop();
    if (win_scrTop == 0) {
        $('.header').stop().animate({ top: 0 });
        $('.top_btn').fadeOut(200);
        $('.nav_white').stop().animate({ opacity: 0.3 }, 200).animate({ top: -100 }, 0);
    } else {
        $('.header').stop().animate({ top: -70 });
        $('.top_btn').fadeIn(200);
        $('.nav_white').stop().animate({ opacity: 1 }, 200).animate({ top: 0 }, 0);
    }
});

// 메뉴바 클릭
$('.ham_bar').click(function () {
    $('.ham_bar').toggleClass('x_bar');
    $('.home_menu').stop().slideToggle();
    $('.pop_black').stop().fadeIn(200);
    $('body').css('overflow', 'hidden');
}); 

$('.nav_menu').click(function () {
    $('.ham_bar').toggleClass('x_bar');
    $('.home_menu').stop().slideToggle();
    $('.pop_black').stop().fadeIn(200);
    $('body').css('overflow', 'hidden');
});

$('.pop_black').click(function () {
    $('.home_menu').stop().fadeOut();
    $('.x_bar').toggleClass('ham_bar');
    $('.pop_black').stop().fadeOut();
    $('body').css('overflow', 'auto');
});

$('menu_btn > .menu').click(function () {
    $(this).css('background-color', 'blue');
    $('menu_btn > .menu').not(this).css('background-color', 'black');
    $(this).find('.sub').slideToggle();
    $('nav_opacity .sub').not($(this).next()).slideUp();
});
//
$('.nav_opacity .menu').mouseenter(function(){
    
    $('.nav_opacity .menu').stop().css({'display':'block'});
    $('.nav_opacity .sub').stop().css({'display':'block'});
                 
});
$('.nav_opacity .menu').mouseenter(function(){
    
    $('.nav_opacity .menu').stop().css({'display':'none'});
    $('.nav_opacity .menu .sub').stop().css({'display':'none'});
                 
});

    //슬라이드
  timi=0;
  timi_a;
$('.con_auto>.play').click(function(){
    clearInterval(timi_a);
    timi_a=setInterval(slide_fade,4000);
    console.log('play');
    $('.con_auto>.pause').stop().css({'color':'#dddddd'});
    $('.con_auto>.play').stop().css({'color':'#fff'});
});
   
$('.con_auto>.pause').click(function(){
   clearInterval(timi_a);
    console.log('pause');
    $('.con_auto>.play').stop().css({'color':'#dddddd'});
    $('.con_auto>.pause').stop().css({'color':'#fff'});
});    
    
function slide_fade(){
        timi++;
        timi=timi%4;
        $('.slide_image_group>.slide_main_image').eq(timi).stop().fadeIn();
        $('.slide_image_group>.slide_main_image ').not($('.slide_image_group>.slide_main_image').eq(timi)).stop().fadeOut();
        console.log(timi+'time');
        $('.con_bar').eq(timi).stop().css({'opacity':'1'});
        $('.con_bar').not($('.con_bar').eq(timi)).stop().css({'opacity':'0.5'});
    };
    function bar_a(){
        $('.slide_image_group>.slide_main_image').eq(num).fadeIn(); 
        $('.slide_image_group>.slide_main_image').not($('.slide_image_group>.slide_main_image').eq(num)).fadeOut();
        
        $('.bar_auto>.con_bar').eq(num).stop().css({'opacity':1});

        $('.bar_auto>.con_bar').not($('.con_bar').eq(num)).stop().css({'opacity':'0.5'});
    };




let sb_num = 0;
// 이미지 슬라이더, 버튼
$('slide_btn').click(function () {
    sb_num = $(this).index();
    console.log(sb_num);
    slideaa();
});

$('.slide_right').click(function () {
    sb_num++; // num=num+1
    sb_num = sb_num % 2;
    slideaa();
});

$('.slide_left').click(function () {
    sb_num--; // num=num-1;
    sb_num = sb_num % 2;
    slideaa();
});

// 슬라이드 함수
function slideaa() {
    $('.slide_img').eq(sb_num).fadeIn();
    $('.slide_img').not($('.slide_img').eq(sb_num)).hide();
    $('.slide_txt').eq(sb_num).fadeIn();
    activeT = $('.slide_txt').eq(sb_num);
    $('.slide_txt').not($('.slide_txt').eq(sb_num)).hide();
    $('slide_btn').eq(sb_num).css({ background: 'black', color: 'white' });
    $('slide_btn').not($('slide_btn').eq(sb_num)).css({ background: 'yellow', color: 'black' });
}

</script>


<script>

//     //변수지정
//      var nav_btn, section, nex_btn, pre_btn, item, win_h, win_w, scr_t, num, sb_num;  
// nav_btn =$('.indigator');
// section =$('.section');
// nex_btn =$('.next');
// pre_btn =$('.prev');
// item    =$('.item');    
// item1    =$('.item1');    
// item2    =$('.item2');    
// item3    =$('.item3');    
// item4    =$('.item4');    
       
//     //문서시작 설정

//     $(document).ready(function(){
//         scrTop=$(window).scrollTop()
//         if(scrTop==0){
//             $('.nav_white').stop().animate({opacity:0},200).animate({top:-100},0)
//         } else{
//             $('.nav_white').stop().animate({opacity:1,top:0},300)
//         }
        
//         $('.menu>.sub').hide();
//         slideaa();
//         $('.top_btn').hide();
//     })
//     /*첫번째 세션*/
//     $(document).ready(function(){
//    clearInterval(timi_a);
//     timi_a=setInterval(slide_fade,4000);
    
// });    
//     //슬라이드
// var timi=0;
//     var timi_a
// $('.con_auto>.play').click(function(){
//     clearInterval(timi_a);
//     timi_a=setInterval(slide_fade,4000);
//     console.log('play');
//     $('.con_auto>.pause').stop().css({'color':'#dddddd'});
//     $('.con_auto>.play').stop().css({'color':'#fff'});
// });
   
// $('.con_auto>.pause').click(function(){
//    clearInterval(timi_a);
//     console.log('pause');
//     $('.con_auto>.play').stop().css({'color':'#dddddd'});
//     $('.con_auto>.pause').stop().css({'color':'#fff'});
// });    
    
// function slide_fade(){
//         timi++;
//         timi=timi%4;
//         $('.slide_image_group>.slide_main_image').eq(timi).stop().fadeIn();
//         $('.slide_image_group>.slide_main_image ').not($('.slide_image_group>.slide_main_image').eq(timi)).stop().fadeOut();
//         console.log(timi+'time');
//         $('.con_bar').eq(timi).stop().css({'opacity':'1'});
//         $('.con_bar').not($('.con_bar').eq(timi)).stop().css({'opacity':'0.5'});
//     };
// var num=0,num2=0,num3=0;    

    
//     $('.bar_auto>.con_bar').click(function(){
//         num=$(this).index();
//         console.log('con_bar');
//         console.log('num'+num);
//         bar_a();
//     });
    
//     $('.slide_con>.next').click(function(){
//         num--;
//         num=num%5;
//         bar_a();
//     });
//     $('.slide_con>.prev').click(function(){
//         num++;
//         num=num%5;
//         bar_a();
//     });


//   //변수지정

//    /*팝업창 띄울 때, 변형
//    $('.btn_group>a').eq(0).click(function(){
//         alert('1클릭');
//         $('body').css({'overflow':'hidden'});
//         $('.pop-black').fadeIn(200);
//         $('.pop-group').fadeIn(200);
//         $('.pop1').fadeIn(200);
        
//     })*/
//     /*팝업창 닫기*/
//     $('.pop>span').click(function(){
//         alert('닫힘');
//         $('body').css({'overflow':'auto'});
// $('.pop_c,.pop-black,.pop_group,.pop').css('display','block')
//     });
    
//     //마우스휠위아래조정
// $('.page_group').on('mousewheel DomMouseScroll', function(e,delta){
//     e.preventDefault()
//     ani_img=$('html,.item').is(':animated')
//     console.log(ani_img)
//     if(delta<0 && num<5 && !ani_img){
//         num=num+1
//         moveaa()
//     } else if(delta>0 && num>0 && !ani_img){
//         num--
//         moveaa()
//     }
// })
    
// // 각 페이지로 스크롤 이동       
// function moveaa(){
//     win_h   =   $(window).height()
//     console.log('함수a()의 num값:'+num)
//     $('html').stop().animate({scrollTop:win_h*num},500,function(){
//         section.eq(num).find(item1).animate({opacity:1},500)
//         section.eq(num).find(item2).delay(200).animate({opacity:1},500)
//         section.eq(num).find(item3).delay(400).animate({opacity:1},500)
//         section.not(section.eq(num)).find(item).css('opacity',0)
//     });
//    $('.indigator').eq(num).css({'color':'white'});
//     $('.indigator').not($('.indigator').eq(num)).css({'color':'red'});
//     if(num<1){
//         pre_btn.fadeOut(500)
//     }else if(num>3){
//         nex_btn.fadeOut(500)
//     }else{
//         pre_btn.fadeIn(500) 
//         nex_btn.fadeIn(500)
//     }
// }
// //인디케이터(네비버튼)를 클릭했을때
// $('.indigator').click(function(){
//     num     =$(this).index()
//     moveaa()
// })
// $(document).ready(function(){
//     win_h   =$(window).height();
//     scr_t   =$(window).scrollTop();
//     num=scr_t/win_h;//소수점
//     num=Math.round(num);//정수로변경
//     moveaa();
// })
// nex_btn.click(function(){
//     num=num+1
//     moveaa()
// })
// pre_btn.click(function(){
//     num=num-1
//     moveaa() 
// })
// $(window).keydown(function(e){
//     if(e.which==38 && num>0){
//         num=num-1
//         moveaa()
//     } else if(e.which==40 && num<4){
//         num=num+1
//         moveaa()
//     }
// });    
//     /*메뉴클릭했을 때, 스크롤 이동*/
//     menu_btn=$('.menu_btn')
//     $('.menu_btn>li').click(function(){
//       num=$(this).index()
//       console.log('menu_btn의 num:'+num)
//         $top=$('.section').eq(num).offset().top;
//         $('html').stop().animate({scrollTop:$top},500)
//     })
    

    
//     //탑버튼
//     $('.top_btn').click(function(){
//      $('html').stop().animate({scrollTop:0})
     
//  });    
 


//     //메뉴창
//     $(window).scroll(function(){
//         win_scrTop =$(window).scrollTop()
//         if(win_scrTop==0){
//             $('.header').stop().animate({top:0});
//             $('.top_btn').fadeOut(200);   $('.nav_white').stop().animate({opacity:0.3},200).animate({top:-100},0);
//         } else{
//            $('.header').stop().animate({top:-70});
//            $('.top_btn').fadeIn(200);
//           $('.nav_white').stop().animate({opacity:1},200).animate({top:0},0);
//         }
//     })
     
//     //메뉴바 클릭
//     $('.ham_bar').click(function(){
//         //$('.ham_bar').addClass('x_bar')
//         //$('.x_bar').removeClass('ham_bar')
//        $('.ham_bar').toggleClass('x_bar')
//        $('.home_menu').stop().slideToggle(); $('.pop_black').stop().fadeIn(200);
//        $('body').css('overflow','hidden')
        
//     });

//     $('.nav_menu').click(function(){
//         //$('.ham_bar').addClass('x_bar')
//         //$('.x_bar').removeClass('ham_bar')
//        $('.ham_bar').toggleClass('x_bar')
//        $('.home_menu').stop().slideToggle(); $('.pop_black').stop().fadeIn(200);
//        $('body').css('overflow','hidden')
        
//     });


//     $('.pop_black').click(function(){
//       $('.home_menu').stop().fadeOut(); 
//       $('.x_bar').toggleClass('ham_bar');
//       $('.pop_black').stop().fadeOut();
//       $('body').css('overflow','auto')
//     });
    
//     //$('.x_bar').click(function(){
//         //$('.x_bar').addClass('.ham_bar')
//         //$('.ham_bar').removeClass('.x_bar')
//     //});
//      $('menu_btn>.menu').click(function(){
//         $(this).css('background-color','blue')
//         $('menu_btn>.menu').not(this).css('background-color','black');  
         
//         $(this).find('.sub').slideToggle();
//         $('nav_opacity .sub').not($(this).next()).slideUp();
//     });
    
//     var sb_num = 0; 
//     //이미지슬라이더,버튼
//     $('slide_btn').click(function(){
//         sb_num=$(this).index();
//         console.log(sb_num)
//         slideaa();
//     })
//     $('.slide_right').click(function(){
//     sb_num++; //num=num+1
//     sb_num=sb_num%2;
//     slideaa();
//     })    
//     $('.slide_left').click(function(){
//     sb_num--;//num=num-1;
//     sb_num=sb_num%2;
//     slideaa(); 
//     })
    
      
//     //슬라이드함수
//     function slideaa(){
//     $('.slide_img').eq(sb_num).fadeIn()
//     $('.slide_img').not($('.slide_img').eq(sb_num)).hide()
//     $('.slide_txt').eq(sb_num).fadeIn()
//     activeT=$('.slide_txt').eq(sb_num)
//     $('.slide_txt').not($('.slide_txt').eq(sb_num)).hide()
//     $('slide_btn').eq(sb_num).css({background:'black',color:'white'})
//     $('slide_btn').not($('slide_btn').eq(sb_num)).css({background:'yellow',color:'black'})
// } 
    
    
</script>