-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: biblioteca
-- ------------------------------------------------------
-- Server version	9.0.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `EDITORIALES`
--

DROP TABLE IF EXISTS `EDITORIALES`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `EDITORIALES` (
  `COD_EDITORIAL` int NOT NULL,
  `NOMBRE_EDITORIAL` varchar(20) NOT NULL,
  `SEDE_SOCIAL` varchar(40) DEFAULT NULL,
  `TIPO` varchar(3) NOT NULL,
  PRIMARY KEY (`COD_EDITORIAL`),
  CONSTRAINT `CK_TIPO_ED` CHECK ((`TIPO` in (_utf8mb4'SL',_utf8mb4'SA',_utf8mb4'SM')))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `EDITORIALES`
--

LOCK TABLES `EDITORIALES` WRITE;
/*!40000 ALTER TABLE `EDITORIALES` DISABLE KEYS */;
INSERT INTO `EDITORIALES` VALUES (1,'PUZZLE','Av. Juan Carlos I Madrid','SL'),(2,'DEBATE','c/ Guzmán el Bueno n. 25 Madrid','SA'),(3,'PLANETA','Av. Diagonal 38 Barcelona','SL'),(4,'PLAZA  JANES','c/ Miguel de Cervantes 21 Madrid','SA'),(5,'MINOTAURO','Av de las Américas 22 Valencia','SA');
/*!40000 ALTER TABLE `EDITORIALES` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ESCRITORES`
--

DROP TABLE IF EXISTS `ESCRITORES`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ESCRITORES` (
  `COD_ESCRITOR` int NOT NULL,
  `NOMBRE_ESCRITOR` varchar(30) NOT NULL,
  `PAIS` varchar(20) DEFAULT NULL,
  `FECHA_NACIMIENTO` date DEFAULT NULL,
  PRIMARY KEY (`COD_ESCRITOR`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ESCRITORES`
--

LOCK TABLES `ESCRITORES` WRITE;
/*!40000 ALTER TABLE `ESCRITORES` DISABLE KEYS */;
INSERT INTO `ESCRITORES` VALUES (1,'Anthony ONeill','Australia','1968-09-14'),(2,'Juan Jesús Vallejo','España','1968-12-14'),(3,'Juan Antonio Cebrián','España','1965-06-12'),(4,'Jack McDevitt','USA','1961-02-11'),(5,'Stphen Baxter','USA','1959-04-11'),(6,'Alejandro Dumas','Francia','1824-04-17'),(7,'Thomas Harris','USA','1953-08-05'),(8,'Gary Jennings','USA','1929-01-12'),(9,'Vernor Vinge','USA','1957-11-30'),(10,'Frank Baer','Alemania','1962-01-03'),(11,'Ken Follet','USA','1950-11-14'),(12,'Peter Hamiltong','USA','1965-04-11'),(13,'Harper Lee','USA','1902-08-21'),(14,'Kim Stanley Robinson','USA','1962-11-21'),(15,'Christian Jacq','Francia','1947-02-08'),(16,'Greg Illes','Alemania','1962-12-02'),(17,'Gore Vidal','USA','1924-04-17'),(18,'Dino Buzzati','Italia','1906-03-11'),(19,'Jack Daniels','USA','1874-11-13');
/*!40000 ALTER TABLE `ESCRITORES` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `LIBROS`
--

DROP TABLE IF EXISTS `LIBROS`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `LIBROS` (
  `COD_LIBRO` int NOT NULL,
  `NOMBRE_LIBRO` varchar(40) NOT NULL,
  `NUMERO_PAGINAS` int DEFAULT NULL,
  `TEMA` varchar(40) DEFAULT NULL,
  `AUTOR` int NOT NULL,
  `EDITORIAL` int NOT NULL,
  PRIMARY KEY (`COD_LIBRO`),
  KEY `FK_AUTOR_LIB` (`AUTOR`),
  KEY `FK_EDITORIAL_LIB` (`EDITORIAL`),
  CONSTRAINT `FK_AUTOR_LIB` FOREIGN KEY (`AUTOR`) REFERENCES `ESCRITORES` (`COD_ESCRITOR`),
  CONSTRAINT `FK_EDITORIAL_LIB` FOREIGN KEY (`EDITORIAL`) REFERENCES `EDITORIALES` (`COD_EDITORIAL`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `LIBROS`
--

LOCK TABLES `LIBROS` WRITE;
/*!40000 ALTER TABLE `LIBROS` DISABLE KEYS */;
INSERT INTO `LIBROS` VALUES (1,'Sherezade',572,'Histórica',1,1),(2,'Enigmas del antiguo Egipto',130,'Ensayo',2,1),(3,'PsicoKillers asesinos sin alma',123,'Ensayo',3,1),(4,'Las máquinas de dios',430,'Ciencia Ficción',4,1),(5,'Luz de otros dias',410,'Ciencia Ficción',5,1),(6,'Los tres mosqueteros',410,'Novela',6,2),(7,'Veinte años después',430,'Novela',6,2),(8,'El vizconde de Bragelonne',570,'Novela',6,2),(9,'El Conde de Montecristo',830,'Novela',6,2),(10,'La mano del Muerto',360,'Novela',6,2),(11,'La reina Margarita',470,'Novela',6,2),(12,'La dama de las camelias',170,'Novela',6,2),(13,'Capitán de lobos',280,'Novela',6,2),(14,'El dragón rojo',370,'Novela',7,2),(15,'El silencio de los corderos',320,'Novela',7,2),(16,'Hannibal',290,'Novela',7,2),(17,'Azteca',770,'Novela',8,3),(18,'El viajero',790,'Novela',8,3),(19,'Lentejuelas',710,'Novela',8,3),(20,'Halcón',770,'Novela',8,3),(21,'Otoño azteca',270,'Novela',8,3),(22,'Sangre azteca',476,'Novela',8,3),(23,'Un abismo en el cielo',474,'Ciencia Ficción',9,4),(24,'Un fuego en el abismo',374,'Ciencia Ficción',9,4),(25,'El puente de Alcántara',542,'Novela Histórica',10,4),(26,'Los pilares de la Tierra',524,'Novela',11,4),(27,'Vuelo final',450,'Novela',11,4),(28,'La caida del dragón',490,'Ciancia Ficción',12,4),(29,'Matar un ruiseñor',360,'Novela',13,4),(30,'Marte rojo',450,'Ciencia Ficción',14,5),(31,'Marte verde',480,'Ciencia Ficción',14,5),(32,'Marte azul',520,'Ciencia Ficción',14,5),(33,'El juez de Egipto',550,'Novela Histórica',15,5),(34,'La reina sol',210,'Novela Histórica',15,5),(35,'El prisionero de Spandau',540,'Novela',16,5),(36,'Creación',450,'Novela Histórica',17,5),(37,'Juliano el apóstata',360,'Novela Histórica',17,5),(38,'El desierto de los tártaros',251,'Novela',18,5);
/*!40000 ALTER TABLE `LIBROS` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'biblioteca'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-01-22 21:28:38
