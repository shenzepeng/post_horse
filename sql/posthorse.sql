/*
Navicat MySQL Data Transfer

Source Server         : http://47.102.113.146
Source Server Version : 50557
Source Host           : 47.102.113.146:3306
Source Database       : posthorse

Target Server Type    : MYSQL
Target Server Version : 50557
File Encoding         : 65001

Date: 2019-04-23 22:34:30
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `book`
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `blanck_spance_space_one` varchar(255) DEFAULT NULL,
  `blanck_spance_space_three` varchar(255) DEFAULT NULL,
  `blanck_spance_space_two` varchar(255) DEFAULT NULL,
  `company_id` bigint(20) NOT NULL,
  `company_name` varchar(255) DEFAULT NULL,
  `create_time` varchar(255) DEFAULT NULL,
  `customer_name` varchar(255) DEFAULT NULL,
  `destination` varchar(255) DEFAULT NULL,
  `evaluate_content` varchar(255) DEFAULT NULL,
  `finished_time` varchar(255) DEFAULT NULL,
  `order_status` varchar(255) DEFAULT NULL,
  `origin` varchar(255) DEFAULT NULL,
  `review` varchar(255) DEFAULT NULL,
  `score` varchar(255) DEFAULT NULL,
  `string_id` varchar(255) DEFAULT NULL,
  `tel_phone_number` varchar(255) DEFAULT NULL,
  `user_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES ('1', 'string', 'string', 'string', '1', 'string', 'string', 'string', 'string', 'string', 'string', 'string', 'string', 'string', 'string', 'string', 'string', '12');
INSERT INTO `book` VALUES ('2', 'string', 'string', 'string', '1', 'string', 'string', 'string', 'string', 'string', 'string', 'string', 'string', 'string', 'string', 'string', 'string', '12');
INSERT INTO `book` VALUES ('3', null, null, null, '1', 'asd', '1555941658223', null, '', null, '2019-04-22', '进行中', '', null, null, '005b7cf1-1005-48c8-8b28-6627eaef2b6e', 'szp', '12');
INSERT INTO `book` VALUES ('4', null, null, null, '1', 'asd', '1555941745023', null, '123', null, '2019-04-22', '进行中', '阿斯顿', null, null, '68d220f3-a97a-44ba-8966-2815e833f7b1', 'szp', '12');
INSERT INTO `book` VALUES ('5', null, null, null, '1', 'asd', '1555941771430', null, '阿斯顿', null, '2019-04-22', '进行中', '阿斯顿', null, null, '1471bef8-cd4e-4900-92e8-30c62c7dc784', 'szp', '12');
INSERT INTO `book` VALUES ('6', null, null, null, '1', 'asd', '1555941800996', null, '爱上', null, '2019-04-22', '进行中', '阿斯顿', null, null, '217218d2-f840-492b-83c6-c205cdec85d4', 'szp', '12');
INSERT INTO `book` VALUES ('7', null, null, null, '1', 'asd', '1555942832673', null, '阿斯顿', null, '2019-04-22', '进行中', '阿斯顿', null, null, '03d497c2-a01c-40f4-b489-ce727fc72b76', 'szp', '12');
INSERT INTO `book` VALUES ('8', null, null, null, '1', '快啦啦搬家公司', '1556008521596', null, '雁翔路', null, '2019-04-23', '已取消', '光华路', null, null, '86cb9e98-c079-494f-b56c-5ad64015ecba', null, '12');
INSERT INTO `book` VALUES ('9', null, null, null, '1', '快啦啦搬家公司', '1556008712361', null, '科技类', null, '2019-04-23', '已完成', '科技楼', null, null, '8814919c-909d-4417-a235-82e86dbd8659', null, '12');
INSERT INTO `book` VALUES ('10', null, null, null, '1', '快啦啦搬家公司', '1556010530331', '个云云', '斯特卡', null, '2019-04-23', '已取消', '雁塔兰', null, null, '457fbbb0-67d6-4f55-93dd-86caa2d57bd0', null, '12');
INSERT INTO `book` VALUES ('11', null, null, null, '1', '快啦啦搬家公司', '2019-04-23', '流星行', '反倒是', null, '2019-04-22', '已取消', '但是我', null, null, '256007f0-abb9-472d-ab01-e7a1e2e1eb79', null, '14');
INSERT INTO `book` VALUES ('12', null, null, null, '1', '快啦啦搬家公司', '2019-04-23', '流行性', '玩儿吧', '123', '2019-04-23', '已完成', '东大', null, '5', '5e9392a9-edf2-473e-a754-cb2d564c8c60', null, '14');
INSERT INTO `book` VALUES ('13', null, null, null, '2', '快啦啦搬家公司', '2019-04-23', '阿斯福', '发送', null, '2019-04-23', '已取消', '撒', null, null, 'b05fccd1-e9c5-4568-b3ca-46b14fec8cc1', null, '14');
INSERT INTO `book` VALUES ('14', null, null, null, '2', '快啦啦搬家公司', '2019-04-23', '空洞', 'v 到发霉了', null, '2019-04-23', '已完成', '耳机', null, null, '174c1510-44a9-451e-bb34-a1cfbb015b99', null, '14');

-- ----------------------------
-- Table structure for `company`
-- ----------------------------
DROP TABLE IF EXISTS `company`;
CREATE TABLE `company` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `blanck_spance_space_one` varchar(255) DEFAULT NULL,
  `blanck_spance_space_three` varchar(255) DEFAULT NULL,
  `blanck_spance_space_two` varchar(255) DEFAULT NULL,
  `company_address` varchar(255) DEFAULT NULL,
  `company_name` varchar(255) DEFAULT NULL,
  `company_qualifications` varchar(255) DEFAULT NULL,
  `contacts_people_name` varchar(255) DEFAULT NULL,
  `service_area` varchar(255) DEFAULT NULL,
  `service_ifo` varchar(255) DEFAULT NULL,
  `user_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of company
-- ----------------------------
INSERT INTO `company` VALUES ('1', 'asd', 'asd', 'asd', 'asd', 'asd', 'asd', 'asd', 'asd', 'asd', '1');
INSERT INTO `company` VALUES ('2', null, null, null, '雁塔区光华路', '快啦啦搬家公司', '', '刘晓时', '雁塔区', '专注搬家100年', '12');

-- ----------------------------
-- Table structure for `favorites`
-- ----------------------------
DROP TABLE IF EXISTS `favorites`;
CREATE TABLE `favorites` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `blanck_spance_space_one` varchar(255) DEFAULT NULL,
  `blanck_spance_space_three` varchar(255) DEFAULT NULL,
  `blanck_spance_space_two` varchar(255) DEFAULT NULL,
  `company_id` bigint(20) NOT NULL,
  `user_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of favorites
-- ----------------------------
INSERT INTO `favorites` VALUES ('1', '1', '1', '1', '1', '1');
INSERT INTO `favorites` VALUES ('2', '2', '2', '2', '1', '2');
INSERT INTO `favorites` VALUES ('3', null, null, null, '0', '0');
INSERT INTO `favorites` VALUES ('4', null, null, null, '0', '0');
INSERT INTO `favorites` VALUES ('5', null, null, null, '0', '0');
INSERT INTO `favorites` VALUES ('6', null, null, null, '0', '0');
INSERT INTO `favorites` VALUES ('7', null, null, null, '1', '12');
INSERT INTO `favorites` VALUES ('8', null, null, null, '1', '12');
INSERT INTO `favorites` VALUES ('9', null, null, null, '1', '12');
INSERT INTO `favorites` VALUES ('10', null, null, null, '1', '12');
INSERT INTO `favorites` VALUES ('11', null, null, null, '1', '12');
INSERT INTO `favorites` VALUES ('12', null, null, null, '1', '12');
INSERT INTO `favorites` VALUES ('13', null, null, null, '2', '14');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `blanck_spance_space_one` varchar(255) DEFAULT NULL,
  `blanck_spance_space_three` varchar(255) DEFAULT NULL,
  `blanck_spance_space_two` varchar(255) DEFAULT NULL,
  `img_url` varchar(255) DEFAULT NULL,
  `nick_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `tel_phone_number` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'szp', 'szp', 'szp', 'szp', 'szp', 'szp', 'szp', '企业账号', 'szp');
INSERT INTO `user` VALUES ('2', 'x', 'x', 'x', 'xxx', 'xxx', 'xxx', 'xxx', 'xx', 'xxx');
INSERT INTO `user` VALUES ('9', null, null, null, 'asd', 'asd', 'asd', 'asd', '1', 'asd');
INSERT INTO `user` VALUES ('11', 'string', 'string', 'string', 'string', 'string', 'string', 'string', 'string', 'string');
INSERT INTO `user` VALUES ('12', null, null, null, null, '阿斯顿', '123', null, '企业账号', '18165252184');
INSERT INTO `user` VALUES ('13', null, null, null, null, null, '123', null, '企业账号', '18165252184');
INSERT INTO `user` VALUES ('14', null, null, null, null, '个云云', '123', null, '个人账号', '18165252183');
