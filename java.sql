-- MySQL dump 10.13  Distrib 8.0.23, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: java
-- ------------------------------------------------------
-- Server version	8.0.23

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
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `category` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Name` text NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` VALUES (1,'Cafe'),(2,'Nước ép'),(3,'Mojito'),(4,'Nước giải khát'),(5,'Tequila'),(6,'nước'),(7,'nước 2');
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `desk`
--

DROP TABLE IF EXISTS `desk`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `desk` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Name` text NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `desk`
--

LOCK TABLES `desk` WRITE;
/*!40000 ALTER TABLE `desk` DISABLE KEYS */;
INSERT INTO `desk` VALUES (1,'Bàn A1'),(2,'Bàn B12');
/*!40000 ALTER TABLE `desk` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `login` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Username` text NOT NULL,
  `Password` text NOT NULL,
  `Name` text NOT NULL,
  `Level` text NOT NULL,
  `Phone` varchar(10) DEFAULT NULL,
  `Email` varchar(100) DEFAULT NULL,
  `Sex` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` VALUES (1,'admin','admin','Tien','1',NULL,NULL,NULL),(2,'test','test','Tien Test','2',NULL,NULL,NULL),(3,'test1','test1','test','2',NULL,NULL,NULL),(4,'admin1','admin1','Tien ne','4',NULL,NULL,NULL),(7,'anh','anh','aloalo','3',NULL,NULL,NULL),(8,'wangk','123456','Nguyễn Nhựt Quang','2','0356809728','n.nquanght@gmail.com','Nam');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Name` text NOT NULL,
  `Price` double NOT NULL,
  `CategoryID` int NOT NULL,
  `Quantity` int NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `CategoryID` (`CategoryID`),
  CONSTRAINT `product_ibfk_1` FOREIGN KEY (`CategoryID`) REFERENCES `category` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=69 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES (1,'Bạc Xỉu',38000,1,10),(2,'Cafe Cappucino',50000,1,10),(15,'Cafe Espresso',40000,1,10),(16,'Cafe Latte',45000,1,14),(17,'Cafe Mocha',45000,1,30),(20,'Cafe Phin',30000,1,20),(21,'Cafe Sữa',35000,1,10),(22,'Mojito Blue',55000,3,10),(23,'Mojito Đào',70000,3,10),(24,'Mojito Kiwi Mint',70000,3,10),(25,'Mojito Phúc Bồn Tử',60000,3,10),(26,'Mojito Việt Quất',65000,3,10),(27,'Nước ép bơ',45000,2,10),(28,'Nước ép cam',45000,2,10),(29,'Nước ép dưa hấu',40000,2,10),(30,'Nước ép dừa',35000,2,10),(31,'Nước ép nho',30000,2,10),(32,'Nước ép xoài',40000,2,20),(33,'7 Up',15000,4,20),(34,'Coca cola',20000,4,20),(35,'Fanta',20000,4,20),(36,'Pepsi',18000,4,20),(37,'Redbull',30000,4,20),(38,'Sting',20000,4,20),(39,'Twister',25000,4,20),(40,'Warrior',25000,4,20),(55,'Tequila Acapulco',65000,5,15),(61,'Tequila Brave Bull',69000,5,10),(62,'Tequila Margarita',60000,5,5),(63,'Tequila Olé',55000,5,30),(64,'Tequila Paloma',60000,5,35),(65,'Tequila Sunrise',60000,5,40);
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `receipt`
--

DROP TABLE IF EXISTS `receipt`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `receipt` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Date` text NOT NULL,
  `Detail` text NOT NULL,
  `Total` int NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `receipt`
--

LOCK TABLES `receipt` WRITE;
/*!40000 ALTER TABLE `receipt` DISABLE KEYS */;
INSERT INTO `receipt` VALUES (14,'10:28 26-04-2021 ','Cafe Phin_1_30000.0,Cafe Sữa_3_35000.0,Bạc Xỉu_2_38000.0,Cafe Mocha_4_45000.0,',391000),(15,'10:46 26-04-2021 ','Cafe Cappucino_1_50000.0,Bạc Xỉu_4_38000.0,Cafe Sữa_1_35000.0,',237000),(18,'10:47 26-04-2021 ','Cafe Sữa_1_35000.0,Bạc Xỉu_2_38000.0,Cafe Mocha_1_45000.0,Cafe Latte_1_45000.0,',201000),(19,'10:47 26-04-2021 ','Cafe Phin_2_30000.0,Cafe Latte_2_45000.0,Cafe Mocha_2_45000.0,',240000);
/*!40000 ALTER TABLE `receipt` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-04-26 13:02:52
