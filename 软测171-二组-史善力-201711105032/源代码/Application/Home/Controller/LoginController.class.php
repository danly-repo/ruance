<?php


namespace Home\Controller;

use Think\Controller;
header("Content-type:text/html;charset=utf-8");
class LoginController extends Controller
{
    public function index(){
        $this->display('index');
    }
    public function addzc()
    {
        if (IS_POST) {
            $suserModel = D ( 'user' );
            if ($suserModel->create()!== false) {
//                dump ($suserModel->create());
//                exit;

                if ($suserModel->add()!== false) {//1.保存 2.激活验证功能
                    $this->success('注册成功');
                    return;
                }

            }
            $this->error('注册失败'.showModelError($suserModel));

        } else {
            $this->display('index');
       }
    }



    public  function  login(){
        if(IS_POST){
            $UserModel = D ( 'user' );

            //接收请求的数据
            if($UserModel-> create() !== false)
            {
                /*dump($UserModel);
                exit;*/
                //进行登录
                $result = $UserModel->login1();

                if(is_array($result)){

                    session('userinfo',$result);
                    //登录成功，跳转index
                    $this->success('登录成功!',U('Index/index'));
                    return;
                }else{
                    switch ($result){
                        case -1:
                            $error = '用户名错误';break;
                        case -2:
                            $error = '密码错误';break;

                    }
                    $this->error($error);
                }

            }
            $this->error('登录失败!'.showModelError($suserModel));

        }else{
            $this->display('index');
        }
    }
   

    public function longinOut(){
        session('userinfo',null);
        $this->success('成功退出',U('index'));
  }

}