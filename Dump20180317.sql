CREATE DATABASE  IF NOT EXISTS `pbd` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `pbd`;
-- MySQL dump 10.13  Distrib 5.7.21, for Linux (x86_64)
--
-- Host: 127.0.0.1    Database: pbd
-- ------------------------------------------------------
-- Server version	5.5.5-10.1.30-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Administrador`
--

DROP TABLE IF EXISTS `Administrador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Administrador` (
  `id` int(11) NOT NULL,
  `cpf` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `senha` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_ha4dbmq5cu6ay8xwfccc6j9cx` (`cpf`),
  UNIQUE KEY `UK_ft2u4cddw1050lj706mf5cafq` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Administrador`
--

LOCK TABLES `Administrador` WRITE;
/*!40000 ALTER TABLE `Administrador` DISABLE KEYS */;
/*!40000 ALTER TABLE `Administrador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Aluno`
--

DROP TABLE IF EXISTS `Aluno`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Aluno` (
  `id` int(11) NOT NULL,
  `codigo` int(11) NOT NULL,
  `cpf` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `endereco` varchar(255) DEFAULT NULL,
  `matricula` int(11) NOT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `senha` varchar(255) DEFAULT NULL,
  `telefone_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_g6otv1ccqwf8a15re4tc1sr9q` (`cpf`),
  UNIQUE KEY `UK_o02ktdmvvw11l6g24qsw4mio4` (`email`),
  KEY `FKb4l8a5j4i6gwyqen4ooxeolpe` (`telefone_id`),
  CONSTRAINT `FKb4l8a5j4i6gwyqen4ooxeolpe` FOREIGN KEY (`telefone_id`) REFERENCES `Telefone` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Aluno`
--

LOCK TABLES `Aluno` WRITE;
/*!40000 ALTER TABLE `Aluno` DISABLE KEYS */;
INSERT INTO `Aluno` VALUES (4,0,'1','v@v.com','António Peréira',0,'André','1',5),(6,0,'2','1v@v.com','Antonio',0,'Vinícius','1',7),(8,0,'3','2v@v.com','Antonio',0,'Carol','1',9),(10,0,'4','3v@v.com','Antonio',0,'Jose','1',11),(12,0,'5','4v@v.com','Antonio',0,'Wedson','1',13),(28,0,'6','swewwew','endere',0,'vc','sdsdsd',29);
/*!40000 ALTER TABLE `Aluno` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Curso`
--

DROP TABLE IF EXISTS `Curso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Curso` (
  `id` int(11) NOT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `coordenador_id` int(11) DEFAULT NULL,
  `depatamento_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKoiwvfutynt0fxsm9knb73adp8` (`coordenador_id`),
  KEY `FKnqs7nhjtf4p9n7sanlyu7lykf` (`depatamento_id`),
  CONSTRAINT `FKnqs7nhjtf4p9n7sanlyu7lykf` FOREIGN KEY (`depatamento_id`) REFERENCES `Departamento` (`id`),
  CONSTRAINT `FKoiwvfutynt0fxsm9knb73adp8` FOREIGN KEY (`coordenador_id`) REFERENCES `Professor` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Curso`
--

LOCK TABLES `Curso` WRITE;
/*!40000 ALTER TABLE `Curso` DISABLE KEYS */;
/*!40000 ALTER TABLE `Curso` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Curso_Disciplina`
--

DROP TABLE IF EXISTS `Curso_Disciplina`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Curso_Disciplina` (
  `Curso_id` int(11) NOT NULL,
  `disciplina_id` int(11) NOT NULL,
  UNIQUE KEY `UK_ta8riobxapllws7v5p0i8fpmr` (`disciplina_id`),
  KEY `FK5u0oq7h0m7fy1rnrsmdqrncpd` (`Curso_id`),
  CONSTRAINT `FK5u0oq7h0m7fy1rnrsmdqrncpd` FOREIGN KEY (`Curso_id`) REFERENCES `Curso` (`id`),
  CONSTRAINT `FKlm07j9jsdjlau8kphiu8u1g0t` FOREIGN KEY (`disciplina_id`) REFERENCES `Disciplina` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Curso_Disciplina`
--

LOCK TABLES `Curso_Disciplina` WRITE;
/*!40000 ALTER TABLE `Curso_Disciplina` DISABLE KEYS */;
/*!40000 ALTER TABLE `Curso_Disciplina` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Departamento`
--

DROP TABLE IF EXISTS `Departamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Departamento` (
  `id` int(11) NOT NULL,
  `nome` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Departamento`
--

LOCK TABLES `Departamento` WRITE;
/*!40000 ALTER TABLE `Departamento` DISABLE KEYS */;
/*!40000 ALTER TABLE `Departamento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Disciplina`
--

DROP TABLE IF EXISTS `Disciplina`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Disciplina` (
  `id` int(11) NOT NULL,
  `carga_horaririo` int(11) NOT NULL,
  `nome` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Disciplina`
--

LOCK TABLES `Disciplina` WRITE;
/*!40000 ALTER TABLE `Disciplina` DISABLE KEYS */;
INSERT INTO `Disciplina` VALUES (1,60,'Goku'),(2,60,'Gohan'),(3,60,'Trunks');
/*!40000 ALTER TABLE `Disciplina` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Falta`
--

DROP TABLE IF EXISTS `Falta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Falta` (
  `id` int(11) NOT NULL,
  `data` date DEFAULT NULL,
  `falta` bit(1) NOT NULL,
  `justificado` bit(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Falta`
--

LOCK TABLES `Falta` WRITE;
/*!40000 ALTER TABLE `Falta` DISABLE KEYS */;
/*!40000 ALTER TABLE `Falta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Nota`
--

DROP TABLE IF EXISTS `Nota`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Nota` (
  `id` int(11) NOT NULL,
  `nota` float NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Nota`
--

LOCK TABLES `Nota` WRITE;
/*!40000 ALTER TABLE `Nota` DISABLE KEYS */;
/*!40000 ALTER TABLE `Nota` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Professor`
--

DROP TABLE IF EXISTS `Professor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Professor` (
  `id` int(11) NOT NULL,
  `coordenador` bit(1) NOT NULL,
  `cpf` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `endereco` varchar(255) DEFAULT NULL,
  `matricula` int(11) NOT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `senha` varchar(255) DEFAULT NULL,
  `vice_coordenador` bit(1) NOT NULL,
  `departamento_id` int(11) DEFAULT NULL,
  `telefone_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_f9xdq98nhl68237568oxfu6l4` (`cpf`),
  KEY `FKj98gljve5cwy75xrmh24kd5ia` (`departamento_id`),
  KEY `FK3f05pahnitm4416euoum1mnme` (`telefone_id`),
  CONSTRAINT `FK3f05pahnitm4416euoum1mnme` FOREIGN KEY (`telefone_id`) REFERENCES `Telefone` (`id`),
  CONSTRAINT `FKj98gljve5cwy75xrmh24kd5ia` FOREIGN KEY (`departamento_id`) REFERENCES `Departamento` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Professor`
--

LOCK TABLES `Professor` WRITE;
/*!40000 ALTER TABLE `Professor` DISABLE KEYS */;
INSERT INTO `Professor` VALUES (14,'','10','1112sdsd','sdsd',0,'berg','1','\0',NULL,15),(16,'','11','2112sdsd','sdsd',0,'ellen','1','\0',NULL,17),(18,'','12','3112sdsd','sdsd',0,'rico','1','\0',NULL,19),(20,'','13','4112sdsd','sdsd',0,'ygor','1','\0',NULL,21),(22,'','14','5112sdsd','sdsd',0,'glauber','1','\0',NULL,23);
/*!40000 ALTER TABLE `Professor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `RegistrarObservacoes`
--

DROP TABLE IF EXISTS `RegistrarObservacoes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `RegistrarObservacoes` (
  `id` int(11) NOT NULL,
  `observacao` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `RegistrarObservacoes`
--

LOCK TABLES `RegistrarObservacoes` WRITE;
/*!40000 ALTER TABLE `RegistrarObservacoes` DISABLE KEYS */;
INSERT INTO `RegistrarObservacoes` VALUES (36,'llçsdçlskdlçklçaskdlçklçsdaadasddadasdsadafsdfdsfsdçsdflçfllfçlsdflçdf');
/*!40000 ALTER TABLE `RegistrarObservacoes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Registro`
--

DROP TABLE IF EXISTS `Registro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Registro` (
  `id` int(11) NOT NULL,
  `data` date DEFAULT NULL,
  `registro` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Registro`
--

LOCK TABLES `Registro` WRITE;
/*!40000 ALTER TABLE `Registro` DISABLE KEYS */;
/*!40000 ALTER TABLE `Registro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `SituacaoAlunoDisciplina`
--

DROP TABLE IF EXISTS `SituacaoAlunoDisciplina`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `SituacaoAlunoDisciplina` (
  `id` int(11) NOT NULL,
  `situacao` varchar(255) DEFAULT NULL,
  `aluno_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKq2aymc8ij1qmdxsml2usgtqo0` (`aluno_id`),
  CONSTRAINT `FKq2aymc8ij1qmdxsml2usgtqo0` FOREIGN KEY (`aluno_id`) REFERENCES `Aluno` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `SituacaoAlunoDisciplina`
--

LOCK TABLES `SituacaoAlunoDisciplina` WRITE;
/*!40000 ALTER TABLE `SituacaoAlunoDisciplina` DISABLE KEYS */;
INSERT INTO `SituacaoAlunoDisciplina` VALUES (25,NULL,6),(26,NULL,8),(27,NULL,12),(35,NULL,4);
/*!40000 ALTER TABLE `SituacaoAlunoDisciplina` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `SituacaoAlunoDisciplina_Falta`
--

DROP TABLE IF EXISTS `SituacaoAlunoDisciplina_Falta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `SituacaoAlunoDisciplina_Falta` (
  `SituacaoAlunoDisciplina_id` int(11) NOT NULL,
  `faltas_id` int(11) NOT NULL,
  UNIQUE KEY `UK_jqf4jq2i9hbhtvuxclkx9hgr0` (`faltas_id`),
  KEY `FKg3mqhgwu1yi9qgmhj8955frg7` (`SituacaoAlunoDisciplina_id`),
  CONSTRAINT `FKg3mqhgwu1yi9qgmhj8955frg7` FOREIGN KEY (`SituacaoAlunoDisciplina_id`) REFERENCES `SituacaoAlunoDisciplina` (`id`),
  CONSTRAINT `FKrllj12y15nc954flnfn4gcbth` FOREIGN KEY (`faltas_id`) REFERENCES `Falta` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `SituacaoAlunoDisciplina_Falta`
--

LOCK TABLES `SituacaoAlunoDisciplina_Falta` WRITE;
/*!40000 ALTER TABLE `SituacaoAlunoDisciplina_Falta` DISABLE KEYS */;
/*!40000 ALTER TABLE `SituacaoAlunoDisciplina_Falta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `SituacaoAlunoDisciplina_Nota`
--

DROP TABLE IF EXISTS `SituacaoAlunoDisciplina_Nota`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `SituacaoAlunoDisciplina_Nota` (
  `SituacaoAlunoDisciplina_id` int(11) NOT NULL,
  `notas_id` int(11) NOT NULL,
  UNIQUE KEY `UK_vqojjsie9ffkitqcxhowwfan` (`notas_id`),
  KEY `FKb9fposbrc7wbre3e1wpna6nkc` (`SituacaoAlunoDisciplina_id`),
  CONSTRAINT `FKb9fposbrc7wbre3e1wpna6nkc` FOREIGN KEY (`SituacaoAlunoDisciplina_id`) REFERENCES `SituacaoAlunoDisciplina` (`id`),
  CONSTRAINT `FKp146r0i4431be06l7h85p9g6a` FOREIGN KEY (`notas_id`) REFERENCES `Nota` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `SituacaoAlunoDisciplina_Nota`
--

LOCK TABLES `SituacaoAlunoDisciplina_Nota` WRITE;
/*!40000 ALTER TABLE `SituacaoAlunoDisciplina_Nota` DISABLE KEYS */;
/*!40000 ALTER TABLE `SituacaoAlunoDisciplina_Nota` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Telefone`
--

DROP TABLE IF EXISTS `Telefone`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Telefone` (
  `id` int(11) NOT NULL,
  `telefone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Telefone`
--

LOCK TABLES `Telefone` WRITE;
/*!40000 ALTER TABLE `Telefone` DISABLE KEYS */;
INSERT INTO `Telefone` VALUES (5,'1'),(7,'1'),(9,'1'),(11,'1'),(13,'1'),(15,'1'),(17,'1'),(19,'1'),(21,'1'),(23,'1'),(29,'232323');
/*!40000 ALTER TABLE `Telefone` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Turma`
--

DROP TABLE IF EXISTS `Turma`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Turma` (
  `id` int(11) NOT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `disciplina_id` int(11) DEFAULT NULL,
  `professor_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK8046jn01khei22nwsvj86kmfr` (`disciplina_id`),
  KEY `FKq31csamjp0hsa4qnkqr0n4l3r` (`professor_id`),
  CONSTRAINT `FK8046jn01khei22nwsvj86kmfr` FOREIGN KEY (`disciplina_id`) REFERENCES `Disciplina` (`id`),
  CONSTRAINT `FKq31csamjp0hsa4qnkqr0n4l3r` FOREIGN KEY (`professor_id`) REFERENCES `Professor` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Turma`
--

LOCK TABLES `Turma` WRITE;
/*!40000 ALTER TABLE `Turma` DISABLE KEYS */;
INSERT INTO `Turma` VALUES (24,'2018.2',3,18),(34,'2018.1',2,18);
/*!40000 ALTER TABLE `Turma` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Turma_RegistrarObservacoes`
--

DROP TABLE IF EXISTS `Turma_RegistrarObservacoes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Turma_RegistrarObservacoes` (
  `Turma_id` int(11) NOT NULL,
  `registrarObservacoes_id` int(11) NOT NULL,
  UNIQUE KEY `UK_4vjtqo52se266gk67kvvb1i1j` (`registrarObservacoes_id`),
  KEY `FKlkt8859rgh554my1gsiccf3n` (`Turma_id`),
  CONSTRAINT `FKbox7mem91fte1ps68vhn6hdpl` FOREIGN KEY (`registrarObservacoes_id`) REFERENCES `RegistrarObservacoes` (`id`),
  CONSTRAINT `FKlkt8859rgh554my1gsiccf3n` FOREIGN KEY (`Turma_id`) REFERENCES `Turma` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Turma_RegistrarObservacoes`
--

LOCK TABLES `Turma_RegistrarObservacoes` WRITE;
/*!40000 ALTER TABLE `Turma_RegistrarObservacoes` DISABLE KEYS */;
INSERT INTO `Turma_RegistrarObservacoes` VALUES (24,36);
/*!40000 ALTER TABLE `Turma_RegistrarObservacoes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Turma_Registro`
--

DROP TABLE IF EXISTS `Turma_Registro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Turma_Registro` (
  `Turma_id` int(11) NOT NULL,
  `registro_id` int(11) NOT NULL,
  UNIQUE KEY `UK_b6hhajetest029400spag6vao` (`registro_id`),
  KEY `FK38t5fib2kny0qc2cvgsw782wf` (`Turma_id`),
  CONSTRAINT `FK38t5fib2kny0qc2cvgsw782wf` FOREIGN KEY (`Turma_id`) REFERENCES `Turma` (`id`),
  CONSTRAINT `FKpnrw7vc5hxt84s8if9mam03hx` FOREIGN KEY (`registro_id`) REFERENCES `Registro` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Turma_Registro`
--

LOCK TABLES `Turma_Registro` WRITE;
/*!40000 ALTER TABLE `Turma_Registro` DISABLE KEYS */;
/*!40000 ALTER TABLE `Turma_Registro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Turma_SituacaoAlunoDisciplina`
--

DROP TABLE IF EXISTS `Turma_SituacaoAlunoDisciplina`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Turma_SituacaoAlunoDisciplina` (
  `Turma_id` int(11) NOT NULL,
  `situacoes_id` int(11) NOT NULL,
  UNIQUE KEY `UK_rqlkbypd6tffid4tyjie72af7` (`situacoes_id`),
  KEY `FKby3opuvpsqakocjwqocn5row6` (`Turma_id`),
  CONSTRAINT `FKby3opuvpsqakocjwqocn5row6` FOREIGN KEY (`Turma_id`) REFERENCES `Turma` (`id`),
  CONSTRAINT `FKe63477aa8cl3cuc1p5n4q37bh` FOREIGN KEY (`situacoes_id`) REFERENCES `SituacaoAlunoDisciplina` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Turma_SituacaoAlunoDisciplina`
--

LOCK TABLES `Turma_SituacaoAlunoDisciplina` WRITE;
/*!40000 ALTER TABLE `Turma_SituacaoAlunoDisciplina` DISABLE KEYS */;
INSERT INTO `Turma_SituacaoAlunoDisciplina` VALUES (24,25),(24,26),(24,27),(34,35);
/*!40000 ALTER TABLE `Turma_SituacaoAlunoDisciplina` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (37),(37),(37),(37),(37),(37),(37),(37),(37),(37),(37),(37),(37);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'pbd'
--

--
-- Dumping routines for database 'pbd'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-03-17 10:54:24
