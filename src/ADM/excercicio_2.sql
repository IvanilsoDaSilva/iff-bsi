-- MySQL dump 10.13  Distrib 5.5.57, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: imobiliaria
-- ------------------------------------------------------
-- Server version	5.5.57-0ubuntu0.14.04.1

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
-- Current Database: `imobiliaria`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `imobiliaria` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `imobiliaria`;

--
-- Table structure for table `cidade`
--

DROP TABLE IF EXISTS `cidade`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cidade` (
  `id_cidade` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(70) NOT NULL,
  PRIMARY KEY (`id_cidade`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cidade`
--

LOCK TABLES `cidade` WRITE;
/*!40000 ALTER TABLE `cidade` DISABLE KEYS */;
INSERT INTO `cidade` VALUES (1,'Campos dos Goyatacazes'),(2,'Macae'),(3,'Itaperuna'),(4,'Rio de Janeiro'),(5,'Rio das Ostras'),(6,'Sao Fidelis'),(7,'Quissamã'),(8,'São Franscisco do Itabapoana');
/*!40000 ALTER TABLE `cidade` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cliente` (
  `id_cliente` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(70) DEFAULT NULL,
  `telefone` varchar(13) DEFAULT NULL,
  PRIMARY KEY (`id_cliente`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,'Maria da silva Joaquina','2345'),(2,'Xuxa da silva',NULL),(3,'Joaninha',NULL),(4,'Galinha Pintadinha','345'),(5,'Jose Mendoca','9999'),(6,'Chico da silva Buarque','8767'),(7,'Bob Esponja',NULL),(8,'Da Silva Fulano',NULL);
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `corretorresponsavel`
--

DROP TABLE IF EXISTS `corretorresponsavel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `corretorresponsavel` (
  `id_corretor` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(70) DEFAULT NULL,
  `cpf` varchar(13) DEFAULT NULL,
  PRIMARY KEY (`id_corretor`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `corretorresponsavel`
--

LOCK TABLES `corretorresponsavel` WRITE;
/*!40000 ALTER TABLE `corretorresponsavel` DISABLE KEYS */;
INSERT INTO `corretorresponsavel` VALUES (1,'Joaozinho ','234'),(2,'Maria da Silva Augusta ','2222'),(3,'Seu Ze da Esquina ',NULL),(4,'Mario Joao',NULL);
/*!40000 ALTER TABLE `corretorresponsavel` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `endereco`
--

DROP TABLE IF EXISTS `endereco`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `endereco` (
  `id_endereco` int(11) NOT NULL AUTO_INCREMENT,
  `rua` varchar(70) DEFAULT NULL,
  `estado` varchar(2) DEFAULT NULL,
  `cidade` varchar(70) DEFAULT NULL,
  `bairro` varchar(70) DEFAULT NULL,
  `complemento` varchar(70) DEFAULT NULL,
  PRIMARY KEY (`id_endereco`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `endereco`
--

LOCK TABLES `endereco` WRITE;
/*!40000 ALTER TABLE `endereco` DISABLE KEYS */;
INSERT INTO `endereco` VALUES (1,'rua abc','RJ','campos dos goytacazes','turf',NULL),(2,'rua abc','SP','sao paulo','xxx',NULL),(3,'rua abc','RJ','macae','centro',NULL),(4,'rua xyz','RJ','campos dos goytacazes','centro',NULL),(5,'rua abc','RJ','campos dos goytacazes','guarus',NULL),(6,'rua abc','RJ','itaperuna','aeroporto',NULL),(7,'rua abc','RJ','macae','aeroporto',NULL);
/*!40000 ALTER TABLE `endereco` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `imovel`
--

DROP TABLE IF EXISTS `imovel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `imovel` (
  `id_imovel` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(100) NOT NULL,
  `area` float NOT NULL,
  `preco` float DEFAULT NULL,
  `id_tipo` int(11) DEFAULT NULL,
  `id_proprietario` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_imovel`)
) ENGINE=MyISAM AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `imovel`
--

LOCK TABLES `imovel` WRITE;
/*!40000 ALTER TABLE `imovel` DISABLE KEYS */;
INSERT INTO `imovel` VALUES (1,'apartamento nascente 3 qts',63,340000,4,1),(2,'terreno rua 28 de marco',87,200000,6,1),(3,'casa 4 qts turf club',400,800000,5,NULL),(4,'apartamento 2 qts suite',87,200000,4,5),(5,'apartamento 1 qt',34,80000,4,9),(6,'casa em condominio fechado',200,450000,5,8),(7,'casa colonial',70,280000,5,9),(8,'terreno rua 28 de marco',300,120000,4,8),(9,'terreno praia farol de sao thomé',310,150000,4,8),(10,'casa em grussaí nascente',450,350000,4,9);
/*!40000 ALTER TABLE `imovel` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `profissao`
--

DROP TABLE IF EXISTS `profissao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `profissao` (
  `id_profissao` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(70) NOT NULL,
  PRIMARY KEY (`id_profissao`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `profissao`
--

LOCK TABLES `profissao` WRITE;
/*!40000 ALTER TABLE `profissao` DISABLE KEYS */;
INSERT INTO `profissao` VALUES (1,'professor'),(2,'estudante'),(3,'analista de sistemas'),(4,'tecnico em informatica'),(5,'medico'),(6,'advogado');
/*!40000 ALTER TABLE `profissao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proprietario`
--

DROP TABLE IF EXISTS `proprietario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `proprietario` (
  `id_proprietario` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(70) NOT NULL,
  `sexo` char(1) NOT NULL,
  `telefone` varchar(13) NOT NULL,
  `id_profissao` int(11) DEFAULT NULL,
  `id_cidade` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_proprietario`)
) ENGINE=MyISAM AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proprietario`
--

LOCK TABLES `proprietario` WRITE;
/*!40000 ALTER TABLE `proprietario` DISABLE KEYS */;
INSERT INTO `proprietario` VALUES (1,'Jose Saramago','m','2322',NULL,1),(2,'Alice no Pais das Maravilhas','m','34455',NULL,2),(3,'Augusto de Souza','m','2322',1,2),(4,'Joaninha','f','34455',1,3),(5,'Marieta da Silva','f','2322',4,1),(6,'Vovo','f','333',5,4),(7,'Zezinho de Souza','f','6767',2,5),(8,'Maricota','f','6987',5,2),(9,'Fulano de tal','m','',NULL,2),(10,'Galinha Pintadinha','f','',NULL,1);
/*!40000 ALTER TABLE `proprietario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reserva`
--

DROP TABLE IF EXISTS `reserva`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reserva` (
  `id_reserva` int(11) NOT NULL AUTO_INCREMENT,
  `data` date DEFAULT NULL,
  `hora` time DEFAULT NULL,
  `id_imovel` int(11) DEFAULT NULL,
  `id_cliente` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_reserva`),
  KEY `id_imovel` (`id_imovel`),
  KEY `id_cliente` (`id_cliente`),
  CONSTRAINT `reserva_ibfk_1` FOREIGN KEY (`id_imovel`) REFERENCES `imovel` (`id_imovel`) ON UPDATE CASCADE,
  CONSTRAINT `reserva_ibfk_2` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id_cliente`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reserva`
--

LOCK TABLES `reserva` WRITE;
/*!40000 ALTER TABLE `reserva` DISABLE KEYS */;
INSERT INTO `reserva` VALUES (1,'2010-12-31','07:00:00',1,1),(2,'2010-12-31','21:50:00',1,1),(3,'2010-12-31','10:30:00',NULL,1),(4,'2010-12-31','09:30:00',1,2),(5,'2010-12-31','08:10:00',NULL,2),(6,'2010-12-31','07:00:00',2,1),(7,'2010-12-30','21:50:00',3,3),(8,'2010-12-30','10:30:00',NULL,4),(9,'2010-12-30','09:30:00',3,5),(10,'2010-12-30','08:10:00',NULL,2);
/*!40000 ALTER TABLE `reserva` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reviewing`
--

DROP TABLE IF EXISTS `reviewing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reviewing` (
  `reviewingid` int(11) NOT NULL DEFAULT '0',
  `papername` text,
  `reviewername` text,
  PRIMARY KEY (`reviewingid`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reviewing`
--

LOCK TABLES `reviewing` WRITE;
/*!40000 ALTER TABLE `reviewing` DISABLE KEYS */;
/*!40000 ALTER TABLE `reviewing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `score`
--

DROP TABLE IF EXISTS `score`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `score` (
  `reviewingid` int(11) DEFAULT NULL,
  `questionnumber` int(11) DEFAULT NULL,
  `score` int(11) DEFAULT NULL,
  KEY `reviewingid` (`reviewingid`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `score`
--

LOCK TABLES `score` WRITE;
/*!40000 ALTER TABLE `score` DISABLE KEYS */;
/*!40000 ALTER TABLE `score` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipo`
--

DROP TABLE IF EXISTS `tipo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipo` (
  `id_tipo` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(20) NOT NULL,
  PRIMARY KEY (`id_tipo`)
) ENGINE=MyISAM AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo`
--

LOCK TABLES `tipo` WRITE;
/*!40000 ALTER TABLE `tipo` DISABLE KEYS */;
INSERT INTO `tipo` VALUES (6,'terreno'),(4,'apartamento'),(5,'casa');
/*!40000 ALTER TABLE `tipo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-10-31 21:01:36

-- Questão 01
SELECT i.descricao imovel, t.descricao tipo FROM imovel i, tipo t WHERE i.id_tipo = t.id_tipo;
SELECT i.descricao imovel, t.descricao tipo 
	FROM imovel i
    INNER JOIN tipo t
    ON i.id_tipo = t.id_tipo;
    
-- Questão 02
SELECT i.descricao imovel, i.area, i.preco, p.nome proprietario FROM imovel i, proprietario p WHERE i.id_proprietario = p.id_proprietario;
SELECT i.descricao imovel, i.area, i.preco, p.nome proprietario
	FROM imovel i
    INNER JOIN proprietario p
    ON i.id_proprietario = p.id_proprietario;
    
-- Questão 03
SELECT prop.nome proprietario, prof.descricao profissão FROM proprietario prop, profissao prof WHERE prop.id_profissao = prof.id_profissao;
SELECT prop.nome proprietario, prof.descricao profissão
	FROM proprietario prop
    INNER JOIN profissao prof
    ON prop.id_profissao = prof.id_profissao;

-- Questão 04
SELECT prop.nome proprietario, prof.descricao profissão
	FROM proprietario prop
    LEFT JOIN profissao prof
    ON prop.id_profissao = prof.id_profissao;

-- Questão 05
SELECT prof.descricao profissao, prop.nome proprietario
	FROM profissao prof
	LEFT JOIN proprietario prop
	ON prop.id_profissao = prof.id_profissao;
    
-- Questão 06
SELECT p.nome proprietario, COUNT(*) quantidade_imovel
	FROM proprietario p
    INNER JOIN imovel i
    ON i.id_proprietario = p.id_proprietario
    GROUP BY p.id_proprietario;
    
-- Questão 07
SELECT i.descricao imovel, prof.descricao profissao_proprietario
	FROM profissao prof
    INNER JOIN proprietario prop
    ON prop.id_profissao = prof.id_profissao
		INNER JOIN imovel i
		ON i.id_proprietario = prop.id_proprietario;
        
-- Questão 08
SELECT i.descricao imovel, i.preco preco, c.descricao cidade_proprietario
FROM imovel i
    INNER JOIN proprietario p
    ON p.id_proprietario = i.id_proprietario
		INNER JOIN cidade c
		ON c.id_cidade = p.id_cidade;
        
-- Questão 09
SELECT t.descricao tipo, AVG(i.preco) media
	FROM imovel i
    INNER JOIN tipo t
    ON i.id_tipo = t.id_tipo
    GROUP BY t.id_tipo;

-- Questão 10
SELECT i.descricao imovel
	FROM imovel i 
    WHERE i.id_proprietario IS NULL;
    
-- Questão 11
SELECT p.nome proprietario, i.descricao
	FROM proprietario p
    LEFT JOIN imovel i
    ON p.id_proprietario = i.id_proprietario
    WHERE i.descricao IS NULL;

-- Questão 12
SELECT i.descricao imovel, i.preco
	FROM imovel i
    INNER JOIN tipo t
	ON i.id_tipo = t.id_tipo
    WHERE t.descricao != "terreno";
    
-- Questão 13
SELECT i.descricao imovel, i.preco, i.area,
	CASE
		WHEN i.area > 300 AND i.preco > 400000 THEN 'alto padrao'
		WHEN i.area BETWEEN 200 AND 300 OR i.preco BETWEEN 200000 AND 400000 THEN 'medio padrao'
		ELSE 'padrao normal'
	END classificacao
FROM imovel i; 

