-- MySQL dump 10.13  Distrib 5.7.27, for Linux (x86_64)
--
-- Host: localhost    Database: papelaria
-- ------------------------------------------------------
-- Server version	5.7.27-0ubuntu0.18.04.1

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
-- Current Database: `papelaria`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `papelaria` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `papelaria`;

--
-- Table structure for table `cidade`
--

DROP TABLE IF EXISTS `cidade`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cidade` (
  `id_cidade` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(50) NOT NULL,
  PRIMARY KEY (`id_cidade`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cidade`
--

LOCK TABLES `cidade` WRITE;
/*!40000 ALTER TABLE `cidade` DISABLE KEYS */;
INSERT INTO `cidade` VALUES (2,'campos dos goytacazes'),(4,'macae'),(5,'sao joao da barra'),(6,'itaperuna');
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
  `nome` varchar(50) NOT NULL,
  `pontos_prog_fidelidade` int(11) DEFAULT NULL,
  `ano_cadastro` int(11) NOT NULL,
  `genero` int(11) NOT NULL,
  `id_cidade` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_cliente`)
) ENGINE=MyISAM AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,'Maria da Silva',10,2011,0,2),(2,'Joao',15,2010,1,4),(3,'Mariana de Sa',5,2009,0,4),(4,'Augusto de Souza',3,2007,1,2),(5,'Cilene da Silva',4,2006,0,2),(9,'Fernando',NULL,2010,1,NULL);
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fabricante`
--

DROP TABLE IF EXISTS `fabricante`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fabricante` (
  `id_fabricante` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(50) NOT NULL,
  PRIMARY KEY (`id_fabricante`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fabricante`
--

LOCK TABLES `fabricante` WRITE;
/*!40000 ALTER TABLE `fabricante` DISABLE KEYS */;
INSERT INTO `fabricante` VALUES (1,'bic'),(2,'faber castell'),(3,'multilaser'),(4,'tilibra'),(5,'pilot'),(6,'compactor'),(7,'hp');
/*!40000 ALTER TABLE `fabricante` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `item_venda`
--

DROP TABLE IF EXISTS `item_venda`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `item_venda` (
  `id_item_venda` int(11) NOT NULL AUTO_INCREMENT,
  `id_venda` int(11) NOT NULL,
  `id_produto` int(11) NOT NULL,
  `qtde` int(11) NOT NULL,
  PRIMARY KEY (`id_item_venda`)
) ENGINE=MyISAM AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item_venda`
--

LOCK TABLES `item_venda` WRITE;
/*!40000 ALTER TABLE `item_venda` DISABLE KEYS */;
INSERT INTO `item_venda` VALUES (1,1,1,2),(2,2,1,4),(3,2,3,1),(4,1,3,5),(5,3,3,4),(6,4,2,1),(7,5,2,2),(8,6,3,5);
/*!40000 ALTER TABLE `item_venda` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `produto`
--

DROP TABLE IF EXISTS `produto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `produto` (
  `id_produto` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(50) NOT NULL,
  `valor` float NOT NULL,
  `qtde_estoque` int(11) NOT NULL,
  `id_fabricante` int(11) NOT NULL,
  PRIMARY KEY (`id_produto`)
) ENGINE=MyISAM AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `produto`
--

LOCK TABLES `produto` WRITE;
/*!40000 ALTER TABLE `produto` DISABLE KEYS */;
INSERT INTO `produto` VALUES (1,'caneta',2,34,1),(2,'lapis',0.5,56,2),(3,'compasso',0.8,10,2),(4,'regua',1,87,1),(5,'Cartucho colorido',130,20,7),(6,'Cartucho preto',110,45,7),(7,'Caneta quadro branco',15,45,5),(8,'Caderno 10 matérias',32,34,4);
/*!40000 ALTER TABLE `produto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary table structure for view `v_cliente`
--

DROP TABLE IF EXISTS `v_cliente`;
/*!50001 DROP VIEW IF EXISTS `v_cliente`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `v_cliente` AS SELECT 
 1 AS `nome`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `venda`
--

DROP TABLE IF EXISTS `venda`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `venda` (
  `id_venda` int(11) NOT NULL AUTO_INCREMENT,
  `ano` int(11) NOT NULL,
  `mes` int(11) NOT NULL,
  `id_cliente` int(11) NOT NULL,
  `id_vendedor` int(11) NOT NULL,
  PRIMARY KEY (`id_venda`)
) ENGINE=MyISAM AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `venda`
--

LOCK TABLES `venda` WRITE;
/*!40000 ALTER TABLE `venda` DISABLE KEYS */;
INSERT INTO `venda` VALUES (1,2010,1,1,1),(2,2010,2,1,1),(3,2010,2,1,2),(4,2011,2,2,2),(5,2011,3,3,2),(6,2012,5,2,1),(7,2010,6,1,2),(8,2011,8,3,2);
/*!40000 ALTER TABLE `venda` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vendedor`
--

DROP TABLE IF EXISTS `vendedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vendedor` (
  `id_vendedor` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) NOT NULL,
  `salario` float NOT NULL,
  `percentual_comissao` float DEFAULT NULL,
  `genero` int(11) NOT NULL,
  `id_cidade` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_vendedor`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vendedor`
--

LOCK TABLES `vendedor` WRITE;
/*!40000 ALTER TABLE `vendedor` DISABLE KEYS */;
INSERT INTO `vendedor` VALUES (1,'Marieta da Silva',800,0.03,0,2),(2,'Fernanda Maria',1000,0.07,0,4),(3,'Zezinho de Souza',750,0.03,1,NULL),(4,'Joaozinho de Sa',300,0.02,1,2);
/*!40000 ALTER TABLE `vendedor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Current Database: `papelaria`
--

USE `papelaria`;

--
-- Final view structure for view `v_cliente`
--

/*!50001 DROP VIEW IF EXISTS `v_cliente`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = latin1 */;
/*!50001 SET character_set_results     = latin1 */;
/*!50001 SET collation_connection      = latin1_swedish_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `v_cliente` AS select distinct `c`.`nome` AS `nome` from (`cliente` `c` join `venda` `v` on((`c`.`id_cliente` = `v`.`id_cliente`))) where (`v`.`ano` = 2011) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-10-01 20:04:09

-- Questão 01
SELECT c.nome cliente
	FROM cliente c
    RIGHT JOIN venda v
    ON c.id_cliente = v.id_cliente;
    
-- Questão 02
SELECT vendedor.nome vendedor, COUNT(*) vendas
	FROM vendedor vendedor
    INNER JOIN venda venda
    ON venda.id_vendedor = vendedor.id_vendedor
	GROUP BY venda.id_vendedor DESC;
    
-- Questão 03
SELECT p.descricao produto,f.descricao fabricante
	FROM produto p
	JOIN fabricante f
	ON p.id_fabricante = f.id_fabricante;

-- Questão 04
SELECT DISTINCT c.nome
	FROM cliente c
	INNER JOIN venda v
    ON c.id_cliente = v.id_cliente
	WHERE v.ano = 2011;
    
-- Questão 05
SELECT v.id_venda, v.ano, v.mes, c.nome AS nome_cliente, vd.nome AS nome_vendedor
	FROM venda v
	LEFT JOIN cliente c
    ON v.id_cliente = c.id_cliente
		LEFT JOIN vendedor vd
        ON v.id_vendedor = vd.id_vendedor
		WHERE v.ano >= 2011;

-- Questão 06
SELECT v.id_vendedor, v.nome nome_vendedor, v.salario, v.percentual_comissao, v.genero, c.descricao cidade
	FROM vendedor v
	LEFT JOIN cidade c
    ON v.id_cidade = c.id_cidade;
    
-- Questão 07
SELECT id_produto, descricao, valor
	FROM produto
	ORDER BY valor ASC
	LIMIT 1;

-- Questão 08
SELECT id_produto, descricao, valor
	FROM produto
	WHERE valor > (SELECT AVG(valor)FROM produto)
	ORDER BY valor DESC;