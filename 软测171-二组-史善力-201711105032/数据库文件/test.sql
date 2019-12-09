/*
Navicat MySQL Data Transfer


*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `info`
-- ----------------------------
DROP TABLE IF EXISTS `info`;
CREATE TABLE `info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sname` char(255) DEFAULT NULL,
  `tel` char(255) DEFAULT NULL,
  `sex` char(255) DEFAULT NULL,
  `email` char(255) DEFAULT NULL,
  `work` char(255) DEFAULT NULL,
  `birthday` char(255) DEFAULT NULL,
  `qq` char(255) DEFAULT NULL,
  `address` char(255) DEFAULT NULL,
  `hobby` char(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=32 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of info
-- ----------------------------
INSERT INTO `info` VALUES ('01', '段和青', '12332112312', '男', '11111@qq.com', '山东建筑大学', '2019-11-26', '7080990', '山东', '');
INSERT INTO `info` VALUES ('02', '孙一月', '12332112312', '男', '11111@qq.com', '山东建筑大学', '2019-11-26', '2404682949', '山东', '');
INSERT INTO `info` VALUES ('03', '李白', '12345678910', '男', '11111@qq.com', '山东建筑大学', '2019-11-26', '2404682949', '北京', '篮球');
INSERT INTO `info` VALUES ('04', '张三', '12345678910', '女', '11111@qq.com', '山东建筑大学', '2019-11-17', '7080990', '山东', '机务');
INSERT INTO `info` VALUES ('05', '魏婴', '12345678910', '男', '11111@qq.com', '山东大学', '1999-05-15', '1440613133', '济南', '唱歌');
INSERT INTO `info` VALUES ('06', '宋雪', '12345678910', '男', '11111@qq.com', '暨南大学', '1997-07-23', '7080990', '山东', '花湖');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  `telephone` char(10) DEFAULT NULL,
  `email` char(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('5', '孙一月', '123', '123', '123');
INSERT INTO `user` VALUES ('2', '李四', '12345', '男', null);
INSERT INTO `user` VALUES ('3', '王二', '123', '12345678', '111');
INSERT INTO `user` VALUES ('4', '张三', '1', '123', '123');
INSERT INTO `user` VALUES ('6', '木一薛', '123', '123', '222');
INSERT INTO `user` VALUES ('7', '1', '1', '1', '1');
INSERT INTO `user` VALUES ('8', '23', '1', '1', '1');
INSERT INTO `user` VALUES ('9', '神农', '1', '1', '1');

-- ----------------------------
-- Procedure structure for `getUserAndAgeById_2`
-- ----------------------------
DROP PROCEDURE IF EXISTS `getUserAndAgeById_2`;
DELIMITER ;;
CREATE DEFINER=`root`@`127.0.0.1` PROCEDURE `getUserAndAgeById_2`(
    IN `userId` int,
    OUT `userName` varchar(50),
    OUT `userAge` int)
BEGIN
    SELECT `name` INTO userName from `user` WHERE id=userId;
    SELECT `age` INTO userAge from `user` WHERE id=userId;
END
;;
DELIMITER ;

-- ----------------------------
-- Procedure structure for `getUserNameAndAgeById_2`
-- ----------------------------
DROP PROCEDURE IF EXISTS `getUserNameAndAgeById_2`;
DELIMITER ;;
CREATE DEFINER=`root`@`127.0.0.1` PROCEDURE `getUserNameAndAgeById_2`(
  IN `userId` int,OUT `userName` VARCHAR(50),OUT `userAge` int )
BEGIN 
  SELECT `name` INTO userName FROM `user` WHERE id = userId;
  SELECT age INTO userAge FROM `user` WHERE id = userId;
END
;;
DELIMITER ;
