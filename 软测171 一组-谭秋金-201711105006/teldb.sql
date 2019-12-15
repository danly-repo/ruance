/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50152
Source Host           : localhost:3306
Source Database       : teldb

Target Server Type    : MYSQL
Target Server Version : 50152
File Encoding         : 65001

Date: 2019-11-26 21:24:51
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `fenzu`
-- ----------------------------
DROP TABLE IF EXISTS `fenzu`;
CREATE TABLE `fenzu` (
  `groupid` varchar(255) NOT NULL,
  `gname` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`groupid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of fenzu
-- ----------------------------
INSERT INTO `fenzu` VALUES ('1', '家人');
INSERT INTO `fenzu` VALUES ('2', '朋友');
INSERT INTO `fenzu` VALUES ('3', '老师');
INSERT INTO `fenzu` VALUES ('4', '亲戚');
INSERT INTO `fenzu` VALUES ('5', '同学');
INSERT INTO `fenzu` VALUES ('6', '初中同学');

-- ----------------------------
-- Table structure for `person`
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
  `pno` varchar(255) NOT NULL,
  `pname` varchar(255) NOT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `telephone` varchar(255) NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `gname` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`pno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of person
-- ----------------------------
INSERT INTO `person` VALUES ('1', '丽丽', '女', '17822227989', '南京', '亲戚');
INSERT INTO `person` VALUES ('2', '张三', '男', '17823994561', '天津', '同学');
INSERT INTO `person` VALUES ('3', '李四', '男', '1782221', '天津', '同学');
INSERT INTO `person` VALUES ('4', '哈鲁', '男', '17860528629', '临沂', '家人');
INSERT INTO `person` VALUES ('5', '端午', '女', '17898780923', '临沂', '朋友');
INSERT INTO `person` VALUES ('6', '白经', '男', '13583932557', '济南', '家人');
INSERT INTO `person` VALUES ('7', '吴南柱', '男', '13567548854', '北京', '同学');
INSERT INTO `person` VALUES ('8', '吕珠多', '女', '13645657154', '北京', '朋友');
INSERT INTO `person` VALUES ('9', '李道华', '男', '16545633876', '南京', '朋友');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userid` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'admin', '1');
INSERT INTO `user` VALUES ('2', 'zhangsan', '1');
INSERT INTO `user` VALUES ('3', 'æå', '1');
INSERT INTO `user` VALUES ('4', 'ææé¯', '1');
