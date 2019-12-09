<?php
/**
 * Created by PhpStorm.
 * User: lenovo
 * Date: 2019-07-25
 * Time: 14:37
 */
 function showModelError($Model){
    $errors = $Model->getError();
    if (empty($errors)){
        return '';
    }

    $errorInfo='</ul>';
    if(is_array($errors))
    {
        foreach($errors as $error)
        {
            $errorInfo.="<li>$error</li>";
        }
    }else{
        //  不是数组
        $errorInfo.="<li>$errors</li>";
    }
    $errorInfo.='</ul>';
    return $errorInfo;

}
