/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80020
 Source Host           : localhost:3306
 Source Schema         : library_seat

 Target Server Type    : MySQL
 Target Server Version : 80020
 File Encoding         : 65001

 Date: 05/07/2020 22:41:12
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin`  (
  `id` int(0) NULL DEFAULT NULL,
  `name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `userName` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `age` int(0) NULL DEFAULT NULL,
  `sex` varchar(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `phone` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `passwd` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES (1, '符玉涟', '#fyl', 18, '女', '15874233412', 'rootroot');

-- ----------------------------
-- Table structure for seat
-- ----------------------------
DROP TABLE IF EXISTS `seat`;
CREATE TABLE `seat`  (
  `Floor` int(0) NOT NULL,
  `NO` int(0) NULL DEFAULT NULL,
  `A` int(0) NULL DEFAULT NULL,
  `B` int(0) NULL DEFAULT NULL,
  `C` int(0) NULL DEFAULT NULL,
  `D` int(0) NULL DEFAULT NULL,
  `E` int(0) NULL DEFAULT NULL,
  `F` int(0) NULL DEFAULT NULL,
  `G` int(0) NULL DEFAULT NULL,
  `H` int(0) NULL DEFAULT NULL,
  `I` int(0) NULL DEFAULT NULL,
  `J` int(0) NULL DEFAULT NULL,
  `K` int(0) NULL DEFAULT NULL,
  `L` int(0) NULL DEFAULT NULL,
  `M` int(0) NULL DEFAULT NULL,
  `N` int(0) NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of seat
-- ----------------------------
INSERT INTO `seat` VALUES (4, 10, 2, 0, 1, 1, 1, 0, 1, 1, 2, 0, 1, 1, 0, 0);
INSERT INTO `seat` VALUES (1, 7, 1, 0, 1, 1, 0, 2, 20, 0, 1, 2, 1, 1, 0, 1);
INSERT INTO `seat` VALUES (1, 3, 1, 1, 0, 1, 1, 2, 0, 0, 0, 0, 2, 2, 2, 1);
INSERT INTO `seat` VALUES (2, 1, 0, 1, 0, 1, 1, 1, 1, 2, 2, 0, 2, 0, 0, 0);
INSERT INTO `seat` VALUES (2, 2, 0, 0, 1, 1, 1, 0, 2, 0, 0, 4, 0, 0, 0, 0);
INSERT INTO `seat` VALUES (1, 9, 1, 1, 0, 1, 2, 0, 2, 2, 1, 1, 1, 0, 1, 0);
INSERT INTO `seat` VALUES (5, 2, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 2, 0, 0, 1);
INSERT INTO `seat` VALUES (3, 2, 20, 1, 1, 2, 3, 3, 2, 0, 1, 0, 2, 1, 0, 1);

-- ----------------------------
-- Table structure for table_log
-- ----------------------------
DROP TABLE IF EXISTS `table_log`;
CREATE TABLE `table_log`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `user_id` int(0) NULL DEFAULT NULL,
  `date` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `time` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `type` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `message` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of table_log
-- ----------------------------
INSERT INTO `table_log` VALUES (4, 1, '2020-07-04', '17:58:51', 'INFO', '你成功预定了 1 楼 H3 号座位');
INSERT INTO `table_log` VALUES (5, 1, '2020-07-04', '17:58:57', 'ERROR', '预定 1 楼 H3 号座位时失败');
INSERT INTO `table_log` VALUES (6, 1, '2020-07-04', '18:01:53', 'INFO', '你成功预定了 3 楼 I2 号座位');
INSERT INTO `table_log` VALUES (7, 1, '2020-07-04', '18:02:02', 'ERROR', '预定 3 楼 I2 号座位时失败');
INSERT INTO `table_log` VALUES (8, 20, '2020-07-05', '09:26:59', 'INFO', '你成功预定了 3 楼 J2 号座位');
INSERT INTO `table_log` VALUES (9, 20, '2020-07-05', '09:27:05', 'ERROR', '预定 3 楼 J2 号座位时失败');
INSERT INTO `table_log` VALUES (10, 20, '2020-07-05', '10:42:27', 'INFO', '你成功预定了 1 楼 G7 号座位');
INSERT INTO `table_log` VALUES (11, 20, '2020-07-05', '10:43:02', 'ERROR', '预定 1 楼 G7 号座位时失败');
INSERT INTO `table_log` VALUES (12, 20, '2020-07-05', '11:09:00', 'INFO', '你成功预定了 1 楼 M7 号座位');
INSERT INTO `table_log` VALUES (13, 20034, '2020-07-05', '13:02:38', 'INFO', '你成功预定了 2 楼 J2 号座位');
INSERT INTO `table_log` VALUES (14, 20, '2020-07-05', '20:19:52', 'INFO', '你成功预定了 3 楼 A2 号座位');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `userName` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `age` int(0) NULL DEFAULT NULL,
  `sex` varchar(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `passwd` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `phone` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `grade` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `description` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (11, '你猜', 'lc', 23, '女', '123456', '1212112121', '罗', '我是罗');
INSERT INTO `user` VALUES (20032, 'jld', '记录的', 20, '女', '123456', '15874432334', '19级8班', '哈哈哈哈');
INSERT INTO `user` VALUES (20034, 'dfl', '等风来', 21, '保密', 'rootroot', '15874432398', '北京电影', '我是等风来');
INSERT INTO `user` VALUES (20037, 'vcjv', 'ddd', 26, '男', '23', '15111566312', '18级', '购房成本\n就第三方');
INSERT INTO `user` VALUES (20039, 'fyl', '符玉涟', 18, '女', '123456', '15889230934', '18级2班', '这是我的个性签名');

SET FOREIGN_KEY_CHECKS = 1;
