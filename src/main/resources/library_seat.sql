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

 Date: 03/07/2020 16:45:54
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
INSERT INTO `seat` VALUES (1, 1, 0, 1, 1, 1, 0, 2, 0, 0, 1, 2, 1, 1, 0, 1);
INSERT INTO `seat` VALUES (1, 3, 1, 1, 1, 1, 1, 2, 0, 0, 0, 0, 2, 2, 2, 1);
INSERT INTO `seat` VALUES (2, 1, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 0, 0, 0);
INSERT INTO `seat` VALUES (2, 2, 2, 1, 1, 1, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0);
INSERT INTO `seat` VALUES (1, 9, 0, 0, 0, 1, 2, 0, 2, 2, 1, 1, 1, 1, 1, 0);
INSERT INTO `seat` VALUES (5, 2, 1, 2, 1, 0, 0, 0, 0, 0, 0, 1, 2, 0, 0, 1);
INSERT INTO `seat` VALUES (3, 2, 0, 1, 1, 2, 3, 3, 2, 0, 0, 0, 2, 1, 0, 1);
INSERT INTO `seat` VALUES (4, 10, 2, 1, 1, 0, 1, 0, 0, 1, 2, 0, 1, 1, 0, 0);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(0) NOT NULL,
  `userName` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `age` int(0) NULL DEFAULT NULL,
  `sex` varchar(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `passwd` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `phone` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `grade` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (20, 'fyl', '符玉涟', 18, '女', '123456', '15874421108', '18级软件5班');
INSERT INTO `user` VALUES (21, 'phl', '盘海林', 20, '男', '654321', '15873321994', '17级软件1班');

SET FOREIGN_KEY_CHECKS = 1;
