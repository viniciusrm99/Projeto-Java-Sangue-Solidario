-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: sangue_solidario
-- ------------------------------------------------------
-- Server version	8.2.0

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
-- Table structure for table `tb_agendamento`
--

DROP TABLE IF EXISTS `tb_agendamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_agendamento` (
  `id_agendamento` int NOT NULL AUTO_INCREMENT,
  `hospital` varchar(255) DEFAULT NULL,
  `data_doacao` varchar(40) DEFAULT NULL,
  `hora_doacao` varchar(40) DEFAULT NULL,
  `observacao` varchar(255) DEFAULT NULL,
  `doador_id` int DEFAULT NULL,
  PRIMARY KEY (`id_agendamento`),
  KEY `fk_doador_id` (`doador_id`),
  CONSTRAINT `fk_doador_id` FOREIGN KEY (`doador_id`) REFERENCES `tb_doadores` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=113 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_agendamento`
--

LOCK TABLES `tb_agendamento` WRITE;
/*!40000 ALTER TABLE `tb_agendamento` DISABLE KEYS */;
INSERT INTO `tb_agendamento` VALUES (64,'Mayo Clinic Rochester','2024-06-01','08:00','Tem tatuagem recente',1),(84,'Hospital Israelita Albert Einstein','2024-06-02','09:00','Colocou brinco recentemente',2),(85,'Massachusetts General Hospital','2024-06-03','10:00','Fez piercing recentemente',3),(86,'Cleveland Clinic','2024-06-04','11:00','Teve febre recentemente',4),(87,'The Mount Sinai Hospital','2024-06-05','12:00','Está tomando antibióticos',5),(88,'Mayo Clinic Rochester','2024-06-06','13:00','Doou sangue há menos de 3 meses',6),(89,'Hospital Israelita Albert Einstein','2024-06-07','14:00','Teve gripe recentemente',27),(90,'Massachusetts General Hospital','2024-06-08','15:00','Fez cirurgia recente',8),(91,'Cleveland Clinic','2024-06-09','16:00','Está grávida',9),(92,'The Mount Sinai Hospital','2024-06-10','17:00','Fez endoscopia recentemente',10),(93,'Mayo Clinic Rochester','2024-06-11','08:30','Está amamentando',11),(94,'Hospital Israelita Albert Einstein','2024-06-12','09:30','Teve hepatite recentemente',12),(95,'Massachusetts General Hospital','2024-06-13','10:30','Teve malária',13),(96,'Cleveland Clinic','2024-06-14','11:30','Tomou vacina recentemente',14),(97,'The Mount Sinai Hospital','2024-06-15','12:30','Fez viagem internacional recente',15),(98,'Mayo Clinic Rochester','2024-06-16','13:30','Tem pressão alta',16),(99,'Hospital Israelita Albert Einstein','2024-06-17','14:30','Teve dengue recentemente',17),(100,'Massachusetts General Hospital','2024-06-18','15:30','Está com anemia',18),(101,'Cleveland Clinic','2024-06-19','16:30','Está com baixo peso',19),(102,'The Mount Sinai Hospital','2024-06-20','17:30','Está em jejum prolongado',20),(107,'Mayo Clinic Rochester','2024-06-01','08:00','Tem DST',27),(112,'Massachusetts General Hospital','2024-06-01','09:30','Recentemente fez uma tatuagem',1);
/*!40000 ALTER TABLE `tb_agendamento` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-28 19:53:54
