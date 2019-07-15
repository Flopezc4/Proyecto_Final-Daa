-- MySQL dump 10.13  Distrib 8.0.15, for Win64 (x86_64)
--
-- Host: localhost    Database: proyecto_productos
-- ------------------------------------------------------
-- Server version	8.0.15

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `productos`
--

DROP TABLE IF EXISTS `productos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `productos` (
  `Codigo` int(11) NOT NULL AUTO_INCREMENT,
  `producto` varchar(60) NOT NULL,
  `lubba` varchar(60) DEFAULT NULL,
  `caserita` varchar(60) DEFAULT NULL,
  `mayorista` varchar(60) DEFAULT NULL,
  `pacifico` varchar(60) DEFAULT NULL,
  `valor` int(11) DEFAULT NULL,
  PRIMARY KEY (`Codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=91 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productos`
--

LOCK TABLES `productos` WRITE;
/*!40000 ALTER TABLE `productos` DISABLE KEYS */;
INSERT INTO `productos` VALUES (1,'Agua Cachantún 1/2 c/gas','2160','2450','3120','2630',4200),(2,'Agua Cachantún 1/2 s/gas','2160','2450','3120','3120',4200),(3,'Agua Cachantún 1.6 c/gas','3600','3550','3810','3770',5400),(4,'Agua Cachantún 1.6 s/gas','3600','3550','3810','3770',5400),(5,'Agua Mas Uva 1/2','3210','3050','3348','3110',4800),(6,'Agua Mas Limón 1/2 s/gas','3210','3050','3348','3110',4800),(7,'Agua Mas Citrus 1/2','3210','3050','3348','3110',4800),(8,'Agua Mas Manzana 1/2','3210','3050','3348','3110',4800),(9,'Agua Mas Pera 1/2','3210','3050','3348','3110',4800),(10,'Agua Mas Naranja/Durazno 1/2','3210','3050','3348','3110',4800),(11,'Agua Mas Granada 1/2','3210','3050','3348','3110',4800),(12,'Agua Mas Limón Naranja 1/2','3210','3050','3348','3110',4800),(13,'Agua Woman Frutos del Bosque 1/2','3210','3050','3348','3110',4800),(14,'Agua Woman Limón Jengibre 1/2','3210','3050','3348','3110',4800),(15,'Agua Mas 1.6 Citrus','4820','4732','4662','4920',7200),(16,'Agua Mas 1.6 Manzana','4820','4732','4662','4920',7200),(17,'Agua Mas 1.6 Granada','4820','4732','4662','4920',7200),(18,'Agua Mas 1.6 Uva','4820','4732','4662','4920',7200),(19,'Jugo Watts 1.6 Naranja','5560','5680','5454','5760',7740),(20,'Jugo Watts 1.6 Durazno','5560','5680','5454','5760',7740),(21,'Jugo Watts 1.6 Piña','5560','5680','5454','5760',7740),(22,'Jugo Watts 1.6 Frutilla','5560','5680','5454','5760',7740),(23,'Jugo Watts 1.6 Arandano','5560','5680','5454','5760',7740),(24,'Jugo Watts Boca Ancha 300m Frutilla','3250','3350','3126','3320',4500),(25,'Jugo Watts Boca Ancha 300m Durazno','3250','3350','3126','3320',4500),(26,'Agua Vital 1/2 c/gas','2350','2300','2460','2100',4200),(27,'Agua Vital 1/2 s/gas','2350','2300','2460','2100',4200),(28,'Agua Vital 1.5 c/gas','3850','3810','3760','3660',5400),(29,'Agua Vital 1.5 s/gas','3850','3810','3760','3660',5400),(30,'Agua Purificada 20Lt. Retornable','6200','6500','6000','6150',12000),(31,'Agua Purificada 10Lt. Retornable','3450','3200','3000','3150',6000),(32,'Agua Purificada 6Lt. Desechable','5100','4950','4800','5000',7200),(33,'Bebida Mini Bilz','2210','2350','2094','2190',2700),(34,'Bebida Mini Pap','2210','2350','2094','2190',2700),(35,'Bebida Mini Kem Piña','2210','2350','2094','2190',2700),(36,'Bebida Mini Limón Soda','2210','2350','2094','2190',2700),(37,'Bebida Mini Pepsi','2210','2350','2094','2190',2700),(38,'Bebida Mini Orange Crush','2210','2350','2094','2190',2700),(39,'Bebida 1/2 Limón Soda','3420','3350','3300','3560',5100),(40,'Bebida 1/2 Orange Crush','3420','3350','3300','3560',5100),(41,'Bebida 1/2 Kem Piña','3420','3350','3300','3560',5100),(42,'Bebida 1/2 Pap','3420','3350','3300','3560',5100),(43,'Bebida 1/2 Bilz','3420','3350','3300','3560',5100),(44,'Bebida 1.75 Kem Piña','4770','4830','4620','4720',6000),(45,'Bebida 1.75 Orange Crush','4770','4830','4620','4720',6000),(46,'Bebida 1.75 Bilz','4770','4830','4620','4720',6000),(47,'Bebida 1.75 Pap','4770','4830','4620','4720',6000),(48,'Bebida 1.75 Limón Soda','4770','4830','4620','4720',6000),(50,'Bebida 2.0 Zero Bilz','4950','5000','4800','4900',7200),(51,'Bebida 2.0 Zero Pap','4950','5000','4800','4900',7200),(52,'Bebida 2.0 Zero Kem Piña','4950','5000','4800','4900',7200),(53,'Bebida 2.0 Zero Limón Soda','4950','5000','4800','4900',7200),(54,'Bebida 2.0 Zero Seven Up','4950','5000','4800','4900',7200),(55,'Bebida 1.5 Coca Cola','6850','6820','6750','6606',7500),(56,'Bebida 1.5 Fanta','6830','6800','6700','6600',7500),(57,'Bebida 1.5 Sprite','6830','6800','6700','6600',7500),(58,'Bebida 1/2 Coca Cola','3910','3950','4120','3822',5100),(59,'Bebida 1/2 Fanta','3910','3950','4120','3822',5100),(60,'Bebida 1/2 Sprite','3910','3950','4120','3822',5100),(61,'Bebida 3Lt. Coca Cola','9390','9420','9350','9288',12600),(62,'Bebida 3Lt. Pepsi','9390','9420','9350','9288',12600),(63,'Bebida 3Lt. Limón Soda','9390','9420','9350','9288',12600),(64,'Bebida 3Lt. Pap','9390','9420','9350','9288',12600),(65,'Bebida 3Lt. Kem Piña','9390','9420','9350','9288',12600),(66,'Bebida Mini Coca Cola','2160','2340','2200','2320',2820),(67,'Bebida Mini Fanta','2160','2340','2200','2320',2820),(68,'Bebida Mini Sprite','2160','2340','2200','2320',2820),(69,'Jugo Love Limón ','4900','4890','4682','4760',9540),(70,'Jugo Love Limón Light','4900','4890','4682','4760',9540),(71,'Jugo Love Limón Naranja','4900','4890','4682','4760',9540),(72,'Aloe Vera 500ml Original','4700','4650','4500','4830',7200),(73,'Aloe Vera 500ml Piña','4700','4650','4500','4830',7200),(74,'Aloe Vera 500ml Sandía','4700','4650','4500','4830',7200),(75,'Aloe Vera 500ml Frutilla','4700','4650','4500','4830',7200),(76,'Aloe Vera 500ml Ponche de Fruta','4700','4650','4500','4830',7200),(77,'Aloe Vera 500ml Granada','4700','4650','4500','4830',7200),(78,'Red Bull 250ml','5990','5890','5760','6300',9540),(79,'Red Bull 355ml','7390','7220','7194','7360',11340),(80,'Monster 355ml Verde','7420','7350','7200','7310',11340),(81,'Monster 355ml Azul','7420','7350','7200','7310',11340),(82,'Kem Extrem AM 355ml','4240','4120','4014','4350',5940),(83,'Kem Extrem PM 355ml','4240','4120','4014','4350',5940),(84,'Kapo Piña ','1230','1320','1240','1170',1500),(85,'Kapo Frambuesa','1230','1320','1240','1170',1500),(86,'Kapo Naranja','1230','1320','1240','1170',1500),(87,'Kapo Manzana','1230','1320','1240','1170',1500),(88,'Refresh Kid Piña','690','720','600','830',1200),(89,'Refresh Kid Naranja','690','720','600','830',1200),(90,'Refresh Kid Manzana','690','720','600','830',1200);
/*!40000 ALTER TABLE `productos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-07-15 19:47:43
