<?php
namespace Home\Controller;
use Think\Controller;
use Home\Model\ResumeModel;
use Think\Upload;
use Think\Page;
header("Content-type:text/html;charset=utf-8");
class IndexController extends Controller {
	public function index(){

         $infoModel = D('info');
         $rows = $infoModel->query("select * from info");
         // dump($rows);
         // exit;
        $this->assign('rows',$rows);


		$this->display('index');
	}

 
   public function  addinfo(){
      $infomodel = D('info');

       $date['sname'] = $_POST['name'];
       $date['tel'] = $_POST['tel'];
       $date['sex'] = $_POST['sex'];
       $date['email'] = $_POST['email'];
       $date['work'] = $_POST['position'];
       $date['birthday'] = $_POST['birthday'];
       $date['qq'] = $_POST['qq'];
       $date['address'] = $_POST['address'];
       $date['hobby'] = $_POST['hobby'];


       $res = $infomodel->add($date);
       // dump($res);
       // exit;
       if($res !== false)
       {

           $this->success('添加成功',U('index'));//跳转到添加页面

       }
       else{
           $this->error('添加失败!');
       }

   }


   //删除方法
   public function  delinfo($info_id){

    $userModel = D('info');
       $sql  = "delete from info where id ='$info_id' ";
        $result = $userModel -> execute($sql);
   
       //3.根据保存的数据结果跳转到制定的页面
       if($result !== false)
       {
           //成功，跳转到列表页面、
           $this->success('删除成功');
       }
       else{
           $this->error('删除失败!');
       }

   }


   public function changeinfo($info_id){
      $userModel = D('info');
       $sql  = "select * from info where id ='$info_id' ";
        $result = $userModel -> query($sql);
        // dump($result);
        // exit;
        $this->assign('row',$result);
        $this->display('changeinfo');
        
   


      
   }
public function  changeaddinfo(){
      $infomodel = D('info');
       $id=$date['id'] = $_POST['myid'];
       $sname=$date['sname'] = $_POST['name'];
       $tel=$date['tel'] = $_POST['tel'];
       $sex=$date['sex'] = $_POST['sex'];
       $email=$date['email'] = $_POST['email'];
       $work=$date['work'] = $_POST['position'];
       $birthday=$date['birthday'] = $_POST['birthday'];
       $qq=$date['qq'] = $_POST['qq'];
       $address=$date['address'] = $_POST['address'];
       $hobby=$date['hobby'] = $_POST['hobby'];

        $sql  = "update info set sname='$sname',tel='$tel',sex='$sex',
        email='$email',work='$work', birthday = '$birthday', qq= '$qq', address='$address' ,
        hobby='$hobby' where id ='$id' ";
        
        // $res = $infomodel->add($date);
       // dump($sql);
       // exit;
        $res = $infomodel -> execute($sql);
       if($res !== false)
       {

           $this->success('修改成功',U('index'));//跳转到添加页面

       }
       else{
           $this->error('修改失败!');
       }

   }
        


   


  


   }




