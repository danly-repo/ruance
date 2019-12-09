<?php if (!defined('THINK_PATH')) exit();?><!DOCTYPE >
<html>
    <head> 
        <title>登录|注册</title> 
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" /> 
        <script type="text/javascript" src="/IEkcpt1.0/Public/Web/js/jquery-1.9.0.min.js"></script>
        <script type="text/javascript" src="/IEkcpt1.0/Public/Web/images/login.js"></script>
        <script src="/IEkcpt1.0/Public/Web/js/jquery.min.js"></script>
        <script src="/IEkcpt1.0/Public/Web/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="/IEkcpt1.0/Public/Web/css/bootstrap.min.css">
        <link href="/IEkcpt1.0/Public/Web/css/login2.css" rel="stylesheet" type="text/css" />
        <script>
            $(function () { 
            $("[data-toggle='popover']").popover();
        });
        </script>
    </head> 
    <body> 
        <h1>登录 注册</h1> 
        <div class="login" style="margin-top:50px;"> 
            <div class="header"> 
                <div class="switch" id="switch">
                    <a class="switch_btn_focus" id="switch_qlogin" href="javascript:void(0);" tabindex="7">快速登录</a> 
                    <a class="switch_btn" id="switch_login" href="javascript:void(0);" tabindex="8">快速注册</a>
                    <!-- <a class="btn" title="提示"
                                data-container="body" data-toggle="popover" data-placement="right" 
                                data-content="学生的账号长度为12 
                                教师的账号长度为10 
                                企业的账号长度为8">提示</a> -->
                    <div class="switch_bottom" id="switch_bottom" style="position: absolute; width: 64px; left: 0px;"></div> 
                </div> 
            </div> 
            <div class="web_qr_login" id="web_qr_login" style="display: block; height: 300px;"> 
                <!--登录--> 
                <div class="web_login" id="web_login"> 
                    <div class="login-box"> 
                        <div class="login_form"> 
                            <form  method="post" action="index.php?m=Home&c=Login&a=login" accept-charset="utf-8" id="login_form"
                                   class="loginForm form-inline" >
                                <input type="hidden" name="did" value="0" /> 
                                <input type="hidden" name="to" value="log" /> 
                               <!--  <div class="form-group">
                                   <label class="input-tips" for="role" >身份:</label>
                                   <div class="inputOuter">
                                       <select class="form-control">
                                           <option>学生</option>
                                           <option>教师</option>
                                           <option>企业</option>
                                       </select>
                                   </div>
                               </div> -->
                                <div class="uinArea" id="uinArea"> 
                                    <label class="input-tips" for="u">用户名：</label> 
                                    <div class="inputOuter" id="uArea"> 
                                        <input type="text" id="u" name="name" class="inputstyle" />
                                    </div> 
                                </div> 
                                <div class="pwdArea" id="pwdArea"> 
                                    <label class="input-tips" for="p">密码：</label> 
                                    <div class="inputOuter" id="pArea"> 
                                        <input type="password" id="p" name="password" class="inputstyle" />
                                    </div> 
                                </div> 
                                <div style="padding-left:50px;margin-top:20px;">
                                    <input type="submit" value="登 录" style="width:150px;" class="button_blue" />
                                </div> 
                            </form> 
                        </div> 
                    </div> 
                </div> 
                <!--登录end--> 
            </div> 
            <!--注册--> 
            <div class="qlogin" id="qlogin" style="display: none; "> 
                <div class="web_login">
                    <form  method="post"  action="index.php?m=Home&c=Login&a=addzc" id="regUser"  >
                      <!--  <input type="hidden" name="to" value="reg" />
                        <input type="hidden" name="did" value="0" />-->
                        <ul class="reg_form" id="reg-ul">
                            <!-- <div class="form-group">
                            <label class="input-tips2" for="role" >身份:</label>
                                <div class="inputOuter2">
                                    <select class="form-control">
                                        <option>学生</option>
                                        <option>教师</option>
                                        <option>企业</option>
                                    </select>
                                </div>
                            </div> -->
                            <li> 
                                <label for="user1" class="input-tips2">用户名：</label>
                                <div class="inputOuter2"> 
                                    <input type="text" id="user1" name="name" maxlength="16" class="inputstyle2" />

                                </div>
                            </li> 
                            <li> 
                                <label for="passwd2" class="input-tips2">密码：</label>
                                <div class="inputOuter2"> 
                                    <input type="password" id="passwd2" name="password" maxlength="16" class="inputstyle2"  />
                                </div>
                            </li> 
                           <li>
                                <label for="passwd2" class="input-tips2">确认密码：</label> 
                                <div class="inputOuter2"> 
                                    <input type="password" id="passwd21" name="respwd" maxlength="16" class="inputstyle2" />
                                </div> 
                            </li>
                             <li>
                                <label for="passwd2" class="input-tips2">电话：</label> 
                                <div class="inputOuter2"> 
                                    <input type="password" id="passwd21" name="telephone" maxlength="16" class="inputstyle2" />
                                </div> 
                            </li>
                             <li>
                                <label for="passwd2" class="input-tips2">邮箱：</label> 
                                <div class="inputOuter2"> 
                                    <input type="password" id="passwd21" name="email" maxlength="16" class="inputstyle2" />
                                </div> 
                            </li>
                            <li> 
                                <div class="inputArea"> 
                                    <input type="submit" id="reg" style="margin-top:10px;margin-left: 120px;" class="button_blue" value="同意协议并注册" />
                                    <!-- <a href="#" class="zcxy" target="_blank">注册协议</a> -->
                                </div> 
                            </li>
                            <div class="cl"></div> 
                        </ul>
                    </form> 
                </div> 
            </div> 
            <!--注册end--> 
        </div> 
    </body>
</html>