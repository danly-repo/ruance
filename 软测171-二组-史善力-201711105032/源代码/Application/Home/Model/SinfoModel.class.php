<?php
///*
//namespace Home\Model;   //定义一个命名空间
//
//
//use Think\Model;
//
//class SinfoModel extends Model
//{
//    // 是否批处理验证
//    protected $patchValidate    =   true;
//    // 自动验证定义
//    protected $_validate        =   array(
//        array('sid','require','用户名不能为空！'),
//        array('spwd','require','密码不能为空！'),
//        array('respwd','require','确认密码不能为空！'),
//        array('respwd','spwd','密码不一致！','','confirm'),
//    );
//    // 自动完成定义
// protected $_auto    =   array(
//        array('spwd','md5','','function')
//    );
//
//    /**
//     * @return int
//     */
//    public function login(){
//        $sid = $this->data['sid'];
//        $spwd = $this->data['spwd'];
//        //打印账号和密码
//      /*  dump($sid);
//        dump($spwd);*/
//        $row = $this->getBySid($sid);
//        //dump($row);打印一个元组
//        if($row){
//            //打印数据库得密码和输入的密码
//            /*var_dump($row['spwd']);
//            var_dump($password);
//            exit;*/
//            //$row['$spwd'] 数据库的密码；
//
//            //存在用户名
//            if($row['$spwd'] == $spwd ){
//                return $row;
//            }else{
//
//                return -2;
//            }
//
//        }else{
//            return -1;
//        }
//    }
//
//
//}*/