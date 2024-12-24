-- MySQL dump 10.13  Distrib 8.0.40, for Win64 (x86_64)
--
-- Host: localhost    Database: webbanhangthoitrang
-- ------------------------------------------------------
-- Server version	8.0.40

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `baiviet`
--

DROP TABLE IF EXISTS `baiviet`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `baiviet` (
  `maBaiViet` int NOT NULL AUTO_INCREMENT,
  `MaNguoiDung` int DEFAULT NULL,
  `tenBai` varchar(100) DEFAULT NULL,
  `noiDung` text,
  `thoiGian` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`maBaiViet`),
  KEY `MaNguoiDung` (`MaNguoiDung`),
  CONSTRAINT `baiviet_ibfk_1` FOREIGN KEY (`MaNguoiDung`) REFERENCES `nguoidung` (`MaNguoiDung`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `baiviet`
--

LOCK TABLES `baiviet` WRITE;
/*!40000 ALTER TABLE `baiviet` DISABLE KEYS */;
INSERT INTO `baiviet` VALUES (2,1,'Khuyến mãi 50%','khuyến mãi các sản phẩm như Esprit Ruffle Shirt khoảng 50% chi ân các khách hàng chê bai chúng tôi cho hết chê chúng tui','22/12/2024');
/*!40000 ALTER TABLE `baiviet` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chitietsanpham`
--

DROP TABLE IF EXISTS `chitietsanpham`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `chitietsanpham` (
  `id` int NOT NULL AUTO_INCREMENT,
  `MaSanPham` int NOT NULL,
  `mauSac` varchar(50) NOT NULL,
  `kichCo` varchar(20) NOT NULL,
  `soLuong` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `MaSanPham` (`MaSanPham`),
  CONSTRAINT `chitietsanpham_ibfk_1` FOREIGN KEY (`MaSanPham`) REFERENCES `sanpham` (`MaSanPham`)
) ENGINE=InnoDB AUTO_INCREMENT=422 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chitietsanpham`
--

LOCK TABLES `chitietsanpham` WRITE;
/*!40000 ALTER TABLE `chitietsanpham` DISABLE KEYS */;
INSERT INTO `chitietsanpham` VALUES (4,1,'Đen','M',500),(7,1,'Xám','M',89),(12,2,'Đỏ','M',170),(13,2,'Xanh','L',151),(14,2,'Vàng','S',193),(15,2,'Đen','M',105),(16,2,'Trắng','L',176),(17,2,'Nâu','S',-1),(18,2,'Xám','M',177),(19,2,'Hồng','L',196),(20,2,'Lam','S',97),(21,2,'Tím','M',149),(22,2,'Xanh lá','L',88),(34,3,'Xanh','S',1000),(35,3,'đỏ','S',111),(40,1,'đỏ','M',1),(43,1,'xám','S',109),(44,1,'vàng','XL',18),(45,1,'xám','S',279),(46,1,'xám','XL',189),(47,1,'vàng','XL',42),(48,1,'xanh','XXL',29),(49,1,'hồng','XXL',258),(50,1,'vàng','L',20),(51,1,'xanh','L',283),(52,1,'đỏ','M',145),(53,1,'xám','XXL',28),(54,1,'cam','L',87),(55,1,'xanh','XL',148),(56,1,'xám','M',172),(57,1,'tím','XXL',169),(58,1,'cam','M',109),(59,1,'cam','XL',252),(60,1,'vàng','M',86),(61,1,'hồng','S',32),(62,1,'xanh','L',234),(63,1,'tím','S',164),(64,1,'xám','XL',158),(65,1,'tím','XL',93),(66,1,'cam','XL',178),(67,1,'hồng','XL',16),(68,2,'vàng','XXL',27),(69,2,'xanh','S',225),(70,2,'xám','M',125),(71,2,'xanh','S',276),(72,2,'tím','XL',106),(73,2,'cam','S',128),(74,2,'xám','L',143),(75,2,'đỏ','S',171),(76,2,'tím','XL',214),(77,2,'vàng','XXL',142),(78,2,'xám','M',135),(79,2,'hồng','XXL',85),(80,2,'xanh','L',100),(81,2,'cam','M',247),(82,2,'tím','XXL',211),(83,2,'cam','XXL',24),(84,2,'hồng','M',79),(85,2,'xám','XL',240),(86,2,'đỏ','XL',249),(87,2,'cam','L',240),(88,2,'hồng','S',123),(89,2,'cam','L',24),(90,2,'đỏ','XXL',55),(91,2,'vàng','M',150),(92,2,'xám','S',295),(93,4,'hồng','XXL',24),(94,4,'xám','M',234),(95,4,'đỏ','M',7),(96,4,'tím','M',261),(97,4,'vàng','XXL',279),(98,4,'cam','XL',241),(99,4,'hồng','XXL',32),(100,4,'đỏ','M',257),(101,4,'xám','M',192),(102,4,'vàng','S',276),(103,4,'xám','XXL',45),(104,4,'xanh','XXL',296),(105,4,'tím','XXL',211),(106,4,'đỏ','XXL',193),(107,4,'vàng','S',82),(108,4,'đỏ','L',131),(109,4,'hồng','XL',147),(110,4,'xám','XXL',124),(111,4,'đỏ','L',246),(112,4,'cam','M',57),(113,4,'đỏ','XXL',9),(114,4,'hồng','XL',80),(115,4,'xanh','XXL',114),(116,4,'vàng','XXL',43),(117,4,'đỏ','S',52),(118,5,'xám','M',292),(119,5,'cam','M',10),(120,5,'tím','XXL',61),(121,5,'đỏ','XXL',57),(122,5,'tím','XL',189),(123,5,'đỏ','XL',41),(124,5,'hồng','L',292),(125,5,'tím','S',31),(126,5,'đỏ','S',272),(127,5,'xám','XL',223),(128,5,'cam','XXL',235),(129,5,'vàng','L',186),(130,5,'xám','M',130),(131,5,'đỏ','M',226),(132,5,'đỏ','M',117),(133,5,'xanh','M',252),(134,5,'tím','XXL',196),(135,5,'xám','XXL',167),(136,5,'tím','L',255),(137,5,'hồng','XXL',248),(138,5,'tím','M',8),(139,5,'tím','S',199),(140,5,'đỏ','L',62),(141,5,'xám','S',164),(142,5,'hồng','XL',56),(170,1,'đỏ','XL',40),(171,1,'hồng','S',179),(172,1,'xám','XXL',25),(173,1,'hồng','XL',163),(174,1,'cam','S',44),(175,2,'xám','S',281),(176,2,'vàng','M',270),(177,2,'cam','L',169),(178,2,'hồng','M',186),(179,2,'tím','L',120),(180,4,'hồng','M',61),(181,4,'tím','L',81),(182,4,'xám','XXL',285),(183,4,'xanh','S',221),(184,4,'tím','XXL',60),(185,5,'đỏ','XL',2),(186,5,'đỏ','XL',3),(187,5,'xanh','XXL',127),(188,5,'xám','S',151),(189,5,'xanh','S',242),(190,7,'hồng','XXL',227),(191,7,'xanh','M',214),(192,7,'hồng','M',126),(193,7,'tím','XL',96),(194,7,'tím','S',17),(195,8,'cam','S',251),(196,8,'xanh','M',118),(197,8,'tím','XXL',192),(198,8,'hồng','M',168),(199,8,'xanh','XXL',105),(200,13,'vàng','L',271),(201,13,'cam','M',233),(202,13,'tím','XL',151),(203,13,'hồng','XXL',80),(204,13,'cam','XXL',210),(205,14,'xám','L',238),(206,14,'xám','L',144),(207,14,'đỏ','S',246),(208,14,'đỏ','XL',140),(209,14,'tím','L',70),(210,3,'xám','XL',6),(211,3,'đỏ','S',84),(212,3,'tím','S',197),(213,3,'tím','XXL',13),(214,3,'xám','S',160),(233,1,'đỏ','XXL',120),(234,1,'tím','XL',195),(235,1,'vàng','XXL',53),(236,1,'vàng','S',122),(237,1,'cam','XXL',196),(238,2,'cam','S',75),(239,2,'cam','M',60),(240,2,'đỏ','L',91),(241,2,'đỏ','XL',248),(242,2,'tím','XL',240),(243,4,'xanh','S',180),(244,4,'cam','M',74),(245,4,'tím','M',137),(246,4,'hồng','XXL',234),(247,4,'đỏ','XL',274),(248,5,'tím','S',269),(249,5,'tím','L',291),(250,5,'tím','S',99),(251,5,'đỏ','M',9),(252,5,'xám','S',141),(253,7,'cam','XXL',182),(254,7,'xám','XXL',234),(255,7,'tím','XXL',253),(256,7,'xám','XL',123),(257,7,'cam','XL',293),(258,8,'xanh','L',7),(259,8,'xám','M',96),(260,8,'xám','XL',298),(261,8,'cam','S',200),(262,8,'vàng','L',163),(263,13,'tím','L',69),(264,13,'vàng','S',174),(265,13,'xám','XL',47),(266,13,'hồng','L',197),(267,13,'cam','S',88),(268,14,'đỏ','S',199),(269,14,'xanh','L',17),(270,14,'hồng','XXL',196),(271,14,'xám','XXL',165),(272,14,'tím','M',76),(273,3,'đỏ','XXL',104),(274,3,'xanh','M',253),(275,3,'vàng','M',33),(276,3,'cam','XXL',293),(277,3,'tím','XXL',296),(296,1,'tím','M',135),(297,1,'xám','L',125),(298,1,'cam','XXL',4),(299,1,'vàng','XL',210),(300,1,'tím','S',201),(301,2,'đỏ','L',144),(302,2,'hồng','S',39),(303,2,'xám','S',92),(304,2,'đỏ','M',285),(305,2,'đỏ','XXL',186),(306,4,'hồng','L',241),(307,4,'vàng','S',108),(308,4,'hồng','S',285),(309,4,'tím','S',64),(310,4,'xám','S',75),(311,5,'hồng','XL',24),(312,5,'xám','L',156),(313,5,'vàng','S',143),(314,5,'đỏ','S',4),(315,5,'xanh','M',8),(316,7,'đỏ','XL',226),(317,7,'cam','XXL',130),(318,7,'tím','L',93),(319,7,'cam','M',292),(320,7,'xanh','XXL',95),(321,8,'đỏ','L',26),(322,8,'đỏ','XXL',84),(323,8,'cam','S',273),(324,8,'vàng','M',83),(325,8,'xám','XL',171),(326,13,'đỏ','L',19),(327,13,'đỏ','XXL',156),(328,13,'cam','XL',221),(329,13,'cam','L',268),(330,13,'tím','L',159),(331,14,'vàng','S',59),(332,14,'xanh','XL',62),(333,14,'cam','S',92),(334,14,'tím','S',259),(335,14,'đỏ','L',198),(336,3,'hồng','M',85),(337,3,'hồng','L',254),(338,3,'xám','XXL',280),(339,3,'đỏ','M',187),(340,3,'đỏ','L',152),(359,1,'xanh','XXL',224),(360,1,'đỏ','M',290),(361,1,'đỏ','L',51),(362,1,'vàng','L',128),(363,1,'xám','M',109),(364,2,'hồng','S',174),(365,2,'hồng','M',157),(366,2,'cam','L',12),(367,2,'hồng','L',10),(368,2,'xanh','S',122),(369,4,'xám','XXL',201),(370,4,'vàng','XL',129),(371,4,'đỏ','S',46),(372,4,'xám','M',152),(373,4,'xanh','XXL',128),(374,5,'cam','M',119),(375,5,'đỏ','S',33),(376,5,'vàng','XL',4),(377,5,'tím','XL',21),(378,5,'tím','XXL',46),(379,7,'cam','XL',67),(380,7,'xanh','XL',223),(381,7,'hồng','M',67),(382,7,'vàng','XXL',195),(383,7,'xám','L',279),(384,8,'tím','M',229),(385,8,'xanh','L',251),(386,8,'xám','S',109),(387,8,'tím','XXL',84),(388,8,'xám','M',152),(389,13,'xám','XL',285),(390,13,'cam','S',32),(391,13,'tím','XXL',255),(392,13,'xám','XXL',23),(393,13,'hồng','XXL',290),(394,14,'xanh','L',49),(395,14,'đỏ','S',258),(396,14,'tím','M',119),(397,14,'cam','XL',81),(398,14,'tím','S',220),(399,3,'xám','M',125),(400,3,'xanh','M',221),(401,3,'cam','XL',168),(402,3,'vàng','L',239),(403,3,'cam','M',178);
/*!40000 ALTER TABLE `chitietsanpham` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `danhgia`
--

DROP TABLE IF EXISTS `danhgia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `danhgia` (
  `idDanhGia` int NOT NULL AUTO_INCREMENT,
  `MaNguoiDung` int NOT NULL,
  `tenNguoiDung` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  `MaSanPham` int NOT NULL,
  `soLuongSao` int NOT NULL DEFAULT '1',
  `noiDung` varchar(500) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  `thoiGian` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  `phanHoiQuantrivien` varchar(5000) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  PRIMARY KEY (`idDanhGia`),
  KEY `MaNguoiDung` (`MaNguoiDung`),
  KEY `MaSanPham` (`MaSanPham`),
  CONSTRAINT `danhgia_ibfk_1` FOREIGN KEY (`MaNguoiDung`) REFERENCES `nguoidung` (`MaNguoiDung`),
  CONSTRAINT `danhgia_ibfk_2` FOREIGN KEY (`MaSanPham`) REFERENCES `sanpham` (`MaSanPham`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `danhgia`
--

LOCK TABLES `danhgia` WRITE;
/*!40000 ALTER TABLE `danhgia` DISABLE KEYS */;
INSERT INTO `danhgia` VALUES (1,1,'Nguyễn Ngọc Tuấn',1,3,'Sản phẩm thật là tuyệt vời','12/2/2024','sản phẩm rất tuyệt vời'),(8,2,'Nguyễn Hữu Thắng',1,0,'sản phẩm rất rất xấu','20/12/2024','Cảm ơn bạn đã phản hồi cho chúng tôi biết'),(9,3,'Vũ Công Tốn',2,4,'sản phẩm như qq','21/12/2024','sản phẩm cũng được mà có xấu lắm âu trời'),(10,4,'Nguyễn Đào Quốc Việt',2,1,'sản phẩm chán vc nho tui muốn đổi hàng . Đề nghị shop hoàn tiền hoặc cho tui con A java web không tui sẽ tấn công nát bét cái web lỏ tật này','21/12/2024','Tui sẽ cho bạn con A hehe . Tui đố bạn dám hack đấy oke'),(11,4,'Nguyễn Đào Quốc Việt',2,1,'sản phẩm chán vc nho tui muốn đổi hàng . Đề nghị shop hoàn tiền hoặc cho tui con A java web không tui sẽ tấn công nát bét cái web lỏ tật này','21/12/2024',NULL),(12,4,'Nguyễn Đào Quốc Việt',2,1,'sản phẩm chán vc nho tui muốn đổi hàng . Đề nghị shop hoàn tiền hoặc cho tui con A java web không tui sẽ tấn công nát bét cái web lỏ tật này','21/12/2024',NULL),(13,4,'Nguyễn Đào Quốc Việt',2,5,'sản phẩm này thật là vê ny nút ','21/12/2024','Cảm ơn bạn đã phản hồi về cho shop của chúng tui , bạn thật là very nút'),(14,3,'Vũ Công Tốn',2,0,'sp như nhon nhat','21/12/2024','sản phẩm của bọn tui uy tín mà vê ny nút'),(15,2,'Nguyễn Hữu Thắng',1,0,'sản phẩm chán vc nho','21/12/2024',NULL),(16,6,'Nguyễn Văn Tiến',1,0,'sản phẩm thật nà nê ny nút','22/12/2024',NULL),(17,6,'Nguyễn Văn Tiến',1,5,'sản phẩm cháy như lửa chùa','22/12/2024','sản như nhon nhặt');
/*!40000 ALTER TABLE `danhgia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `danhmucsanpham`
--

DROP TABLE IF EXISTS `danhmucsanpham`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `danhmucsanpham` (
  `MaDanhMuc` int NOT NULL AUTO_INCREMENT,
  `TenDanhMuc` varchar(100) NOT NULL,
  PRIMARY KEY (`MaDanhMuc`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `danhmucsanpham`
--

LOCK TABLES `danhmucsanpham` WRITE;
/*!40000 ALTER TABLE `danhmucsanpham` DISABLE KEYS */;
INSERT INTO `danhmucsanpham` VALUES (1,'Nữ'),(2,'Nam'),(3,'Túi'),(4,'Giày');
/*!40000 ALTER TABLE `danhmucsanpham` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `donhang`
--

DROP TABLE IF EXISTS `donhang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `donhang` (
  `idDonHang` int NOT NULL AUTO_INCREMENT,
  `MaNguoiDung` int NOT NULL,
  `id` int NOT NULL,
  `TenKhachHang` varchar(255) NOT NULL,
  `SoDienThoai` int NOT NULL,
  `DiaChiGiaoHang` varchar(500) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `TrangThai` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  `SoLuong` int DEFAULT NULL,
  `Gia` decimal(10,2) DEFAULT NULL,
  `ngaydathang` varchar(250) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  PRIMARY KEY (`idDonHang`),
  KEY `MaNguoiDung` (`MaNguoiDung`),
  KEY `id` (`id`),
  CONSTRAINT `donhang_ibfk_1` FOREIGN KEY (`MaNguoiDung`) REFERENCES `nguoidung` (`MaNguoiDung`),
  CONSTRAINT `donhang_ibfk_2` FOREIGN KEY (`id`) REFERENCES `chitietsanpham` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `donhang`
--

LOCK TABLES `donhang` WRITE;
/*!40000 ALTER TABLE `donhang` DISABLE KEYS */;
INSERT INTO `donhang` VALUES (6,2,4,'Nguyễn Hữu Thắng',357975654,'Trường đại học công nghiệp hà nội','Đang chuẩn bị hàng',1,16.64,'14/2/2024'),(12,2,15,'Nguyễn Hữu Thắng',357975654,'Hà Nội','Đang giao đến bạn',1,17.66,'18/3/2024'),(13,3,15,'Vũ Công Tốn',376998401,'Vĩnh Phúc','Đang giao đến bạn',21,247.17,'19/4/2024'),(15,4,22,'Nguyễn Đào Quốc Việt',376998401,'Dak','Đang giao đến bạn',2,70.62,'19/5/2024'),(18,4,22,'Nguyễn Đào Quốc Việt',376998401,'Dak','Hoàn thành',3,35.31,'21/6/2024'),(19,3,22,'Vũ Công Tốn',376998401,'Vĩnh Phúc','Hoàn thành',2,70.62,'21/1/2024'),(20,3,22,'Vũ Công Tốn',376998401,'Vĩnh Phúc','đang chuẩn bị hàng',2,70.62,'21/7/2024'),(21,4,4,'Nguyễn Đào Quốc Việt',376998401,'Dak','Đang giao đến bạn',2,8.32,'21/9/2024'),(22,6,4,'Nguyễn Văn Tiến',347320177,'Hà Nội','Hoàn thành',1,16.64,'22/8/2024'),(23,6,15,'Nguyễn Văn Tiến',347320177,'Hà Nội','Hoàn thành',1,35.31,'22/10/2024'),(24,2,399,'Nguyễn Hữu Thắng',357975654,'Hà Nội','Hoàn thành',1,25.50,'23/11/2024'),(25,5,15,'Trần Đức Tâm',55725276,'Nam Định','Hoàn thành',3,105.93,'23/12/2024');
/*!40000 ALTER TABLE `donhang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `giohang`
--

DROP TABLE IF EXISTS `giohang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `giohang` (
  `idGioHang` int NOT NULL AUTO_INCREMENT,
  `MaNguoiDung` int NOT NULL,
  `id` int NOT NULL,
  `soLuong` int NOT NULL DEFAULT '1',
  `mauSac` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  `kichCo` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  `giaTien` decimal(10,2) DEFAULT NULL,
  `trangThai` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  `duongdananh` varchar(250) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  `tensanpham` varchar(250) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  PRIMARY KEY (`idGioHang`),
  KEY `MaNguoiDung` (`MaNguoiDung`),
  KEY `id` (`id`),
  CONSTRAINT `giohang_ibfk_1` FOREIGN KEY (`MaNguoiDung`) REFERENCES `nguoidung` (`MaNguoiDung`),
  CONSTRAINT `giohang_ibfk_2` FOREIGN KEY (`id`) REFERENCES `chitietsanpham` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `giohang`
--

LOCK TABLES `giohang` WRITE;
/*!40000 ALTER TABLE `giohang` DISABLE KEYS */;
INSERT INTO `giohang` VALUES (18,3,22,2,'Xanh lá','L',70.62,'True','images/product-02.jpg','Herschel Supply'),(19,2,15,2,'Đen','M',70.62,'True','images/product-02.jpg','Herschel Supply'),(21,4,22,2,'Xanh lá','L',70.62,'True','images/product-02.jpg','Herschel Supply'),(22,6,4,1,'Đen','M',16.64,'True','images/product-01.jpg','Esprit Ruffle Shirt'),(23,5,15,3,'Đen','M',105.93,'True','images/product-02.jpg','Herschel Supply');
/*!40000 ALTER TABLE `giohang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `khuyenmai`
--

DROP TABLE IF EXISTS `khuyenmai`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `khuyenmai` (
  `maKhuyeMai` varchar(250) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `noiDungKhuyenMai` varchar(500) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  `phanTramKhuyenMai` float DEFAULT NULL,
  `MaSanPham` int DEFAULT NULL,
  PRIMARY KEY (`maKhuyeMai`),
  KEY `fk_MaSanPham` (`MaSanPham`),
  CONSTRAINT `fk_MaSanPham` FOREIGN KEY (`MaSanPham`) REFERENCES `sanpham` (`MaSanPham`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `khuyenmai`
--

LOCK TABLES `khuyenmai` WRITE;
/*!40000 ALTER TABLE `khuyenmai` DISABLE KEYS */;
INSERT INTO `khuyenmai` VALUES ('Lophocjava','Khuyến mãi 20%',0.2,7),('Lophocjavaa','khuyến mãi 50%',0.5,1);
/*!40000 ALTER TABLE `khuyenmai` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nguoidung`
--

DROP TABLE IF EXISTS `nguoidung`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nguoidung` (
  `MaNguoiDung` int NOT NULL AUTO_INCREMENT,
  `TenDangNhap` varchar(50) NOT NULL,
  `MatKhau` varchar(255) NOT NULL,
  `HoTen` varchar(100) DEFAULT NULL,
  `Email` varchar(100) DEFAULT NULL,
  `SoDienThoai` varchar(15) DEFAULT NULL,
  `MaQuyen` int NOT NULL,
  `DiaChi` varchar(255) DEFAULT NULL,
  `trangThai` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  PRIMARY KEY (`MaNguoiDung`),
  UNIQUE KEY `TenDangNhap` (`TenDangNhap`),
  UNIQUE KEY `Email` (`Email`),
  KEY `MaQuyen` (`MaQuyen`),
  CONSTRAINT `nguoidung_ibfk_1` FOREIGN KEY (`MaQuyen`) REFERENCES `quyen` (`MaQuyen`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nguoidung`
--

LOCK TABLES `nguoidung` WRITE;
/*!40000 ALTER TABLE `nguoidung` DISABLE KEYS */;
INSERT INTO `nguoidung` VALUES (1,'tuanne','ae89faa84e88fce51d7af8bd2c16227946ef6290e148876685c1b888f4cd58e0','Nguyễn Ngọc Tuấn','tuanne2542004@gmail.com','376998401',1,'Hà Nội','True'),(2,'thangne','ef797c8118f02dfb649607dd5d3f8c7623048c9c063d532cc95c5ed7a898a64f','Nguyễn Hữu Thắng','thangne123@gmail.com','0357975654',3,'Hà Nội','True'),(3,'tonne','ef797c8118f02dfb649607dd5d3f8c7623048c9c063d532cc95c5ed7a898a64f','Vũ Công Tốn','vucongton12345@gmail.com','0376998401',3,'Vĩnh Phúc','True'),(4,'vietne','ef797c8118f02dfb649607dd5d3f8c7623048c9c063d532cc95c5ed7a898a64f','Nguyễn Đào Quốc Việt','vietlo12345678@gmail.com','0376998401',3,'Dak','True'),(5,'tamne','ef797c8118f02dfb649607dd5d3f8c7623048c9c063d532cc95c5ed7a898a64f','Trần Đức Tâm','tamne12345678@gmail.com','055725276',3,'Nam Định','True'),(6,'tienne','ef797c8118f02dfb649607dd5d3f8c7623048c9c063d532cc95c5ed7a898a64f','Nguyễn Văn Tiến','tienne2542004@gmail.com','0347320177',3,'Hà Nội','True');
/*!40000 ALTER TABLE `nguoidung` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `quyen`
--

DROP TABLE IF EXISTS `quyen`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `quyen` (
  `MaQuyen` int NOT NULL AUTO_INCREMENT,
  `TenQuyen` varchar(50) NOT NULL,
  `moTa` varchar(500) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  PRIMARY KEY (`MaQuyen`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `quyen`
--

LOCK TABLES `quyen` WRITE;
/*!40000 ALTER TABLE `quyen` DISABLE KEYS */;
INSERT INTO `quyen` VALUES (1,'Quản trị viên','Có quyền kiểm soát toàn bộ hệ thống của trang web'),(3,'Khách hàng','Có quyền sử dụng các dịch vụ hoặc chức năng mà trang web cung cấp');
/*!40000 ALTER TABLE `quyen` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sanpham`
--

DROP TABLE IF EXISTS `sanpham`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sanpham` (
  `MaSanPham` int NOT NULL AUTO_INCREMENT,
  `TenSanPham` varchar(100) NOT NULL,
  `Gia` decimal(10,2) NOT NULL,
  `MoTa` text,
  `MaDanhMuc` int DEFAULT NULL,
  `DuongDanAnh` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`MaSanPham`),
  KEY `MaDanhMuc` (`MaDanhMuc`),
  CONSTRAINT `sanpham_ibfk_1` FOREIGN KEY (`MaDanhMuc`) REFERENCES `danhmucsanpham` (`MaDanhMuc`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sanpham`
--

LOCK TABLES `sanpham` WRITE;
/*!40000 ALTER TABLE `sanpham` DISABLE KEYS */;
INSERT INTO `sanpham` VALUES (1,'Esprit Ruffle Shirt',16.64,'Ruffle shirt from Esprit',1,'images/product-01.jpg'),(2,'Herschel Supply',35.31,'Herschel Supply Bag',1,'images/product-02.jpg'),(3,'Only Check Trouser',25.50,'Only checkered trousers',2,'images/product-03.jpg'),(4,'Classic Trench Coat',75.00,'Classic trench coat for cold weather',1,'images/product-04.jpg'),(5,'Front Pocket Jumper',34.75,'Jumper with front pocket',1,'images/product-05.jpg'),(7,'Shirt in Stretch Cotton',52.66,'Stretch cotton shirt',1,'images/product-07.jpg'),(8,'Pieces Metallic Printed',18.96,'Metallic printed pieces',1,'images/product-08.jpg'),(13,'Áo nữ phong cách ',55.00,'Ảnh gái đẹp phong cách',1,'images/anhbaiviet.jpg'),(14,'Áo giá xinh đẹp ',55.00,'Gái đẹp mặc gì cũng đẹp',1,'images/gallery-09.jpg'),(16,'Giày du mục',55.00,'Giày du mục',4,'images/product-09.jpg');
/*!40000 ALTER TABLE `sanpham` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-12-24 20:16:31
