<?php
/**
 * Created by PhpStorm.
 * User: lenovo
 * Date: 2019-07-26
 * Time: 11:46
 */

namespace Home\Model;


use Think\Model;
header("Content-type:text/html;charset=utf-8");
class UserModel extends Model
{
    // 是否批处理验证
    protected $patchValidate    =   true;
    // 自动验证定义
    protected $_validate        =   array(
        /*array('sid','require','用户名不能为空！'),
        array('spwd','require','密码不能为空！'),
        array('respwd','require','确认密码不能为空！'),
        array('respwd','spwd','密码不一致！','','confirm'),*/
    );
    // 自动完成定义
//    protected $_auto    =   array(
//        array('spwd','md5','','function')
//    );

    /**
     * @return int
     */
    public function login1(){
        $sid = $this->data['name'];
        $spwd = $this->data['password'];
        //打印输入账号和密码
       /*dump($sid);
       dump($spwd);*/
        $row = $this->getByName($sid);
           /* dump($row);//打印一个元组
            exit;*/
        if($row){
            //打印数据库得密码和输入的密码
            /*var_dump($row['spwd']);
            var_dump($password);
            exit;*/
            //$row['$spwd'] 数据库的密码；
            //存在用户名
            if($row["password"] == $spwd ){
                return $row;
            }else{

                return -2;
            }

        }else{
            return -1;
        }
    }
}