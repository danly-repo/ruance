<?php if (!defined('THINK_PATH')) exit();?>﻿<!DOCTYPE html>
<html>
  <head>
    <title>新增联系人详细信息</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
    <meta name="apple-mobile-web-app-capable" content="yes"/>
    <link href="/IEkcpt1.0/Application/Home/View/index/resources/css/jquery-ui-themes.css" type="text/css" rel="stylesheet"/>
    <link href="/IEkcpt1.0/Application/Home/View/index/resources/css/axure_rp_page.css" type="text/css" rel="stylesheet"/>
    <link href="/IEkcpt1.0/Application/Home/View/index/data/styles.css" type="text/css" rel="stylesheet"/>
    <link href="/IEkcpt1.0/Application/Home/View/index/files/通讯录管理/styles.css" type="text/css" rel="stylesheet"/>
    <link href="/IEkcpt1.0/Application/Home/View/index/resources/css/jquery-ui-themes.css" type="text/css" rel="stylesheet"/>
    <link href="/IEkcpt1.0/Application/Home/View/index/resources/css/axure_rp_page.css" type="text/css" rel="stylesheet"/>
    <link href="/IEkcpt1.0/Application/Home/View/index/data/styles.css" type="text/css" rel="stylesheet"/>
    <link href="/IEkcpt1.0/Application/Home/View/index/files/新增联系人详细信息/styles.css" type="text/css" rel="stylesheet"/>
    <script src="resources/scripts/jquery-1.7.1.min.js"></script>
    <script src="resources/scripts/jquery-ui-1.8.10.custom.min.js"></script>
    <script src="resources/scripts/prototypePre.js"></script>
    <script src="data/document.js"></script>
    <script src="resources/scripts/prototypePost.js"></script>
    <script src="files/新增联系人详细信息/data.js"></script>
    <script type="text/javascript">
      $axure.utils.getTransparentGifPath = function() { return 'resources/images/transparent.gif'; };
      $axure.utils.getOtherPath = function() { return 'resources/Other.html'; };
      $axure.utils.getReloadPath = function() { return 'resources/reload.html'; };
    </script>
    <style>
      #dvLoginBox {
        border-radius: 6px;
        display: block;
        position: absolute;
        top: 41px;
        z-index: 9998;
        color: #434343;
        background-color: rgba(0,0,0,.05);
        background-color: #fff;
        left: 245px;
        box-shadow: 2px 5px 70px rgba(0,0,0,.5);
        width: 800px;
        height: 612px;
        top: 70px;
      }

      .apply-btn {
        margin-top: 30px;
        margin-left: 255px;
        width: 160px;
        height: 44px;
        line-height: 44px;
        color: #fff;
        font-size: 20px;
        text-align: center;
        background-image: linear-gradient(45deg,#3b99fc,#6d93fe);
        border-radius: 100px;
        cursor: pointer;
      }

      #spnCloseButton {
        font-family: Arial;
        position: absolute;
        top: 6px;
        right: 14px;
        cursor: pointer;
        padding: 3px;

      }
      #spnCloseButton:hover{
        color:red;
      }
      .solution_list h2 a:hover {
        color: #2eafbb;
      }
      .tanchuang1{
        color: #999;
        margin: 33px 30px 36px;
        font-size: 1em;
      }
      .tanchuang2{

        font-size: 2em;
        color: #000;
        margin:33px 30px 36px;
      }
      .source3{

        padding: 33px 30px 36px;
        padding-right: 0px;
        font-size: 20px;
        color: #ff7900;
      }
      .source4{
        font-size: 15px;

      }
      .source5{
        padding: 33px 30px 36px;
        color: #666;
        font-size: 15px;

      }
      .source6{
        padding: 3px 30px 3px;
        border-top: 1px solid #eee;
        font-size: 17px;
      }
      .source7{
        font-size: 18px;
        font-weight: bold;
      }
      .apply-btn {
        margin-top: 30px;
        margin-left: 255px;
        width: 160px;
        height: 44px;
        line-height: 44px;
        color: #fff;
        font-size: 20px;
        text-align: center;
        background-image: linear-gradient(45deg,#3b99fc,#6d93fe);
        border-radius: 100px;
        cursor: pointer;
      }
.xiugaixixin{
  margin: 0 auto;
    padding: 0 10px;
    width: 536px;
    height: 34px;
    border: 1px solid rgba(255,255,255,.8);
    border-radius: 2px;
    color: #272822;
    background: #E8F0FE;
    margin-top: 10px;
  </style>
  </head>
  <body >
    <div style="width: " >
      <div id="u67" >
        <div id="u67_div" class=""></div>
      </div>

      <!-- Unnamed (Rectangle) -->
      <div id="u68" class="ax_default _形状">
        <div id="u68_div" class=""></div>
      </div>

      <!-- SearchInput (Text Field) -->
      <div id="u69" class="ax_default _文本框" data-label="SearchInput">
        <input id="u69_input" type="text" value=""/>
      </div>

      <!-- Unnamed (Shape) -->
      <div id="u70" class="ax_default icon">
     
      </div>

      <!-- DeleteButton (Shape) -->
      <div id="u71" class="ax_default icon ax_default_hidden" data-label="DeleteButton" style="display:none; visibility: hidden">
        <img id="u71_img" class="img " src="images/通讯录管理/deletebutton_u71.png"/>
      </div>

      <!-- Unnamed (Shape) -->
      <div id="u72" class="ax_default icon">
        
      </div>

      <!-- Unnamed (Rectangle) -->
      <div id="u73" class="ax_default label">
        <div id="u73_div" class=""></div>
        <div id="u73_text" class="text">
          <p><span><a href="index.html">信息管理</a></span><span style="margin-left: 20px;"><a href="newinfo.html">新增联系人</a></span>
            <span style="margin-left: 20px;" ><a href="<?php echo U('Login/longinOut');?>">退出系统</a></span> <span style="margin-left: 500px; font-size: 22px;color: #4DA200;font-weight: bold;">您好：<?php echo ($_SESSION['userinfo']['name']); ?></span>
          </p>


        </div>
      </div>

      </div>
    <div id="base" class="" style="margin-top: 50px;">

      
        

      <!-- Unnamed (Rectangle) -->

      <form action="<?php echo U('Index/addinfo');?>" method="post" >

         <div   id="dvLoginBox" >
            <div style="text-align: center;" >
           <span class="tanchuang2">增加人员信息</span><hr>
           <label>姓名：</label><input class="xiugaixixin" type="text" name="name" ><br>
           <label>手机：</label><input class="xiugaixixin" type="text" name="tel" ><br>
           <label>性别：</label><input class="xiugaixixin" type="text" name="sex" ><br>
           <label>邮箱：</label><input class="xiugaixixin" type="text" name="email" ><br>
           <label>单位：</label><input class="xiugaixixin" type="text" name="position" ><br>
           <label>生日：</label><input class="xiugaixixin" type="date" name="birthday" ><br>
           <label>q&nbsp; q：</label><input class="xiugaixixin" type="text" name="qq" ><br>
           <label>住址：</label><input class="xiugaixixin" type="text" name="address" ><br>
           <label>爱好：</label><input class="xiugaixixin" type="text" name="hobby" ><br>
           </div>
              <input style="text-align: center;" class="apply-btn"  type="submit" name="addpeopleinfo" value="提交">
             
            </div>
         </form>
  
    </div>
  </body>
</html>