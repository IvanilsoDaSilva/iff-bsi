DROP SCHEMA IF EXISTS `db_sistema_bancario`;
CREATE SCHEMA IF NOT EXISTS `db_sistema_bancario`;
USE `db_sistema_bancario`;

/*
Endereço
*/
DROP TABLE IF EXISTS `address`;
CREATE TABLE IF NOT EXISTS `address`(
	id INT AUTO_INCREMENT UNIQUE NOT NULL,
    number VARCHAR(63),
    street VARCHAR(127),
    complement VARCHAR(255),
    city VARCHAR(127),
    state VARCHAR(127),
    contry VARCHAR(127),
    postal_code VARCHAR(63),
    
    PRIMARY KEY(id)
);
-- DESCRIBE address;

/*
Agência
*/
DROP TABLE IF EXISTS `agency`;
CREATE TABLE IF NOT EXISTS `agency`(
	id INT AUTO_INCREMENT UNIQUE NOT NULL,
    id_address INT,
    number VARCHAR(63),
    
    PRIMARY KEY(id),
    FOREIGN KEY(id_address) REFERENCES address(id)
);
-- DESCRIBE agency;

/*
Conta
*/
DROP TABLE IF EXISTS `account`;
CREATE TABLE IF NOT EXISTS `account`(
	id INT AUTO_INCREMENT UNIQUE NOT NULL,
    id_agency INT,
    number VARCHAR(63),
    balance DOUBLE,
    type ENUM(
		"CORRENTE","POUPANÇA", "SALARIO", "UNIVERSIÁRIA"
	),
    active BOOLEAN,
    password VARCHAR(127),
    
    PRIMARY KEY(id),
    FOREIGN KEY(id_agency) REFERENCES agency(id)
);
-- DESCRIBE account;

/*
Pessoa Jurídica
*/
DROP TABLE IF EXISTS `legal_entity`;
CREATE TABLE IF NOT EXISTS `legal_entity`(
	id INT AUTO_INCREMENT UNIQUE NOT NULL,
    id_account INT,
    company_name VARCHAR(127),
    cnpj VARCHAR(14) UNIQUE,
    
    PRIMARY KEY(id),
    FOREIGN KEY(id_account) REFERENCES account(id)
);
-- DESCRIBE legal_entity;

/*
Pessoa Física
*/
DROP TABLE IF EXISTS `individual_entity`;
CREATE TABLE IF NOT EXISTS `individual_entity`(
	id INT AUTO_INCREMENT UNIQUE NOT NULL,
    id_account INT,
    name VARCHAR(127),
    cpf VARCHAR(11) UNIQUE,
    rg  VARCHAR(9) UNIQUE, -- Quantidade de digitos do RG pode variar de estado para estado
    birthday DATE,
    
    PRIMARY KEY(id),
    FOREIGN KEY(id_account) REFERENCES account(id)
);
-- DESCRIBE individual_entity;

DROP TABLE IF EXISTS `transaction`;
CREATE TABLE IF NOT EXISTS `transaction`(
	id INT AUTO_INCREMENT UNIQUE NOT NULL,
    id_account_emitter INT,
    id_account_destination INT,
    balance DOUBLE,
	type ENUM(
		"PIX","TED", "DOC"
	),
    date DATE,
    
    PRIMARY KEY(id),
    FOREIGN KEY(id_account_emitter) REFERENCES account(id),
    FOREIGN KEY(id_account_destination) REFERENCES account(id)
);
-- DESCRIBE transaction;

DROP TABLE IF EXISTS `log`;
CREATE TABLE IF NOT EXISTS `log`(
	id INT AUTO_INCREMENT UNIQUE NOT NULL,
    id_address INT,
    id_account INT,
    ip VARCHAR(15),
    date DATE,
    
    PRIMARY KEY(id),
    FOREIGN KEY(id_address) REFERENCES address(id),
    FOREIGN KEY(id_account) REFERENCES account(id)
);