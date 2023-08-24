SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

 -- Schema
CREATE SCHEMA IF NOT EXISTS `farmacia`;
USE `farmacia`;

-- Table farmacia.franquia
CREATE TABLE IF NOT EXISTS `farmacia`.`db_franquia` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `created_date` DATE NULL DEFAULT NULL,
  `last_modified_date` DATE NULL DEFAULT NULL,
  `name` VARCHAR(255) NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
)

-- Table farmacia.telefone
CREATE TABLE IF NOT EXISTS `farmacia`.`db_telefone` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `created_date` DATE NULL DEFAULT NULL,
  `last_modified_date` DATE NULL DEFAULT NULL,
  `ddd` VARCHAR(255) NOT NULL,
  `ddi` VARCHAR(255) NOT NULL,
  `number` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`)
)

-- Table farmacia.endereco
CREATE TABLE IF NOT EXISTS `farmacia`.`db_endereco` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `created_date` DATE NULL DEFAULT NULL,
  `last_modified_date` DATE NULL DEFAULT NULL,
  `pais` VARCHAR(255) NOT NULL,
  `cidade` VARCHAR(255) NOT NULL,
  `municipio` VARCHAR(255) NOT NULL,
  `destrito` VARCHAR(255) NOT NULL,
  `rua` VARCHAR(255) NOT NULL,
  `numero` VARCHAR(255) NOT NULL,
  `complemento` VARCHAR(255) NOT NULL,
  `cep` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`)
)

-- Table farmacia.farmacia
CREATE TABLE IF NOT EXISTS `farmacia`.`db_farmacia` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `created_date` DATE NULL DEFAULT NULL,
  `last_modified_date` DATE NULL DEFAULT NULL,
  `razao_social` VARCHAR(255) NOT NULL,
  `cnpj` VARCHAR(255) NOT NULL,
  `franquia_id` BIGINT(20) NULL DEFAULT NULL,
  `endereco_id` BIGINT(20) NULL DEFAULT NULL,
  `telefone_id` BIGINT(20) NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `FKf9hyk1ceq9wnhktllkenmvgoa` FOREIGN KEY (`franquia_id`) REFERENCES `farmacia`.`db_franquia` (`id`),
  CONSTRAINT `FKf9hyk1ceq9wnhktllkenmvgob` FOREIGN KEY (`endereco_id`) REFERENCES `farmacia`.`db_endereco` (`id`),
  CONSTRAINT `FKf9hyk1ceq9wnhktllkenmvgoc` FOREIGN KEY (`telefone_id`) REFERENCES `farmacia`.`db_telefone` (`id`)
)