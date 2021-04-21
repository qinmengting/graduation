DROP TABLE IF EXISTS `art_user`;
CREATE TABLE `art_user` (
                            `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
                            `username` varchar(63) NOT NULL DEFAULT ' ' COMMENT '用户名',
                            `password` varchar(127) NOT NULL DEFAULT ' ' COMMENT '密码',
                            `account_type` tinyint(2) NOT NULL DEFAULT 2 COMMENT '账户类型 0 管理员 1 老师 2 学生',
                            `account_name` varchar(63) NOT NULL DEFAULT '' COMMENT '账户名',
                            `mobile` varchar(16) DEFAULT '' COMMENT '电话号码',
                            `student_ID` char(10) DEFAULT '' COMMENT '学号/职工号',
                            `remark` varchar(255) DEFAULT NULL COMMENT '备注',
                            `gmt_create` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                            `gmt_modify` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
                            PRIMARY KEY (`id`),
                            KEY `idx_user_name` (`username`),
                            KEY `idx_mobile` (`mobile`),
                            KEY `idx_student_ID` (`student_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `art_member`;
CREATE TABLE `art_user` (
                            `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '用户唯一标识',
                            `username` varchar(63) NOT NULL DEFAULT ' ' COMMENT '用户名',
                            `password` varchar(127) NOT NULL DEFAULT ' ' COMMENT '密码',
                            `account_type` tinyint(2) NOT NULL DEFAULT 2 COMMENT '学生类型 0 团长 1 副团长 2 团员',
                            `account_name` varchar(63) NOT NULL DEFAULT '' COMMENT '姓名',
                            `mobile` varchar(16) DEFAULT '' COMMENT '电话号码',
                            `student_ID` char(10) DEFAULT '' COMMENT '学号',
                            `teacher` varchar(16) DEFAULT '' COMMENT '指导老师',
                            `Specialty_type` tinyint(2) NOT NULL DEFAULT 0 COMMENT '是否为特长生 0 不是 1 是',
                            `join_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '入团时间',
                            `in_group_time` tinyint(2) NOT NULL DEFAULT 0 COMMENT '在团学期',
                            `remark` varchar(255) DEFAULT NULL COMMENT '备注',
                            `gmt_create` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                            `gmt_modify` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
                            PRIMARY KEY (`id`),
                            KEY `idx_user_name` (`username`),
                            KEY `idx_mobile` (`mobile`)，
                                KEY `idx_student_ID` (`student_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `role`;
CREATE TABLE `art_role` (
                            `role_id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
                            `type` tinyint(2) NOT NULL COMMENT '角色类型 0 管理员 1 分团管理员 2 团员',
                            `nameZh` varchar(31) NOT NULL DEFAULT '' COMMENT '角色名-中文',
                            `remark` varchar(255) DEFAULT NULL COMMENT '备注',
                            `gmt_create` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                            `gmt_modify` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
                            PRIMARY KEY (`role_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8mb4;

DROP TABLE IF EXISTS `role_permission`;
CREATE TABLE `role_permission` (
                                   `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
                                   `role_id` int(11) NOT NULL COMMENT '角色ID',
                                   `p_id` int(11) NOT NULL COMMENT '权限ID',
                                   `gmt_create` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                                   `gmt_modify` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
                                   PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8mb4;

DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role` (
                             `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
                             `uid` bigint(20) NOT NULL COMMENT '用户ID',
                             `rid` bigint(20) NOT NULL COMMENT '角色ID',
                             `gmt_create` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                             `gmt_modify` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
                             PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8mb4;

DROP TABLE IF EXISTS `art_permission`;
CREATE TABLE `art_permission` (
                                  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
                                  `type` tinyint(2) NOT NULL COMMENT '1 老师 2 学生',
                                  `data` varchar(31) NOT NULL DEFAULT '' COMMENT '功能',
                                  `gmt_create` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                                  `gmt_modify` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
                                  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8mb4;

DROP TABLE IF EXISTS `attendance`;
CREATE TABLE `attendance` (
                              `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
                              `username` varchar(63) NOT NULL DEFAULT ' ' COMMENT '用户名',
                              `student_ID` char(10) DEFAULT '' COMMENT '学号',
                              `gmt_create` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '考勤时间',
                              `gmt_modify` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
                              PRIMARY KEY (`id`),
                                  KEY `idx_user_name` (`username`),
                              KEY `idx_student_ID` (`student_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8mb4;