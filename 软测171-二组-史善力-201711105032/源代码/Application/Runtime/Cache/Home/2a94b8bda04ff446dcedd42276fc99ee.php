<?php if (!defined('THINK_PATH')) exit();?>﻿<!DOCTYPE html>
<html>
  <head>
    <title>通讯录管理</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
    <meta name="apple-mobile-web-app-capable" content="yes"/>
    <link href="/IEkcpt1.0/Application/Home/View/index/resources/css/jquery-ui-themes.css" type="text/css" rel="stylesheet"/>
    <link href="/IEkcpt1.0/Application/Home/View/index/resources/css/axure_rp_page.css" type="text/css" rel="stylesheet"/>
    <link href="/IEkcpt1.0/Application/Home/View/index/data/styles.css" type="text/css" rel="stylesheet"/>
    <link href="/IEkcpt1.0/Application/Home/View/index/files/通讯录管理/styles.css" type="text/css" rel="stylesheet"/>
    <script src="resources/scripts/jquery-1.7.1.min.js"></script>
    <script src="resources/scripts/jquery-ui-1.8.10.custom.min.js"></script>
    <script src="resources/scripts/prototypePre.js"></script>
    <script src="data/document.js"></script>
    <script src="resources/scripts/prototypePost.js"></script>
    <script src="files/通讯录管理/data.js"></script>
    <script type="text/javascript">
      $axure.utils.getTransparentGifPath = function() { return 'resources/images/transparent.gif'; };
      $axure.utils.getOtherPath = function() { return 'resources/Other.html'; };
      $axure.utils.getReloadPath = function() { return 'resources/reload.html'; };
    </script>
    <style>
    .biaoge{
  margin:5px 10px auto 10px;
}
table tr:nth-child(odd){
  background:#BFD1F5;
}
table tr:nth-child(1){
  background:#7EB2F2;
}

      #dvLoginBox {
        border-radius: 6px;
        display: none;
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

}
  </style>
  </head>
  <body >

      <!-- Unnamed (Rectangle) -->
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
      

      <!-- Unnamed (Rectangle) -->
      <div id="u73" class="ax_default label">
        <div id="u73_div" class=""></div>
        <div id="u73_text" class="text ">
          <p><span><a href="index.html">信息管理</a></span><span style="margin-left: 20px;"><a href="newinfo.html">新增联系人</a></span>
            <span style="margin-left: 20px;" ><a href="<?php echo U('Login/longinOut');?>">退出系统</a></span> <span style="margin-left: 500px; font-size: 22px;color: #4DA200;font-weight: bold;">您好：<?php echo ($_SESSION['userinfo']['name']); ?></span>
          </p>


        </div>
      </div>

      </div>
      <div style="margin: 60px 0 20px 100px;text-align: center;">
     <div class="biaoge">
        <table border="1" cellspacing="6px" cellpadding="10px"  style="text-align: center; border-collapse:collapse;" >
        <tr>
        <td>序号</td><td>姓名</td><td>手机</td><td>性别</td><td>邮箱</td><td>单位</td>
        <td>生日</td><td>QQ</td><td>住址</td><td>爱好</td><td>操作</td>
        </tr>
        <?php if(is_array($rows)): $i = 0; $__LIST__ = $rows;if( count($__LIST__)==0 ) : echo "" ;else: foreach($__LIST__ as $key=>$vo): $mod = ($i % 2 );++$i;?><tr>
          <td><?php echo ($vo["id"]); ?></td>
          <td><?php echo ($vo["sname"]); ?></td>
          <td><?php echo ($vo["tel"]); ?></td>
          <td><?php echo ($vo["sex"]); ?></td>
          <td><?php echo ($vo["email"]); ?></td>
          <td><?php echo ($vo["work"]); ?></td>
          <td><?php echo ($vo["birthday"]); ?></td>
          <td><?php echo ($vo["qq"]); ?></td>
          <td><?php echo ($vo["address"]); ?></td>
          <td><?php echo ($vo["hobby"]); ?></td>
          <td><button><a href="<?php echo U('Index/changeinfo',array('info_id'=>$vo['id']));?>">修改</a></button> <button><a href="<?php echo U('Index/delinfo',array('info_id'=>$vo['id']));?>">删除</a></button></td>
        </tr><?php endforeach; endif; else: echo "" ;endif; ?>
        </table>
        </div>
 </div>

 <!--弹框js-->



      

      <div id="u194" class="ax_default" style="position: absolute;left: 0px;top: 700px;" >
        <div id="u194_state0" class="panel_state" data-label="State1" >
        <div style="margin-top: 60px;">
                <p><span>帮助：</span></p><p><span>1、详细说明见《使用说明书》；</span></p><p><span>2、联系方式：12345678；</span></p><p><span>3、版权所有：山东建筑大学。</span></p>
              </div>
        </div>
      </div>
   
      

    </div>

  </body>
  <script type="text/javascript">
      function showInform(){
          document.getElementById("dvLoginBox").style.display='block';
      }
      function hiddenInform(event){
        var informDiv = document.getElementById('dvLoginBox');
        document.getElementById('spnCloseButton').onclick=function(){informDiv.style.display='none';}
}
  </script>
</html>