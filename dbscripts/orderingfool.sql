/*
Navicat MySQL Data Transfer

Source Server         : mySQL
Source Server Version : 50162
Source Host           : localhost:3306
Source Database       : orderingfool

Target Server Type    : MYSQL
Target Server Version : 50162
File Encoding         : 65001

Date: 2016-11-23 16:15:18
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `business`
-- ----------------------------
DROP TABLE IF EXISTS `business`;
CREATE TABLE `business` (
  `bid` int(11) NOT NULL AUTO_INCREMENT,
  `storeName` varchar(20) DEFAULT NULL,
  `synopsis` longtext,
  `phoneNum` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`bid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of business
-- ----------------------------

-- ----------------------------
-- Table structure for `menus`
-- ----------------------------
DROP TABLE IF EXISTS `menus`;
CREATE TABLE `menus` (
  `mid` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `state` bit(1) DEFAULT NULL,
  `synopsis` longtext,
  `material` varchar(200) DEFAULT NULL,
  `id` int(11) DEFAULT NULL,
  PRIMARY KEY (`mid`),
  KEY `FK62F96F442ABB104` (`id`),
  CONSTRAINT `FK62F96F442ABB104` FOREIGN KEY (`id`) REFERENCES `users` (`bid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of menus
-- ----------------------------

-- ----------------------------
-- Table structure for `product`
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `pid` int(11) NOT NULL AUTO_INCREMENT,
  `pname` varchar(20) DEFAULT NULL,
  `price` double DEFAULT NULL,
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of product
-- ----------------------------

-- ----------------------------
-- Table structure for `users`
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `uid` int(11) NOT NULL,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `phoneNum` bigint(20) DEFAULT NULL,
  `bid` int(11) NOT NULL AUTO_INCREMENT,
  `storeName` varchar(20) DEFAULT NULL,
  `synopsis` longtext,
  PRIMARY KEY (`bid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
