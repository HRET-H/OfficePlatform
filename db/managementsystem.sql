/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80032
 Source Host           : localhost:3306
 Source Schema         : managementsystem

 Target Server Type    : MySQL
 Target Server Version : 80032
 File Encoding         : 65001

 Date: 11/05/2023 11:16:35
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for account_table
-- ----------------------------
DROP TABLE IF EXISTS `account_table`;
CREATE TABLE `account_table`  (
  `Account id` int NOT NULL COMMENT '账户id',
  `password` int NULL DEFAULT NULL COMMENT '账户密码',
  `Authority _level` int NULL DEFAULT NULL COMMENT '账户权限级别 (1.学生 2.老师 3.管理员)'
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of account_table
-- ----------------------------
INSERT INTO `account_table` VALUES (1001, 6666, 1);
INSERT INTO `account_table` VALUES (1001, 6666, 2);
INSERT INTO `account_table` VALUES (6666, 6666, 3);

-- ----------------------------
-- Table structure for achievement_table
-- ----------------------------
DROP TABLE IF EXISTS `achievement_table`;
CREATE TABLE `achievement_table`  (
  `Examination_number` int NOT NULL AUTO_INCREMENT COMMENT '考试编号',
  `Examination_time` date NULL DEFAULT NULL COMMENT '考试时间',
  `Student_number` int NULL DEFAULT NULL COMMENT '学生学号',
  `Student_name` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '学生姓名',
  `Student_achievement` int NULL DEFAULT NULL COMMENT '学生成绩',
  PRIMARY KEY (`Examination_number`) USING BTREE,
  INDEX `fk-Examination_time`(`Examination_time` ASC) USING BTREE,
  INDEX `fk-Student_number`(`Student_number` ASC) USING BTREE,
  INDEX `fk-Student_name`(`Student_name` ASC) USING BTREE,
  CONSTRAINT `fk-Examination_number` FOREIGN KEY (`Examination_number`) REFERENCES `examination_form` (`Examination_number`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `fk-Examination_time` FOREIGN KEY (`Examination_time`) REFERENCES `examination_form` (`Examination_time`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `fk-Student_number` FOREIGN KEY (`Student_number`) REFERENCES `student_list` (`Student_number`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `fk-Student_name` FOREIGN KEY (`Student_name`) REFERENCES `student_list` (`Student_name`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of achievement_table
-- ----------------------------
INSERT INTO `achievement_table` VALUES (10086, '2023-05-26', 1001, '小明', 66);
INSERT INTO `achievement_table` VALUES (10087, '2023-05-27', 1002, '小刘', 88);
INSERT INTO `achievement_table` VALUES (10088, '2023-05-28', 1003, '小李', 99);

-- ----------------------------
-- Table structure for class_table
-- ----------------------------
DROP TABLE IF EXISTS `class_table`;
CREATE TABLE `class_table`  (
  `Class_id` int NOT NULL AUTO_INCREMENT COMMENT '班级编号',
  `Student_grade` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '学生年级',
  `Class_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '班级名',
  `Class_Size` int NULL DEFAULT NULL COMMENT '班级人数',
  `Sourse_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '班级课程',
  PRIMARY KEY (`Class_id`) USING BTREE,
  INDEX `Student_grade`(`Student_grade` ASC) USING BTREE,
  INDEX `Class_name`(`Class_name` ASC) USING BTREE,
  INDEX `fk-Sourse_name-one`(`Sourse_name` ASC) USING BTREE,
  CONSTRAINT `fk-Sourse_name-one` FOREIGN KEY (`Sourse_name`) REFERENCES `sourse_table` (`Sourse_name`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of class_table
-- ----------------------------
INSERT INTO `class_table` VALUES (1, '三年级', '2009JavaA', 1, 'java大数据');
INSERT INTO `class_table` VALUES (2, '二年级', '2109uiA', 1, 'ui设计');
INSERT INTO `class_table` VALUES (3, '一年级', '2209', 1, '前端设计');

-- ----------------------------
-- Table structure for examination_form
-- ----------------------------
DROP TABLE IF EXISTS `examination_form`;
CREATE TABLE `examination_form`  (
  `Examination_number` int NOT NULL AUTO_INCREMENT COMMENT '考试编号',
  `Examination_time` date NULL DEFAULT NULL COMMENT '考试时间',
  `Sourse_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '课程编号',
  PRIMARY KEY (`Examination_number`) USING BTREE,
  INDEX `Examination_time`(`Examination_time` ASC) USING BTREE,
  INDEX `ex-Sourse_name`(`Sourse_name` ASC) USING BTREE,
  CONSTRAINT `ex-Sourse_name` FOREIGN KEY (`Sourse_name`) REFERENCES `sourse_table` (`Sourse_name`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of examination_form
-- ----------------------------
INSERT INTO `examination_form` VALUES (10086, '2023-05-26', 'java大数据');
INSERT INTO `examination_form` VALUES (10087, '2023-05-27', 'ui设计');
INSERT INTO `examination_form` VALUES (10088, '2023-05-28', '前端设计');

-- ----------------------------
-- Table structure for sourse_table
-- ----------------------------
DROP TABLE IF EXISTS `sourse_table`;
CREATE TABLE `sourse_table`  (
  `Sourse_number` int NOT NULL AUTO_INCREMENT COMMENT '课程编号',
  `Sourse_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '课程名字',
  `Sourse_type` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '课程类型',
  `Teacher_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '开课教师',
  `Start_time` date NULL DEFAULT NULL COMMENT '开课时间',
  `End_time` date NULL DEFAULT NULL COMMENT '结课时间',
  PRIMARY KEY (`Sourse_number`) USING BTREE,
  INDEX `Sourse_name`(`Sourse_name` ASC) USING BTREE,
  INDEX `fk-Teacher_name`(`Teacher_name` ASC) USING BTREE,
  CONSTRAINT `fk-Teacher_name` FOREIGN KEY (`Teacher_name`) REFERENCES `teacher_list` (`Teacher_name`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of sourse_table
-- ----------------------------
INSERT INTO `sourse_table` VALUES (1001, 'java大数据', 'java', '张三', '2023-05-18', '2023-07-15');
INSERT INTO `sourse_table` VALUES (1002, 'ui设计', 'ui', '夕阳红', '2023-05-16', '2023-08-27');
INSERT INTO `sourse_table` VALUES (1003, '前端设计', 'html,js,css', '猿飞阿斯玛', '2023-05-03', '2023-08-01');

-- ----------------------------
-- Table structure for student_list
-- ----------------------------
DROP TABLE IF EXISTS `student_list`;
CREATE TABLE `student_list`  (
  `Student_number` int NOT NULL AUTO_INCREMENT COMMENT '学生学号',
  `Student_name` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '学生姓名',
  `Student_age` int NULL DEFAULT NULL COMMENT '学生年龄',
  `Student_grade` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '学生年级',
  `Student_gender` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '学生性别',
  `HomeAddress` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '家庭住址',
  `Course_Elective` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '选修课程',
  `Class_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '班级名',
  `Enrollment_ time` date NULL DEFAULT NULL COMMENT '入学时间',
  `Student_IdNumber` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '身份证号',
  `Student_ phone` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT '' COMMENT '学生手机号',
  PRIMARY KEY (`Student_number`) USING BTREE,
  INDEX `Student_name`(`Student_name` ASC) USING BTREE,
  INDEX `fk-Student_grade`(`Student_grade` ASC) USING BTREE,
  INDEX `fk-Sourse_name`(`Course_Elective` ASC) USING BTREE,
  INDEX `fk-Class_name`(`Class_name` ASC) USING BTREE,
  CONSTRAINT `fk-Sourse_name` FOREIGN KEY (`Course_Elective`) REFERENCES `sourse_table` (`Sourse_name`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `fk-Student_grade` FOREIGN KEY (`Student_grade`) REFERENCES `class_table` (`Student_grade`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `fk-Class_name` FOREIGN KEY (`Class_name`) REFERENCES `class_table` (`Class_name`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of student_list
-- ----------------------------
INSERT INTO `student_list` VALUES (1001, '小明', 20, '三年级', '男', '陕西', 'java大数据', '2009JavaA', '2020-09-06', '611066600664758940', '1111111111');
INSERT INTO `student_list` VALUES (1002, '小刘', 18, '二年级', '女', '山西', 'ui设计', '2109uiA', '2021-09-01', '611025836980456850', '2222222222');
INSERT INTO `student_list` VALUES (1003, '小李', 16, '一年级', '男', '宁夏', '前端设计', '2209', '2022-09-01', '311025806491785620', '3333333333');

-- ----------------------------
-- Table structure for teacher_list
-- ----------------------------
DROP TABLE IF EXISTS `teacher_list`;
CREATE TABLE `teacher_list`  (
  `Teacher_number` int NOT NULL AUTO_INCREMENT COMMENT '教师编号',
  `Teacher_name` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '教师姓名',
  `Teacher_gender` varchar(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '教师性别',
  `Teacher_age` int NULL DEFAULT NULL COMMENT '教师年龄',
  `Teacher_phone` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '教师手机号',
  `Teacher_major` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '教师专业',
  PRIMARY KEY (`Teacher_number`) USING BTREE,
  INDEX `Teacher_name`(`Teacher_name` ASC) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of teacher_list
-- ----------------------------
INSERT INTO `teacher_list` VALUES (1001, '张三', '男', 26, '14725836941', 'java大数据');
INSERT INTO `teacher_list` VALUES (1002, '夕阳红', '女', 27, '12384578749', 'ui设计');
INSERT INTO `teacher_list` VALUES (1003, '猿飞阿斯玛', '男', 30, '18156475203', '前端工程师');

SET FOREIGN_KEY_CHECKS = 1;
