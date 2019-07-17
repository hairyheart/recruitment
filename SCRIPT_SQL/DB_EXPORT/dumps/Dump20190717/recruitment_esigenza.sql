-- MySQL dump 10.13  Distrib 8.0.16, for Win64 (x86_64)
--
-- Host: localhost    Database: recruitment
-- ------------------------------------------------------
-- Server version	8.0.16

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
-- Table structure for table `esigenza`
--

DROP TABLE IF EXISTS `esigenza`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `esigenza` (
  `idesigenza` int(11) NOT NULL AUTO_INCREMENT,
  `num_risorse` int(11) NOT NULL,
  `data_inizio` date NOT NULL,
  `data_fine` date DEFAULT NULL,
  `tipologia` varchar(50) NOT NULL,
  `idtiporisorse` int(11) NOT NULL,
  `idutente` int(11) NOT NULL,
  `idbu` int(11) NOT NULL,
  PRIMARY KEY (`idesigenza`),
  KEY `fk_tiporisorse_idx` (`idtiporisorse`),
  KEY `fk_bu_idx` (`idbu`),
  KEY `fk_utente_idx` (`idutente`),
  CONSTRAINT `fk_bu` FOREIGN KEY (`idbu`) REFERENCES `bu` (`idbu`),
  CONSTRAINT `fk_tiporisorse` FOREIGN KEY (`idtiporisorse`) REFERENCES `tipo_risorse` (`idtiporisorse`),
  CONSTRAINT `fk_utente` FOREIGN KEY (`idutente`) REFERENCES `utente` (`idutente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `esigenza`
--

LOCK TABLES `esigenza` WRITE;
/*!40000 ALTER TABLE `esigenza` DISABLE KEYS */;
/*!40000 ALTER TABLE `esigenza` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-07-17 12:27:17
