-- phpMyAdmin SQL Dump
-- version 3.5.2
-- http://www.phpmyadmin.net
--
-- 主机: localhost
-- 生成日期: 2018 年 07 月 04 日 16:21
-- 服务器版本: 5.5.19
-- PHP 版本: 5.3.5

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- 数据库: `myweb`
--

-- --------------------------------------------------------

--
-- 表的结构 `user_login`
--

CREATE TABLE IF NOT EXISTS `user_login` (
  `id` int(16) unsigned NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `user_name` varchar(16) COLLATE utf8_bin DEFAULT NULL COMMENT '用户名',
  `password` varchar(16) COLLATE utf8_bin DEFAULT NULL COMMENT '用户登录密码',
  `email` varchar(16) COLLATE utf8_bin DEFAULT NULL COMMENT '用户email',
  `mobile` varchar(11) COLLATE utf8_bin DEFAULT NULL COMMENT '用户手机号',
  PRIMARY KEY (`id`),
  KEY `id` (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='存储用户信息' AUTO_INCREMENT=101 ;

--
-- 转存表中的数据 `user_login`
--

INSERT INTO `user_login` (`id`, `user_name`, `password`, `email`, `mobile`) VALUES
(100, 'zxd', '111111', '2279323@qq.com', '15057159482');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
